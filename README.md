# producer
Spring Cloud Contract - Messaging / RabbitMQ - producer (producer driven)

# Contract
* The contract can be written also in Groovy, Spring RestDoc formats
https://github.com/nusmanov/producer/blob/master/src/test/resources/contracts/user-presence.yaml

# Verifier for your API
* Spring Cloud Contract Verifier generates also a JUnit test from your Test-Base class and contract, and runs against your Implementation:
* target/generated-test-sources/
* https://github.com/nusmanov/producer/blob/master/src/test/java/com/cdt/producer/TestBase.java
* Trigger Method for sending a message is defined in TestBase#onUserIsOnline()

# Create RabbitMQ Stub Jar 
* Create the RabbitMQ Stub Jar based on the contract
* Verifies the API implementetion executing the generated JUnit test
```mvn clean install```

# Create only the RabbitMQ Stub
* This case is needed, if you define contract, but you did not implemented the functionality.
```mvn clean install -DskipTests```

* please use java < 14 (there is a bug with java 14 in SCC)
