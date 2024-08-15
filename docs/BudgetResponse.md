

# BudgetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **BigDecimal** | A goal amount set by the user for a category&#39;s transaction total during a month. |  [optional] |
|**categoryGuid** | **String** | Unique identifier for the budget category. Defined by MX. |  [optional] |
|**createdAt** | **String** | Date and time the budget was created, represented in ISO 8601 format with timestamp. |  [optional] |
|**guid** | **String** | Unique identifier for the budget. Defined by MX. |  [optional] |
|**isExceeded** | **Boolean** | If the budget has been exceeded, this field will be true. Otherwise, this field will be false. |  [optional] |
|**isOffTrack** | **Boolean** | If the budget is off track, this field will be true. Otherwise, this field will be false. |  [optional] |
|**metadata** | **String** | Additional information a partner can store on the budget. |  [optional] |
|**name** | **String** | The name of the budget that is visible to the user (ie \&quot;Food\&quot;, \&quot;Bills\&quot;, \&quot;Entertainment\&quot;, etc). |  [optional] |
|**offTrackPercentage** | **BigDecimal** | The percentage amount of off track spending. (Deprecated). |  [optional] |
|**parentGuid** | **String** | Unique identifier for the parent budget. Defined by MX. |  [optional] |
|**percentSpent** | **BigDecimal** | The percentage of a budget that has been spent during the current calendar month Calculated as the transaction total divided by the amount and then multiplied by 100.A value of zero will be returned when &#x60;amount&#x60; is zero. |  [optional] |
|**projectedSpending** | **BigDecimal** | The projected amount of spending for the budget. |  [optional] |
|**revision** | **Integer** | The revision number of this budget record. |  [optional] |
|**transactionTotal** | **Object** | The cumulative amount of all transactions under the budget. |  [optional] |
|**updatedAt** | **Object** | Date and time the budget was updated, represented in ISO 8601 format with timestamp. |  [optional] |
|**userGuid** | **Object** | Unique identifier for the user. Defined by MX. |  [optional] |



