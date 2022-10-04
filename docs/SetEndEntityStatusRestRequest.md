

# SetEndEntityStatusRestRequest

Use one of allowed values as property(see enum values below). Available TOKEN - USERGENERATED, P12, BCFKS, JKS, PEM;  Available STATUS - NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL; 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**password** | **String** | Password |  [optional] |
|**token** | [**TokenEnum**](#TokenEnum) | Token type property |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | End entity status property |  [optional] |



## Enum: TokenEnum

| Name | Value |
|---- | -----|
| USERGENERATED | &quot;USERGENERATED&quot; |
| P12 | &quot;P12&quot; |
| BCFKS | &quot;BCFKS&quot; |
| JKS | &quot;JKS&quot; |
| PEM | &quot;PEM&quot; |



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



