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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CaInfoRestResponse;

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
 * CaInfosRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-04T15:03:09.556-07:00[America/Phoenix]")
public class CaInfosRestResponse {
  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITIES = "certificate_authorities";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITIES)
  private List<CaInfoRestResponse> certificateAuthorities = null;

  public CaInfosRestResponse() {
  }

  public CaInfosRestResponse certificateAuthorities(List<CaInfoRestResponse> certificateAuthorities) {
    
    this.certificateAuthorities = certificateAuthorities;
    return this;
  }

  public CaInfosRestResponse addCertificateAuthoritiesItem(CaInfoRestResponse certificateAuthoritiesItem) {
    if (this.certificateAuthorities == null) {
      this.certificateAuthorities = new ArrayList<>();
    }
    this.certificateAuthorities.add(certificateAuthoritiesItem);
    return this;
  }

   /**
   * Get certificateAuthorities
   * @return certificateAuthorities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CaInfoRestResponse> getCertificateAuthorities() {
    return certificateAuthorities;
  }


  public void setCertificateAuthorities(List<CaInfoRestResponse> certificateAuthorities) {
    this.certificateAuthorities = certificateAuthorities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaInfosRestResponse caInfosRestResponse = (CaInfosRestResponse) o;
    return Objects.equals(this.certificateAuthorities, caInfosRestResponse.certificateAuthorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateAuthorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaInfosRestResponse {\n");
    sb.append("    certificateAuthorities: ").append(toIndentedString(certificateAuthorities)).append("\n");
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
    openapiFields.add("certificate_authorities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaInfosRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CaInfosRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaInfosRestResponse is not found in the empty JSON string", CaInfosRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CaInfosRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaInfosRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("certificate_authorities") != null && !jsonObj.get("certificate_authorities").isJsonNull()) {
        JsonArray jsonArraycertificateAuthorities = jsonObj.getAsJsonArray("certificate_authorities");
        if (jsonArraycertificateAuthorities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("certificate_authorities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `certificate_authorities` to be an array in the JSON string but got `%s`", jsonObj.get("certificate_authorities").toString()));
          }

          // validate the optional field `certificate_authorities` (array)
          for (int i = 0; i < jsonArraycertificateAuthorities.size(); i++) {
            CaInfoRestResponse.validateJsonObject(jsonArraycertificateAuthorities.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaInfosRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaInfosRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaInfosRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaInfosRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CaInfosRestResponse>() {
           @Override
           public void write(JsonWriter out, CaInfosRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaInfosRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CaInfosRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaInfosRestResponse
  * @throws IOException if the JSON string is invalid with respect to CaInfosRestResponse
  */
  public static CaInfosRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaInfosRestResponse.class);
  }

 /**
  * Convert an instance of CaInfosRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

