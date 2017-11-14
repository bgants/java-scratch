
This will get you past the Same Origin Policy (SOP), very helpful during development.
see - https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy.
 
 
Works for GETs and POSTs.

Deployment: 
	drop the war file into the same servlet container (i.e. Tomcat) that your running your 
	javascript app from, this will proxy your request for you. 		
Usage:   
	/JSProxy/proxy?url=<URL>/<SERVICE>
Example :
	In your javascript you would pre-pend the /JSProxy/proxy?url= to your RESTful call like so,  	
	/JSProxy/proxy?url=http://172.29.8.44:8080/MSAPI/datasets
	/JSProxy/proxy?url=http://localhost:7777/AmeDataModel/FlightData.jsp?method=doQuery

