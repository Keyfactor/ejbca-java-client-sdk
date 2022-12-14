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
 * End Entity revocation request. Available reason codes:   0 - Unspecified,  1 - Key Compromise,  2 - CA Compromise,  3 - Affiliation Changed,  4 - Superseded,  5 - Cessation of Operation,  6 - Certificate Hold,  8 - Remove from CRL,  9 - Privileges Withdrawn,  10 - AA Compromise
 */
@ApiModel(description = "End Entity revocation request. Available reason codes:   0 - Unspecified,  1 - Key Compromise,  2 - CA Compromise,  3 - Affiliation Changed,  4 - Superseded,  5 - Cessation of Operation,  6 - Certificate Hold,  8 - Remove from CRL,  9 - Privileges Withdrawn,  10 - AA Compromise")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EndEntityRevocationRestRequest {
  /**
   * Reason code
   */
  @JsonAdapter(ReasonCodeEnum.Adapter.class)
  public enum ReasonCodeEnum {
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

    ReasonCodeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonCodeEnum fromValue(Integer value) {
      for (ReasonCodeEnum b : ReasonCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonCodeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ReasonCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON_CODE = "reason_code";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private ReasonCodeEnum reasonCode;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private Boolean delete;

  public EndEntityRevocationRestRequest() {
  }

  public EndEntityRevocationRestRequest reasonCode(ReasonCodeEnum reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Reason code
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Reason code")

  public ReasonCodeEnum getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(ReasonCodeEnum reasonCode) {
    this.reasonCode = reasonCode;
  }


  public EndEntityRevocationRestRequest delete(Boolean delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Delete")

  public Boolean getDelete() {
    return delete;
  }


  public void setDelete(Boolean delete) {
    this.delete = delete;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndEntityRevocationRestRequest endEntityRevocationRestRequest = (EndEntityRevocationRestRequest) o;
    return Objects.equals(this.reasonCode, endEntityRevocationRestRequest.reasonCode) &&
        Objects.equals(this.delete, endEntityRevocationRestRequest.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCode, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndEntityRevocationRestRequest {\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
    openapiFields.add("reason_code");
    openapiFields.add("delete");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EndEntityRevocationRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EndEntityRevocationRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndEntityRevocationRestRequest is not found in the empty JSON string", EndEntityRevocationRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EndEntityRevocationRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndEntityRevocationRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndEntityRevocationRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndEntityRevocationRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndEntityRevocationRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndEntityRevocationRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EndEntityRevocationRestRequest>() {
           @Override
           public void write(JsonWriter out, EndEntityRevocationRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndEntityRevocationRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndEntityRevocationRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndEntityRevocationRestRequest
  * @throws IOException if the JSON string is invalid with respect to EndEntityRevocationRestRequest
  */
  public static EndEntityRevocationRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndEntityRevocationRestRequest.class);
  }

 /**
  * Convert an instance of EndEntityRevocationRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

