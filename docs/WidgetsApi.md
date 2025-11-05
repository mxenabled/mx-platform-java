# WidgetsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestConnectWidgetURL**](WidgetsApi.md#requestConnectWidgetURL) | **POST** /users/{user_guid}/connect_widget_url | (Deprecated) Request connect widget URL |
| [**requestOAuthWindowURI**](WidgetsApi.md#requestOAuthWindowURI) | **GET** /users/{user_guid}/members/{member_guid}/oauth_window_uri | Request oauth window uri |
| [**requestWidgetURL**](WidgetsApi.md#requestWidgetURL) | **POST** /users/{user_guid}/widget_urls | Request widget URL |


<a id="requestConnectWidgetURL"></a>
# **requestConnectWidgetURL**
> ConnectWidgetResponseBody requestConnectWidgetURL(userGuid, connectWidgetRequestBody)

(Deprecated) Request connect widget URL

This endpoint will return a URL for an embeddable version of MX Connect.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.WidgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WidgetsApi apiInstance = new WidgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ConnectWidgetRequestBody connectWidgetRequestBody = new ConnectWidgetRequestBody(); // ConnectWidgetRequestBody | Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials)
    try {
      ConnectWidgetResponseBody result = apiInstance.requestConnectWidgetURL(userGuid, connectWidgetRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#requestConnectWidgetURL");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **connectWidgetRequestBody** | [**ConnectWidgetRequestBody**](ConnectWidgetRequestBody.md)| Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials) | |

### Return type

[**ConnectWidgetResponseBody**](ConnectWidgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestOAuthWindowURI"></a>
# **requestOAuthWindowURI**
> OAuthWindowResponseBody requestOAuthWindowURI(memberGuid, userGuid, clientRedirectUrl, enableApp2app, referralSource, skipAggregation, uiMessageWebviewUrlScheme)

Request oauth window uri

This endpoint will generate an &#x60;oauth_window_uri&#x60; for the specified &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.WidgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WidgetsApi apiInstance = new WidgetsApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String clientRedirectUrl = "https://{yoursite.com}"; // String | A URL that MX will redirect to at the end of OAuth with additional query parameters. Only available with `referral_source=APP`.
    String enableApp2app = "false"; // String | This indicates whether OAuth app2app behavior is enabled for institutions that support it. Defaults to `true`. When set to `false`, any `oauth_window_uri` generated will **not** direct the end user to the institution's mobile application. This setting is not persistent. This setting currently only affects Chase institutions.
    String referralSource = "APP"; // String | Must be either `BROWSER` or `APP` depending on the implementation. Defaults to `BROWSER`.
    Boolean skipAggregation = false; // Boolean | Setting this parameter to `true` will prevent the member from automatically aggregating after being redirected from the authorization page.
    String uiMessageWebviewUrlScheme = "uiMessageWebviewUrlScheme_example"; // String | A scheme for routing the user back to the application state they were previously in. Only available with `referral_source=APP`.
    try {
      OAuthWindowResponseBody result = apiInstance.requestOAuthWindowURI(memberGuid, userGuid, clientRedirectUrl, enableApp2app, referralSource, skipAggregation, uiMessageWebviewUrlScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#requestOAuthWindowURI");
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
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **clientRedirectUrl** | **String**| A URL that MX will redirect to at the end of OAuth with additional query parameters. Only available with &#x60;referral_source&#x3D;APP&#x60;. | [optional] |
| **enableApp2app** | **String**| This indicates whether OAuth app2app behavior is enabled for institutions that support it. Defaults to &#x60;true&#x60;. When set to &#x60;false&#x60;, any &#x60;oauth_window_uri&#x60; generated will **not** direct the end user to the institution&#39;s mobile application. This setting is not persistent. This setting currently only affects Chase institutions. | [optional] |
| **referralSource** | **String**| Must be either &#x60;BROWSER&#x60; or &#x60;APP&#x60; depending on the implementation. Defaults to &#x60;BROWSER&#x60;. | [optional] |
| **skipAggregation** | **Boolean**| Setting this parameter to &#x60;true&#x60; will prevent the member from automatically aggregating after being redirected from the authorization page. | [optional] |
| **uiMessageWebviewUrlScheme** | **String**| A scheme for routing the user back to the application state they were previously in. Only available with &#x60;referral_source&#x3D;APP&#x60;. | [optional] |

### Return type

[**OAuthWindowResponseBody**](OAuthWindowResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestWidgetURL"></a>
# **requestWidgetURL**
> WidgetResponseBody requestWidgetURL(userGuid, widgetRequestBody, acceptLanguage, X_CALLBACK_PAYLOAD)

Request widget URL

Get an embeddable URL for integrating a widget into your website or app. The URL expires after ten minutes or upon first use, whichever occurs first. You&#39;ll need to obtain a new URL each time the page loads or reloads.  Include the &#x60;widget_type&#x60; in the request body to specify which widget you want to embed—the Connect Widget, a Personal Financial Management widget, or an Insights widget. Some request parameters are specific to certain widget types.  To embed the Connect Widget, set &#x60;widget_type&#x60; to &#x60;connect_widget&#x60;.  For a full list of available widget types, see [Widget Types](/api-reference/platform-api/reference/widgets#widget-types). 

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.WidgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    WidgetsApi apiInstance = new WidgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    WidgetRequestBody widgetRequestBody = new WidgetRequestBody(); // WidgetRequestBody | The widget url configuration options.
    String acceptLanguage = "en-US"; // String | The desired language of the widget.
    String X_CALLBACK_PAYLOAD = "813e50bd-4a7e-4517-b6bb-9eef65a68cbd"; // String | The base64 encoded string defined in this header will be returned in the [Member](/resources/webhooks/member/) and [Member Data Updated](/resources/webhooks/member#member-data-updated) webhooks. This allows you to trace user interactions and workflows initiated externally and internally in the MX Platform. Max 1024 characters.
    try {
      WidgetResponseBody result = apiInstance.requestWidgetURL(userGuid, widgetRequestBody, acceptLanguage, X_CALLBACK_PAYLOAD);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#requestWidgetURL");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **widgetRequestBody** | [**WidgetRequestBody**](WidgetRequestBody.md)| The widget url configuration options. | |
| **acceptLanguage** | **String**| The desired language of the widget. | [optional] |
| **X_CALLBACK_PAYLOAD** | **String**| The base64 encoded string defined in this header will be returned in the [Member](/resources/webhooks/member/) and [Member Data Updated](/resources/webhooks/member#member-data-updated) webhooks. This allows you to trace user interactions and workflows initiated externally and internally in the MX Platform. Max 1024 characters. | [optional] |

### Return type

[**WidgetResponseBody**](WidgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

