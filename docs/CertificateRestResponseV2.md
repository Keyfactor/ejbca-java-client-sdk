

# CertificateRestResponseV2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fingerprint** | **String** | Certificate fingerprint |  [optional] [readonly] |
|**cAFingerprint** | **String** | Certificate Authority fingerprint |  [optional] [readonly] |
|**certificateProfileId** | **Integer** | Certificate Profile Identifier |  [optional] [readonly] |
|**endEntityProfileId** | **Integer** | End Entity Profile Identifier |  [optional] [readonly] |
|**expireDate** | **Long** | Date after which certificate should be considered expired |  [optional] [readonly] |
|**issuerDN** | **String** | Issuer Distinguished Name |  [optional] [readonly] |
|**notBefore** | **Long** | Date at which certificate became valid |  [optional] [readonly] |
|**revocationDate** | **Long** | Revocation date |  [optional] [readonly] |
|**revocationReason** | [**RevocationReasonEnum**](#RevocationReasonEnum) | Revocation reson |  [optional] [readonly] |
|**serialNumber** | **String** | Hex Serial Number |  [optional] [readonly] |
|**status** | **Integer** | Certificate status |  [optional] [readonly] |
|**subjectAltName** | **String** | Subject Alternative Name (SAN) |  [optional] [readonly] |
|**subjectDN** | **String** | Subject Distinguished Name |  [optional] [readonly] |
|**subjectKeyId** | **String** | Subject Key Identifier |  [optional] [readonly] |
|**tag** | **String** |  |  [optional] [readonly] |
|**type** | **Integer** |  |  [optional] [readonly] |
|**udpateTime** | **Long** | Update time |  [optional] [readonly] |
|**username** | **String** | Username |  [optional] [readonly] |
|**base64Cert** | **String** | Base64 encoded certificate |  [optional] [readonly] |
|**certificateRequest** | **String** | Certificate request |  [optional] [readonly] |
|**crlPartitionIndex** | **Integer** | CRL partition index |  [optional] [readonly] |



## Enum: RevocationReasonEnum

| Name | Value |
|---- | -----|
| NUMBER_MINUS_1 | -1 |
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



