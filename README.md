## Wikimedia stream to database

- Multi-module Maven project
- Main (root) project + 2 modules (Producer & Consumer)

Kafka Producer (project) intercepts the data stream from Wikimedia and saves this data in the Kafka topic.
Kafka Consumer (project) consumes this data and writes it to a MySQL database.

Apache Kafka is a broker that allows the exchange of messages between the Producer and the Consumer in the SpringBoot project.
