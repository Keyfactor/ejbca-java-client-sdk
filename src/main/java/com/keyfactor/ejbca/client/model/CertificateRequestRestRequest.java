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
 * CertificateRequestRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T00:18:55.030-07:00[America/Phoenix]")
public class CertificateRequestRestRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_REQUEST = "certificate_request";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_REQUEST)
  private String certificateRequest;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_INCLUDE_CHAIN = "include_chain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHAIN)
  private Boolean includeChain;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_NAME = "certificate_authority_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_NAME)
  private String certificateAuthorityName;

  public CertificateRequestRestRequest() {
  }

  public CertificateRequestRestRequest certificateRequest(String certificateRequest) {
    
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


  public CertificateRequestRestRequest username(String username) {
    
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


  public CertificateRequestRestRequest password(String password) {
    
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


  public CertificateRequestRestRequest includeChain(Boolean includeChain) {
    
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


  public CertificateRequestRestRequest certificateAuthorityName(String certificateAuthorityName) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateRequestRestRequest certificateRequestRestRequest = (CertificateRequestRestRequest) o;
    return Objects.equals(this.certificateRequest, certificateRequestRestRequest.certificateRequest) &&
        Objects.equals(this.username, certificateRequestRestRequest.username) &&
        Objects.equals(this.password, certificateRequestRestRequest.password) &&
        Objects.equals(this.includeChain, certificateRequestRestRequest.includeChain) &&
        Objects.equals(this.certificateAuthorityName, certificateRequestRestRequest.certificateAuthorityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateRequest, username, password, includeChain, certificateAuthorityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateRequestRestRequest {\n");
    sb.append("    certificateRequest: ").append(toIndentedString(certificateRequest)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    includeChain: ").append(toIndentedString(includeChain)).append("\n");
    sb.append("    certificateAuthorityName: ").append(toIndentedString(certificateAuthorityName)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("include_chain");
    openapiFields.add("certificate_authority_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateRequestRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificateRequestRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateRequestRestRequest is not found in the empty JSON string", CertificateRequestRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateRequestRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateRequestRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("certificate_request") != null && !jsonObj.get("certificate_request").isJsonNull()) && !jsonObj.get("certificate_request").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_request` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_request").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("certificate_authority_name") != null && !jsonObj.get("certificate_authority_name").isJsonNull()) && !jsonObj.get("certificate_authority_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_authority_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_authority_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateRequestRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateRequestRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateRequestRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateRequestRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateRequestRestRequest>() {
           @Override
           public void write(JsonWriter out, CertificateRequestRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateRequestRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateRequestRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateRequestRestRequest
  * @throws IOException if the JSON string is invalid with respect to CertificateRequestRestRequest
  */
  public static CertificateRequestRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateRequestRestRequest.class);
  }

 /**
  * Convert an instance of CertificateRequestRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

