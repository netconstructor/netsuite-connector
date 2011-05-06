Netsuite Setup Demo
==============================

INTRODUCTION
  This example setups environment in order to be able to run NetSuite examples   

HOW TO DEMO:
  1. Set the following system properties:
    a. netsuiteAccount This is the NetSuite webservice - SuiteTalk - account id. It looks like TSTDRVXXXXXX 
    b. netsuiteEmail This is the login email the same of both the NetSuite UI and SuiteTalk
  	c. netsuitePassword This is the login password of both the NetSuite UI and SuiteTalk
  	d. netsuiterRoleId This is the id of the role used to login in SuiteTalk, which determines the operation privileges
  	d. s3AccessKey This is the access key of your Amazon Account
    e. s3SecetKey. This is the secret key of your Amazon Account
    f. s3BucketName. This is a test bucket from where images where being uploaded to NetSuite
  2. Run each of the setup flows, either by runnig the NetsuiteFunctionalTestDriver, or deploying this example in a Mule container, an hitting the corresponding urls:
  		* http://localhost:9090/netsuite-demo-setup-create-employee-phone-updates
  		* http://localhost:9090/netsuite-demo-setup-create-bucket
  		* http://localhost:9090/netsuite-demo-setup-upload-s3-image
  		* http://localhost:9090/netsuite-demo-setup-add-employees
  		* http://localhost:9090/netsuite-demo-setup-add-folder
  	
  

