Netsuite Search and Upload Demo
==============================

INTRODUCTION
  This is minimalistic a demo about updating product attributes like price. This demo covers the creation and modification of products

HOW TO DEMO:
  1. Set the following system properties:
    a. netsuiteAccount This is the NetSuite webservice - SuiteTalk - account id. It looks like TSTDRVXXXXXX 
    b. netsuiteEmail This is the login email the same of both the NetSuite UI and SuiteTalk
  	c. netsuitePassword This is the login password of both the NetSuite UI and SuiteTalk
  	d. netsuiterRoleId This is the id of the role used to login in SuiteTalk, which determines the operation privileges
  	e. mongo.database. This is the name of the database that contains price updates
    f. mongo.hostname. This is the host where the mongo db is located
  2. Run the "MainFlow". This will query employee-updates documents in a mongodb - which should haven been previously created either manually
  	 or with the example-setup - and will update such employees in NetSuite
  	a. You can verify the price update from the NetSuite UI 

HOW IT WORKS:
   - The MainFlow gets all mongo documents in the form 
   	{ email: <email>, 
   	  officePhone: <officePhone>, 
   	  homePhone: <homePhone>, 
   	  mobilePhone: <mobilePhone> }, that represent phone number updates
   - For each price phone number update, its employee id is searched, and phone numbers 
   	 of such employee are updated.   

    
