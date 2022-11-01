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
 * SshPublicKeyRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T11:20:10.237-07:00[America/Phoenix]")
public class SshPublicKeyRestResponse {
  public static final String SERIALIZED_NAME_CA_NAME = "ca_name";
  @SerializedName(SERIALIZED_NAME_CA_NAME)
  private String caName;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public SshPublicKeyRestResponse() {
  }

  public SshPublicKeyRestResponse caName(String caName) {
    
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


  public SshPublicKeyRestResponse response(String response) {
    
    this.response = response;
    return this;
  }

   /**
   * CA’s public key
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ssh-rsa AAAAB...QxLwx SshCA", value = "CA’s public key")

  public String getResponse() {
    return response;
  }


  public void setResponse(String response) {
    this.response = response;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SshPublicKeyRestResponse sshPublicKeyRestResponse = (SshPublicKeyRestResponse) o;
    return Objects.equals(this.caName, sshPublicKeyRestResponse.caName) &&
        Objects.equals(this.response, sshPublicKeyRestResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caName, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SshPublicKeyRestResponse {\n");
    sb.append("    caName: ").append(toIndentedString(caName)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
    openapiFields.add("ca_name");
    openapiFields.add("response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SshPublicKeyRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SshPublicKeyRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SshPublicKeyRestResponse is not found in the empty JSON string", SshPublicKeyRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SshPublicKeyRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SshPublicKeyRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ca_name") != null && !jsonObj.get("ca_name").isJsonNull()) && !jsonObj.get("ca_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ca_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ca_name").toString()));
      }
      if ((jsonObj.get("response") != null && !jsonObj.get("response").isJsonNull()) && !jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SshPublicKeyRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SshPublicKeyRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SshPublicKeyRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SshPublicKeyRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SshPublicKeyRestResponse>() {
           @Override
           public void write(JsonWriter out, SshPublicKeyRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SshPublicKeyRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SshPublicKeyRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SshPublicKeyRestResponse
  * @throws IOException if the JSON string is invalid with respect to SshPublicKeyRestResponse
  */
  public static SshPublicKeyRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SshPublicKeyRestResponse.class);
  }

 /**
  * Convert an instance of SshPublicKeyRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

