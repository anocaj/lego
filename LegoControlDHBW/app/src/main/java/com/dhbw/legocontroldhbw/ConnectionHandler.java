package com.dhbw.legocontroldhbw;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by D062299 on 02.02.2017.
 */
public class ConnectionHandler {

    public URL url;
    public HttpURLConnection connection;
    public OutputStreamWriter outputWriter;

    public ConnectionHandler() throws IOException {
        url = new URL("http://10.0.1.1");
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("PUT");
        outputWriter = new OutputStreamWriter(
                connection.getOutputStream());
    }

}
