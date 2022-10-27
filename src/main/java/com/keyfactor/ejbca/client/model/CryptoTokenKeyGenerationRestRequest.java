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
 * CryptoTokenKeyGenerationRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T11:03:33.187-07:00[America/Phoenix]")
public class CryptoTokenKeyGenerationRestRequest {
  public static final String SERIALIZED_NAME_KEY_PAIR_ALIAS = "key_pair_alias";
  @SerializedName(SERIALIZED_NAME_KEY_PAIR_ALIAS)
  private String keyPairAlias;

  public static final String SERIALIZED_NAME_KEY_ALG = "key_alg";
  @SerializedName(SERIALIZED_NAME_KEY_ALG)
  private String keyAlg;

  public static final String SERIALIZED_NAME_KEY_SPEC = "key_spec";
  @SerializedName(SERIALIZED_NAME_KEY_SPEC)
  private String keySpec;

  public CryptoTokenKeyGenerationRestRequest() {
  }

  public CryptoTokenKeyGenerationRestRequest keyPairAlias(String keyPairAlias) {
    
    this.keyPairAlias = keyPairAlias;
    return this;
  }

   /**
   * Key pair alias
   * @return keyPairAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "signKey", value = "Key pair alias")

  public String getKeyPairAlias() {
    return keyPairAlias;
  }


  public void setKeyPairAlias(String keyPairAlias) {
    this.keyPairAlias = keyPairAlias;
  }


  public CryptoTokenKeyGenerationRestRequest keyAlg(String keyAlg) {
    
    this.keyAlg = keyAlg;
    return this;
  }

   /**
   * Key algorithm
   * @return keyAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RSA", value = "Key algorithm")

  public String getKeyAlg() {
    return keyAlg;
  }


  public void setKeyAlg(String keyAlg) {
    this.keyAlg = keyAlg;
  }


  public CryptoTokenKeyGenerationRestRequest keySpec(String keySpec) {
    
    this.keySpec = keySpec;
    return this;
  }

   /**
   * Key specification
   * @return keySpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4096", value = "Key specification")

  public String getKeySpec() {
    return keySpec;
  }


  public void setKeySpec(String keySpec) {
    this.keySpec = keySpec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoTokenKeyGenerationRestRequest cryptoTokenKeyGenerationRestRequest = (CryptoTokenKeyGenerationRestRequest) o;
    return Objects.equals(this.keyPairAlias, cryptoTokenKeyGenerationRestRequest.keyPairAlias) &&
        Objects.equals(this.keyAlg, cryptoTokenKeyGenerationRestRequest.keyAlg) &&
        Objects.equals(this.keySpec, cryptoTokenKeyGenerationRestRequest.keySpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPairAlias, keyAlg, keySpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoTokenKeyGenerationRestRequest {\n");
    sb.append("    keyPairAlias: ").append(toIndentedString(keyPairAlias)).append("\n");
    sb.append("    keyAlg: ").append(toIndentedString(keyAlg)).append("\n");
    sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
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
    openapiFields.add("key_pair_alias");
    openapiFields.add("key_alg");
    openapiFields.add("key_spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CryptoTokenKeyGenerationRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CryptoTokenKeyGenerationRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CryptoTokenKeyGenerationRestRequest is not found in the empty JSON string", CryptoTokenKeyGenerationRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CryptoTokenKeyGenerationRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CryptoTokenKeyGenerationRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("key_pair_alias") != null && !jsonObj.get("key_pair_alias").isJsonNull()) && !jsonObj.get("key_pair_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_pair_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_pair_alias").toString()));
      }
      if ((jsonObj.get("key_alg") != null && !jsonObj.get("key_alg").isJsonNull()) && !jsonObj.get("key_alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_alg").toString()));
      }
      if ((jsonObj.get("key_spec") != null && !jsonObj.get("key_spec").isJsonNull()) && !jsonObj.get("key_spec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_spec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key_spec").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CryptoTokenKeyGenerationRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CryptoTokenKeyGenerationRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CryptoTokenKeyGenerationRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CryptoTokenKeyGenerationRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CryptoTokenKeyGenerationRestRequest>() {
           @Override
           public void write(JsonWriter out, CryptoTokenKeyGenerationRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CryptoTokenKeyGenerationRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CryptoTokenKeyGenerationRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CryptoTokenKeyGenerationRestRequest
  * @throws IOException if the JSON string is invalid with respect to CryptoTokenKeyGenerationRestRequest
  */
  public static CryptoTokenKeyGenerationRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CryptoTokenKeyGenerationRestRequest.class);
  }

 /**
  * Convert an instance of CryptoTokenKeyGenerationRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

