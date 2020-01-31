## 1. **Server** Specs

 ### Methods
  
  1.  Adding a new claim:
  
    1.1 Arguments:
      - textual description of the new claim;
      - identifier of user submitting the claim (user ID).
    
    1.2 Creates:
      - empty object associated with claim
      - return unique claim ID - **Positive Integer** & **Unique**.
    
  2.  Associating new document with the claim:
  
    1.1 Arguments:
      - claim ID;
      - content of document;
      - user ID (from Insure or client);
      - **EXTRA** : digital signature validation; 
    
    1.2 Creates:
      - an ID to document - **Positive Integer** & **Unique for same claim**;
      - timestamp to the document - **date/hour**.;
      - stores the document associated with the claim;
      - stores digital signature;
      - 
  
  3.  Retrieving the set of documents associated with the claim:
  
    1.1 Arguments:
      - claim ID;
    
    1.2 Creates:
      - returns documents associated with claim;
    
  ### Specs
  
    1.  multi-threades;
    2.  Handle synchronization;
    3.  claims received are stored in a shared claim repository;
    4.  smaller document ID number has smaller timestamp;
