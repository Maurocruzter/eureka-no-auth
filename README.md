To run the Docker image, you must make sure the following Firewall ports are open

`8761 - Eureka Server`

`8080 - Eureka Client`

`8081 - Eureka Feign`

on Ubuntu you can open ports through the following command: 

`$ ufw allow <Port>`

For this example to work, you will need to know the Eureka IP address and port.
If you are running everything on localhost **(without docker)**, all you need to do is run the Main classes on your favorite IDE) because `localhost` is set as the IP.


If you are running the images **with docker**, you will need to specify the IP address of the Eureka server in the `application.properties` file of the `eureka-client` and the `eureka-server`.
The property you should change in both projects is `eureka.client.serviceUrl.defaultZone`

**If you run the images with docker and leave** `localhost` **as the Eureka IP address, it will look for the** `localhost` **of the docker image and therefore will not find the Eureka server**.

To test, go to postman and do a get on  `http://localhost:8081/query` **Assuming that things are not running on Docker**.
