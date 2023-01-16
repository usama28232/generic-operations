# generic-operations

## Problem

The configuration applications, there are a lot of screens that require common CRUD operations such as list, create, update or delete

## Solution
I built this structure to expose rest endpoints that are extending generic operations defined in `ControllerBase`, `ServiceBase` & `RepositoryBase`

These rest endpoints can be used by front-end applications to consume data. A better approach would be to wrap these endpoints with `GraphQL` to give more control to the front-end application

## Working
`ControllerBase` provides generic endpoints such as `/context/<entity>/` & `/context/<entity>/get?<pk>` for all controllers that extends `ControllerBase`

For the sake of simplicity, I have only implemented "list" and "get" behaviors

To list all records from menu entity:
````
curl --request GET \
  --url http://localhost:8081/menu
````
The list endpoint `/context/<entity>/` also supports pagination like:

````
curl --request GET \
  --url 'http://localhost:8081/menu?page=0&size=2'
````
**Note:** If you fail to provide `size` attribute,  `app.default.page.size` property will determine the default number of records to fetch

To list single record from user entity:
````
curl --request GET \
  --url 'http://localhost:8081/users/get?id=3'
````

`ServiceBase` provides the generic business logic

`RepositoryBase` provides generic database operations

This approach also provides us benefit to extend the default behavior for complex screens by introducing custom business logic in appropriate `Service`



