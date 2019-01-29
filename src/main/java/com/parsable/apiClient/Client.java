package com.parsable.apiClient;

import com.parsable.common.Environment;
import com.parsable.thrift.v1.job_event.JobEventService;
import com.wi.director.thrift.v1.abac.AbacService;
import com.wi.director.thrift.v1.authentication.AuthenticationService;
import com.wi.director.thrift.v1.authentication.LoginOptions;
import com.wi.director.thrift.v1.authentication.LoginResult;
import com.wi.director.thrift.v1.common.commonConstants;
import com.wi.director.thrift.v1.datasheet.DataSheetService;
import com.wi.director.thrift.v1.group_headers.GroupHeaderContentService;
import com.wi.director.thrift.v1.job.JobService;
import com.wi.director.thrift.v1.jobfilter.JobFilterService;
import com.wi.director.thrift.v1.jobrole.JobRoleService;
import com.wi.director.thrift.v1.jobtemplate.JobTemplateService;
import com.wi.director.thrift.v1.messaging.MessagingService;
import com.wi.director.thrift.v1.metadata.MetadataService;
import com.wi.director.thrift.v1.notification.NotificationService;
import com.wi.director.thrift.v1.setting.SettingService;
import com.wi.director.thrift.v1.team.TeamService;
import com.wi.director.thrift.v1.templateset.TemplateSetService;
import com.wi.director.thrift.v1.user.User;
import com.wi.director.thrift.v1.user.UserService;
import javafx.util.Pair;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    private static final String contentType = "application/vnd.mothership.v1+x-thrift-compact";
    private static final String clientVersion = commonConstants.MAJOR_VERSION + "." + commonConstants.MINOR_VERSION + "." + commonConstants.PATCH_VERSION;
    private static final String platform = "workflow-engine";

    private String mothershipUrl;
    private String notificationsUrl;
    private String token;

    public Client() {
        this.mothershipUrl = Environment.getMothershipUrl();
        this.notificationsUrl = Environment.getNotificationsUrl();
    }

    /**
     * Login this client with a user email and password
     *
     * @param email
     * @param password
     */
    public User setUser(String email, String password) throws TException {
        AuthenticationService.Client client = getAuthenticationClient();
        LoginResult res = client.login(email, password, new LoginOptions());
        String authToken = res.getAuthToken();
        token = "Token " + authToken;
        return res.getCurrentUser();
    }

    /**
     * Clear the client with no user logged in
     */
    public void unsetUser() {
        token = null;
    }

    private TProtocol getThriftProtocol(String url) throws TTransportException {
        THttpClient httpClient = new THttpClient(url);
        if (token != null) {
            httpClient.setCustomHeader("Authorization", token);
        }
        httpClient.setCustomHeader("Content-Type", contentType);
        httpClient.setCustomHeader("Accept", contentType);
        httpClient.setCustomHeader("Wi-Thrift-Version", clientVersion);
        httpClient.setCustomHeader("Wi-Platform", platform);
        return new TCompactProtocol(httpClient);
    }

    public AuthenticationService.Client getAuthenticationClient() throws TTransportException {
        return new AuthenticationService.Client(getThriftProtocol(mothershipUrl + "/api/auth"));
    }

    public TeamService.Client getTeamClient() throws TTransportException {
        return new TeamService.Client(getThriftProtocol(mothershipUrl + "/api/teams"));
    }

    public UserService.Client getUserClient() throws TTransportException {
        return new UserService.Client(getThriftProtocol(mothershipUrl + "/api/users"));
    }

    public JobTemplateService.Client getJobTemplateClient() throws TTransportException {
        return new JobTemplateService.Client(getThriftProtocol(mothershipUrl + "/api/job_templates"));
    }

    public TemplateSetService.Client getTemplateSetClient() throws TTransportException {
        return new TemplateSetService.Client(getThriftProtocol(mothershipUrl + "/api/template_sets"));
    }

    public MetadataService.Client getMetadataClient() throws TTransportException {
        return new MetadataService.Client(getThriftProtocol(mothershipUrl + "/api/metadata"));
    }

    public JobService.Client getJobClient() throws TTransportException {
        return new JobService.Client(getThriftProtocol(mothershipUrl + "/api/jobs"));
    }

    public JobRoleService.Client getJobRoleClient() throws TTransportException {
        return new JobRoleService.Client(getThriftProtocol(mothershipUrl + "/api/job_roles"));
    }

    public GroupHeaderContentService.Client getGroupHeaderClient() throws TTransportException {
        return new GroupHeaderContentService.Client(getThriftProtocol(mothershipUrl + "/api/group_headers"));
    }

    public DataSheetService.Client getDataSheetClient() throws TTransportException {
        return new DataSheetService.Client(getThriftProtocol(mothershipUrl + "/api/data_sheets"));
    }

    public DocumentClient getDocumentClient() {
        return new DocumentClient(mothershipUrl + "/api/documents");
    }

    public NotificationService.Client getNotificationClient() throws TTransportException {
        return new NotificationService.Client(getThriftProtocol(notificationsUrl + "/api/notifications"));
    }

    public MessagingService.Client getMessageClient() throws TTransportException {
        return new MessagingService.Client(getThriftProtocol(mothershipUrl + "/api/messages"));
    }

    public JobEventService.Client getJobEventClient() throws TTransportException {
        return new JobEventService.Client(getThriftProtocol(mothershipUrl + "/api/job_events"));
    }

    public SettingService.Client getSettingsClient() throws TTransportException {
        return new SettingService.Client(getThriftProtocol(mothershipUrl + "/api/settings"));
    }

    public AbacService.Client getAbacClient() throws TTransportException {
        return new AbacService.Client(getThriftProtocol(mothershipUrl + "/api/abac"));
    }

    public JobFilterService.Client getJobFilterClient() throws TTransportException {
        return new JobFilterService.Client(getThriftProtocol(mothershipUrl + "/api/job_filters"));
    }

    public class PlainHttpClient {
        private String url;

        public PlainHttpClient() {
        }

        public PlainHttpClient(String url) {
            this.url = url;
        }

        public Pair<Integer, String> multiPostFile(String key, String fileName, List<Header> headers, String contentType) throws IOException {
            HttpClient client;
            if (headers != null)
                client = HttpClientBuilder.create().setDefaultHeaders(headers).build();
            else
                client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            HttpEntity entity;
            if(contentType == null){
                entity = MultipartEntityBuilder.create().addBinaryBody(key, new File(fileName)).build();
            } else {
                entity = MultipartEntityBuilder.create().addBinaryBody(key, new File(fileName), ContentType.create(contentType), fileName.substring(fileName.lastIndexOf("/") + 1)).build();
            }
            post.setEntity(entity);
            HttpResponse response = client.execute(post);
            int code = response.getStatusLine().getStatusCode();
            String body = EntityUtils.toString(response.getEntity());
            return new Pair<>(code, body);
        }
    }

    public class DocumentClient extends PlainHttpClient {
        public DocumentClient(String url) {
            super(url);
        }

        public Pair<Integer, String> uploadDocument(String fileName, String contentType) throws IOException {
            Header header = new BasicHeader("Authorization", token);
            return super.multiPostFile("file", fileName, new ArrayList<>(Arrays.asList(header)), contentType);
        }
    }
}
