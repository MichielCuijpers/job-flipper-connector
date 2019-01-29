package com.parsable.apiClient;

import javafx.util.Pair;
import org.apache.http.Header;

import java.io.IOException;
import java.util.List;

public interface PlainHttpClient {
    Pair<Integer, String> multiPostFile(String key, String fileName, List<Header> headers, String contentType) throws IOException;
}
