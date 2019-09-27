# JWT Authentication Server
JSON Web Token Authentication Server Proof of Concept for the seminary of UTN University Degree in Informatic Systems.

## Instructions
- Endpoint "/auth" expects {username, password}, if credentials are correct it returns an object with a token.
- Endpoint "/refresh" expects a header with an expired token, returns a new token (currently this is refreshing every token, as "Refresh Token" is not implemented).
- Endpoints currently not secured.

## Users Loaded

Users loaded in H2 database for testing purposes.
 
|username|password|authorities|
|--------|--------|-----------|
|admin@admin.com|admin|administator|
|user@user.com|password|user|
