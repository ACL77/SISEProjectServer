package com.insure.server;

import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.util.HashSet;

//add annotation
public class Claim {
    //verify the publics, privates, statics, etc...

    //field to store claim description
    private String description;
    // field to keep a Unique ID
    private final int ID;
    //static ID counter for class unique ID
    private static int ClaimCounter = 1;

    //created here so the document number is unique for each claim
    //but repeated for different claims
    private int documentID = 1;

    //Set so that I easily add with o(1)
    //and retrieving is not a problem - I always retrieve all documents
    private HashSet<Document> documentStorage;

    public Claim (String description){

        this.description = description;
        this.ID = ClaimCounter++;

    }

    public void createDocument(){

        Document document = new Document(documentID);

        documentID++;
    }


    public String toString(){

        return description + ID; //more??
    }

    public void addDocument(){

    }

    public int getID(){
        return this.ID;
    }


}
