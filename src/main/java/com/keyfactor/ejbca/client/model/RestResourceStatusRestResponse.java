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
 * RestResourceStatusRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T11:20:10.237-07:00[America/Phoenix]")
public class RestResourceStatusRestResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private String revision;

  public RestResourceStatusRestResponse() {
  }

  public RestResourceStatusRestResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OK", value = "Status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public RestResourceStatusRestResponse version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Resource version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Resource version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public RestResourceStatusRestResponse revision(String revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Application revision
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EJBCA 1.0.0 Enterprise", value = "Application revision")

  public String getRevision() {
    return revision;
  }


  public void setRevision(String revision) {
    this.revision = revision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResourceStatusRestResponse restResourceStatusRestResponse = (RestResourceStatusRestResponse) o;
    return Objects.equals(this.status, restResourceStatusRestResponse.status) &&
        Objects.equals(this.version, restResourceStatusRestResponse.version) &&
        Objects.equals(this.revision, restResourceStatusRestResponse.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, version, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestResourceStatusRestResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("version");
    openapiFields.add("revision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RestResourceStatusRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RestResourceStatusRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestResourceStatusRestResponse is not found in the empty JSON string", RestResourceStatusRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RestResourceStatusRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestResourceStatusRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("revision") != null && !jsonObj.get("revision").isJsonNull()) && !jsonObj.get("revision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestResourceStatusRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestResourceStatusRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestResourceStatusRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestResourceStatusRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RestResourceStatusRestResponse>() {
           @Override
           public void write(JsonWriter out, RestResourceStatusRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestResourceStatusRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestResourceStatusRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestResourceStatusRestResponse
  * @throws IOException if the JSON string is invalid with respect to RestResourceStatusRestResponse
  */
  public static RestResourceStatusRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestResourceStatusRestResponse.class);
  }

 /**
  * Convert an instance of RestResourceStatusRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

