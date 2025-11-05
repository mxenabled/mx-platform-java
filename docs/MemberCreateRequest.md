

# MemberCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backgroundAggregationIsDisabled** | **Boolean** |  |  [optional] |
|**credentials** | [**List&lt;CredentialRequest&gt;**](CredentialRequest.md) |  |  |
|**id** | **String** |  |  [optional] |
|**institutionCode** | **String** |  |  |
|**isOauth** | **Boolean** |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**skipAggregation** | **Boolean** |  |  [optional] |
|**useCases** | [**List&lt;UseCasesEnum&gt;**](#List&lt;UseCasesEnum&gt;) | The use case associated with the member. Valid values are &#x60;PFM&#x60; and/or &#x60;MONEY_MOVEMENT&#x60;. Only set this if you&#39;ve met with MX and have opted in to using this field. |  [optional] |



## Enum: List&lt;UseCasesEnum&gt;

| Name | Value |
|---- | -----|
| MONEY_MOVEMENT | &quot;MONEY_MOVEMENT&quot; |
| PFM | &quot;PFM&quot; |



