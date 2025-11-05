# MerchantsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listMerchants**](MerchantsApi.md#listMerchants) | **GET** /merchants | List merchants |
| [**readMerchant**](MerchantsApi.md#readMerchant) | **GET** /merchants/{merchant_guid} | Read merchant |
| [**readMerchantLocation**](MerchantsApi.md#readMerchantLocation) | **GET** /merchant_locations/{merchant_location_guid} | Read merchant location |


<a id="listMerchants"></a>
# **listMerchants**
> MerchantsResponseBody listMerchants(name, page, recordsPerPage)

List merchants

This endpoint returns a paginated list of all the merchants in the MX system.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String name = "Comcast"; // String | This will list only merchants in which the appended string appears.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      MerchantsResponseBody result = apiInstance.listMerchants(name, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#listMerchants");
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
| **name** | **String**| This will list only merchants in which the appended string appears. | [optional] |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**MerchantsResponseBody**](MerchantsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readMerchant"></a>
# **readMerchant**
> MerchantResponseBody readMerchant(merchantGuid)

Read merchant

Returns information about a particular merchant, such as a logo, name, and website.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String merchantGuid = "MCH-7ed79542-884d-2b1b-dd74-501c5cc9d25b"; // String | The unique id for a `merchant`.
    try {
      MerchantResponseBody result = apiInstance.readMerchant(merchantGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#readMerchant");
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
| **merchantGuid** | **String**| The unique id for a &#x60;merchant&#x60;. | |

### Return type

[**MerchantResponseBody**](MerchantResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readMerchantLocation"></a>
# **readMerchantLocation**
> MerchantLocationResponseBody readMerchantLocation(merchantLocationGuid)

Read merchant location

This endpoint returns the specified &#x60;merchant_location&#x60; resource. The &#x60;merchant_location_guid&#x60; can be found on &#x60;transaction&#x60; objects.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MerchantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MerchantsApi apiInstance = new MerchantsApi(defaultClient);
    String merchantLocationGuid = "MCH-09466f0a-fb58-9d1a-bae2-2af0afbea621"; // String | The unique id for a `merchant_location`.
    try {
      MerchantLocationResponseBody result = apiInstance.readMerchantLocation(merchantLocationGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#readMerchantLocation");
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
| **merchantLocationGuid** | **String**| The unique id for a &#x60;merchant_location&#x60;. | |

### Return type

[**MerchantLocationResponseBody**](MerchantLocationResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

