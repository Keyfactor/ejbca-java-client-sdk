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
import com.keyfactor.ejbca.client.model.CertificateRestResponse;
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
 * CertificatesRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CertificatesRestResponse {
  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<CertificateRestResponse> certificates = null;

  public CertificatesRestResponse() {
  }

  public CertificatesRestResponse certificates(List<CertificateRestResponse> certificates) {
    
    this.certificates = certificates;
    return this;
  }

  public CertificatesRestResponse addCertificatesItem(CertificateRestResponse certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CertificateRestResponse> getCertificates() {
    return certificates;
  }


  public void setCertificates(List<CertificateRestResponse> certificates) {
    this.certificates = certificates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificatesRestResponse certificatesRestResponse = (CertificatesRestResponse) o;
    return Objects.equals(this.certificates, certificatesRestResponse.certificates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificatesRestResponse {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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
    openapiFields.add("certificates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificatesRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificatesRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificatesRestResponse is not found in the empty JSON string", CertificatesRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificatesRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificatesRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("certificates") != null && !jsonObj.get("certificates").isJsonNull()) {
        JsonArray jsonArraycertificates = jsonObj.getAsJsonArray("certificates");
        if (jsonArraycertificates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("certificates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `certificates` to be an array in the JSON string but got `%s`", jsonObj.get("certificates").toString()));
          }

          // validate the optional field `certificates` (array)
          for (int i = 0; i < jsonArraycertificates.size(); i++) {
            CertificateRestResponse.validateJsonObject(jsonArraycertificates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificatesRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificatesRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificatesRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificatesRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificatesRestResponse>() {
           @Override
           public void write(JsonWriter out, CertificatesRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificatesRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificatesRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificatesRestResponse
  * @throws IOException if the JSON string is invalid with respect to CertificatesRestResponse
  */
  public static CertificatesRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificatesRestResponse.class);
  }

 /**
  * Convert an instance of CertificatesRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

