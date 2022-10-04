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


package org.openapitools.client.model;

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

import org.openapitools.client.JSON;

/**
 * Use one of allowed values as property and operation. Available propertiesUSERNAME  SUBJECT_DN  SUBJECT_ALT_NAME  END_ENTITY_PROFILE(by databse identifier, not user-given name)  CERTIFICATE_PROFILE(by identifier)  CA(by identifier)  STATUS  UPDATE_TIME  CREATED_DATE   Available operationsASC  DESC  
 */
@ApiModel(description = "Use one of allowed values as property and operation. Available propertiesUSERNAME  SUBJECT_DN  SUBJECT_ALT_NAME  END_ENTITY_PROFILE(by databse identifier, not user-given name)  CERTIFICATE_PROFILE(by identifier)  CA(by identifier)  STATUS  UPDATE_TIME  CREATED_DATE   Available operationsASC  DESC  ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-04T15:03:09.556-07:00[America/Phoenix]")
public class SearchEndEntitiesSortRestRequest {
  /**
   * Sorted by
   */
  @JsonAdapter(PropertyEnum.Adapter.class)
  public enum PropertyEnum {
    USERNAME("USERNAME"),
    
    SUBJECT_DN("SUBJECT_DN"),
    
    SUBJECT_ALT_NAME("SUBJECT_ALT_NAME"),
    
    END_ENTITY_PROFILE("END_ENTITY_PROFILE"),
    
    CERTIFICATE_PROFILE("CERTIFICATE_PROFILE"),
    
    STATUS("STATUS"),
    
    UPDATE_TIME("UPDATE_TIME"),
    
    CREATED_TIME("CREATED_TIME");

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

  /**
   * Sort ascending or descending. &#39;ASC&#39; for ascending, &#39;DESC&#39; for descending.
   */
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    ASC("ASC"),
    
    DESC("DESC");

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

  public SearchEndEntitiesSortRestRequest() {
  }

  public SearchEndEntitiesSortRestRequest property(PropertyEnum property) {
    
    this.property = property;
    return this;
  }

   /**
   * Sorted by
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sorted by")

  public PropertyEnum getProperty() {
    return property;
  }


  public void setProperty(PropertyEnum property) {
    this.property = property;
  }


  public SearchEndEntitiesSortRestRequest operation(OperationEnum operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Sort ascending or descending. &#39;ASC&#39; for ascending, &#39;DESC&#39; for descending.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sort ascending or descending. 'ASC' for ascending, 'DESC' for descending.")

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
    SearchEndEntitiesSortRestRequest searchEndEntitiesSortRestRequest = (SearchEndEntitiesSortRestRequest) o;
    return Objects.equals(this.property, searchEndEntitiesSortRestRequest.property) &&
        Objects.equals(this.operation, searchEndEntitiesSortRestRequest.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEndEntitiesSortRestRequest {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
    openapiFields.add("operation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchEndEntitiesSortRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchEndEntitiesSortRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchEndEntitiesSortRestRequest is not found in the empty JSON string", SearchEndEntitiesSortRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchEndEntitiesSortRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchEndEntitiesSortRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
      if ((jsonObj.get("operation") != null && !jsonObj.get("operation").isJsonNull()) && !jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchEndEntitiesSortRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchEndEntitiesSortRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchEndEntitiesSortRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchEndEntitiesSortRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchEndEntitiesSortRestRequest>() {
           @Override
           public void write(JsonWriter out, SearchEndEntitiesSortRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchEndEntitiesSortRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchEndEntitiesSortRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchEndEntitiesSortRestRequest
  * @throws IOException if the JSON string is invalid with respect to SearchEndEntitiesSortRestRequest
  */
  public static SearchEndEntitiesSortRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchEndEntitiesSortRestRequest.class);
  }

 /**
  * Convert an instance of SearchEndEntitiesSortRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
