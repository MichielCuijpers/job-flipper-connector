package com.parsable.apiClient;

import javafx.util.Pair;

import java.io.IOException;

public interface DocumentClient  extends PlainHttpClient {
        Pair<Integer, String> uploadDocument(String fileName, String contentType) throws IOException;
}
