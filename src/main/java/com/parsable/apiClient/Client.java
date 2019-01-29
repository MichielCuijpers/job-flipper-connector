package com.parsable.apiClient;

import com.parsable.thrift.v1.job_event.JobEventService;
import com.wi.director.thrift.v1.abac.AbacService;
import com.wi.director.thrift.v1.authentication.AuthenticationService;
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
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import org.springframework.stereotype.Component;

@Component
public interface Client {
    User setUser(String email, String password) throws TException;

    /**
     * Clear the client with no user logged in
     */
    void unsetUser();

    AuthenticationService.Iface getAuthenticationClient() throws TTransportException;

    TeamService.Iface getTeamClient() throws TTransportException;

    UserService.Iface getUserClient() throws TTransportException;

    JobTemplateService.Iface getJobTemplateClient() throws TTransportException;

    TemplateSetService.Iface getTemplateSetClient() throws TTransportException;

    MetadataService.Iface getMetadataClient() throws TTransportException;

    JobService.Iface getJobClient() throws TTransportException;

    JobRoleService.Iface getJobRoleClient() throws TTransportException;

    GroupHeaderContentService.Iface getGroupHeaderClient() throws TTransportException;

    DataSheetService.Iface getDataSheetClient() throws TTransportException;

    DocumentClient getDocumentClient();

    NotificationService.Iface getNotificationClient() throws TTransportException;

    MessagingService.Iface getMessageClient() throws TTransportException;

    JobEventService.Iface getJobEventClient() throws TTransportException;

    SettingService.Iface getSettingsClient() throws TTransportException;

    AbacService.Iface getAbacClient() throws TTransportException;

    JobFilterService.Iface getJobFilterClient() throws TTransportException;
}
