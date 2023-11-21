# MxPlatformApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aggregateMember**](MxPlatformApi.md#aggregateMember) | **POST** /users/{user_guid}/members/{member_guid}/aggregate | Aggregate member |
| [**checkBalances**](MxPlatformApi.md#checkBalances) | **POST** /users/{user_guid}/members/{member_guid}/check_balance | Check balances |
| [**createCategory**](MxPlatformApi.md#createCategory) | **POST** /users/{user_guid}/categories | Create category |
| [**createManagedAccount**](MxPlatformApi.md#createManagedAccount) | **POST** /users/{user_guid}/managed_members/{member_guid}/accounts | Create managed account |
| [**createManagedMember**](MxPlatformApi.md#createManagedMember) | **POST** /users/{user_guid}/managed_members | Create managed member |
| [**createManagedTransaction**](MxPlatformApi.md#createManagedTransaction) | **POST** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions | Create managed transaction |
| [**createManualAccount**](MxPlatformApi.md#createManualAccount) | **POST** /users/{user_guid}/accounts | Create manual account |
| [**createMember**](MxPlatformApi.md#createMember) | **POST** /users/{user_guid}/members | Create member |
| [**createTag**](MxPlatformApi.md#createTag) | **POST** /users/{user_guid}/tags | Create tag |
| [**createTagging**](MxPlatformApi.md#createTagging) | **POST** /users/{user_guid}/taggings | Create tagging |
| [**createTransactionRule**](MxPlatformApi.md#createTransactionRule) | **POST** /users/{user_guid}/transaction_rules | Create transaction rule |
| [**createUser**](MxPlatformApi.md#createUser) | **POST** /users | Create user |
| [**deleteCategory**](MxPlatformApi.md#deleteCategory) | **DELETE** /users/{user_guid}/categories/{category_guid} | Delete category |
| [**deleteManagedAccount**](MxPlatformApi.md#deleteManagedAccount) | **DELETE** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Delete managed account |
| [**deleteManagedMember**](MxPlatformApi.md#deleteManagedMember) | **DELETE** /users/{user_guid}/managed_members/{member_guid} | Delete managed member |
| [**deleteManagedTransaction**](MxPlatformApi.md#deleteManagedTransaction) | **DELETE** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Delete managed transaction |
| [**deleteManualAccount**](MxPlatformApi.md#deleteManualAccount) | **DELETE** /users/{user_guid}/accounts/{account_guid} | Delete manual account |
| [**deleteMember**](MxPlatformApi.md#deleteMember) | **DELETE** /users/{user_guid}/members/{member_guid} | Delete member |
| [**deleteTag**](MxPlatformApi.md#deleteTag) | **DELETE** /users/{user_guid}/tags/{tag_guid} | Delete tag |
| [**deleteTagging**](MxPlatformApi.md#deleteTagging) | **DELETE** /users/{user_guid}/taggings/{tagging_guid} | Delete tagging |
| [**deleteTransactionRule**](MxPlatformApi.md#deleteTransactionRule) | **DELETE** /users/{user_guid}/transaction_rules/{transaction_rule_guid} | Delete transaction rule |
| [**deleteUser**](MxPlatformApi.md#deleteUser) | **DELETE** /users/{user_guid} | Delete user |
| [**deprecatedRequestPaymentProcessorAuthorizationCode**](MxPlatformApi.md#deprecatedRequestPaymentProcessorAuthorizationCode) | **POST** /payment_processor_authorization_code | (Deprecated) Request an authorization code. |
| [**downloadStatementPDF**](MxPlatformApi.md#downloadStatementPDF) | **GET** /users/{user_guid}/members/{member_guid}/statements/{statement_guid}.pdf | Download statement pdf |
| [**downloadTaxDocument**](MxPlatformApi.md#downloadTaxDocument) | **GET** /users/{user_guid}/members/{member_guid}/tax_documents/{tax_document_guid}.pdf | Download a Tax Document PDF |
| [**enhanceTransactions**](MxPlatformApi.md#enhanceTransactions) | **POST** /transactions/enhance | Enhance transactions |
| [**extendHistory**](MxPlatformApi.md#extendHistory) | **POST** /users/{user_guid}/members/{member_guid}/extend_history | Extend history |
| [**fetchStatements**](MxPlatformApi.md#fetchStatements) | **POST** /users/{user_guid}/members/{member_guid}/fetch_statements | Fetch statements |
| [**fetchTaxDocuments**](MxPlatformApi.md#fetchTaxDocuments) | **POST** /users/{user_guid}/members/{member_guid}/fetch_tax_documents | Fetch Tax Documents |
| [**identifyMember**](MxPlatformApi.md#identifyMember) | **POST** /users/{user_guid}/members/{member_guid}/identify | Identify member |
| [**listAccountNumbersByAccount**](MxPlatformApi.md#listAccountNumbersByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/account_numbers | List account numbers by account |
| [**listAccountNumbersByMember**](MxPlatformApi.md#listAccountNumbersByMember) | **GET** /users/{user_guid}/members/{member_guid}/account_numbers | List account numbers by member |
| [**listAccountOwnersByMember**](MxPlatformApi.md#listAccountOwnersByMember) | **GET** /users/{user_guid}/members/{member_guid}/account_owners | List account owners by member |
| [**listCategories**](MxPlatformApi.md#listCategories) | **GET** /users/{user_guid}/categories | List categories |
| [**listDefaultCategories**](MxPlatformApi.md#listDefaultCategories) | **GET** /categories/default | List default categories |
| [**listDefaultCategoriesByUser**](MxPlatformApi.md#listDefaultCategoriesByUser) | **GET** /users/{user_guid}/categories/default | List default categories by user |
| [**listFavoriteInstitutions**](MxPlatformApi.md#listFavoriteInstitutions) | **GET** /institutions/favorites | List favorite institutions |
| [**listHoldings**](MxPlatformApi.md#listHoldings) | **GET** /users/{user_guid}/holdings | List holdings |
| [**listHoldingsByAccount**](MxPlatformApi.md#listHoldingsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/holdings | List holdings by account |
| [**listHoldingsByMember**](MxPlatformApi.md#listHoldingsByMember) | **GET** /users/{user_guid}/members/{member_guid}/holdings | List holdings by member |
| [**listInstitutionCredentials**](MxPlatformApi.md#listInstitutionCredentials) | **GET** /institutions/{institution_code}/credentials | List institution credentials |
| [**listInstitutions**](MxPlatformApi.md#listInstitutions) | **GET** /institutions | List institutions |
| [**listManagedAccounts**](MxPlatformApi.md#listManagedAccounts) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts | List managed accounts |
| [**listManagedInstitutions**](MxPlatformApi.md#listManagedInstitutions) | **GET** /managed_institutions | List managed institutions |
| [**listManagedMembers**](MxPlatformApi.md#listManagedMembers) | **GET** /users/{user_guid}/managed_members | List managed members |
| [**listManagedTransactions**](MxPlatformApi.md#listManagedTransactions) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions | List managed transactions |
| [**listMemberAccounts**](MxPlatformApi.md#listMemberAccounts) | **GET** /users/{user_guid}/members/{member_guid}/accounts | List accounts by member |
| [**listMemberChallenges**](MxPlatformApi.md#listMemberChallenges) | **GET** /users/{user_guid}/members/{member_guid}/challenges | List member challenges |
| [**listMemberCredentials**](MxPlatformApi.md#listMemberCredentials) | **GET** /users/{user_guid}/members/{member_guid}/credentials | List member credentials |
| [**listMembers**](MxPlatformApi.md#listMembers) | **GET** /users/{user_guid}/members | List members |
| [**listMerchants**](MxPlatformApi.md#listMerchants) | **GET** /merchants | List merchants |
| [**listStatementsByMember**](MxPlatformApi.md#listStatementsByMember) | **GET** /users/{user_guid}/members/{member_guid}/statements | List statements by member |
| [**listTaggings**](MxPlatformApi.md#listTaggings) | **GET** /users/{user_guid}/taggings | List taggings |
| [**listTags**](MxPlatformApi.md#listTags) | **GET** /users/{user_guid}/tags | List tags |
| [**listTaxDocuments**](MxPlatformApi.md#listTaxDocuments) | **GET** /users/{user_guid}/members/{member_guid}/tax_documents | List Tax Documents |
| [**listTransactionRules**](MxPlatformApi.md#listTransactionRules) | **GET** /users/{user_guid}/transaction_rules | List transaction rules |
| [**listTransactions**](MxPlatformApi.md#listTransactions) | **GET** /users/{user_guid}/transactions | List transactions |
| [**listTransactionsByAccount**](MxPlatformApi.md#listTransactionsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/transactions | List transactions by account |
| [**listTransactionsByMember**](MxPlatformApi.md#listTransactionsByMember) | **GET** /users/{user_guid}/members/{member_guid}/transactions | List transactions by member |
| [**listTransactionsByTag**](MxPlatformApi.md#listTransactionsByTag) | **GET** /users/{user_guid}/tags/{tag_guid}/transactions | List transactions by tag |
| [**listUserAccounts**](MxPlatformApi.md#listUserAccounts) | **GET** /users/{user_guid}/accounts | List accounts |
| [**listUsers**](MxPlatformApi.md#listUsers) | **GET** /users | List users |
| [**readAccount**](MxPlatformApi.md#readAccount) | **GET** /users/{user_guid}/accounts/{account_guid} | Read account |
| [**readAccountByMember**](MxPlatformApi.md#readAccountByMember) | **GET** /users/{user_guid}/members/{member_guid}/accounts/{account_guid} | Read account by member |
| [**readCategory**](MxPlatformApi.md#readCategory) | **GET** /users/{user_guid}/categories/{category_guid} | Read a custom category |
| [**readDefaultCategory**](MxPlatformApi.md#readDefaultCategory) | **GET** /categories/{category_guid} | Read a default category |
| [**readHolding**](MxPlatformApi.md#readHolding) | **GET** /users/{user_guid}/holdings/{holding_guid} | Read holding |
| [**readInstitution**](MxPlatformApi.md#readInstitution) | **GET** /institutions/{institution_code} | Read institution |
| [**readManagedAccount**](MxPlatformApi.md#readManagedAccount) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Read managed account |
| [**readManagedMember**](MxPlatformApi.md#readManagedMember) | **GET** /users/{user_guid}/managed_members/{member_guid} | Read managed member |
| [**readManagedTransaction**](MxPlatformApi.md#readManagedTransaction) | **GET** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Read managed transaction |
| [**readMember**](MxPlatformApi.md#readMember) | **GET** /users/{user_guid}/members/{member_guid} | Read member |
| [**readMemberStatus**](MxPlatformApi.md#readMemberStatus) | **GET** /users/{user_guid}/members/{member_guid}/status | Read member status |
| [**readMerchant**](MxPlatformApi.md#readMerchant) | **GET** /merchants/{merchant_guid} | Read merchant |
| [**readMerchantLocation**](MxPlatformApi.md#readMerchantLocation) | **GET** /merchant_locations/{merchant_location_guid} | Read merchant location |
| [**readStatementByMember**](MxPlatformApi.md#readStatementByMember) | **GET** /users/{user_guid}/members/{member_guid}/statements/{statement_guid} | Read statement by member |
| [**readTag**](MxPlatformApi.md#readTag) | **GET** /users/{user_guid}/tags/{tag_guid} | Read tag |
| [**readTagging**](MxPlatformApi.md#readTagging) | **GET** /users/{user_guid}/taggings/{tagging_guid} | Read tagging |
| [**readTaxDocument**](MxPlatformApi.md#readTaxDocument) | **GET** /users/{user_guid}/members/{member_guid}/tax_documents/{tax_document_guid} | Read a Tax Document |
| [**readTransaction**](MxPlatformApi.md#readTransaction) | **GET** /users/{user_guid}/transactions/{transaction_guid} | Read transaction |
| [**readTransactionRule**](MxPlatformApi.md#readTransactionRule) | **GET** /users/{user_guid}/transaction_rules/{transaction_rule_guid} | Read transaction rule |
| [**readUser**](MxPlatformApi.md#readUser) | **GET** /users/{user_guid} | Read user |
| [**requestAuthorizationCode**](MxPlatformApi.md#requestAuthorizationCode) | **POST** /authorization_code | Request an authorization code. |
| [**requestConnectWidgetURL**](MxPlatformApi.md#requestConnectWidgetURL) | **POST** /users/{user_guid}/connect_widget_url | Request connect widget url |
| [**requestOAuthWindowURI**](MxPlatformApi.md#requestOAuthWindowURI) | **GET** /users/{user_guid}/members/{member_guid}/oauth_window_uri | Request oauth window uri |
| [**requestWidgetURL**](MxPlatformApi.md#requestWidgetURL) | **POST** /users/{user_guid}/widget_urls | Request widget url |
| [**resumeAggregation**](MxPlatformApi.md#resumeAggregation) | **PUT** /users/{user_guid}/members/{member_guid}/resume | Resume aggregation |
| [**updateAccountByMember**](MxPlatformApi.md#updateAccountByMember) | **PUT** /users/{user_guid}/members/{member_guid}/accounts/{account_guid} | Update account by member |
| [**updateCategory**](MxPlatformApi.md#updateCategory) | **PUT** /users/{user_guid}/categories/{category_guid} | Update category |
| [**updateManagedAccount**](MxPlatformApi.md#updateManagedAccount) | **PUT** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid} | Update managed account |
| [**updateManagedMember**](MxPlatformApi.md#updateManagedMember) | **PUT** /users/{user_guid}/managed_members/{member_guid} | Update managed member |
| [**updateManagedTransaction**](MxPlatformApi.md#updateManagedTransaction) | **PUT** /users/{user_guid}/managed_members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Update managed transaction |
| [**updateMember**](MxPlatformApi.md#updateMember) | **PUT** /users/{user_guid}/members/{member_guid} | Update member |
| [**updateTag**](MxPlatformApi.md#updateTag) | **PUT** /users/{user_guid}/tags/{tag_guid} | Update tag |
| [**updateTagging**](MxPlatformApi.md#updateTagging) | **PUT** /users/{user_guid}/taggings/{tagging_guid} | Update tagging |
| [**updateTransaction**](MxPlatformApi.md#updateTransaction) | **PUT** /users/{user_guid}/transactions/{transaction_guid} | Update transaction |
| [**updateTransactionRule**](MxPlatformApi.md#updateTransactionRule) | **PUT** /users/{user_guid}/transaction_rules/{transaction_rule_guid} | Update transaction_rule |
| [**updateUser**](MxPlatformApi.md#updateUser) | **PUT** /users/{user_guid} | Update user |
| [**verifyMember**](MxPlatformApi.md#verifyMember) | **POST** /users/{user_guid}/members/{member_guid}/verify | Verify member |


<a id="aggregateMember"></a>
# **aggregateMember**
> MemberResponseBody aggregateMember(memberGuid, userGuid)

Aggregate member

Calling this endpoint initiates an aggregation event for the member. This brings in the latest account and transaction data from the connected institution. If this data has recently been updated, MX may not initiate an aggregation event.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="checkBalances"></a>
# **checkBalances**
> MemberResponseBody checkBalances(memberGuid, userGuid)

Check balances

This endpoint operates much like the aggregate member endpoint except that it gathers only account balance information; it does not gather any transaction data.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.checkBalances(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#checkBalances");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="createCategory"></a>
# **createCategory**
> CategoryResponseBody createCategory(userGuid, categoryCreateRequestBody)

Create category

Use this endpoint to create a new custom category for a specific &#x60;user&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    CategoryCreateRequestBody categoryCreateRequestBody = new CategoryCreateRequestBody(); // CategoryCreateRequestBody | Custom category object to be created
    try {
      CategoryResponseBody result = apiInstance.createCategory(userGuid, categoryCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createCategory");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **categoryCreateRequestBody** | [**CategoryCreateRequestBody**](CategoryCreateRequestBody.md)| Custom category object to be created | |

### Return type

[**CategoryResponseBody**](CategoryResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    ManagedAccountCreateRequestBody managedAccountCreateRequestBody = new ManagedAccountCreateRequestBody(); // ManagedAccountCreateRequestBody | Managed account to be created.
    try {
      AccountResponseBody result = apiInstance.createManagedAccount(memberGuid, userGuid, managedAccountCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createManagedAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
| **202** | OK |  -  |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    ManagedMemberCreateRequestBody managedMemberCreateRequestBody = new ManagedMemberCreateRequestBody(); // ManagedMemberCreateRequestBody | Managed member to be created.
    try {
      MemberResponseBody result = apiInstance.createManagedMember(userGuid, managedMemberCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createManagedMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    ManagedTransactionCreateRequestBody managedTransactionCreateRequestBody = new ManagedTransactionCreateRequestBody(); // ManagedTransactionCreateRequestBody | Managed transaction to be created.
    try {
      TransactionResponseBody result = apiInstance.createManagedTransaction(accountGuid, memberGuid, userGuid, managedTransactionCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createManagedTransaction");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
| **202** | OK |  -  |

<a id="createManualAccount"></a>
# **createManualAccount**
> AccountResponseBody createManualAccount(userGuid, accountCreateRequestBody)

Create manual account

This endpoint can only be used to create manual accounts. Creating a manual account will automatically create it under the Manual Institution member. Since a manual account has no credentials tied to the member, the account will never aggregate or include data from a data feed..

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    AccountCreateRequestBody accountCreateRequestBody = new AccountCreateRequestBody(); // AccountCreateRequestBody | Manual account object to be created.
    try {
      AccountResponseBody result = apiInstance.createManualAccount(userGuid, accountCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createManualAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **accountCreateRequestBody** | [**AccountCreateRequestBody**](AccountCreateRequestBody.md)| Manual account object to be created. | |

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

<a id="createMember"></a>
# **createMember**
> MemberResponseBody createMember(userGuid, memberCreateRequestBody)

Create member

This endpoint allows you to create a new member. Members are created with the required parameters credentials and institution_code, and the optional parameters id and metadata. When creating a member, youll need to include the correct type of credential required by the financial institution and provided by the user. You can find out which credential type is required with the &#x60;/institutions/{institution_code}/credentials&#x60; endpoint. If successful, the MX Platform API will respond with the newly-created member object. Once you successfully create a member, MX will immediately validate the provided credentials and attempt to aggregate data for accounts and transactions.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    MemberCreateRequestBody memberCreateRequestBody = new MemberCreateRequestBody(); // MemberCreateRequestBody | Member object to be created with optional parameters (id and metadata) and required parameters (credentials and institution_code)
    try {
      MemberResponseBody result = apiInstance.createMember(userGuid, memberCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **memberCreateRequestBody** | [**MemberCreateRequestBody**](MemberCreateRequestBody.md)| Member object to be created with optional parameters (id and metadata) and required parameters (credentials and institution_code) | |

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
| **202** | Accepted |  -  |

<a id="createTag"></a>
# **createTag**
> TagResponseBody createTag(userGuid, tagCreateRequestBody)

Create tag

Use this endpoint to create a new custom tag.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TagCreateRequestBody tagCreateRequestBody = new TagCreateRequestBody(); // TagCreateRequestBody | Tag object to be created with required parameters (tag_guid)
    try {
      TagResponseBody result = apiInstance.createTag(userGuid, tagCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createTag");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **tagCreateRequestBody** | [**TagCreateRequestBody**](TagCreateRequestBody.md)| Tag object to be created with required parameters (tag_guid) | |

### Return type

[**TagResponseBody**](TagResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createTagging"></a>
# **createTagging**
> TaggingResponseBody createTagging(userGuid, taggingCreateRequestBody)

Create tagging

Use this endpoint to create a new association between a tag and a particular transaction, according to their unique GUIDs.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TaggingCreateRequestBody taggingCreateRequestBody = new TaggingCreateRequestBody(); // TaggingCreateRequestBody | Tagging object to be created with required parameters (tag_guid and transaction_guid)
    try {
      TaggingResponseBody result = apiInstance.createTagging(userGuid, taggingCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createTagging");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **taggingCreateRequestBody** | [**TaggingCreateRequestBody**](TaggingCreateRequestBody.md)| Tagging object to be created with required parameters (tag_guid and transaction_guid) | |

### Return type

[**TaggingResponseBody**](TaggingResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Accepted |  -  |

<a id="createTransactionRule"></a>
# **createTransactionRule**
> TransactionRuleResponseBody createTransactionRule(userGuid, transactionRuleCreateRequestBody)

Create transaction rule

Use this endpoint to create a new transaction rule. The newly-created &#x60;transaction_rule&#x60; object will be returned if successful.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TransactionRuleCreateRequestBody transactionRuleCreateRequestBody = new TransactionRuleCreateRequestBody(); // TransactionRuleCreateRequestBody | TransactionRule object to be created with optional parameters (description) and required parameters (category_guid and match_description)
    try {
      TransactionRuleResponseBody result = apiInstance.createTransactionRule(userGuid, transactionRuleCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#createTransactionRule");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **transactionRuleCreateRequestBody** | [**TransactionRuleCreateRequestBody**](TransactionRuleCreateRequestBody.md)| TransactionRule object to be created with optional parameters (description) and required parameters (category_guid and match_description) | |

### Return type

[**TransactionRuleResponseBody**](TransactionRuleResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createUser"></a>
# **createUser**
> UserResponseBody createUser(userCreateRequestBody)

Create user

Use this endpoint to create a new user. The API will respond with the newly-created user object if successful. Disabling a user means that accounts and transactions associated with it will not be updated in the background by MX. It will also restrict access to that user’s data until they are no longer disabled.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    UserCreateRequestBody userCreateRequestBody = new UserCreateRequestBody(); // UserCreateRequestBody | User object to be created. (None of these parameters are required, but the user object cannot be empty)
    try {
      UserResponseBody result = apiInstance.createUser(userCreateRequestBody);
      System.out.println(result);
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userCreateRequestBody** | [**UserCreateRequestBody**](UserCreateRequestBody.md)| User object to be created. (None of these parameters are required, but the user object cannot be empty) | |

### Return type

[**UserResponseBody**](UserResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryGuid, userGuid)

Delete category

Use this endpoint to delete a specific custom category according to its unique GUID. The API will respond with an empty object and a status of &#x60;204 No Content&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String categoryGuid = "CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874"; // String | The unique id for a `category`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteCategory(categoryGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteCategory");
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
| **categoryGuid** | **String**| The unique id for a &#x60;category&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteManagedAccount(accountGuid, memberGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteManagedAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
> deleteManagedMember(memberGuid, userGuid)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      apiInstance.deleteManagedMember(memberGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteManagedMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteManagedTransaction");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deleteManualAccount"></a>
# **deleteManualAccount**
> deleteManualAccount(accountGuid, userGuid)

Delete manual account

This endpoint deletes accounts that were manually created. The API will respond with an empty object and a status of &#x60;204 No Content&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteManualAccount(accountGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteManualAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **204** | No content. |  -  |

<a id="deleteMember"></a>
# **deleteMember**
> deleteMember(memberGuid, userGuid)

Delete member

Accessing this endpoint will permanently delete a member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      apiInstance.deleteMember(memberGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(tagGuid, userGuid)

Delete tag

Use this endpoint to permanently delete a specific tag based on its unique GUID. If successful, the API will respond with status of &#x60;204 No Content&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String tagGuid = "TAG-aef36e72-6294-4c38-844d-e573e80aed52"; // String | The unique id for a `tag`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteTag(tagGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteTag");
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
| **tagGuid** | **String**| The unique id for a &#x60;tag&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deleteTagging"></a>
# **deleteTagging**
> deleteTagging(taggingGuid, userGuid)

Delete tagging

Use this endpoint to delete a tagging according to its unique GUID. If successful, the API will respond with an empty body and a status of 204 NO Content.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String taggingGuid = "TGN-007f5486-17e1-45fc-8b87-8f03984430fe"; // String | The unique id for a `tagging`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteTagging(taggingGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteTagging");
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
| **taggingGuid** | **String**| The unique id for a &#x60;tagging&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deleteTransactionRule"></a>
# **deleteTransactionRule**
> deleteTransactionRule(transactionRuleGuid, userGuid)

Delete transaction rule

Use this endpoint to permanently delete a transaction rule based on its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String transactionRuleGuid = "TXR-a080e0f9-a2d4-4d6f-9e03-672cc357a4d3"; // String | The unique id for a `transaction_rule`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteTransactionRule(transactionRuleGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteTransactionRule");
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
| **transactionRuleGuid** | **String**| The unique id for a &#x60;transaction_rule&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(userGuid)

Delete user

Use this endpoint to delete the specified &#x60;user&#x60;. The response will have a status of &#x60;204 No Content&#x60; without an object.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.deleteUser(userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deleteUser");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="deprecatedRequestPaymentProcessorAuthorizationCode"></a>
# **deprecatedRequestPaymentProcessorAuthorizationCode**
> PaymentProcessorAuthorizationCodeResponseBody deprecatedRequestPaymentProcessorAuthorizationCode(paymentProcessorAuthorizationCodeRequestBody)

(Deprecated) Request an authorization code.

(This endpoint is deprecated. Clients should use &#x60;/authorization_code&#x60;.) Clients use this endpoint to request an authorization_code according to a user, member, and account specified in the request body. Clients then pass this code to processors. Processor access is scoped only to the user/member/account specified in this request. Before requesting an authorization_code, clients must have verified the specified member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    PaymentProcessorAuthorizationCodeRequestBody paymentProcessorAuthorizationCodeRequestBody = new PaymentProcessorAuthorizationCodeRequestBody(); // PaymentProcessorAuthorizationCodeRequestBody | The scope for the authorization code.
    try {
      PaymentProcessorAuthorizationCodeResponseBody result = apiInstance.deprecatedRequestPaymentProcessorAuthorizationCode(paymentProcessorAuthorizationCodeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#deprecatedRequestPaymentProcessorAuthorizationCode");
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
| **paymentProcessorAuthorizationCodeRequestBody** | [**PaymentProcessorAuthorizationCodeRequestBody**](PaymentProcessorAuthorizationCodeRequestBody.md)| The scope for the authorization code. | |

### Return type

[**PaymentProcessorAuthorizationCodeResponseBody**](PaymentProcessorAuthorizationCodeResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadStatementPDF"></a>
# **downloadStatementPDF**
> File downloadStatementPDF(memberGuid, statementGuid, userGuid)

Download statement pdf

Use this endpoint to download a specified statement PDF.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String statementGuid = "STA-737a344b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for a `statement`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      File result = apiInstance.downloadStatementPDF(memberGuid, statementGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#downloadStatementPDF");
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
| **statementGuid** | **String**| The unique id for a &#x60;statement&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadTaxDocument"></a>
# **downloadTaxDocument**
> File downloadTaxDocument(taxDocumentGuid, memberGuid, userGuid)

Download a Tax Document PDF

Use this endpoint to download a PDF version of the specified tax document. The endpoint URL is the base URL appended with the uri of the tax_document.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String taxDocumentGuid = "TAX-987dfds1b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `tax_document`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      File result = apiInstance.downloadTaxDocument(taxDocumentGuid, memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#downloadTaxDocument");
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
| **taxDocumentGuid** | **String**| The unique id for a &#x60;tax_document&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="enhanceTransactions"></a>
# **enhanceTransactions**
> EnhanceTransactionsResponseBody enhanceTransactions(enhanceTransactionsRequestBody)

Enhance transactions

Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    EnhanceTransactionsRequestBody enhanceTransactionsRequestBody = new EnhanceTransactionsRequestBody(); // EnhanceTransactionsRequestBody | Transaction object to be enhanced
    try {
      EnhanceTransactionsResponseBody result = apiInstance.enhanceTransactions(enhanceTransactionsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#enhanceTransactions");
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
| **enhanceTransactionsRequestBody** | [**EnhanceTransactionsRequestBody**](EnhanceTransactionsRequestBody.md)| Transaction object to be enhanced | |

### Return type

[**EnhanceTransactionsResponseBody**](EnhanceTransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="extendHistory"></a>
# **extendHistory**
> MemberResponseBody extendHistory(memberGuid, userGuid)

Extend history

Some institutions allow developers to access an extended transaction history with up to 24 months of data associated with a particular member. The process for fetching and then reading this extended transaction history is much like standard aggregation, and it may trigger multi-factor authentication.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique identifier for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`.
    try {
      MemberResponseBody result = apiInstance.extendHistory(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#extendHistory");
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
| **memberGuid** | **String**| The unique identifier for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="fetchStatements"></a>
# **fetchStatements**
> MemberResponseBody fetchStatements(memberGuid, userGuid)

Fetch statements

Use this endpoint to fetch the statements associated with a particular member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.fetchStatements(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#fetchStatements");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="fetchTaxDocuments"></a>
# **fetchTaxDocuments**
> MemberResponseBody fetchTaxDocuments(memberGuid, userGuid)

Fetch Tax Documents

Use this endpoint to fetch (aggregate) the tax documents associated with the specified member. This request **does not** return the latest tax documents. It just starts the document aggregation process and returns the initial state of the process. You must interact with the newly aggregated data using the other document endpoints in this reference. This request may also trigger multi-factor authentication which requires end-user input and a specific process for answering authentication challenges.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.fetchTaxDocuments(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#fetchTaxDocuments");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="identifyMember"></a>
# **identifyMember**
> MemberResponseBody identifyMember(memberGuid, userGuid)

Identify member

The identify endpoint begins an identification process for an already-existing member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.identifyMember(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#identifyMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="listAccountNumbersByAccount"></a>
# **listAccountNumbersByAccount**
> AccountNumbersResponseBody listAccountNumbersByAccount(accountGuid, userGuid, page, recordsPerPage)

List account numbers by account

This endpoint returns a list of account numbers associated with the specified &#x60;account&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountNumbersResponseBody result = apiInstance.listAccountNumbersByAccount(accountGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listAccountNumbersByAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**AccountNumbersResponseBody**](AccountNumbersResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listAccountNumbersByMember"></a>
# **listAccountNumbersByMember**
> AccountNumbersResponseBody listAccountNumbersByMember(memberGuid, userGuid, page, recordsPerPage)

List account numbers by member

This endpoint returns a list of account numbers associated with the specified &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountNumbersResponseBody result = apiInstance.listAccountNumbersByMember(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listAccountNumbersByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**AccountNumbersResponseBody**](AccountNumbersResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listAccountOwnersByMember"></a>
# **listAccountOwnersByMember**
> AccountOwnersResponseBody listAccountOwnersByMember(memberGuid, userGuid, page, recordsPerPage)

List account owners by member

This endpoint returns an array with information about every account associated with a particular member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountOwnersResponseBody result = apiInstance.listAccountOwnersByMember(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listAccountOwnersByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**AccountOwnersResponseBody**](AccountOwnersResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCategories"></a>
# **listCategories**
> CategoriesResponseBody listCategories(userGuid, page, recordsPerPage)

List categories

Use this endpoint to list all categories associated with a &#x60;user&#x60;, including both default and custom categories.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CategoriesResponseBody result = apiInstance.listCategories(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listCategories");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**CategoriesResponseBody**](CategoriesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listDefaultCategories"></a>
# **listDefaultCategories**
> CategoriesResponseBody listDefaultCategories(page, recordsPerPage)

List default categories

Use this endpoint to retrieve a list of all the default categories and subcategories offered within the MX Platform API. In other words, each item in the returned list will have its &#x60;is_default&#x60; field set to &#x60;true&#x60;. There are currently 119 default categories and subcategories. Both the _list default categories_ and _list default categories by user_ endpoints return the same results. The different routes are provided for convenience.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CategoriesResponseBody result = apiInstance.listDefaultCategories(page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listDefaultCategories");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**CategoriesResponseBody**](CategoriesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listDefaultCategoriesByUser"></a>
# **listDefaultCategoriesByUser**
> CategoriesResponseBody listDefaultCategoriesByUser(userGuid, page, recordsPerPage)

List default categories by user

Use this endpoint to retrieve a list of all the default categories and subcategories, scoped by user, offered within the MX Platform API. In other words, each item in the returned list will have its &#x60;is_default&#x60; field set to &#x60;true&#x60;. There are currently 119 default categories and subcategories. Both the _list default categories_ and _list default categories by user_ endpoints return the same results. The different routes are provided for convenience.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CategoriesResponseBody result = apiInstance.listDefaultCategoriesByUser(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listDefaultCategoriesByUser");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**CategoriesResponseBody**](CategoriesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFavoriteInstitutions"></a>
# **listFavoriteInstitutions**
> InstitutionsResponseBody listFavoriteInstitutions(page, recordsPerPage)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      InstitutionsResponseBody result = apiInstance.listFavoriteInstitutions(page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listFavoriteInstitutions");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listHoldings"></a>
# **listHoldings**
> HoldingsResponseBody listHoldings(userGuid, fromDate, page, recordsPerPage, toDate)

List holdings

This endpoint returns all holdings associated with the specified &#x60;user&#x60; across all accounts and members.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    String fromDate = "2015-09-20"; // String | Filter holdings from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter holdings to this date.
    try {
      HoldingsResponseBody result = apiInstance.listHoldings(userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listHoldings");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter holdings from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter holdings to this date. | [optional] |

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listHoldingsByAccount"></a>
# **listHoldingsByAccount**
> HoldingsResponseBody listHoldingsByAccount(accountGuid, userGuid, fromDate, page, recordsPerPage, toDate)

List holdings by account

This endpoint returns all holdings associated with the specified &#x60;account&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for the `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for the `user`.
    String fromDate = "2015-09-20"; // String | Filter holdings from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter holdings to this date.
    try {
      HoldingsResponseBody result = apiInstance.listHoldingsByAccount(accountGuid, userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listHoldingsByAccount");
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
| **accountGuid** | **String**| The unique id for the &#x60;account&#x60;. | |
| **userGuid** | **String**| The unique id for the &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter holdings from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter holdings to this date. | [optional] |

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listHoldingsByMember"></a>
# **listHoldingsByMember**
> HoldingsResponseBody listHoldingsByMember(memberGuid, userGuid, fromDate, page, recordsPerPage, toDate)

List holdings by member

This endpoint returns all holdings associated with the specified &#x60;member&#x60; across all accounts.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    String fromDate = "2015-09-20"; // String | Filter holdings from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter holdings to this date.
    try {
      HoldingsResponseBody result = apiInstance.listHoldingsByMember(memberGuid, userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listHoldingsByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter holdings from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter holdings to this date. | [optional] |

### Return type

[**HoldingsResponseBody**](HoldingsResponseBody.md)

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

Use this endpoint to see which credentials will be needed to create a member for a specific institution.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String institutionCode = "chase"; // String | The institution_code of the institution.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CredentialsResponseBody result = apiInstance.listInstitutionCredentials(institutionCode, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listInstitutionCredentials");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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
> InstitutionsResponseBody listInstitutions(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String name = "chase"; // String | This will list only institutions in which the appended string appears.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    Boolean supportsAccountIdentification = true; // Boolean | Filter only institutions which support account identification.
    Boolean supportsAccountStatement = true; // Boolean | Filter only institutions which support account statements.
    Boolean supportsAccountVerification = true; // Boolean | Filter only institutions which support account verification.
    Boolean supportsTransactionHistory = true; // Boolean | Filter only institutions which support extended transaction history.
    try {
      InstitutionsResponseBody result = apiInstance.listInstitutions(name, page, recordsPerPage, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsTransactionHistory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listInstitutions");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
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

<a id="listManagedAccounts"></a>
# **listManagedAccounts**
> AccountsResponseBody listManagedAccounts(memberGuid, userGuid, page, recordsPerPage)

List managed accounts

Use this endpoint to retrieve a list of all the partner-managed accounts associated with the given partner-manage member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountsResponseBody result = apiInstance.listManagedAccounts(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listManagedAccounts");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      InstitutionsResponseBody result = apiInstance.listManagedInstitutions(page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listManagedInstitutions");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      MembersResponseBody result = apiInstance.listManagedMembers(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listManagedMembers");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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
> TransactionsResponseBody listManagedTransactions(accountGuid, memberGuid, userGuid, page, recordsPerPage)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TransactionsResponseBody result = apiInstance.listManagedTransactions(accountGuid, memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listManagedTransactions");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listMemberAccounts"></a>
# **listMemberAccounts**
> AccountsResponseBody listMemberAccounts(userGuid, memberGuid, memberIsManagedByUser, page, recordsPerPage)

List accounts by member

This endpoint returns a list of all the accounts associated with the specified &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    Boolean memberIsManagedByUser = true; // Boolean | List only accounts whose member is managed by the user.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountsResponseBody result = apiInstance.listMemberAccounts(userGuid, memberGuid, memberIsManagedByUser, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listMemberAccounts");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **memberIsManagedByUser** | **Boolean**| List only accounts whose member is managed by the user. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listMemberChallenges"></a>
# **listMemberChallenges**
> ChallengesResponseBody listMemberChallenges(memberGuid, userGuid, page, recordsPerPage)

List member challenges

Use this endpoint for information on what multi-factor authentication challenges need to be answered in order to aggregate a member. If the aggregation is not challenged, i.e., the member does not have a connection status of &#x60;CHALLENGED&#x60;, then code &#x60;204 No Content&#x60; will be returned. If the aggregation has been challenged, i.e., the member does have a connection status of &#x60;CHALLENGED&#x60;, then code &#x60;200 OK&#x60; will be returned - along with the corresponding credentials.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      ChallengesResponseBody result = apiInstance.listMemberChallenges(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listMemberChallenges");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**ChallengesResponseBody**](ChallengesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMemberCredentials"></a>
# **listMemberCredentials**
> CredentialsResponseBody listMemberCredentials(memberGuid, userGuid, page, recordsPerPage)

List member credentials

This endpoint returns an array which contains information on every non-MFA credential associated with a specific member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CredentialsResponseBody result = apiInstance.listMemberCredentials(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listMemberCredentials");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listMembers"></a>
# **listMembers**
> MembersResponseBody listMembers(userGuid, page, recordsPerPage)

List members

This endpoint returns an array which contains information on every member associated with a specific user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      MembersResponseBody result = apiInstance.listMembers(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listMembers");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listMerchants"></a>
# **listMerchants**
> MerchantsResponseBody listMerchants(page, recordsPerPage)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      MerchantsResponseBody result = apiInstance.listMerchants(page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listMerchants");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listStatementsByMember"></a>
# **listStatementsByMember**
> StatementsResponseBody listStatementsByMember(memberGuid, userGuid, page, recordsPerPage)

List statements by member

Use this endpoint to get an array of available statements.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      StatementsResponseBody result = apiInstance.listStatementsByMember(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listStatementsByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**StatementsResponseBody**](StatementsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTaggings"></a>
# **listTaggings**
> TaggingsResponseBody listTaggings(userGuid, page, recordsPerPage)

List taggings

Use this endpoint to retrieve a list of all the taggings associated with a specific user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TaggingsResponseBody result = apiInstance.listTaggings(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTaggings");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**TaggingsResponseBody**](TaggingsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTags"></a>
# **listTags**
> TagsResponseBody listTags(userGuid, page, recordsPerPage)

List tags

Use this endpoint to list all tags associated with the specified &#x60;user&#x60;. Each user includes the &#x60;Business&#x60; tag by default.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TagsResponseBody result = apiInstance.listTags(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTags");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**TagsResponseBody**](TagsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTaxDocuments"></a>
# **listTaxDocuments**
> TaxDocumentsResponseBody listTaxDocuments(memberGuid, userGuid, page, recordsPerPage)

List Tax Documents

Use this endpoint to get a paginated list of tax documents.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TaxDocumentsResponseBody result = apiInstance.listTaxDocuments(memberGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTaxDocuments");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**TaxDocumentsResponseBody**](TaxDocumentsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactionRules"></a>
# **listTransactionRules**
> TransactionRulesResponseBody listTransactionRules(userGuid, page, recordsPerPage)

List transaction rules

Use this endpoint to read the attributes of all existing transaction rules belonging to the user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TransactionRulesResponseBody result = apiInstance.listTransactionRules(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTransactionRules");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**TransactionRulesResponseBody**](TransactionRulesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactions"></a>
# **listTransactions**
> TransactionsResponseBody listTransactions(userGuid, fromDate, page, recordsPerPage, toDate)

List transactions

Requests to this endpoint return a list of transactions associated with the specified &#x60;user&#x60;, accross all members and accounts associated with that &#x60;user&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    String fromDate = "2015-09-20"; // String | Filter transactions from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter transactions to this date.
    try {
      TransactionsResponseBody result = apiInstance.listTransactions(userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTransactions");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter transactions from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter transactions to this date. | [optional] |

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

<a id="listTransactionsByAccount"></a>
# **listTransactionsByAccount**
> TransactionsResponseBody listTransactionsByAccount(accountGuid, userGuid, fromDate, page, recordsPerPage, toDate)

List transactions by account

This endpoint returns a list of the last 90 days of transactions associated with the specified account.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    String fromDate = "2015-09-20"; // String | Filter transactions from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter transactions to this date.
    try {
      TransactionsResponseBody result = apiInstance.listTransactionsByAccount(accountGuid, userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTransactionsByAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter transactions from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter transactions to this date. | [optional] |

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

<a id="listTransactionsByMember"></a>
# **listTransactionsByMember**
> TransactionsResponseBody listTransactionsByMember(memberGuid, userGuid, fromDate, page, recordsPerPage, toDate)

List transactions by member

Requests to this endpoint return a list of transactions associated with the specified &#x60;member&#x60;, accross all accounts associated with that &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    String fromDate = "2015-09-20"; // String | Filter transactions from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter transactions to this date.
    try {
      TransactionsResponseBody result = apiInstance.listTransactionsByMember(memberGuid, userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTransactionsByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter transactions from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter transactions to this date. | [optional] |

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

<a id="listTransactionsByTag"></a>
# **listTransactionsByTag**
> TransactionsResponseBody listTransactionsByTag(tagGuid, userGuid, fromDate, page, recordsPerPage, toDate)

List transactions by tag

Use this endpoint to get a list of all transactions associated with a particular tag according to the tag’s unique GUID. In other words, a list of all transactions that have been assigned to a particular tag using the create a tagging endpoint.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String tagGuid = "TAG-aef36e72-6294-4c38-844d-e573e80aed52"; // String | The unique id for a `tag`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    String fromDate = "2015-09-20"; // String | Filter transactions from this date.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String toDate = "2019-10-20"; // String | Filter transactions to this date.
    try {
      TransactionsResponseBody result = apiInstance.listTransactionsByTag(tagGuid, userGuid, fromDate, page, recordsPerPage, toDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listTransactionsByTag");
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
| **tagGuid** | **String**| The unique id for a &#x60;tag&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **fromDate** | **String**| Filter transactions from this date. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **toDate** | **String**| Filter transactions to this date. | [optional] |

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

<a id="listUserAccounts"></a>
# **listUserAccounts**
> AccountsResponseBody listUserAccounts(userGuid, memberIsManagedByUser, page, isManual, recordsPerPage)

List accounts

This endpoint returns a list of all the accounts associated with the specified &#x60;user&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    Boolean memberIsManagedByUser = true; // Boolean | List only accounts whose member is managed by the user.
    Integer page = 1; // Integer | Specify current page.
    Boolean isManual = true; // Boolean | List only accounts that were manually created.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountsResponseBody result = apiInstance.listUserAccounts(userGuid, memberIsManagedByUser, page, isManual, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listUserAccounts");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **memberIsManagedByUser** | **Boolean**| List only accounts whose member is managed by the user. | [optional] |
| **page** | **Integer**| Specify current page. | [optional] |
| **isManual** | **Boolean**| List only accounts that were manually created. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

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

<a id="listUsers"></a>
# **listUsers**
> UsersResponseBody listUsers(page, recordsPerPage, id, email, isDisabled)

List users

Use this endpoint to list every user you&#39;ve created in the MX Platform API.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    String id = "u-12324-abdc"; // String | The user `id` to search for.
    String email = "example@example.com"; // String | The user `email` to search for.
    Boolean isDisabled = true; // Boolean | Search for users that are diabled.
    try {
      UsersResponseBody result = apiInstance.listUsers(page, recordsPerPage, id, email, isDisabled);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#listUsers");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |
| **id** | **String**| The user &#x60;id&#x60; to search for. | [optional] |
| **email** | **String**| The user &#x60;email&#x60; to search for. | [optional] |
| **isDisabled** | **Boolean**| Search for users that are diabled. | [optional] |

### Return type

[**UsersResponseBody**](UsersResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readAccount"></a>
# **readAccount**
> AccountResponseBody readAccount(accountGuid, userGuid)

Read account

This endpoint returns the specified &#x60;account&#x60; resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      AccountResponseBody result = apiInstance.readAccount(accountGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="readAccountByMember"></a>
# **readAccountByMember**
> AccountResponseBody readAccountByMember(accountGuid, memberGuid, userGuid)

Read account by member

This endpoint allows you to read the attributes of an &#x60;account&#x60; resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      AccountResponseBody result = apiInstance.readAccountByMember(accountGuid, memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readAccountByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="readCategory"></a>
# **readCategory**
> CategoryResponseBody readCategory(categoryGuid, userGuid)

Read a custom category

Use this endpoint to read the attributes of either a default category or a custom category.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String categoryGuid = "CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874"; // String | The unique id for a `category`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      CategoryResponseBody result = apiInstance.readCategory(categoryGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readCategory");
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
| **categoryGuid** | **String**| The unique id for a &#x60;category&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**CategoryResponseBody**](CategoryResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readDefaultCategory"></a>
# **readDefaultCategory**
> CategoryResponseBody readDefaultCategory(categoryGuid)

Read a default category

Use this endpoint to read the attributes of a default category.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String categoryGuid = "CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874"; // String | The unique id for a `category`.
    try {
      CategoryResponseBody result = apiInstance.readDefaultCategory(categoryGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readDefaultCategory");
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
| **categoryGuid** | **String**| The unique id for a &#x60;category&#x60;. | |

### Return type

[**CategoryResponseBody**](CategoryResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readHolding"></a>
# **readHolding**
> HoldingResponseBody readHolding(holdingGuid, userGuid)

Read holding

Use this endpoint to read the attributes of a specific &#x60;holding&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String holdingGuid = "HOL-d65683e8-9eab-26bb-bcfd-ced159c9abe2"; // String | The unique id for a `holding`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      HoldingResponseBody result = apiInstance.readHolding(holdingGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readHolding");
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
| **holdingGuid** | **String**| The unique id for a &#x60;holding&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**HoldingResponseBody**](HoldingResponseBody.md)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String institutionCode = "chase"; // String | The institution_code of the institution.
    try {
      InstitutionResponseBody result = apiInstance.readInstitution(institutionCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readInstitution");
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      AccountResponseBody result = apiInstance.readManagedAccount(accountGuid, memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readManagedAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

This endpoint returns the attributes of the specified partner-managed &#x60;member&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.readManagedMember(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readManagedMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TransactionResponseBody result = apiInstance.readManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readManagedTransaction");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="readMember"></a>
# **readMember**
> MemberResponseBody readMember(memberGuid, userGuid)

Read member

Use this endpoint to read the attributes of a specific member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.readMember(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="readMemberStatus"></a>
# **readMemberStatus**
> MemberStatusResponseBody readMemberStatus(memberGuid, userGuid)

Read member status

This endpoint provides the status of the members most recent aggregation event. This is an important step in the aggregation process, and the results returned by this endpoint should determine what you do next in order to successfully aggregate a member. MX has introduced new, more detailed information on the current status of a members connection to a financial institution and the state of its aggregation - the connection_status field. These are intended to replace and expand upon the information provided in the status field, which will soon be deprecated; support for the status field remains for the time being.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberStatusResponseBody result = apiInstance.readMemberStatus(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readMemberStatus");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**MemberStatusResponseBody**](MemberStatusResponseBody.md)

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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String merchantGuid = "MCH-7ed79542-884d-2b1b-dd74-501c5cc9d25b"; // String | The unique id for a `merchant`.
    try {
      MerchantResponseBody result = apiInstance.readMerchant(merchantGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readMerchant");
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

This endpoint returns the specified merchant_location resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String merchantLocationGuid = "MCH-09466f0a-fb58-9d1a-bae2-2af0afbea621"; // String | The unique id for a `merchant_location`.
    try {
      MerchantLocationResponseBody result = apiInstance.readMerchantLocation(merchantLocationGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readMerchantLocation");
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

<a id="readStatementByMember"></a>
# **readStatementByMember**
> StatementResponseBody readStatementByMember(memberGuid, statementGuid, userGuid)

Read statement by member

Use this endpoint to read a JSON representation of the statement.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String statementGuid = "STA-737a344b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for a `statement`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      StatementResponseBody result = apiInstance.readStatementByMember(memberGuid, statementGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readStatementByMember");
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
| **statementGuid** | **String**| The unique id for a &#x60;statement&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**StatementResponseBody**](StatementResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readTag"></a>
# **readTag**
> TagResponseBody readTag(tagGuid, userGuid)

Read tag

Use this endpoint to read the attributes of a particular tag according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String tagGuid = "TAG-aef36e72-6294-4c38-844d-e573e80aed52"; // String | The unique id for a `tag`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TagResponseBody result = apiInstance.readTag(tagGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readTag");
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
| **tagGuid** | **String**| The unique id for a &#x60;tag&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**TagResponseBody**](TagResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readTagging"></a>
# **readTagging**
> TaggingResponseBody readTagging(taggingGuid, userGuid)

Read tagging

Use this endpoint to read the attributes of a &#x60;tagging&#x60; according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String taggingGuid = "TGN-007f5486-17e1-45fc-8b87-8f03984430fe"; // String | The unique id for a `tagging`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TaggingResponseBody result = apiInstance.readTagging(taggingGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readTagging");
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
| **taggingGuid** | **String**| The unique id for a &#x60;tagging&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**TaggingResponseBody**](TaggingResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readTaxDocument"></a>
# **readTaxDocument**
> TaxDocumentResponseBody readTaxDocument(taxDocumentGuid, memberGuid, userGuid)

Read a Tax Document

Use this endpoint to read the attributes of the specified tax document.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String taxDocumentGuid = "TAX-987dfds1b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `tax_document`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TaxDocumentResponseBody result = apiInstance.readTaxDocument(taxDocumentGuid, memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readTaxDocument");
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
| **taxDocumentGuid** | **String**| The unique id for a &#x60;tax_document&#x60;. | |
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**TaxDocumentResponseBody**](TaxDocumentResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readTransaction"></a>
# **readTransaction**
> TransactionResponseBody readTransaction(transactionGuid, userGuid)

Read transaction

Requests to this endpoint will return the attributes of the specified &#x60;transaction&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TransactionResponseBody result = apiInstance.readTransaction(transactionGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readTransaction");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

<a id="readTransactionRule"></a>
# **readTransactionRule**
> TransactionRuleResponseBody readTransactionRule(transactionRuleGuid, userGuid)

Read transaction rule

Use this endpoint to read the attributes of an existing transaction rule based on the rule’s unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String transactionRuleGuid = "TXR-a080e0f9-a2d4-4d6f-9e03-672cc357a4d3"; // String | The unique id for a `transaction_rule`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      TransactionRuleResponseBody result = apiInstance.readTransactionRule(transactionRuleGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readTransactionRule");
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
| **transactionRuleGuid** | **String**| The unique id for a &#x60;transaction_rule&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**TransactionRuleResponseBody**](TransactionRuleResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readUser"></a>
# **readUser**
> UserResponseBody readUser(userGuid)

Read user

Use this endpoint to read the attributes of a specific user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      UserResponseBody result = apiInstance.readUser(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#readUser");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

[**UserResponseBody**](UserResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestAuthorizationCode"></a>
# **requestAuthorizationCode**
> AuthorizationCodeResponseBody requestAuthorizationCode(authorizationCodeRequestBody)

Request an authorization code.

Clients use this endpoint to request an authorization code according to the parameters specified in the scope. Clients then pass this code to processors. Processor access is scoped only to the GUIDs and features specified in this request. Before requesting an authorization code which includes a member in the scope, clients must have verified that member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    AuthorizationCodeRequestBody authorizationCodeRequestBody = new AuthorizationCodeRequestBody(); // AuthorizationCodeRequestBody | The scope for the authorization code.
    try {
      AuthorizationCodeResponseBody result = apiInstance.requestAuthorizationCode(authorizationCodeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#requestAuthorizationCode");
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
| **authorizationCodeRequestBody** | [**AuthorizationCodeRequestBody**](AuthorizationCodeRequestBody.md)| The scope for the authorization code. | |

### Return type

[**AuthorizationCodeResponseBody**](AuthorizationCodeResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestConnectWidgetURL"></a>
# **requestConnectWidgetURL**
> ConnectWidgetResponseBody requestConnectWidgetURL(userGuid, connectWidgetRequestBody)

Request connect widget url

This endpoint will return a URL for an embeddable version of MX Connect.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    ConnectWidgetRequestBody connectWidgetRequestBody = new ConnectWidgetRequestBody(); // ConnectWidgetRequestBody | Optional config options for WebView (is_mobile_webview, current_institution_code, current_member_guid, update_credentials)
    try {
      ConnectWidgetResponseBody result = apiInstance.requestConnectWidgetURL(userGuid, connectWidgetRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#requestConnectWidgetURL");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    String clientRedirectUrl = "https://mx.com"; // String | A URL that MX will redirect to at the end of OAuth with additional query parameters. Only available with `referral_source=APP`.
    String enableApp2app = "false"; // String | This indicates whether OAuth app2app behavior is enabled for institutions that support it. Defaults to `true`. This setting is not persistent.
    String referralSource = "APP"; // String | Must be either `BROWSER` or `APP` depending on the implementation. Defaults to `BROWSER`.
    Boolean skipAggregation = false; // Boolean | Setting this parameter to `true` will prevent the member from automatically aggregating after being redirected from the authorization page.
    String uiMessageWebviewUrlScheme = "mx"; // String | A scheme for routing the user back to the application state they were previously in. Only available with `referral_source=APP`.
    try {
      OAuthWindowResponseBody result = apiInstance.requestOAuthWindowURI(memberGuid, userGuid, clientRedirectUrl, enableApp2app, referralSource, skipAggregation, uiMessageWebviewUrlScheme);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#requestOAuthWindowURI");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **clientRedirectUrl** | **String**| A URL that MX will redirect to at the end of OAuth with additional query parameters. Only available with &#x60;referral_source&#x3D;APP&#x60;. | [optional] |
| **enableApp2app** | **String**| This indicates whether OAuth app2app behavior is enabled for institutions that support it. Defaults to &#x60;true&#x60;. This setting is not persistent. | [optional] |
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
> WidgetResponseBody requestWidgetURL(userGuid, widgetRequestBody, acceptLanguage)

Request widget url

This endpoint allows partners to get a URL by passing the &#x60;widget_type&#x60; in the request body, as well as configuring it in several different ways. In the case of Connect, that means setting the &#x60;widget_type&#x60; to &#x60;connect_widget&#x60;. Partners may also pass an optional &#x60;Accept-Language&#x60; header as well as a number of configuration options. Note that this is a &#x60;POST&#x60; request.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    WidgetRequestBody widgetRequestBody = new WidgetRequestBody(); // WidgetRequestBody | The widget url configuration options.
    String acceptLanguage = "en-US"; // String | The desired language of the widget.
    try {
      WidgetResponseBody result = apiInstance.requestWidgetURL(userGuid, widgetRequestBody, acceptLanguage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#requestWidgetURL");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **widgetRequestBody** | [**WidgetRequestBody**](WidgetRequestBody.md)| The widget url configuration options. | |
| **acceptLanguage** | **String**| The desired language of the widget. | [optional] |

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

<a id="resumeAggregation"></a>
# **resumeAggregation**
> MemberResponseBody resumeAggregation(memberGuid, userGuid, memberResumeRequestBody)

Resume aggregation

This endpoint answers the challenges needed when a member has been challenged by multi-factor authentication.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    MemberResumeRequestBody memberResumeRequestBody = new MemberResumeRequestBody(); // MemberResumeRequestBody | Member object with MFA challenge answers
    try {
      MemberResponseBody result = apiInstance.resumeAggregation(memberGuid, userGuid, memberResumeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#resumeAggregation");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **memberResumeRequestBody** | [**MemberResumeRequestBody**](MemberResumeRequestBody.md)| Member object with MFA challenge answers | |

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
| **202** | Accepted |  -  |

<a id="updateAccountByMember"></a>
# **updateAccountByMember**
> AccountResponseBody updateAccountByMember(accountGuid, memberGuid, userGuid, accountUpdateRequestBody)

Update account by member

This endpoint allows you to update certain attributes of an &#x60;account&#x60; resource.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    AccountUpdateRequestBody accountUpdateRequestBody = new AccountUpdateRequestBody(); // AccountUpdateRequestBody | Account object to be created with optional parameters (is_hidden)
    try {
      AccountResponseBody result = apiInstance.updateAccountByMember(accountGuid, memberGuid, userGuid, accountUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateAccountByMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **accountUpdateRequestBody** | [**AccountUpdateRequestBody**](AccountUpdateRequestBody.md)| Account object to be created with optional parameters (is_hidden) | |

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

<a id="updateCategory"></a>
# **updateCategory**
> CategoryResponseBody updateCategory(categoryGuid, userGuid, categoryUpdateRequestBody)

Update category

Use this endpoint to update the attributes of a custom category according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String categoryGuid = "CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874"; // String | The unique id for a `category`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    CategoryUpdateRequestBody categoryUpdateRequestBody = new CategoryUpdateRequestBody(); // CategoryUpdateRequestBody | Category object to be updated (While no single parameter is required, the `category` object cannot be empty)
    try {
      CategoryResponseBody result = apiInstance.updateCategory(categoryGuid, userGuid, categoryUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateCategory");
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
| **categoryGuid** | **String**| The unique id for a &#x60;category&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **categoryUpdateRequestBody** | [**CategoryUpdateRequestBody**](CategoryUpdateRequestBody.md)| Category object to be updated (While no single parameter is required, the &#x60;category&#x60; object cannot be empty) | |

### Return type

[**CategoryResponseBody**](CategoryResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    ManagedAccountUpdateRequestBody managedAccountUpdateRequestBody = new ManagedAccountUpdateRequestBody(); // ManagedAccountUpdateRequestBody | Managed account object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      AccountResponseBody result = apiInstance.updateManagedAccount(accountGuid, memberGuid, userGuid, managedAccountUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateManagedAccount");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    ManagedMemberUpdateRequestBody managedMemberUpdateRequestBody = new ManagedMemberUpdateRequestBody(); // ManagedMemberUpdateRequestBody | Managed member object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      MemberResponseBody result = apiInstance.updateManagedMember(memberGuid, userGuid, managedMemberUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateManagedMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    ManagedTransactionUpdateRequestBody managedTransactionUpdateRequestBody = new ManagedTransactionUpdateRequestBody(); // ManagedTransactionUpdateRequestBody | Managed transaction object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      TransactionResponseBody result = apiInstance.updateManagedTransaction(accountGuid, memberGuid, transactionGuid, userGuid, managedTransactionUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateManagedTransaction");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
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

<a id="updateMember"></a>
# **updateMember**
> MemberResponseBody updateMember(memberGuid, userGuid, memberUpdateRequestBody)

Update member

Use this endpoint to update a members attributes. Only the credentials, id, and metadata parameters can be updated. To get a list of the required credentials for the member, use the list member credentials endpoint.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
    MemberUpdateRequestBody memberUpdateRequestBody = new MemberUpdateRequestBody(); // MemberUpdateRequestBody | Member object to be updated (While no single parameter is required, the request body can't be empty)
    try {
      MemberResponseBody result = apiInstance.updateMember(memberGuid, userGuid, memberUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **memberUpdateRequestBody** | [**MemberUpdateRequestBody**](MemberUpdateRequestBody.md)| Member object to be updated (While no single parameter is required, the request body can&#39;t be empty) | |

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

<a id="updateTag"></a>
# **updateTag**
> TagResponseBody updateTag(tagGuid, userGuid, tagUpdateRequestBody)

Update tag

Use this endpoint to update the name of a specific tag according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String tagGuid = "TAG-aef36e72-6294-4c38-844d-e573e80aed52"; // String | The unique id for a `tag`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TagUpdateRequestBody tagUpdateRequestBody = new TagUpdateRequestBody(); // TagUpdateRequestBody | Tag object to be updated with required parameter (tag_guid)
    try {
      TagResponseBody result = apiInstance.updateTag(tagGuid, userGuid, tagUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateTag");
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
| **tagGuid** | **String**| The unique id for a &#x60;tag&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **tagUpdateRequestBody** | [**TagUpdateRequestBody**](TagUpdateRequestBody.md)| Tag object to be updated with required parameter (tag_guid) | |

### Return type

[**TagResponseBody**](TagResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTagging"></a>
# **updateTagging**
> TaggingResponseBody updateTagging(taggingGuid, userGuid, taggingUpdateRequestBody)

Update tagging

Use this endpoint to update a tagging.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String taggingGuid = "TGN-007f5486-17e1-45fc-8b87-8f03984430fe"; // String | The unique id for a `tagging`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TaggingUpdateRequestBody taggingUpdateRequestBody = new TaggingUpdateRequestBody(); // TaggingUpdateRequestBody | Tagging object to be updated with required parameter (tag_guid)
    try {
      TaggingResponseBody result = apiInstance.updateTagging(taggingGuid, userGuid, taggingUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateTagging");
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
| **taggingGuid** | **String**| The unique id for a &#x60;tagging&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **taggingUpdateRequestBody** | [**TaggingUpdateRequestBody**](TaggingUpdateRequestBody.md)| Tagging object to be updated with required parameter (tag_guid) | |

### Return type

[**TaggingResponseBody**](TaggingResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTransaction"></a>
# **updateTransaction**
> TransactionResponseBody updateTransaction(transactionGuid, userGuid, transactionUpdateRequestBody)

Update transaction

Use this endpoint to update the &#x60;description&#x60; of a specific transaction according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TransactionUpdateRequestBody transactionUpdateRequestBody = new TransactionUpdateRequestBody(); // TransactionUpdateRequestBody | Transaction object to be updated with a new description
    try {
      TransactionResponseBody result = apiInstance.updateTransaction(transactionGuid, userGuid, transactionUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateTransaction");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **transactionUpdateRequestBody** | [**TransactionUpdateRequestBody**](TransactionUpdateRequestBody.md)| Transaction object to be updated with a new description | |

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

<a id="updateTransactionRule"></a>
# **updateTransactionRule**
> TransactionRuleResponseBody updateTransactionRule(transactionRuleGuid, userGuid, transactionRuleUpdateRequestBody)

Update transaction_rule

Use this endpoint to update the attributes of a specific transaction rule based on its unique GUID. The API will respond with the updated transaction_rule object. Any attributes not provided will be left unchanged.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String transactionRuleGuid = "TXR-a080e0f9-a2d4-4d6f-9e03-672cc357a4d3"; // String | The unique id for a `transaction_rule`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    TransactionRuleUpdateRequestBody transactionRuleUpdateRequestBody = new TransactionRuleUpdateRequestBody(); // TransactionRuleUpdateRequestBody | TransactionRule object to be updated
    try {
      TransactionRuleResponseBody result = apiInstance.updateTransactionRule(transactionRuleGuid, userGuid, transactionRuleUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateTransactionRule");
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
| **transactionRuleGuid** | **String**| The unique id for a &#x60;transaction_rule&#x60;. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **transactionRuleUpdateRequestBody** | [**TransactionRuleUpdateRequestBody**](TransactionRuleUpdateRequestBody.md)| TransactionRule object to be updated | |

### Return type

[**TransactionRuleResponseBody**](TransactionRuleResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateUser"></a>
# **updateUser**
> UserResponseBody updateUser(userGuid, userUpdateRequestBody)

Update user

Use this endpoint to update the attributes of the specified user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MxPlatformApi apiInstance = new MxPlatformApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    UserUpdateRequestBody userUpdateRequestBody = new UserUpdateRequestBody(); // UserUpdateRequestBody | User object to be updated (None of these parameters are required, but the user object cannot be empty.)
    try {
      UserResponseBody result = apiInstance.updateUser(userGuid, userUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#updateUser");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |
| **userUpdateRequestBody** | [**UserUpdateRequestBody**](UserUpdateRequestBody.md)| User object to be updated (None of these parameters are required, but the user object cannot be empty.) | |

### Return type

[**UserResponseBody**](UserResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="verifyMember"></a>
# **verifyMember**
> MemberResponseBody verifyMember(memberGuid, userGuid)

Verify member

The verify endpoint begins a verification process for a member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MxPlatformApi;

public class Example {
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
      MemberResponseBody result = apiInstance.verifyMember(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MxPlatformApi#verifyMember");
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
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

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

