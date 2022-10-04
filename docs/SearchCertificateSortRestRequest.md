

# SearchCertificateSortRestRequest

Use one of allowed values as property and operation. Available propertiesUSERNAME  ISSUER_DN  SUBJECT_DN  EXTERNAL_ACCOUNT_BINDING_ID  END_ENTITY_PROFILE  CERTIFICATE_PROFILE  STATUS  TAG  TYPE  UPDATE_TIME  ISSUED_DATE  EXPIRE_DATE  REVOCATION_DATE   Available operationsASC  DESC  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | [**PropertyEnum**](#PropertyEnum) | Sorted by |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Sort ascending or descending. &#39;ASC&#39; for ascending, &#39;DESC&#39; for descending. |  [optional] |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| USERNAME | &quot;USERNAME&quot; |
| ISSUER_DN | &quot;ISSUER_DN&quot; |
| SUBJECT_DN | &quot;SUBJECT_DN&quot; |
| EXTERNAL_ACCOUNT_BINDING_ID | &quot;EXTERNAL_ACCOUNT_BINDING_ID&quot; |
| END_ENTITY_PROFILE | &quot;END_ENTITY_PROFILE&quot; |
| CERTIFICATE_PROFILE | &quot;CERTIFICATE_PROFILE&quot; |
| STATUS | &quot;STATUS&quot; |
| TAG | &quot;TAG&quot; |
| TYPE | &quot;TYPE&quot; |
| UPDATE_TIME | &quot;UPDATE_TIME&quot; |
| ISSUED_DATE | &quot;ISSUED_DATE&quot; |
| EXPIRE_DATE | &quot;EXPIRE_DATE&quot; |
| REVOCATION_DATE | &quot;REVOCATION_DATE&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



