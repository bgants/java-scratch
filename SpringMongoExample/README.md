This is an example of a Spring Boot implementation using MongoDB and REST.
* This is a custom implementation in that it leverages a custom REST controller to issue custom queries to the database.

* This example assumes a MongDB instance installed and running.

* This example works off of the MongoDB restaurants collection in the test database, follow this link to load the data: 
  -  https://docs.mongodb.com/getting-started/shell/import-data/

* To run this issue this command:
  - mvn spring-boot:run

A major stumbling block that I ran into while working with SPring boof (MongoDB and and Rest) was being able to add custom queries. 
While its relatively straightforward to add custom JSAN based queris by annotation in the "repository" its seems all but impossible 
to create a custom repository that can be implemented to add things like Criteria. See this for more information - https://stackoverflow.com/a/25217113.
