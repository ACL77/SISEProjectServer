package com.insure.server;

import javax.jws.WebService;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

@WebService
//Add annotation
public class ClaimDataStore {
    //verify the publics, privates, statics, etc...

    //Map so that I can find a claim by its ID
    private static HashMap<Integer, Claim> claimStorage;

    public ClaimDataStore(){
    }

    //creates object claim and adds it to the collection
    public int addClaim(String description){
        //missing user ID as input

        //creates claim object
        Claim claim = new Claim(description);


        //adds object to the HashTable which is identified by its ID
        //claimStorage.put(claim.getID(), claim);

        return claim.getID();
    }
//
    //retreives claim
 //   public Claim getClaim(int claimID){
//
//            return
//    }

    //lists documents of claim

    //creates document of claim

    //reads document of claim

    //updates document of claim
    public void addDocument(int claimID){
        //missing input parameter: content of document, user ID, digital signature


    }

    //deletes document of claim

}
