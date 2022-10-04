

# SearchCertificateCriteriaRestRequest

Use one of allowed values as property(see enum values below). QUERY - multiplicity [0, 1] - is used to search by SubjectDn, SubjectAn, Username or SerialNr;  Available STATUS - multiplicity [0, 12] - values are: CERT_ACTIVE, CERT_REVOKED, REVOCATION_REASON_UNSPECIFIED, REVOCATION_REASON_KEYCOMPROMISE, REVOCATION_REASON_CACOMPROMISE, REVOCATION_REASON_AFFILIATIONCHANGED, REVOCATION_REASON_SUPERSEDED, REVOCATION_REASON_CESSATIONOFOPERATION, REVOCATION_REASON_CERTIFICATEHOLD, REVOCATION_REASON_REMOVEFROMCRL, REVOCATION_REASON_PRIVILEGESWITHDRAWN, REVOCATION_REASON_AACOMPROMISE;  END_ENTITY_PROFILE, CERTIFICATE_PROFILE, CA - multiplicity [0, *) - exact match of the name for referencing End Entity Profile, Certificate Profile or CA;  ISSUED_DATE 'BEFORE' - multiplicity [0, 1] - ISO 8601 Date string;  ISSUED_DATE 'AFTER' - multiplicity [0, 1] - ISO 8601 Date string;  EXPIRE_DATE 'BEFORE' - multiplicity [0, 1] - ISO 8601 Date string;  EXPIRE_DATE 'AFTER' - multiplicity [0, 1] - ISO 8601 Date string;  REVOCATION_DATE 'BEFORE' - multiplicity [0, 1] - ISO 8601 Date string;  REVOCATION_DATE 'AFTER' - multiplicity [0, 1] - ISO 8601 Date string.  UPDATE_TIME 'BEFORE' - multiplicity [0, 1] - ISO 8601 Date string;  UPDATE_TIME 'AFTER' - multiplicity [0, 1] - ISO 8601 Date string;  

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | [**PropertyEnum**](#PropertyEnum) | A search property |  [optional] |
|**value** | **String** | A search value. This could be sting value, ISO 8601 Date string, an appropriate string name of End Entity Profile or Certificate Profile or CA |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | An operation for property on inserted value. &#39;EQUAL&#39; for string, &#39;LIKE&#39; for string value (&#39;QUERY&#39;), &#39;BEFORE&#39; or &#39;AFTER&#39; for date values |  [optional] |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| QUERY | &quot;QUERY&quot; |
| END_ENTITY_PROFILE | &quot;END_ENTITY_PROFILE&quot; |
| CERTIFICATE_PROFILE | &quot;CERTIFICATE_PROFILE&quot; |
| EXTERNAL_ACCOUNT_BINDING_ID | &quot;EXTERNAL_ACCOUNT_BINDING_ID&quot; |
| CA | &quot;CA&quot; |
| STATUS | &quot;STATUS&quot; |
| ISSUED_DATE | &quot;ISSUED_DATE&quot; |
| EXPIRE_DATE | &quot;EXPIRE_DATE&quot; |
| REVOCATION_DATE | &quot;REVOCATION_DATE&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;EQUAL&quot; |
| LIKE | &quot;LIKE&quot; |
| BEFORE | &quot;BEFORE&quot; |
| AFTER | &quot;AFTER&quot; |



