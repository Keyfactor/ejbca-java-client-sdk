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
 * Use one of allowed values as property(see enum values below). QUERY - multiplicity [0, 1] - is used to search by SubjectDn, SubjectAn, Username;  Available STATUS - multiplicity [0, 9] - values are: NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL;  END_ENTITY_PROFILE, CERTIFICATE_PROFILE, CA - multiplicity [0, *) - exact match of the name for referencing End Entity Profile, Certificate Profile or CA;  
 */
@ApiModel(description = "Use one of allowed values as property(see enum values below). QUERY - multiplicity [0, 1] - is used to search by SubjectDn, SubjectAn, Username;  Available STATUS - multiplicity [0, 9] - values are: NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL;  END_ENTITY_PROFILE, CERTIFICATE_PROFILE, CA - multiplicity [0, *) - exact match of the name for referencing End Entity Profile, Certificate Profile or CA;  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchEndEntityCriteriaRestRequest {
  /**
   * A search property
   */
  @JsonAdapter(PropertyEnum.Adapter.class)
  public enum PropertyEnum {
    QUERY("QUERY"),
    
    END_ENTITY_PROFILE("END_ENTITY_PROFILE"),
    
    CERTIFICATE_PROFILE("CERTIFICATE_PROFILE"),
    
    CA("CA"),
    
    STATUS("STATUS"),
    
    MODIFIED_BEFORE("MODIFIED_BEFORE"),
    
    MODIFIED_AFTER("MODIFIED_AFTER");

    private String value;

    PropertyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PropertyEnum fromValue(String value) {
      for (PropertyEnum b : PropertyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PropertyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PropertyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PropertyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private PropertyEnum property;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  /**
   * An operation for property on inserted value. &#39;EQUALS&#39; for string, &#39;LIKE&#39; for string value (&#39;QUERY&#39;)
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    EQUAL("EQUAL"),
    
    LIKE("LIKE");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private OperationEnum operation;

  public SearchEndEntityCriteriaRestRequest() {
  }

  public SearchEndEntityCriteriaRestRequest property(PropertyEnum property) {
    
    this.property = property;
    return this;
  }

   /**
   * A search property
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A search property")

  public PropertyEnum getProperty() {
    return property;
  }


  public void setProperty(PropertyEnum property) {
    this.property = property;
  }


  public SearchEndEntityCriteriaRestRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * A search value. This could be string value, an appropriate string name of End Entity Profile or Certificate Profile or CA
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "exampleUsername", value = "A search value. This could be string value, an appropriate string name of End Entity Profile or Certificate Profile or CA")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public SearchEndEntityCriteriaRestRequest operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * An operation for property on inserted value. &#39;EQUALS&#39; for string, &#39;LIKE&#39; for string value (&#39;QUERY&#39;)
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An operation for property on inserted value. 'EQUALS' for string, 'LIKE' for string value ('QUERY')")

  public OperationEnum getOperation() {
    return operation;
  }


  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEndEntityCriteriaRestRequest searchEndEntityCriteriaRestRequest = (SearchEndEntityCriteriaRestRequest) o;
    return Objects.equals(this.property, searchEndEntityCriteriaRestRequest.property) &&
        Objects.equals(this.value, searchEndEntityCriteriaRestRequest.value) &&
        Objects.equals(this.operation, searchEndEntityCriteriaRestRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, value, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEndEntityCriteriaRestRequest {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
    openapiFields.add("property");
    openapiFields.add("value");
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchEndEntityCriteriaRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchEndEntityCriteriaRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchEndEntityCriteriaRestRequest is not found in the empty JSON string", SearchEndEntityCriteriaRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchEndEntityCriteriaRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchEndEntityCriteriaRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchEndEntityCriteriaRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchEndEntityCriteriaRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchEndEntityCriteriaRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchEndEntityCriteriaRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchEndEntityCriteriaRestRequest>() {
           @Override
           public void write(JsonWriter out, SearchEndEntityCriteriaRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchEndEntityCriteriaRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchEndEntityCriteriaRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchEndEntityCriteriaRestRequest
  * @throws IOException if the JSON string is invalid with respect to SearchEndEntityCriteriaRestRequest
  */
  public static SearchEndEntityCriteriaRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchEndEntityCriteriaRestRequest.class);
  }

 /**
  * Convert an instance of SearchEndEntityCriteriaRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

