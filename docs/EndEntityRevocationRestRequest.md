

# EndEntityRevocationRestRequest

End Entity revocation request. Available reason codes:   0 - Unspecified,  1 - Key Compromise,  2 - CA Compromise,  3 - Affiliation Changed,  4 - Superseded,  5 - Cessation of Operation,  6 - Certificate Hold,  8 - Remove from CRL,  9 - Privileges Withdrawn,  10 - AA Compromise

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | Reason code |  [optional] |
|**delete** | **Boolean** | Delete |  [optional] |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |



