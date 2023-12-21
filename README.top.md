#  Kotlin Multiplatform client library for Adyen's API

A kotlin multiplatform library for Adyen's api generated with openapi-generator based on the "multiplatform" target.

To regenerate, call:

```
make models
```



# Missing Crypto for Terminals

Note, this library is missing the crypto need for api calls to terminals.

See: https://github.com/Adyen/adyen-java-api-library/blob/main/src/main/java/com/adyen/terminal/security/NexoCrypto.java

This still needs to be implemented.

