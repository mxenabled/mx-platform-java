

# MemberResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregatedAt** | **String** |  |  [optional] |
|**backgroundAggregationIsDisabled** | **Boolean** |  |  [optional] |
|**connectionStatus** | **String** |  |  [optional] |
|**connectionStatusMessage** | **String** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**guid** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**institutionCode** | **String** |  |  [optional] |
|**institutionGuid** | **String** |  |  [optional] |
|**isBeingAggregated** | **Boolean** |  |  [optional] |
|**isManagedByUser** | **Boolean** |  |  [optional] |
|**isManual** | **Boolean** |  |  [optional] |
|**isOauth** | **Boolean** |  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**mostRecentJobDetailCode** | **Integer** |  |  [optional] |
|**mostRecentJobDetailText** | **Boolean** |  |  [optional] |
|**mostRecentJobGuid** | **Boolean** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**needsUpdatedCredentials** | **Boolean** |  |  [optional] |
|**oauthWindowUri** | **String** |  |  [optional] |
|**successfullyAggregatedAt** | **String** |  |  [optional] |
|**useCases** | [**List&lt;UseCasesEnum&gt;**](#List&lt;UseCasesEnum&gt;) | The use case associated with the member. Valid values are &#x60;PFM&#x60; and/or &#x60;MONEY_MOVEMENT&#x60;. Only set this if you&#39;ve met with MX and have opted in to using this field. |  [optional] |
|**userGuid** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |



## Enum: List&lt;UseCasesEnum&gt;

| Name | Value |
|---- | -----|
| MONEY_MOVEMENT | &quot;MONEY_MOVEMENT&quot; |
| PFM | &quot;PFM&quot; |



