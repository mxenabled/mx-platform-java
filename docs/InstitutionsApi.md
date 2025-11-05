# InstitutionsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listFavoriteInstitutions**](InstitutionsApi.md#listFavoriteInstitutions) | **GET** /institutions/favorites | List favorite institutions |
| [**listInstitutionCredentials**](InstitutionsApi.md#listInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | List institution credentials |
| [**listInstitutions**](InstitutionsApi.md#listInstitutions) | **GET** /institutions | List institutions |
| [**readInstitution**](InstitutionsApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution |


<a id="listFavoriteInstitutions"></a>
# **listFavoriteInstitutions**
> InstitutionsResponseBody listFavoriteInstitutions(isoCountryCode, page, recordsPerPage)

List favorite institutions

This endpoint returns a paginated list containing institutions that have been set as the partner’s favorites, sorted by popularity. Please contact MX to set a list of favorites.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
    List<String> isoCountryCode = Arrays.asList(); // List<String> | An array of strings that filters institutions in the widget by the specified country code. Acceptable codes include `US`, `CA`, and `MX` (Mexico).
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `100`. If the value exceeds `100`, the default value of `25` will be used instead.
    try {
      InstitutionsResponseBody result = apiInstance.listFavoriteInstitutions(isoCountryCode, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#listFavoriteInstitutions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **isoCountryCode** | [**List&lt;String&gt;**](String.md)| An array of strings that filters institutions in the widget by the specified country code. Acceptable codes include &#x60;US&#x60;, &#x60;CA&#x60;, and &#x60;MX&#x60; (Mexico). | [optional] |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;100&#x60;. If the value exceeds &#x60;100&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**InstitutionsResponseBody**](InstitutionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInstitutionCredentials"></a>
# **listInstitutionCredentials**
> CredentialsResponseBody listInstitutionCredentials(institutionCode, page, recordsPerPage)

List institution credentials

Use this endpoint to see which credentials will be needed to create a member for a specific institution.  Passing an invalid &#x60;institution_code&#x60; returns a &#x60;404&#x60;. 

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
    String institutionCode = "mxbank"; // String | The institution_code of the institution.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      CredentialsResponseBody result = apiInstance.listInstitutionCredentials(institutionCode, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#listInstitutionCredentials");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionCode** | **String**| The institution_code of the institution. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**CredentialsResponseBody**](CredentialsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInstitutions"></a>
# **listInstitutions**
> InstitutionsResponseBody listInstitutions(name, isoCountryCode, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory)

List institutions

This endpoint returns a list of institutions based on the specified search term or parameter.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
    String name = "mxbank"; // String | This will list only institutions in which the appended string appears.
    List<String> isoCountryCode = Arrays.asList(); // List<String> | An array of strings that filters institutions in the widget by the specified country code. Acceptable codes include `US`, `CA`, and `MX` (Mexico).
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `100`. If the value exceeds `100`, the default value of `25` will be used instead.
    Boolean supportsAccountIdentification = true; // Boolean | Filter only institutions which support account identification.
    Boolean supportsAccountStatement = true; // Boolean | Filter only institutions which support account statements.
    Boolean supportsAccountVerification = true; // Boolean | Filter only institutions which support account verification.
    Boolean supportsTransactionHistory = true; // Boolean | Filter only institutions which support extended transaction history.
    try {
      InstitutionsResponseBody result = apiInstance.listInstitutions(name, isoCountryCode, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#listInstitutions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| This will list only institutions in which the appended string appears. | [optional] |
| **isoCountryCode** | [**List&lt;String&gt;**](String.md)| An array of strings that filters institutions in the widget by the specified country code. Acceptable codes include &#x60;US&#x60;, &#x60;CA&#x60;, and &#x60;MX&#x60; (Mexico). | [optional] |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;100&#x60;. If the value exceeds &#x60;100&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |
| **supportsAccountIdentification** | **Boolean**| Filter only institutions which support account identification. | [optional] |
| **supportsAccountStatement** | **Boolean**| Filter only institutions which support account statements. | [optional] |
| **supportsAccountVerification** | **Boolean**| Filter only institutions which support account verification. | [optional] |
| **supportsTransactionHistory** | **Boolean**| Filter only institutions which support extended transaction history. | [optional] |

### Return type

[**InstitutionsResponseBody**](InstitutionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readInstitution"></a>
# **readInstitution**
> InstitutionResponseBody readInstitution(institutionCode)

Read institution

This endpoint returns information about the institution specified by &#x60;institution_code&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InstitutionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
    String institutionCode = "mxbank"; // String | The institution_code of the institution.
    try {
      InstitutionResponseBody result = apiInstance.readInstitution(institutionCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstitutionsApi#readInstitution");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionCode** | **String**| The institution_code of the institution. | |

### Return type

[**InstitutionResponseBody**](InstitutionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

