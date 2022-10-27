/*
 * EJBCA REST Interface
 * API reference documentation.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.keyfactor.ejbca.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.keyfactor.ejbca.client.JSON;

/**
 * CertificateRestResponseV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T00:18:55.030-07:00[America/Phoenix]")
public class CertificateRestResponseV2 {
  public static final String SERIALIZED_NAME_FINGERPRINT = "fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private String fingerprint;

  public static final String SERIALIZED_NAME_C_A_FINGERPRINT = "cAFingerprint";
  @SerializedName(SERIALIZED_NAME_C_A_FINGERPRINT)
  private String cAFingerprint;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROFILE_ID = "certificateProfileId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROFILE_ID)
  private Integer certificateProfileId;

  public static final String SERIALIZED_NAME_END_ENTITY_PROFILE_ID = "endEntityProfileId";
  @SerializedName(SERIALIZED_NAME_END_ENTITY_PROFILE_ID)
  private Integer endEntityProfileId;

  public static final String SERIALIZED_NAME_EXPIRE_DATE = "expireDate";
  @SerializedName(SERIALIZED_NAME_EXPIRE_DATE)
  private Long expireDate;

  public static final String SERIALIZED_NAME_ISSUER_D_N = "issuerDN";
  @SerializedName(SERIALIZED_NAME_ISSUER_D_N)
  private String issuerDN;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private Long notBefore;

  public static final String SERIALIZED_NAME_REVOCATION_DATE = "revocationDate";
  @SerializedName(SERIALIZED_NAME_REVOCATION_DATE)
  private Long revocationDate;

  /**
   * Revocation reson
   */
  @JsonAdapter(RevocationReasonEnum.Adapter.class)
  public enum RevocationReasonEnum {
    NUMBER_MINUS_1(-1),
    
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_8(8),
    
    NUMBER_9(9),
    
    NUMBER_10(10);

    private Integer value;

    RevocationReasonEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RevocationReasonEnum fromValue(Integer value) {
      for (RevocationReasonEnum b : RevocationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RevocationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RevocationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RevocationReasonEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return RevocationReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVOCATION_REASON = "revocationReason";
  @SerializedName(SERIALIZED_NAME_REVOCATION_REASON)
  private RevocationReasonEnum revocationReason;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_SUBJECT_ALT_NAME = "subjectAltName";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ALT_NAME)
  private String subjectAltName;

  public static final String SERIALIZED_NAME_SUBJECT_D_N = "subjectDN";
  @SerializedName(SERIALIZED_NAME_SUBJECT_D_N)
  private String subjectDN;

  public static final String SERIALIZED_NAME_SUBJECT_KEY_ID = "subjectKeyId";
  @SerializedName(SERIALIZED_NAME_SUBJECT_KEY_ID)
  private String subjectKeyId;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_UDPATE_TIME = "udpateTime";
  @SerializedName(SERIALIZED_NAME_UDPATE_TIME)
  private Long udpateTime;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_BASE64_CERT = "base64Cert";
  @SerializedName(SERIALIZED_NAME_BASE64_CERT)
  private String base64Cert;

  public static final String SERIALIZED_NAME_CERTIFICATE_REQUEST = "certificateRequest";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_REQUEST)
  private String certificateRequest;

  public static final String SERIALIZED_NAME_CRL_PARTITION_INDEX = "crlPartitionIndex";
  @SerializedName(SERIALIZED_NAME_CRL_PARTITION_INDEX)
  private Integer crlPartitionIndex;

  public CertificateRestResponseV2() {
  }

  
  public CertificateRestResponseV2(
     String fingerprint, 
     String cAFingerprint, 
     Integer certificateProfileId, 
     Integer endEntityProfileId, 
     Long expireDate, 
     String issuerDN, 
     Long notBefore, 
     Long revocationDate, 
     RevocationReasonEnum revocationReason, 
     String serialNumber, 
     Integer status, 
     String subjectAltName, 
     String subjectDN, 
     String subjectKeyId, 
     String tag, 
     Integer type, 
     Long udpateTime, 
     String username, 
     String base64Cert, 
     String certificateRequest, 
     Integer crlPartitionIndex
  ) {
    this();
    this.fingerprint = fingerprint;
    this.cAFingerprint = cAFingerprint;
    this.certificateProfileId = certificateProfileId;
    this.endEntityProfileId = endEntityProfileId;
    this.expireDate = expireDate;
    this.issuerDN = issuerDN;
    this.notBefore = notBefore;
    this.revocationDate = revocationDate;
    this.revocationReason = revocationReason;
    this.serialNumber = serialNumber;
    this.status = status;
    this.subjectAltName = subjectAltName;
    this.subjectDN = subjectDN;
    this.subjectKeyId = subjectKeyId;
    this.tag = tag;
    this.type = type;
    this.udpateTime = udpateTime;
    this.username = username;
    this.base64Cert = base64Cert;
    this.certificateRequest = certificateRequest;
    this.crlPartitionIndex = crlPartitionIndex;
  }

   /**
   * Certificate fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123abc456def789ghi123klm456nop789qrs123t", value = "Certificate fingerprint")

  public String getFingerprint() {
    return fingerprint;
  }




   /**
   * Certificate Authority fingerprint
   * @return cAFingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc123def456ghi789klm123nop456qrs789tvx1", value = "Certificate Authority fingerprint")

  public String getcAFingerprint() {
    return cAFingerprint;
  }




   /**
   * Certificate Profile Identifier
   * @return certificateProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Certificate Profile Identifier")

  public Integer getCertificateProfileId() {
    return certificateProfileId;
  }




   /**
   * End Entity Profile Identifier
   * @return endEntityProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "End Entity Profile Identifier")

  public Integer getEndEntityProfileId() {
    return endEntityProfileId;
  }




   /**
   * Date after which certificate should be considered expired
   * @return expireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2147483647000", value = "Date after which certificate should be considered expired")

  public Long getExpireDate() {
    return expireDate;
  }




   /**
   * Issuer Distinguished Name
   * @return issuerDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=ExampleCA", value = "Issuer Distinguished Name")

  public String getIssuerDN() {
    return issuerDN;
  }




   /**
   * Date at which certificate became valid
   * @return notBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1659952800011", value = "Date at which certificate became valid")

  public Long getNotBefore() {
    return notBefore;
  }




   /**
   * Revocation date
   * @return revocationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "Revocation date")

  public Long getRevocationDate() {
    return revocationDate;
  }




   /**
   * Revocation reson
   * @return revocationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "Revocation reson")

  public RevocationReasonEnum getRevocationReason() {
    return revocationReason;
  }




   /**
   * Hex Serial Number
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890ABCDEF", value = "Hex Serial Number")

  public String getSerialNumber() {
    return serialNumber;
  }




   /**
   * Certificate status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "Certificate status")

  public Integer getStatus() {
    return status;
  }




   /**
   * Subject Alternative Name (SAN)
   * @return subjectAltName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rfc822Name=john.doe@example.com", value = "Subject Alternative Name (SAN)")

  public String getSubjectAltName() {
    return subjectAltName;
  }




   /**
   * Subject Distinguished Name
   * @return subjectDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=John Doe,SURNAME=Doe,GIVENNAME=John,C=SE", value = "Subject Distinguished Name")

  public String getSubjectDN() {
    return subjectDN;
  }




   /**
   * Subject Key Identifier
   * @return subjectKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "z123abc456def789ghi123klm456nop789qrs123", value = "Subject Key Identifier")

  public String getSubjectKeyId() {
    return subjectKeyId;
  }




   /**
   * Get tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTag() {
    return tag;
  }




   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getType() {
    return type;
  }




   /**
   * Update time
   * @return udpateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1659967133000", value = "Update time")

  public Long getUdpateTime() {
    return udpateTime;
  }




   /**
   * Username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JohnDoe", value = "Username")

  public String getUsername() {
    return username;
  }




   /**
   * Base64 encoded certificate
   * @return base64Cert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TUlJR...t2A==", value = "Base64 encoded certificate")

  public String getBase64Cert() {
    return base64Cert;
  }




   /**
   * Certificate request
   * @return certificateRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-----BEGIN CERTIFICATE REQUEST----- MIICh...V8shQ== -----END CERTIFICATE REQUEST-----", value = "Certificate request")

  public String getCertificateRequest() {
    return certificateRequest;
  }




   /**
   * CRL partition index
   * @return crlPartitionIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "CRL partition index")

  public Integer getCrlPartitionIndex() {
    return crlPartitionIndex;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRestResponseV2 certificateRestResponseV2 = (CertificateRestResponseV2) o;
    return Objects.equals(this.fingerprint, certificateRestResponseV2.fingerprint) &&
        Objects.equals(this.cAFingerprint, certificateRestResponseV2.cAFingerprint) &&
        Objects.equals(this.certificateProfileId, certificateRestResponseV2.certificateProfileId) &&
        Objects.equals(this.endEntityProfileId, certificateRestResponseV2.endEntityProfileId) &&
        Objects.equals(this.expireDate, certificateRestResponseV2.expireDate) &&
        Objects.equals(this.issuerDN, certificateRestResponseV2.issuerDN) &&
        Objects.equals(this.notBefore, certificateRestResponseV2.notBefore) &&
        Objects.equals(this.revocationDate, certificateRestResponseV2.revocationDate) &&
        Objects.equals(this.revocationReason, certificateRestResponseV2.revocationReason) &&
        Objects.equals(this.serialNumber, certificateRestResponseV2.serialNumber) &&
        Objects.equals(this.status, certificateRestResponseV2.status) &&
        Objects.equals(this.subjectAltName, certificateRestResponseV2.subjectAltName) &&
        Objects.equals(this.subjectDN, certificateRestResponseV2.subjectDN) &&
        Objects.equals(this.subjectKeyId, certificateRestResponseV2.subjectKeyId) &&
        Objects.equals(this.tag, certificateRestResponseV2.tag) &&
        Objects.equals(this.type, certificateRestResponseV2.type) &&
        Objects.equals(this.udpateTime, certificateRestResponseV2.udpateTime) &&
        Objects.equals(this.username, certificateRestResponseV2.username) &&
        Objects.equals(this.base64Cert, certificateRestResponseV2.base64Cert) &&
        Objects.equals(this.certificateRequest, certificateRestResponseV2.certificateRequest) &&
        Objects.equals(this.crlPartitionIndex, certificateRestResponseV2.crlPartitionIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fingerprint, cAFingerprint, certificateProfileId, endEntityProfileId, expireDate, issuerDN, notBefore, revocationDate, revocationReason, serialNumber, status, subjectAltName, subjectDN, subjectKeyId, tag, type, udpateTime, username, base64Cert, certificateRequest, crlPartitionIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRestResponseV2 {\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    cAFingerprint: ").append(toIndentedString(cAFingerprint)).append("\n");
    sb.append("    certificateProfileId: ").append(toIndentedString(certificateProfileId)).append("\n");
    sb.append("    endEntityProfileId: ").append(toIndentedString(endEntityProfileId)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    revocationDate: ").append(toIndentedString(revocationDate)).append("\n");
    sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectAltName: ").append(toIndentedString(subjectAltName)).append("\n");
    sb.append("    subjectDN: ").append(toIndentedString(subjectDN)).append("\n");
    sb.append("    subjectKeyId: ").append(toIndentedString(subjectKeyId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    udpateTime: ").append(toIndentedString(udpateTime)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    base64Cert: ").append(toIndentedString(base64Cert)).append("\n");
    sb.append("    certificateRequest: ").append(toIndentedString(certificateRequest)).append("\n");
    sb.append("    crlPartitionIndex: ").append(toIndentedString(crlPartitionIndex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("fingerprint");
    openapiFields.add("cAFingerprint");
    openapiFields.add("certificateProfileId");
    openapiFields.add("endEntityProfileId");
    openapiFields.add("expireDate");
    openapiFields.add("issuerDN");
    openapiFields.add("notBefore");
    openapiFields.add("revocationDate");
    openapiFields.add("revocationReason");
    openapiFields.add("serialNumber");
    openapiFields.add("status");
    openapiFields.add("subjectAltName");
    openapiFields.add("subjectDN");
    openapiFields.add("subjectKeyId");
    openapiFields.add("tag");
    openapiFields.add("type");
    openapiFields.add("udpateTime");
    openapiFields.add("username");
    openapiFields.add("base64Cert");
    openapiFields.add("certificateRequest");
    openapiFields.add("crlPartitionIndex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateRestResponseV2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificateRestResponseV2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateRestResponseV2 is not found in the empty JSON string", CertificateRestResponseV2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateRestResponseV2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateRestResponseV2` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("fingerprint") != null && !jsonObj.get("fingerprint").isJsonNull()) && !jsonObj.get("fingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fingerprint").toString()));
      }
      if ((jsonObj.get("cAFingerprint") != null && !jsonObj.get("cAFingerprint").isJsonNull()) && !jsonObj.get("cAFingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cAFingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cAFingerprint").toString()));
      }
      if ((jsonObj.get("issuerDN") != null && !jsonObj.get("issuerDN").isJsonNull()) && !jsonObj.get("issuerDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerDN").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      if ((jsonObj.get("subjectAltName") != null && !jsonObj.get("subjectAltName").isJsonNull()) && !jsonObj.get("subjectAltName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectAltName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectAltName").toString()));
      }
      if ((jsonObj.get("subjectDN") != null && !jsonObj.get("subjectDN").isJsonNull()) && !jsonObj.get("subjectDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectDN").toString()));
      }
      if ((jsonObj.get("subjectKeyId") != null && !jsonObj.get("subjectKeyId").isJsonNull()) && !jsonObj.get("subjectKeyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectKeyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectKeyId").toString()));
      }
      if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull()) && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("base64Cert") != null && !jsonObj.get("base64Cert").isJsonNull()) && !jsonObj.get("base64Cert").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base64Cert` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base64Cert").toString()));
      }
      if ((jsonObj.get("certificateRequest") != null && !jsonObj.get("certificateRequest").isJsonNull()) && !jsonObj.get("certificateRequest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateRequest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateRequest").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateRestResponseV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateRestResponseV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateRestResponseV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateRestResponseV2.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateRestResponseV2>() {
           @Override
           public void write(JsonWriter out, CertificateRestResponseV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateRestResponseV2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateRestResponseV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateRestResponseV2
  * @throws IOException if the JSON string is invalid with respect to CertificateRestResponseV2
  */
  public static CertificateRestResponseV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateRestResponseV2.class);
  }

 /**
  * Convert an instance of CertificateRestResponseV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
