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
 * CryptoTokenActivationRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T00:18:55.030-07:00[America/Phoenix]")
public class CryptoTokenActivationRestRequest {
  public static final String SERIALIZED_NAME_ACTIVATION_CODE = "activation_code";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_CODE)
  private String activationCode;

  public CryptoTokenActivationRestRequest() {
  }

  public CryptoTokenActivationRestRequest activationCode(String activationCode) {
    
    this.activationCode = activationCode;
    return this;
  }

   /**
   * Activation Code
   * @return activationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "foo123", value = "Activation Code")

  public String getActivationCode() {
    return activationCode;
  }


  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoTokenActivationRestRequest cryptoTokenActivationRestRequest = (CryptoTokenActivationRestRequest) o;
    return Objects.equals(this.activationCode, cryptoTokenActivationRestRequest.activationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoTokenActivationRestRequest {\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
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
    openapiFields.add("activation_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CryptoTokenActivationRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CryptoTokenActivationRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CryptoTokenActivationRestRequest is not found in the empty JSON string", CryptoTokenActivationRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CryptoTokenActivationRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CryptoTokenActivationRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("activation_code") != null && !jsonObj.get("activation_code").isJsonNull()) && !jsonObj.get("activation_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activation_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activation_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CryptoTokenActivationRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CryptoTokenActivationRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CryptoTokenActivationRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CryptoTokenActivationRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CryptoTokenActivationRestRequest>() {
           @Override
           public void write(JsonWriter out, CryptoTokenActivationRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CryptoTokenActivationRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CryptoTokenActivationRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CryptoTokenActivationRestRequest
  * @throws IOException if the JSON string is invalid with respect to CryptoTokenActivationRestRequest
  */
  public static CryptoTokenActivationRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CryptoTokenActivationRestRequest.class);
  }

 /**
  * Convert an instance of CryptoTokenActivationRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

