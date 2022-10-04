

# SearchEndEntityCriteriaRestRequest

Use one of allowed values as property(see enum values below). QUERY - multiplicity [0, 1] - is used to search by SubjectDn, SubjectAn, Username;  Available STATUS - multiplicity [0, 9] - values are: NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL;  END_ENTITY_PROFILE, CERTIFICATE_PROFILE, CA - multiplicity [0, *) - exact match of the name for referencing End Entity Profile, Certificate Profile or CA;  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | [**PropertyEnum**](#PropertyEnum) | A search property |  [optional] |
|**value** | **String** | A search value. This could be string value, an appropriate string name of End Entity Profile or Certificate Profile or CA |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | An operation for property on inserted value. &#39;EQUALS&#39; for string, &#39;LIKE&#39; for string value (&#39;QUERY&#39;) |  [optional] |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| QUERY | &quot;QUERY&quot; |
| END_ENTITY_PROFILE | &quot;END_ENTITY_PROFILE&quot; |
| CERTIFICATE_PROFILE | &quot;CERTIFICATE_PROFILE&quot; |
| CA | &quot;CA&quot; |
| STATUS | &quot;STATUS&quot; |
| MODIFIED_BEFORE | &quot;MODIFIED_BEFORE&quot; |
| MODIFIED_AFTER | &quot;MODIFIED_AFTER&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;EQUAL&quot; |
| LIKE | &quot;LIKE&quot; |



