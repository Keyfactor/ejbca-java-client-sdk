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
import com.keyfactor.ejbca.client.model.ExtendedInformationRestRequestComponent;
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
 * AddEndEntityRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddEndEntityRestRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_SUBJECT_DN = "subject_dn";
  @SerializedName(SERIALIZED_NAME_SUBJECT_DN)
  private String subjectDn;

  public static final String SERIALIZED_NAME_SUBJECT_ALT_NAME = "subject_alt_name";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ALT_NAME)
  private String subjectAltName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTENSION_DATA = "extension_data";
  @SerializedName(SERIALIZED_NAME_EXTENSION_DATA)
  private List<ExtendedInformationRestRequestComponent> extensionData = null;

  public static final String SERIALIZED_NAME_CA_NAME = "ca_name";
  @SerializedName(SERIALIZED_NAME_CA_NAME)
  private String caName;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROFILE_NAME = "certificate_profile_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROFILE_NAME)
  private String certificateProfileName;

  public static final String SERIALIZED_NAME_END_ENTITY_PROFILE_NAME = "end_entity_profile_name";
  @SerializedName(SERIALIZED_NAME_END_ENTITY_PROFILE_NAME)
  private String endEntityProfileName;

  /**
   * Token type property
   */
  @JsonAdapter(TokenEnum.Adapter.class)
  public enum TokenEnum {
    USERGENERATED("USERGENERATED"),
    
    P12("P12"),
    
    JKS("JKS"),
    
    PEM("PEM");

    private String value;

    TokenEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenEnum fromValue(String value) {
      for (TokenEnum b : TokenEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private TokenEnum token;

  public static final String SERIALIZED_NAME_ACCOUNT_BINDING_ID = "account_binding_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BINDING_ID)
  private String accountBindingId;

  public AddEndEntityRestRequest() {
  }

  public AddEndEntityRestRequest username(String username) {
    
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


  public AddEndEntityRestRequest password(String password) {
    
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


  public AddEndEntityRestRequest subjectDn(String subjectDn) {
    
    this.subjectDn = subjectDn;
    return this;
  }

   /**
   * Subject Distinguished Name
   * @return subjectDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=John Doe,SURNAME=Doe,GIVENNAME=John,C=SE", value = "Subject Distinguished Name")

  public String getSubjectDn() {
    return subjectDn;
  }


  public void setSubjectDn(String subjectDn) {
    this.subjectDn = subjectDn;
  }


  public AddEndEntityRestRequest subjectAltName(String subjectAltName) {
    
    this.subjectAltName = subjectAltName;
    return this;
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


  public void setSubjectAltName(String subjectAltName) {
    this.subjectAltName = subjectAltName;
  }


  public AddEndEntityRestRequest email(String email) {
    
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


  public AddEndEntityRestRequest extensionData(List<ExtendedInformationRestRequestComponent> extensionData) {
    
    this.extensionData = extensionData;
    return this;
  }

  public AddEndEntityRestRequest addExtensionDataItem(ExtendedInformationRestRequestComponent extensionDataItem) {
    if (this.extensionData == null) {
      this.extensionData = new ArrayList<>();
    }
    this.extensionData.add(extensionDataItem);
    return this;
  }

   /**
   * Get extensionData
   * @return extensionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtendedInformationRestRequestComponent> getExtensionData() {
    return extensionData;
  }


  public void setExtensionData(List<ExtendedInformationRestRequestComponent> extensionData) {
    this.extensionData = extensionData;
  }


  public AddEndEntityRestRequest caName(String caName) {
    
    this.caName = caName;
    return this;
  }

   /**
   * Certificate Authority (CA) name
   * @return caName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=ExampleCA", value = "Certificate Authority (CA) name")

  public String getCaName() {
    return caName;
  }


  public void setCaName(String caName) {
    this.caName = caName;
  }


  public AddEndEntityRestRequest certificateProfileName(String certificateProfileName) {
    
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


  public AddEndEntityRestRequest endEntityProfileName(String endEntityProfileName) {
    
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


  public AddEndEntityRestRequest token(TokenEnum token) {
    
    this.token = token;
    return this;
  }

   /**
   * Token type property
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P12", value = "Token type property")

  public TokenEnum getToken() {
    return token;
  }


  public void setToken(TokenEnum token) {
    this.token = token;
  }


  public AddEndEntityRestRequest accountBindingId(String accountBindingId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEndEntityRestRequest addEndEntityRestRequest = (AddEndEntityRestRequest) o;
    return Objects.equals(this.username, addEndEntityRestRequest.username) &&
        Objects.equals(this.password, addEndEntityRestRequest.password) &&
        Objects.equals(this.subjectDn, addEndEntityRestRequest.subjectDn) &&
        Objects.equals(this.subjectAltName, addEndEntityRestRequest.subjectAltName) &&
        Objects.equals(this.email, addEndEntityRestRequest.email) &&
        Objects.equals(this.extensionData, addEndEntityRestRequest.extensionData) &&
        Objects.equals(this.caName, addEndEntityRestRequest.caName) &&
        Objects.equals(this.certificateProfileName, addEndEntityRestRequest.certificateProfileName) &&
        Objects.equals(this.endEntityProfileName, addEndEntityRestRequest.endEntityProfileName) &&
        Objects.equals(this.token, addEndEntityRestRequest.token) &&
        Objects.equals(this.accountBindingId, addEndEntityRestRequest.accountBindingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, subjectDn, subjectAltName, email, extensionData, caName, certificateProfileName, endEntityProfileName, token, accountBindingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEndEntityRestRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    subjectDn: ").append(toIndentedString(subjectDn)).append("\n");
    sb.append("    subjectAltName: ").append(toIndentedString(subjectAltName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    extensionData: ").append(toIndentedString(extensionData)).append("\n");
    sb.append("    caName: ").append(toIndentedString(caName)).append("\n");
    sb.append("    certificateProfileName: ").append(toIndentedString(certificateProfileName)).append("\n");
    sb.append("    endEntityProfileName: ").append(toIndentedString(endEntityProfileName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    accountBindingId: ").append(toIndentedString(accountBindingId)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("subject_dn");
    openapiFields.add("subject_alt_name");
    openapiFields.add("email");
    openapiFields.add("extension_data");
    openapiFields.add("ca_name");
    openapiFields.add("certificate_profile_name");
    openapiFields.add("end_entity_profile_name");
    openapiFields.add("token");
    openapiFields.add("account_binding_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddEndEntityRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AddEndEntityRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddEndEntityRestRequest is not found in the empty JSON string", AddEndEntityRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddEndEntityRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddEndEntityRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("subject_dn") != null && !jsonObj.get("subject_dn").isJsonNull()) && !jsonObj.get("subject_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_dn").toString()));
      }
      if ((jsonObj.get("subject_alt_name") != null && !jsonObj.get("subject_alt_name").isJsonNull()) && !jsonObj.get("subject_alt_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_alt_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_alt_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("extension_data") != null && !jsonObj.get("extension_data").isJsonNull()) {
        JsonArray jsonArrayextensionData = jsonObj.getAsJsonArray("extension_data");
        if (jsonArrayextensionData != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extension_data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extension_data` to be an array in the JSON string but got `%s`", jsonObj.get("extension_data").toString()));
          }

          // validate the optional field `extension_data` (array)
          for (int i = 0; i < jsonArrayextensionData.size(); i++) {
            ExtendedInformationRestRequestComponent.validateJsonObject(jsonArrayextensionData.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("ca_name") != null && !jsonObj.get("ca_name").isJsonNull()) && !jsonObj.get("ca_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ca_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ca_name").toString()));
      }
      if ((jsonObj.get("certificate_profile_name") != null && !jsonObj.get("certificate_profile_name").isJsonNull()) && !jsonObj.get("certificate_profile_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_profile_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_profile_name").toString()));
      }
      if ((jsonObj.get("end_entity_profile_name") != null && !jsonObj.get("end_entity_profile_name").isJsonNull()) && !jsonObj.get("end_entity_profile_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_entity_profile_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_entity_profile_name").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("account_binding_id") != null && !jsonObj.get("account_binding_id").isJsonNull()) && !jsonObj.get("account_binding_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_binding_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_binding_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddEndEntityRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddEndEntityRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddEndEntityRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddEndEntityRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddEndEntityRestRequest>() {
           @Override
           public void write(JsonWriter out, AddEndEntityRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddEndEntityRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddEndEntityRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddEndEntityRestRequest
  * @throws IOException if the JSON string is invalid with respect to AddEndEntityRestRequest
  */
  public static AddEndEntityRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddEndEntityRestRequest.class);
  }

 /**
  * Convert an instance of AddEndEntityRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

