# ManagedDataApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManagedAccount**](ManagedDataApi.md#createManagedAccount) | **POST** /users/{user_guid}/managed_members/{member_guid}/accounts | Create managed account |
| [**createManagedMember**](ManagedDataApi.md#createManagedMember) | **POST** /users/{user_guid}/managed_members | Create managed member |
| [**createManagedTransaction**](ManagedDataApi.md#createManagedTransaction) | **POST** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions | Create managed transaction |
| [**deleteManagedAccount**](ManagedDataApi.md#deleteManagedAccount) | **DELETE** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Delete managed account |
| [**deleteManagedMember**](ManagedDataApi.md#deleteManagedMember) | **DELETE** /users/{user_guid}/managed_members/{member_guid} | Delete managed member |
| [**deleteManagedTransaction**](ManagedDataApi.md#deleteManagedTransaction) | **DELETE** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Delete managed transaction |
| [**listManagedAccounts**](ManagedDataApi.md#listManagedAccounts) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts | List managed accounts |
| [**listManagedInstitutions**](ManagedDataApi.md#listManagedInstitutions) | **GET** /managed_institutions | List managed institutions |
| [**listManagedMembers**](ManagedDataApi.md#listManagedMembers) | **GET** /users/{user_guid}/managed_members | List managed members |
| [**listManagedTransactions**](ManagedDataApi.md#listManagedTransactions) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions | List managed transactions |
| [**readManagedAccount**](ManagedDataApi.md#readManagedAccount) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Read managed account |
| [**readManagedMember**](ManagedDataApi.md#readManagedMember) | **GET** /users/{user_guid}/managed_members/{member_guid} | Read managed member |
| [**readManagedTransaction**](ManagedDataApi.md#readManagedTransaction) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Read managed transaction |
| [**updateManagedAccount**](ManagedDataApi.md#updateManagedAccount) | **PUT** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Update managed account |
| [**updateManagedMember**](ManagedDataApi.md#updateManagedMember) | **PUT** /users/{user_guid}/managed_members/{member_guid} | Update managed member |
| [**updateManagedTransaction**](ManagedDataApi.md#updateManagedTransaction) | **PUT** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Update managed transaction |


<a id="createManagedAccount"></a>
# **createManagedAccount**
> AccountResponseBody createManagedAccount(memberGuid, userGuid, managedAccountCreateRequestBody)

Create managed account

Use this endpoint to create a partner-managed account.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedAccountCreateRequestBody managedAccountCreateRequestBody = new ManagedAccountCreateRequestBody(); // ManagedAccountCreateRequestBody | Managed account to be created.
    try {
      AccountResponseBody result = apiInstance.createManagedAccount(memberGuid, userGuid, managedAccountCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#createManagedAccount");
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
| **managedAccountCreateRequestBody** | [**ManagedAccountCreateRequestBody**](ManagedAccountCreateRequestBody.md)| Managed account to be created. | |

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createManagedMember"></a>
# **createManagedMember**
> MemberResponseBody createManagedMember(userGuid, managedMemberCreateRequestBody)

Create managed member

Use this endpoint to create a new partner-managed &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedMemberCreateRequestBody managedMemberCreateRequestBody = new ManagedMemberCreateRequestBody(); // ManagedMemberCreateRequestBody | Managed member to be created.
    try {
      MemberResponseBody result = apiInstance.createManagedMember(userGuid, managedMemberCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#createManagedMember");
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
| **managedMemberCreateRequestBody** | [**ManagedMemberCreateRequestBody**](ManagedMemberCreateRequestBody.md)| Managed member to be created. | |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="createManagedTransaction"></a>
# **createManagedTransaction**
> TransactionResponseBody createManagedTransaction(accountGuid, memberGuid, userGuid, managedTransactionCreateRequestBody)

Create managed transaction

Use this endpoint to create a new partner-managed &#x60;transaction&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedTransactionCreateRequestBody managedTransactionCreateRequestBody = new ManagedTransactionCreateRequestBody(); // ManagedTransactionCreateRequestBody | Managed transaction to be created.
    try {
      TransactionResponseBody result = apiInstance.createManagedTransaction(accountGuid, memberGuid, userGuid, managedTransactionCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#createManagedTransaction");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **managedTransactionCreateRequestBody** | [**ManagedTransactionCreateRequestBody**](ManagedTransactionCreateRequestBody.md)| Managed transaction to be created. | |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteManagedAccount"></a>
# **deleteManagedAccount**
> deleteManagedAccount(accountGuid, memberGuid, userGuid)

Delete managed account

Use this endpoint to delete a partner-managed account according to its unique GUID. If successful, the API will respond with a status of &#x60;204 No Content&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteManagedAccount(accountGuid, memberGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#deleteManagedAccount");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteManagedMember"></a>
# **deleteManagedMember**
> deleteManagedMember(memberGuid, accept, userGuid)

Delete managed member

Use this endpoint to delete the specified partner-managed &#x60;member&#x60;. The endpoint will respond with a status of &#x60;204 No Content&#x60; without a resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String accept = "application/vnd.mx.api.v1+json"; // String | Specifies the media type expected in the response.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteManagedMember(memberGuid, accept, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#deleteManagedMember");
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
| **accept** | **String**| Specifies the media type expected in the response. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteManagedTransaction"></a>
# **deleteManagedTransaction**
> deleteManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid)

Delete managed transaction

Use this endpoint to delete the specified partner-managed &#x60;transaction&#x60;. The endpoint will respond with a status of &#x60;204 No Content&#x60; without a resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#deleteManagedTransaction");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="listManagedAccounts"></a>
# **listManagedAccounts**
> AccountsResponseBody listManagedAccounts(memberGuid, userGuid, page, recordsPerPage)

List managed accounts

Use this endpoint to retrieve a list of all the partner-managed accounts associated with the given partner-managed member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      AccountsResponseBody result = apiInstance.listManagedAccounts(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#listManagedAccounts");
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
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**AccountsResponseBody**](AccountsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listManagedInstitutions"></a>
# **listManagedInstitutions**
> InstitutionsResponseBody listManagedInstitutions(page, recordsPerPage)

List managed institutions

This endpoint returns a list of institutions which can be used to create partner-managed members.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      InstitutionsResponseBody result = apiInstance.listManagedInstitutions(page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#listManagedInstitutions");
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
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

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

<a id="listManagedMembers"></a>
# **listManagedMembers**
> MembersResponseBody listManagedMembers(userGuid, page, recordsPerPage)

List managed members

This endpoint returns a list of all the partner-managed members associated with the specified &#x60;user&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      MembersResponseBody result = apiInstance.listManagedMembers(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#listManagedMembers");
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
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**MembersResponseBody**](MembersResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listManagedTransactions"></a>
# **listManagedTransactions**
> TransactionsResponseBody listManagedTransactions(accountGuid, memberGuid, userGuid, page, fromDate, toDate, recordsPerPage)

List managed transactions

This endpoint returns a list of all the partner-managed transactions associated with the specified &#x60;account&#x60;, scoped through a &#x60;user&#x60; and a &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    String fromDate = "2024-01-01"; // String | Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided.
    String toDate = "2024-03-31"; // String | Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      TransactionsResponseBody result = apiInstance.listManagedTransactions(accountGuid, memberGuid, userGuid, page, fromDate, toDate, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#listManagedTransactions");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **fromDate** | **String**| Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided. | [optional] |
| **toDate** | **String**| Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**TransactionsResponseBody**](TransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readManagedAccount"></a>
# **readManagedAccount**
> AccountResponseBody readManagedAccount(accountGuid, memberGuid, userGuid)

Read managed account

Use this endpoint to read the attributes of a partner-managed account according to its unique guid.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      AccountResponseBody result = apiInstance.readManagedAccount(accountGuid, memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#readManagedAccount");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readManagedMember"></a>
# **readManagedMember**
> MemberResponseBody readManagedMember(memberGuid, userGuid)

Read managed member

This endpoint returns the attributes of the specified partner-managed&#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MemberResponseBody result = apiInstance.readManagedMember(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#readManagedMember");
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

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readManagedTransaction"></a>
# **readManagedTransaction**
> TransactionResponseBody readManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid)

Read managed transaction

Requests to this endpoint will return the attributes of the specified partner-managed &#x60;transaction&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      TransactionResponseBody result = apiInstance.readManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#readManagedTransaction");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateManagedAccount"></a>
# **updateManagedAccount**
> AccountResponseBody updateManagedAccount(accountGuid, memberGuid, userGuid, managedAccountUpdateRequestBody)

Update managed account

Use this endpoint to update the attributes of a partner-managed account according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedAccountUpdateRequestBody managedAccountUpdateRequestBody = new ManagedAccountUpdateRequestBody(); // ManagedAccountUpdateRequestBody | Managed account object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      AccountResponseBody result = apiInstance.updateManagedAccount(accountGuid, memberGuid, userGuid, managedAccountUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#updateManagedAccount");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **managedAccountUpdateRequestBody** | [**ManagedAccountUpdateRequestBody**](ManagedAccountUpdateRequestBody.md)| Managed account object to be updated (While no single parameter is required, the request body can&#39;t be empty) | |

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateManagedMember"></a>
# **updateManagedMember**
> MemberResponseBody updateManagedMember(memberGuid, userGuid, managedMemberUpdateRequestBody)

Update managed member

Use this endpoint to update the attributes of the specified partner_managed &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedMemberUpdateRequestBody managedMemberUpdateRequestBody = new ManagedMemberUpdateRequestBody(); // ManagedMemberUpdateRequestBody | Managed member object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      MemberResponseBody result = apiInstance.updateManagedMember(memberGuid, userGuid, managedMemberUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#updateManagedMember");
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
| **managedMemberUpdateRequestBody** | [**ManagedMemberUpdateRequestBody**](ManagedMemberUpdateRequestBody.md)| Managed member object to be updated (While no single parameter is required, the request body can&#39;t be empty) | |

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateManagedTransaction"></a>
# **updateManagedTransaction**
> TransactionResponseBody updateManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid, managedTransactionUpdateRequestBody)

Update managed transaction

Use this endpoint to update the attributes of the specified partner_managed &#x60;transaction&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ManagedDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ManagedDataApi apiInstance = new ManagedDataApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    ManagedTransactionUpdateRequestBody managedTransactionUpdateRequestBody = new ManagedTransactionUpdateRequestBody(); // ManagedTransactionUpdateRequestBody | Managed transaction object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      TransactionResponseBody result = apiInstance.updateManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid, managedTransactionUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedDataApi#updateManagedTransaction");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **managedTransactionUpdateRequestBody** | [**ManagedTransactionUpdateRequestBody**](ManagedTransactionUpdateRequestBody.md)| Managed transaction object to be updated (While no single parameter is required, the request body can&#39;t be empty) | |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

