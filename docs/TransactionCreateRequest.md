

# TransactionCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** |  |  |
|**date** | **String** |  |  |
|**description** | **String** |  |  |
|**type** | **String** | The type of transaction, which must be CREDIT or DEBIT. See Transaction Fields for more information. |  |
|**categoryGuid** | **String** | Unique identifier of the category. |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**hasBeenViewed** | **Boolean** |  |  [optional] |
|**isHidden** | **Boolean** |  |  [optional] |
|**isInternational** | **Boolean** |  |  [optional] |
|**memo** | **String** |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**skipWebhook** | **Boolean** | When set to true, this parameter will prevent a webhook from being triggered by the request. |  [optional] |



