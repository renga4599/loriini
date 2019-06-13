ZuulProperties


Netflix uses Zuul for the following:

Authentication
Insights
Stress Testing
Canary Testing
Dynamic Routing
Service Migration
Load Shedding
Security
Static Response handling
Active/Active traffic management

The default HTTP client used by Zuul is now backed by the Apache HTTP Client instead of the deprecated Ribbon RestClient


Route actuator end points:
--------------------------
GET
http://localhost:8080/actuator/routes
http://localhost:8080/actuator/routes/details

POST to /routes forces a refresh of the existing routes

Route Filter endpoints:
----------------------
http://localhost:8080/actuator/filters

How route works:    
----------------

As you can see, we are calling the backend services through Zuul. By default, Eureka client IDs (user-service) become part of the URIs. 
For example, here we made a call to Zuul using /user-service/api/v1/user/1. 

http://localhost:8080/user-service/user-service/api/v1/user/1

localhost:8080 -> identifies zuul gateway server.

Zuul will check if there is any service registered as user-service (http://localhost:8080/user-service) in Eureka. 
If it's there, it will get the URL for the user service (http://localhost:8300) and append the remaining original URL part(/user-service/api/v1/user/1) to it(http://localhost:8300) and make the call http://localhost:8300/user-service/api/v1/user/1.


Reference:
----------

https://stackabuse.com/spring-cloud-routing-with-zuul-and-gateway/

https://github.com/spring-cloud-samples/sample-zuul-filters/tree/master/src/main/java/org/springframework/cloud/samplezuulfilters

