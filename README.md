# coinbase-api-v2-java
A non-official Java library for Coinbase v2 API
https://developers.coinbase.com/api/v2

## How to use ?

### 1. Authentication context

#### 1a. By Coinbase API Key

API Key is used when you provide services for your own
```java
CoinbaseAuthenticationBearer auth = new CoinbaseAuthenticationApiKey("{MY_COINBASE_API_KEY}");
```


#### 1b. By Coinbase OAuth service

OAuth is used when you provide services for a third party
```java
CoinbaseAuthenticationBearer auth = new CoinbaseAuthenticationOAuth("{ACCESS_TOKEN_RETRIEVED_BY_AUTH}");
```


### 2. Call Coinbase user remote services

```java
CoinbaseUserService userService = new CoinbaseUserService();
```

#### 2a. Show current user informations
```java
CoinbaseUser user = userService.showCurrent(auth);
```


#### 2b. Show current user authorizations
```java
CoinbaseAuthInfo informations = userService.showAuthorizationInformation(auth);
```

## Current limitations
	
- The remote call by OAuth is not tested yet
- All the features from API are not yet implemented (please ask if you want one missing quickly)


## License
__***For non-commercial use only !***__
Please contact me if you want to use it for commercial use.


## Who to thanks ?
This API was written by Yoan Africa.
