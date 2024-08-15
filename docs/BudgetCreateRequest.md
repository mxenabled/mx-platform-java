

# BudgetCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categoryGuid** | **String** | Unique identifier of the category. |  |
|**parentGuid** | **String** | Unique identifier of the parent budget. This is only required when creating a budget on a sub-category. |  |
|**amount** | **Integer** | Amount of the budget. |  [optional] |
|**metadata** | **String** | Additional information a partner can store on the budget. |  [optional] |
|**skipWebhook** | **Boolean** | When set to true, this parameter will prevent a webhook from being triggered by the request. |  [optional] |



