package org.cyrus.webserver.request.data;

import org.cyrus.webserver.request.RequestContext;
import org.cyrus.webserver.request.RequestType;
import org.cyrus.webserver.request.WebRequest;

import java.io.IOException;

public class HomeWebRequest implements WebRequest {
    @Override
    public RequestType getType() {
        return RequestType.GET;
    }

    @Override
    public String[] getEndPoints() {
        return new String[]{"/", "/index"};
    }

    @Override
    public void onRequest(RequestContext onRequest) {
        try {
            onRequest.setResource("html/ChooseProject.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
