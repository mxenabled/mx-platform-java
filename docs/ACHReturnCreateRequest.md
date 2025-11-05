

# ACHReturnCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountGuid** | **String** | The unique identifier for the account associated with the transaction. Defined by MX. |  |
|**accountNumberLastFour** | **String** | The last 4 digits of the account number used for the transaction by the Originating Depository Financial Institution (ODFI). |  [optional] |
|**achInitiatedAt** | **String** | The date and time when the transaction was initiated by the Originating Depository Financial Institution (ODFI) in ISO 8601 format without timestamp. |  [optional] |
|**correctedAccountNumber** | **String** | The account number correction reported by the RDFI. Populate only if the &#x60;resolution_code&#x60; is &#x60;NOTICE_OF_CHANGE&#x60;. |  [optional] |
|**correctedRoutingNumber** | **String** | The routing number correction reported by the RDFI. Populate only if the &#x60;resolution_code&#x60; is &#x60;NOTICE_OF_CHANGE&#x60;. Must be a valid 9-digit routing number format. |  [optional] |
|**id** | **String** | Client-defined identifier for this specific return submission. Allows you to track and reference you requests. |  |
|**memberGuid** | **String** | The unique identifier for the member associated with the transaction. Defined by MX. |  |
|**returnAccountNumber** | **String** | Incorrect account number used in the ACH transaction. |  [optional] |
|**returnCode** | **String** | The associated ACH return code and notice of change code (for example, R02, R03, R04, R05, R20, NOC). See [Return Codes](/api-reference/platform-api/reference/ach-return-fields#return-codes) for a complete list. |  |
|**returnNotes** | **String** | Notes that you set to inform MX on internal ACH processing. |  [optional] |
|**returnRoutingNumber** | **String** | Incorrect routing number used in the ACH transaction. |  [optional] |
|**returnedAt** | **String** | The date and time when the return was reported by the Receiving Financial Depository Institution (RDFI) in ISO 8601 format without timestamp. |  [optional] |
|**secCode** | **String** | The SEC code (Standard Entry Class Code)–a three-letter code describing how a payment was authorized (for example, &#x60;WEB&#x60;). See [SEC Codes](/api-reference/platform-api/reference/ach-return-fields#sec-codes) for a complete list. |  [optional] |
|**transactionAmount** | **BigDecimal** | The amount of the transaction. |  [optional] |
|**transactionAmountRange** | **BigDecimal** | The transaction amount range, used for impact assessment. |  [optional] |
|**userGuid** | **String** | MX-defined identifier for the user associated with the ACH return. |  |



