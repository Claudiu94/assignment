Start application:
mvn spring-boot:run

GET all users:

curl -u test:test -X GET -H 'Content-Type: application/json' -i http://localhost:8080/users



GET /user - gets a single user - needs an id

curl -u test:test -X GET -H 'Content-Type: application/json' -i 'http://localhost:8080/user?id=13'



POST /user - updates a user - id needs to exist:

curl -u test:test -X POST -H 'Content-Type: application/json' -i http://localhost:8080/user --data '{
"id":"13",
"username":"updateuser",
"password":"test1vfdgvdf",
"status":"ACTIVATED"
}'



PUT /user - adds a new user:

curl -u test:test -X PUT -H 'Content-Type: application/json' -i http://localhost:8080/user --data '{
"username":"new_user",
"password":"test1vfdgvdf",
"status":"ACTIVATED"
}'



DELETE /user - needs an ID

curl -u test:test -X DELETE -i 'http://localhost:8080/user?id=13'



