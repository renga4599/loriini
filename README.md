# loriini


Cloud Native
12 factor applications
 -- Microservice 
 -- Java 8
 -- Spring boot
 -- Spring Cloud Netflix
 -- Spring Data JPA (Hibernate)
 -- AWS - DynamoDB
 -- S3
 
 -- Cloud (AWS/Azure/GCP/)
 -- PaaS (EBS/)
 
-- Dev Ops
---------- 
 -- Jenkins/GitLab/Travis CI
 -- Docker/Kubernate
-----------------------------

Micro-service:
--------------

Spring-cloud-config (Config server)
Spring-cloud-Netflix-Eureka (service-registry & discovery)
Feign client (declarative rest client/ Client side load balancer)
Zuul proxy (API - gateway)
Ribbon Client -- Server side load balancer
Hystrix -- Circuit Breaker & Dashboard
Turbine -- TBD
Sleuth -- Tracing 
Zipkin -- Distributed Tracing


To check the env..
http://localhost:8300/user-service/actuator/env



Admin Service
=============
http://localhost:8100


Notification Service
=============
http://localhost:8200



User Service
=============
http://localhost:8300


Hystrix
-------
http://localhost:8300/hystrix
We need to monitor the user-service hystrix metric stream. 
For that, let's type in http://localhost:8300/actuator/hystrix.stream in the box and click "Monitor Stream".

Monitoring a ‘hystrix.stream’ is something fine, but if you have to watch multiple Hystrix-enabled applications, it will become inconvenient. For this purpose, Spring Cloud provides a tool called Turbine, which can aggregate streams to present in one Hystrix Dashboard.



Circuit breaker:
https://www.baeldung.com/spring-cloud-netflix-hystrix
https://www.devglan.com/spring-cloud/spring-cloud-hystrix
