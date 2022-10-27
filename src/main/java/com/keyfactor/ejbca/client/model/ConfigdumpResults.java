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
 * ConfigdumpResults
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T00:18:55.030-07:00[America/Phoenix]")
public class ConfigdumpResults {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<String> errors = null;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = null;

  public ConfigdumpResults() {
  }

  public ConfigdumpResults success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ConfigdumpResults errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public ConfigdumpResults addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public ConfigdumpResults warnings(List<String> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public ConfigdumpResults addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigdumpResults configdumpResults = (ConfigdumpResults) o;
    return Objects.equals(this.success, configdumpResults.success) &&
        Objects.equals(this.errors, configdumpResults.errors) &&
        Objects.equals(this.warnings, configdumpResults.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigdumpResults {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("errors");
    openapiFields.add("warnings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigdumpResults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigdumpResults.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigdumpResults is not found in the empty JSON string", ConfigdumpResults.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigdumpResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigdumpResults` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("warnings") != null && !jsonObj.get("warnings").isJsonNull()) && !jsonObj.get("warnings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warnings` to be an array in the JSON string but got `%s`", jsonObj.get("warnings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigdumpResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigdumpResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigdumpResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigdumpResults.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigdumpResults>() {
           @Override
           public void write(JsonWriter out, ConfigdumpResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigdumpResults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigdumpResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigdumpResults
  * @throws IOException if the JSON string is invalid with respect to ConfigdumpResults
  */
  public static ConfigdumpResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigdumpResults.class);
  }

 /**
  * Convert an instance of ConfigdumpResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
