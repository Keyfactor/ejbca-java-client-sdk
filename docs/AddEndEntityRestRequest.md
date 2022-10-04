

# AddEndEntityRestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | Username |  [optional] |
|**password** | **String** | Password |  [optional] |
|**subjectDn** | **String** | Subject Distinguished Name |  [optional] |
|**subjectAltName** | **String** | Subject Alternative Name (SAN) |  [optional] |
|**email** | **String** | Email |  [optional] |
|**extensionData** | [**List&lt;ExtendedInformationRestRequestComponent&gt;**](ExtendedInformationRestRequestComponent.md) |  |  [optional] |
|**caName** | **String** | Certificate Authority (CA) name |  [optional] |
|**certificateProfileName** | **String** | Certificate profile name |  [optional] |
|**endEntityProfileName** | **String** | End Entity profile name |  [optional] |
|**token** | [**TokenEnum**](#TokenEnum) | Token type property |  [optional] |
|**accountBindingId** | **String** | Account Binding ID |  [optional] |



## Enum: TokenEnum

| Name | Value |
|---- | -----|
| USERGENERATED | &quot;USERGENERATED&quot; |
| P12 | &quot;P12&quot; |
| JKS | &quot;JKS&quot; |
| PEM | &quot;PEM&quot; |



