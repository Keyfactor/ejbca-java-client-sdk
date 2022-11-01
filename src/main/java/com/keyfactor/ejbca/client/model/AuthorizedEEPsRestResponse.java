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
import com.keyfactor.ejbca.client.model.EndEntityProfileRestResponse;
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
 * AuthorizedEEPsRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T11:20:10.237-07:00[America/Phoenix]")
public class AuthorizedEEPsRestResponse {
  public static final String SERIALIZED_NAME_END_ENTITIE_PROFILES = "end_entitie_profiles";
  @SerializedName(SERIALIZED_NAME_END_ENTITIE_PROFILES)
  private List<EndEntityProfileRestResponse> endEntitieProfiles = null;

  public AuthorizedEEPsRestResponse() {
  }

  public AuthorizedEEPsRestResponse endEntitieProfiles(List<EndEntityProfileRestResponse> endEntitieProfiles) {
    
    this.endEntitieProfiles = endEntitieProfiles;
    return this;
  }

  public AuthorizedEEPsRestResponse addEndEntitieProfilesItem(EndEntityProfileRestResponse endEntitieProfilesItem) {
    if (this.endEntitieProfiles == null) {
      this.endEntitieProfiles = new ArrayList<>();
    }
    this.endEntitieProfiles.add(endEntitieProfilesItem);
    return this;
  }

   /**
   * Get endEntitieProfiles
   * @return endEntitieProfiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EndEntityProfileRestResponse> getEndEntitieProfiles() {
    return endEntitieProfiles;
  }


  public void setEndEntitieProfiles(List<EndEntityProfileRestResponse> endEntitieProfiles) {
    this.endEntitieProfiles = endEntitieProfiles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedEEPsRestResponse authorizedEEPsRestResponse = (AuthorizedEEPsRestResponse) o;
    return Objects.equals(this.endEntitieProfiles, authorizedEEPsRestResponse.endEntitieProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endEntitieProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedEEPsRestResponse {\n");
    sb.append("    endEntitieProfiles: ").append(toIndentedString(endEntitieProfiles)).append("\n");
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
    openapiFields.add("end_entitie_profiles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizedEEPsRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorizedEEPsRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizedEEPsRestResponse is not found in the empty JSON string", AuthorizedEEPsRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorizedEEPsRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizedEEPsRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("end_entitie_profiles") != null && !jsonObj.get("end_entitie_profiles").isJsonNull()) {
        JsonArray jsonArrayendEntitieProfiles = jsonObj.getAsJsonArray("end_entitie_profiles");
        if (jsonArrayendEntitieProfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("end_entitie_profiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `end_entitie_profiles` to be an array in the JSON string but got `%s`", jsonObj.get("end_entitie_profiles").toString()));
          }

          // validate the optional field `end_entitie_profiles` (array)
          for (int i = 0; i < jsonArrayendEntitieProfiles.size(); i++) {
            EndEntityProfileRestResponse.validateJsonObject(jsonArrayendEntitieProfiles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizedEEPsRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizedEEPsRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizedEEPsRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizedEEPsRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizedEEPsRestResponse>() {
           @Override
           public void write(JsonWriter out, AuthorizedEEPsRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizedEEPsRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizedEEPsRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizedEEPsRestResponse
  * @throws IOException if the JSON string is invalid with respect to AuthorizedEEPsRestResponse
  */
  public static AuthorizedEEPsRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizedEEPsRestResponse.class);
  }

 /**
  * Convert an instance of AuthorizedEEPsRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

