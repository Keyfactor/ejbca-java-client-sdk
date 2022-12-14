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
import com.keyfactor.ejbca.client.model.CertificatesRestResponse;
import com.keyfactor.ejbca.client.model.PaginationRestResponseComponent;
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
 * ExpiringCertificatesRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpiringCertificatesRestResponse {
  public static final String SERIALIZED_NAME_PAGINATION_REST_RESPONSE_COMPONENT = "pagination_rest_response_component";
  @SerializedName(SERIALIZED_NAME_PAGINATION_REST_RESPONSE_COMPONENT)
  private PaginationRestResponseComponent paginationRestResponseComponent;

  public static final String SERIALIZED_NAME_CERTIFICATES_REST_RESPONSE = "certificates_rest_response";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES_REST_RESPONSE)
  private CertificatesRestResponse certificatesRestResponse;

  public ExpiringCertificatesRestResponse() {
  }

  public ExpiringCertificatesRestResponse paginationRestResponseComponent(PaginationRestResponseComponent paginationRestResponseComponent) {
    
    this.paginationRestResponseComponent = paginationRestResponseComponent;
    return this;
  }

   /**
   * Get paginationRestResponseComponent
   * @return paginationRestResponseComponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationRestResponseComponent getPaginationRestResponseComponent() {
    return paginationRestResponseComponent;
  }


  public void setPaginationRestResponseComponent(PaginationRestResponseComponent paginationRestResponseComponent) {
    this.paginationRestResponseComponent = paginationRestResponseComponent;
  }


  public ExpiringCertificatesRestResponse certificatesRestResponse(CertificatesRestResponse certificatesRestResponse) {
    
    this.certificatesRestResponse = certificatesRestResponse;
    return this;
  }

   /**
   * Get certificatesRestResponse
   * @return certificatesRestResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificatesRestResponse getCertificatesRestResponse() {
    return certificatesRestResponse;
  }


  public void setCertificatesRestResponse(CertificatesRestResponse certificatesRestResponse) {
    this.certificatesRestResponse = certificatesRestResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpiringCertificatesRestResponse expiringCertificatesRestResponse = (ExpiringCertificatesRestResponse) o;
    return Objects.equals(this.paginationRestResponseComponent, expiringCertificatesRestResponse.paginationRestResponseComponent) &&
        Objects.equals(this.certificatesRestResponse, expiringCertificatesRestResponse.certificatesRestResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationRestResponseComponent, certificatesRestResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpiringCertificatesRestResponse {\n");
    sb.append("    paginationRestResponseComponent: ").append(toIndentedString(paginationRestResponseComponent)).append("\n");
    sb.append("    certificatesRestResponse: ").append(toIndentedString(certificatesRestResponse)).append("\n");
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
    openapiFields.add("pagination_rest_response_component");
    openapiFields.add("certificates_rest_response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExpiringCertificatesRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExpiringCertificatesRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExpiringCertificatesRestResponse is not found in the empty JSON string", ExpiringCertificatesRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExpiringCertificatesRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExpiringCertificatesRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `pagination_rest_response_component`
      if (jsonObj.get("pagination_rest_response_component") != null && !jsonObj.get("pagination_rest_response_component").isJsonNull()) {
        PaginationRestResponseComponent.validateJsonObject(jsonObj.getAsJsonObject("pagination_rest_response_component"));
      }
      // validate the optional field `certificates_rest_response`
      if (jsonObj.get("certificates_rest_response") != null && !jsonObj.get("certificates_rest_response").isJsonNull()) {
        CertificatesRestResponse.validateJsonObject(jsonObj.getAsJsonObject("certificates_rest_response"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExpiringCertificatesRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExpiringCertificatesRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExpiringCertificatesRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExpiringCertificatesRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExpiringCertificatesRestResponse>() {
           @Override
           public void write(JsonWriter out, ExpiringCertificatesRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExpiringCertificatesRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExpiringCertificatesRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExpiringCertificatesRestResponse
  * @throws IOException if the JSON string is invalid with respect to ExpiringCertificatesRestResponse
  */
  public static ExpiringCertificatesRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExpiringCertificatesRestResponse.class);
  }

 /**
  * Convert an instance of ExpiringCertificatesRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

