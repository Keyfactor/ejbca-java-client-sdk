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
 * EnrollCertificateRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:22:53.234-07:00[America/Phoenix]")
public class EnrollCertificateRestRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_REQUEST = "certificate_request";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_REQUEST)
  private String certificateRequest;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROFILE_NAME = "certificate_profile_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROFILE_NAME)
  private String certificateProfileName;

  public static final String SERIALIZED_NAME_END_ENTITY_PROFILE_NAME = "end_entity_profile_name";
  @SerializedName(SERIALIZED_NAME_END_ENTITY_PROFILE_NAME)
  private String endEntityProfileName;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_NAME = "certificate_authority_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_NAME)
  private String certificateAuthorityName;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_ACCOUNT_BINDING_ID = "account_binding_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BINDING_ID)
  private String accountBindingId;

  public static final String SERIALIZED_NAME_INCLUDE_CHAIN = "include_chain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHAIN)
  private Boolean includeChain;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public EnrollCertificateRestRequest() {
  }

  public EnrollCertificateRestRequest certificateRequest(String certificateRequest) {
    
    this.certificateRequest = certificateRequest;
    return this;
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


  public void setCertificateRequest(String certificateRequest) {
    this.certificateRequest = certificateRequest;
  }


  public EnrollCertificateRestRequest certificateProfileName(String certificateProfileName) {
    
    this.certificateProfileName = certificateProfileName;
    return this;
  }

   /**
   * Certificate profile name
   * @return certificateProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENDUSER", value = "Certificate profile name")

  public String getCertificateProfileName() {
    return certificateProfileName;
  }


  public void setCertificateProfileName(String certificateProfileName) {
    this.certificateProfileName = certificateProfileName;
  }


  public EnrollCertificateRestRequest endEntityProfileName(String endEntityProfileName) {
    
    this.endEntityProfileName = endEntityProfileName;
    return this;
  }

   /**
   * End Entity profile name
   * @return endEntityProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ExampleEEP", value = "End Entity profile name")

  public String getEndEntityProfileName() {
    return endEntityProfileName;
  }


  public void setEndEntityProfileName(String endEntityProfileName) {
    this.endEntityProfileName = endEntityProfileName;
  }


  public EnrollCertificateRestRequest certificateAuthorityName(String certificateAuthorityName) {
    
    this.certificateAuthorityName = certificateAuthorityName;
    return this;
  }

   /**
   * Certificate Authority (CA) name
   * @return certificateAuthorityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=ExampleCA", value = "Certificate Authority (CA) name")

  public String getCertificateAuthorityName() {
    return certificateAuthorityName;
  }


  public void setCertificateAuthorityName(String certificateAuthorityName) {
    this.certificateAuthorityName = certificateAuthorityName;
  }


  public EnrollCertificateRestRequest username(String username) {
    
    this.username = username;
    return this;
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


  public void setUsername(String username) {
    this.username = username;
  }


  public EnrollCertificateRestRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "foo123", value = "Password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public EnrollCertificateRestRequest accountBindingId(String accountBindingId) {
    
    this.accountBindingId = accountBindingId;
    return this;
  }

   /**
   * Account Binding ID
   * @return accountBindingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "Account Binding ID")

  public String getAccountBindingId() {
    return accountBindingId;
  }


  public void setAccountBindingId(String accountBindingId) {
    this.accountBindingId = accountBindingId;
  }


  public EnrollCertificateRestRequest includeChain(Boolean includeChain) {
    
    this.includeChain = includeChain;
    return this;
  }

   /**
   * Get includeChain
   * @return includeChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeChain() {
    return includeChain;
  }


  public void setIncludeChain(Boolean includeChain) {
    this.includeChain = includeChain;
  }


  public EnrollCertificateRestRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john.doe@example.com", value = "Email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollCertificateRestRequest enrollCertificateRestRequest = (EnrollCertificateRestRequest) o;
    return Objects.equals(this.certificateRequest, enrollCertificateRestRequest.certificateRequest) &&
        Objects.equals(this.certificateProfileName, enrollCertificateRestRequest.certificateProfileName) &&
        Objects.equals(this.endEntityProfileName, enrollCertificateRestRequest.endEntityProfileName) &&
        Objects.equals(this.certificateAuthorityName, enrollCertificateRestRequest.certificateAuthorityName) &&
        Objects.equals(this.username, enrollCertificateRestRequest.username) &&
        Objects.equals(this.password, enrollCertificateRestRequest.password) &&
        Objects.equals(this.accountBindingId, enrollCertificateRestRequest.accountBindingId) &&
        Objects.equals(this.includeChain, enrollCertificateRestRequest.includeChain) &&
        Objects.equals(this.email, enrollCertificateRestRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateRequest, certificateProfileName, endEntityProfileName, certificateAuthorityName, username, password, accountBindingId, includeChain, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollCertificateRestRequest {\n");
    sb.append("    certificateRequest: ").append(toIndentedString(certificateRequest)).append("\n");
    sb.append("    certificateProfileName: ").append(toIndentedString(certificateProfileName)).append("\n");
    sb.append("    endEntityProfileName: ").append(toIndentedString(endEntityProfileName)).append("\n");
    sb.append("    certificateAuthorityName: ").append(toIndentedString(certificateAuthorityName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accountBindingId: ").append(toIndentedString(accountBindingId)).append("\n");
    sb.append("    includeChain: ").append(toIndentedString(includeChain)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("certificate_request");
    openapiFields.add("certificate_profile_name");
    openapiFields.add("end_entity_profile_name");
    openapiFields.add("certificate_authority_name");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("account_binding_id");
    openapiFields.add("include_chain");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnrollCertificateRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnrollCertificateRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnrollCertificateRestRequest is not found in the empty JSON string", EnrollCertificateRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnrollCertificateRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnrollCertificateRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("certificate_request") != null && !jsonObj.get("certificate_request").isJsonNull()) && !jsonObj.get("certificate_request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_request").toString()));
      }
      if ((jsonObj.get("certificate_profile_name") != null && !jsonObj.get("certificate_profile_name").isJsonNull()) && !jsonObj.get("certificate_profile_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_profile_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_profile_name").toString()));
      }
      if ((jsonObj.get("end_entity_profile_name") != null && !jsonObj.get("end_entity_profile_name").isJsonNull()) && !jsonObj.get("end_entity_profile_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_entity_profile_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_entity_profile_name").toString()));
      }
      if ((jsonObj.get("certificate_authority_name") != null && !jsonObj.get("certificate_authority_name").isJsonNull()) && !jsonObj.get("certificate_authority_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_authority_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_authority_name").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("account_binding_id") != null && !jsonObj.get("account_binding_id").isJsonNull()) && !jsonObj.get("account_binding_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_binding_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_binding_id").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnrollCertificateRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnrollCertificateRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnrollCertificateRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnrollCertificateRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EnrollCertificateRestRequest>() {
           @Override
           public void write(JsonWriter out, EnrollCertificateRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnrollCertificateRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnrollCertificateRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnrollCertificateRestRequest
  * @throws IOException if the JSON string is invalid with respect to EnrollCertificateRestRequest
  */
  public static EnrollCertificateRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnrollCertificateRestRequest.class);
  }

 /**
  * Convert an instance of EnrollCertificateRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

