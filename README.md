*This project is currently in **Beta**. Please open up an issue [here](https://github.com/mxenabled/mx-platform-java/issues) to report issues using the MX Platform Java library.*

# MX Platform Java

The [MX Platform API](https://www.mx.com/products/platform-api) is a powerful, fully-featured API designed to make aggregating and enhancing financial data easy and reliable. It can seamlessly connect your app or website to tens of thousands of financial institutions.

## Documentation

Examples for the API endpoints can be found [here.](https://docs.mx.com/api)

## Requirements

Building the API client library requires:

- Java 1.7+
- Maven

## Installation

To install the API client library to your local Maven repository, generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:
  - `target/mx-platform-java-0.6.1.jar`
  - `target/lib/*.jar`

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mx</groupId>
  <artifactId>mx-platform-java</artifactId>
  <version>0.6.1</version>
  <scope>compile</scope>
</dependency>
```

You can find the MX Platform Java Library in the [Maven Central Repository](https://search.maven.org/search?q=mx-platform-java).

## Getting Started

In order to make requests, you will need to [sign up](https://dashboard.mx.com/sign_up) for the MX Platform API and get a `Client ID` and `API Key`.

Please follow the [installation](#installation) procedure and then run the following code to create your first User:

```java
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.model.*;
import com.mx.client.mx_platform_api.MxPlatformApi;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.addDefaultHeader("Accept", "application/vnd.mx.api.v1+json");

        // Configure environment. https://int-api.mx.com for development, https://api.mx.com for production
        defaultClient.setBasePath("https://int-api.mx.com");

        // Configure with your Client ID/API Key from https://dashboard.mx.com
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("Your Client ID");
        basicAuth.setPassword("Your API Key");

        MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);

        UserCreateRequestBody userCreateRequestBody = new UserCreateRequestBody();
        UserCreateRequest userCreateRequest = new UserCreateRequest();
        userCreateRequest.setMetadata("Creating a user!");
        userCreateRequestBody.setUser(userCreateRequest);

        try {
            UserResponseBody response = apiInstance.createUser(userCreateRequestBody);
            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling MxPlatformApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Development

This project was generated by the [OpenAPI Generator](https://openapi-generator.tech). To generate this library, verify you have the latest version of the `openapi-generator-cli` found [here.](https://github.com/OpenAPITools/openapi-generator#17---npm)

Running the following command in this repo's directory will generate this library using the [MX Platform API OpenAPI spec](https://github.com/mxenabled/openapi/blob/master/openapi/mx_platform_api.yml) with our [configuration and templates.](https://github.com/mxenabled/mx-platform-ruby/tree/master/openapi)
```shell
openapi-generator-cli generate \
-i https://raw.githubusercontent.com/mxenabled/openapi/master/openapi/mx_platform_api.yml \
-g java \
-c ./openapi/config.yml \
-t ./openapi/templates
```

## Contributing

Please [open an issue](https://github.com/mxenabled/mx-platform-java/issues) or [submit a pull request.](https://github.com/mxenabled/mx-platform-java/pulls)
