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
 * Use one of allowed values as property(see enum values below). Available TOKEN - USERGENERATED, P12, BCFKS, JKS, PEM;  Available STATUS - NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL; 
 */
@ApiModel(description = "Use one of allowed values as property(see enum values below). Available TOKEN - USERGENERATED, P12, BCFKS, JKS, PEM;  Available STATUS - NEW, FAILED, INITIALIZED, INPROCESS, GENERATED, REVOKED, HISTORICAL, KEYRECOVERY, WAITINGFORADDAPPROVAL; ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T11:03:33.187-07:00[America/Phoenix]")
public class SetEndEntityStatusRestRequest {
  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  /**
   * Token type property
   */
  @JsonAdapter(TokenEnum.Adapter.class)
  public enum TokenEnum {
    USERGENERATED("USERGENERATED"),
    
    P12("P12"),
    
    BCFKS("BCFKS"),
    
    JKS("JKS"),
    
    PEM("PEM");

    private String value;

    TokenEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenEnum fromValue(String value) {
      for (TokenEnum b : TokenEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private TokenEnum token;

  /**
   * End entity status property
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("NEW"),
    
    FAILED("FAILED"),
    
    INITIALIZED("INITIALIZED"),
    
    INPROCESS("INPROCESS"),
    
    GENERATED("GENERATED"),
    
    REVOKED("REVOKED"),
    
    HISTORICAL("HISTORICAL"),
    
    KEYRECOVERY("KEYRECOVERY"),
    
    WAITINGFORADDAPPROVAL("WAITINGFORADDAPPROVAL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public SetEndEntityStatusRestRequest() {
  }

  public SetEndEntityStatusRestRequest password(String password) {
    
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


  public SetEndEntityStatusRestRequest token(TokenEnum token) {
    
    this.token = token;
    return this;
  }

   /**
   * Token type property
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USERGENERATED", value = "Token type property")

  public TokenEnum getToken() {
    return token;
  }


  public void setToken(TokenEnum token) {
    this.token = token;
  }


  public SetEndEntityStatusRestRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * End entity status property
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NEW", value = "End entity status property")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEndEntityStatusRestRequest setEndEntityStatusRestRequest = (SetEndEntityStatusRestRequest) o;
    return Objects.equals(this.password, setEndEntityStatusRestRequest.password) &&
        Objects.equals(this.token, setEndEntityStatusRestRequest.token) &&
        Objects.equals(this.status, setEndEntityStatusRestRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, token, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEndEntityStatusRestRequest {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("password");
    openapiFields.add("token");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SetEndEntityStatusRestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SetEndEntityStatusRestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetEndEntityStatusRestRequest is not found in the empty JSON string", SetEndEntityStatusRestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SetEndEntityStatusRestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetEndEntityStatusRestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetEndEntityStatusRestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetEndEntityStatusRestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetEndEntityStatusRestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetEndEntityStatusRestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SetEndEntityStatusRestRequest>() {
           @Override
           public void write(JsonWriter out, SetEndEntityStatusRestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetEndEntityStatusRestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetEndEntityStatusRestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetEndEntityStatusRestRequest
  * @throws IOException if the JSON string is invalid with respect to SetEndEntityStatusRestRequest
  */
  public static SetEndEntityStatusRestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetEndEntityStatusRestRequest.class);
  }

 /**
  * Convert an instance of SetEndEntityStatusRestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

