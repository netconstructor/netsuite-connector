Netsuite Search and Upload Demo
==============================

INTRODUCTION
  This example setups environment in order to be able to run netsuite examples   


        
   

HOW TO DEMO:
  1. Set the following environment variables:
    a. netsuiteAccount This is the NetSuite webservice - SuiteTalk - account id. It looks like TSTDRVXXXXXX 
    b. netsuiteEmail This is the login email the same of both the NetSuite UI and SuiteTalk
  	c. netsuitePassword This is the login password of both the NetSuite UI and SuiteTalk
  	d. netsuiterRoleId This is the id of the role used to login in SuiteTalk, which determines the operation privileges 
  2. Run the different setup flows from the NetsuiteFunctionalTestDriver, or deploy it an a Mule Container:
  	a. CreateRecordUpdatesFlow: Creates some price update document in the mongodb. Alternatively, hit
  	http://localhost:9090/netsuite-demo-setup-create-record-updates 
  	b. CreateRecordsFlow: creates some record in Netsuite. Alternatively, you can hit
  	http://localhost:9090/netsuite-demo-setup-create-records in order to run it. 
  
  
