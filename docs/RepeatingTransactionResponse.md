

# RepeatingTransactionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountGuid** | **String** |  |  [optional] |
|**amount** | **BigDecimal** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**guid** | **String** |  |  [optional] |
|**memberGuid** | **String** |  |  [optional] |
|**merchantGuid** | **String** |  |  [optional] |
|**lastPostedDate** | **String** |  |  [optional] |
|**predictedOccursOn** | **String** |  |  [optional] |
|**recurrenceType** | **String** |  |  [optional] |
|**userGuid** | **String** |  |  [optional] |
|**repeatingTransactionType** | [**RepeatingTransactionTypeEnum**](#RepeatingTransactionTypeEnum) |  |  [optional] |
|**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) |  |  [optional] |



## Enum: RepeatingTransactionTypeEnum

| Name | Value |
|---- | -----|
| BILL | &quot;BILL&quot; |
| SUBSCRIPTION | &quot;SUBSCRIPTION&quot; |
| INCOME | &quot;INCOME&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: TransactionTypeEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;DEBIT&quot; |
| CREDIT | &quot;CREDIT&quot; |



