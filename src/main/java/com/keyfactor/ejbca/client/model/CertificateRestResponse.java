/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 *
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
import java.util.ArrayList;
import java.util.List;

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
 * CertificateRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T11:20:10.237-07:00[America/Phoenix]")
public class CertificateRestResponse {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serial_number";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_RESPONSE_FORMAT = "response_format";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FORMAT)
  private String responseFormat;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificate_chain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private List<byte[]> certificateChain = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROFILE = "certificate_profile";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROFILE)
  private String certificateProfile;

  public static final String SERIALIZED_NAME_END_ENTITY_PROFILE = "end_entity_profile";
  @SerializedName(SERIALIZED_NAME_END_ENTITY_PROFILE)
  private String endEntityProfile;

  public CertificateRestResponse() {
  }

  public CertificateRestResponse certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MIIDXzCCA...eW1Zro0=", value = "Certificate")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public CertificateRestResponse serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
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


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public CertificateRestResponse responseFormat(String responseFormat) {
    
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Response format
   * @return responseFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DER", value = "Response format")

  public String getResponseFormat() {
    return responseFormat;
  }


  public void setResponseFormat(String responseFormat) {
    this.responseFormat = responseFormat;
  }


  public CertificateRestResponse certificateChain(List<byte[]> certificateChain) {
    
    this.certificateChain = certificateChain;
    return this;
  }

  public CertificateRestResponse addCertificateChainItem(byte[] certificateChainItem) {
    if (this.certificateChain == null) {
      this.certificateChain = new ArrayList<>();
    }
    this.certificateChain.add(certificateChainItem);
    return this;
  }

   /**
   * Certificate chain
   * @return certificateChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[ “ABC123efg...345xyz0=“ ]", value = "Certificate chain")

  public List<byte[]> getCertificateChain() {
    return certificateChain;
  }


  public void setCertificateChain(List<byte[]> certificateChain) {
    this.certificateChain = certificateChain;
  }


  public CertificateRestResponse certificateProfile(String certificateProfile) {
    
    this.certificateProfile = certificateProfile;
    return this;
  }

   /**
   * Certificate profile name
   * @return certificateProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENDUSER", value = "Certificate profile name")

  public String getCertificateProfile() {
    return certificateProfile;
  }


  public void setCertificateProfile(String certificateProfile) {
    this.certificateProfile = certificateProfile;
  }


  public CertificateRestResponse endEntityProfile(String endEntityProfile) {
    
    this.endEntityProfile = endEntityProfile;
    return this;
  }

   /**
   * End Entity profile name
   * @return endEntityProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ExampleEEP", value = "End Entity profile name")

  public String getEndEntityProfile() {
    return endEntityProfile;
  }


  public void setEndEntityProfile(String endEntityProfile) {
    this.endEntityProfile = endEntityProfile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRestResponse certificateRestResponse = (CertificateRestResponse) o;
    return Objects.equals(this.certificate, certificateRestResponse.certificate) &&
        Objects.equals(this.serialNumber, certificateRestResponse.serialNumber) &&
        Objects.equals(this.responseFormat, certificateRestResponse.responseFormat) &&
        Objects.equals(this.certificateChain, certificateRestResponse.certificateChain) &&
        Objects.equals(this.certificateProfile, certificateRestResponse.certificateProfile) &&
        Objects.equals(this.endEntityProfile, certificateRestResponse.endEntityProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, serialNumber, responseFormat, certificateChain, certificateProfile, endEntityProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRestResponse {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    certificateProfile: ").append(toIndentedString(certificateProfile)).append("\n");
    sb.append("    endEntityProfile: ").append(toIndentedString(endEntityProfile)).append("\n");
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
    openapiFields.add("certificate");
    openapiFields.add("serial_number");
    openapiFields.add("response_format");
    openapiFields.add("certificate_chain");
    openapiFields.add("certificate_profile");
    openapiFields.add("end_entity_profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificateRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateRestResponse is not found in the empty JSON string", CertificateRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) && !jsonObj.get("certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate").toString()));
      }
      if ((jsonObj.get("serial_number") != null && !jsonObj.get("serial_number").isJsonNull()) && !jsonObj.get("serial_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_number").toString()));
      }
      if ((jsonObj.get("response_format") != null && !jsonObj.get("response_format").isJsonNull()) && !jsonObj.get("response_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_format").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("certificate_chain") != null && !jsonObj.get("certificate_chain").isJsonNull()) && !jsonObj.get("certificate_chain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_chain` to be an array in the JSON string but got `%s`", jsonObj.get("certificate_chain").toString()));
      }
      if ((jsonObj.get("certificate_profile") != null && !jsonObj.get("certificate_profile").isJsonNull()) && !jsonObj.get("certificate_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_profile").toString()));
      }
      if ((jsonObj.get("end_entity_profile") != null && !jsonObj.get("end_entity_profile").isJsonNull()) && !jsonObj.get("end_entity_profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_entity_profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_entity_profile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateRestResponse>() {
           @Override
           public void write(JsonWriter out, CertificateRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateRestResponse
  * @throws IOException if the JSON string is invalid with respect to CertificateRestResponse
  */
  public static CertificateRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateRestResponse.class);
  }

 /**
  * Convert an instance of CertificateRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

