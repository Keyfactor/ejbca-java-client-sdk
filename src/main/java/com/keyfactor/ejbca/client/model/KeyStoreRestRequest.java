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
 * KeyStoreRestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T11:03:33.187-07:00[America/Phoenix]")
public class KeyStoreRestRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_KEY_ALG = "key_alg";
  @SerializedName(SERIALIZED_NAME_KEY_ALG)
  private String keyAlg;

  public static final String SERIALIZED_NAME_KEY_SPEC = "key_spec";
  @SerializedName(SERIALIZED_NAME_KEY_SPEC)
  private String keySpec;

  public KeyStoreRestRequest() {
  }

  public KeyStoreRestRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JohnDoe", value = "Username")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public KeyStoreRestRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "foo123", value = "Password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public KeyStoreRestRequest keyAlg(String keyAlg) {
    
    this.keyAlg = keyAlg;
    return this;
  }

   /**
   * Key algorithm used for enrollment
   * @return keyAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RSA", value = "Key algorithm used for enrollment")

  public String getKeyAlg() {
    return keyAlg;
  }


  public void setKeyAlg(String keyAlg) {
    this.keyAlg = keyAlg;
  }


  public KeyStoreRestRequest keySpec(String keySpec) {
    
    this.keySpec = keySpec;
    return this;
  }

   /**
   * Key specification to use
   * @return keySpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4096", value = "Key specification to use")

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
    KeyStoreRestRequest keyStoreRestRequest = (KeyStoreRestRequest) o;
    return Objects.equals(this.username, keyStoreRestRequest.username) &&
        Objects.equals(this.password, keyStoreRestRequest.password) &&
        Objects.equals(this.keyAlg, keyStoreRestRequest.keyAlg) &&
        Objects.equals(this.keySpec, keyStoreRestRequest.keySpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, keyAlg, keySpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyStoreRestRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("key_alg");
    openapiFields.add("key_spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyStoreRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KeyStoreRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyStoreRestRequest is not found in the empty JSON string", KeyStoreRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyStoreRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyStoreRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
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
       if (!KeyStoreRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyStoreRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyStoreRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyStoreRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyStoreRestRequest>() {
           @Override
           public void write(JsonWriter out, KeyStoreRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyStoreRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyStoreRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyStoreRestRequest
  * @throws IOException if the JSON string is invalid with respect to KeyStoreRestRequest
  */
  public static KeyStoreRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyStoreRestRequest.class);
  }

 /**
  * Convert an instance of KeyStoreRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

