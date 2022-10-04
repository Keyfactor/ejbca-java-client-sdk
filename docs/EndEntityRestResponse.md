

# EndEntityRestResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username |  [optional] |
|**dn** | **String** | Subject Distinguished Name |  [optional] |
|**subjectAltName** | **String** | Subject Alternative Name (SAN) |  [optional] |
|**email** | **String** | Email |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | End Entity status |  [optional] |
|**token** | [**TokenEnum**](#TokenEnum) | Token type |  [optional] |
|**extensionData** | [**List&lt;ExtendedInformationRestResponseComponent&gt;**](ExtendedInformationRestResponseComponent.md) | Extended Information |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| FAILED | &quot;FAILED&quot; |
| INITIALIZED | &quot;INITIALIZED&quot; |
| INPROCESS | &quot;INPROCESS&quot; |
| GENERATED | &quot;GENERATED&quot; |
| REVOKED | &quot;REVOKED&quot; |
| HISTORICAL | &quot;HISTORICAL&quot; |
| KEYRECOVERY | &quot;KEYRECOVERY&quot; |
| WAITINGFORADDAPPROVAL | &quot;WAITINGFORADDAPPROVAL&quot; |



## Enum: TokenEnum

| Name | Value |
|---- | -----|
| USERGENERATED | &quot;USERGENERATED&quot; |
| P12 | &quot;P12&quot; |
| BCFKS | &quot;BCFKS&quot; |
| JKS | &quot;JKS&quot; |
| PEM | &quot;PEM&quot; |



