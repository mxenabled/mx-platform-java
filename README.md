*This project is currently in **Beta**. Please open up an issue [here](https://github.com/mxenabled/mx-platform-java/issues) to report issues using the MX Platform API Java Library.*

# MX Platform Java

The MX Platform API is a powerful, fully-featured API designed to make aggregating and enhancing financial data easy and reliable. It can seamlessly connect your app or website to tens of thousands of financial institutions.

For more information, please [visit](https://www.mx.com/products/platform-api)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven

### Documentation

See the [documentation](https://docs.mx.com/api).

## Installation

To install the API client library to your local Maven repository, generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:
  - `target/mx-platform-java-0.1.0.jar`
  - `target/lib/*.jar`

## Getting Started

In order to make requests, you will need to [sign up](https://dashboard.mx.com/sign_up) for the MX Platform API and get a `Client ID` and `API Key`.

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mx.client.*;
import com.mx.client.auth.*;
import com.mx.client.model.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class MxPlatformApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.mx.com");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
        String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
        String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
        try {
            MemberResponseBody result = apiInstance.aggregateMember(memberGuid, userGuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MxPlatformApi#aggregateMember");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
