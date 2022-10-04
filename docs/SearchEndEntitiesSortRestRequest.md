

# SearchEndEntitiesSortRestRequest

Use one of allowed values as property and operation. Available propertiesUSERNAME  SUBJECT_DN  SUBJECT_ALT_NAME  END_ENTITY_PROFILE(by databse identifier, not user-given name)  CERTIFICATE_PROFILE(by identifier)  CA(by identifier)  STATUS  UPDATE_TIME  CREATED_DATE   Available operationsASC  DESC  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | [**PropertyEnum**](#PropertyEnum) | Sorted by |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Sort ascending or descending. &#39;ASC&#39; for ascending, &#39;DESC&#39; for descending. |  [optional] |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| USERNAME | &quot;USERNAME&quot; |
| SUBJECT_DN | &quot;SUBJECT_DN&quot; |
| SUBJECT_ALT_NAME | &quot;SUBJECT_ALT_NAME&quot; |
| END_ENTITY_PROFILE | &quot;END_ENTITY_PROFILE&quot; |
| CERTIFICATE_PROFILE | &quot;CERTIFICATE_PROFILE&quot; |
| STATUS | &quot;STATUS&quot; |
| UPDATE_TIME | &quot;UPDATE_TIME&quot; |
| CREATED_TIME | &quot;CREATED_TIME&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



