package com.insure.server;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String args[]){

        System.out.println("Project template - server");

        ClaimDataStore Insure = new ClaimDataStore();

        // publish the object
        Endpoint.publish("http://localhost:8090/docstorage", Insure);
    }
}
