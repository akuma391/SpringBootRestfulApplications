1. PeopleDataManagementApp 
 Simple RESTful API to create,read, update and delete single entity object. We are using crud repository to perforn the required operations.

2. PeopleDataManagementApp2  
 Simple RESTful  API using @DynamicUpdate to update on column. It is generaly not preferred for large appilications.

4. PeopleDataManagementAppl  
 imple RESTful API Using @DynamicUpdate get details of a person using soneparticular properties.

 5.PeopleDataManagementApplJPANamedQry :-
  RESTful API Using @DynamicUpdate. Used 2 proceess to find details 
   a. Named Queries using Entity name and Attribute name using JPQL
   b. NamedNativeQueries using Table name and column name using sql query

6. PeopleDataManagementAsync
 Using  @Async annotation. Spring will execute it in a separate thread and the caller of the method will not wait till the method is 
completed execution.

7. PeopleDataManagementPagination
Example of Pagination and Sorting. This is helpful when we have a large dataset and we want to present it to the user in smaller chunks.

8. PeopleDataManagementQueryAnnotation_1

In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the @Query annotation  — its value attribute contains the JPQL or SQL to execute.
The @Query annotation takes precedence over named queries, which are annotated with @NamedQuery.

9. PeopleDataManagementUpdateQuery
This project is to  create update queries with the Spring Data JPA @Query annotation using @Modifying annotation.

10. PeopleDataManagementUsingNamedParameter
pass method parameters to the query using named parameters. We define these using the @Param annotation inside our repository method declaration.

11. SpringProfileApp 
This project explains how to use different profiles in spring so as to map our beans to different profiles – for example, dev, test, prod.

12. TicketBookingManagememtApp
A RESTful API that uses HTTP requests to GET, PUT, POST and DELETE data using embedded database.

13. TicketBookingManagememtAppCustomError
RESTful API with  ErrorController to handle errors

14. TicketBookingRestFul 
A RESTful API that uses HTTP requests to GET, PUT, POST and DELETE data using mysql database

15. TicketBookingRestFulActuator_1
A RESTful API that uses HTTP requests to GET, PUT, POST and DELETE data using JPA, devtools, actuator and spring boot security


