# producer
Spring Cloud Contract - Messaging / RabbitMQ - producer (producer driven)

# Create RabbitMQ Stub Jar locally & Verify your API
* Spring Cloud Contract Verifier generates also a JUnit test from your Base class, and runs against your Implementation:
* https://github.com/nusmanov/producer/blob/master/src/test/java/com/cdt/producer/TestBase.java

```mvn clean install```

# Create only the RabbitMQ Stub
* This case is needed, if you define contract, but you did not implemented the functionality.
```mvn clean install -DskipTests```

* please use java < 14 (there is a bug with java 14 in SCC)
