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
 * SearchCertificatesRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T11:03:33.187-07:00[America/Phoenix]")
public class SearchCertificatesRestResponse {
  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<CertificateRestResponse> certificates = null;

  public static final String SERIALIZED_NAME_MORE_RESULTS = "more_results";
  @SerializedName(SERIALIZED_NAME_MORE_RESULTS)
  private Boolean moreResults;

  public SearchCertificatesRestResponse() {
  }

  public SearchCertificatesRestResponse certificates(List<CertificateRestResponse> certificates) {
    
    this.certificates = certificates;
    return this;
  }

  public SearchCertificatesRestResponse addCertificatesItem(CertificateRestResponse certificatesItem) {
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


  public SearchCertificatesRestResponse moreResults(Boolean moreResults) {
    
    this.moreResults = moreResults;
    return this;
  }

   /**
   * Get moreResults
   * @return moreResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMoreResults() {
    return moreResults;
  }


  public void setMoreResults(Boolean moreResults) {
    this.moreResults = moreResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCertificatesRestResponse searchCertificatesRestResponse = (SearchCertificatesRestResponse) o;
    return Objects.equals(this.certificates, searchCertificatesRestResponse.certificates) &&
        Objects.equals(this.moreResults, searchCertificatesRestResponse.moreResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, moreResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCertificatesRestResponse {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    moreResults: ").append(toIndentedString(moreResults)).append("\n");
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
    openapiFields.add("more_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchCertificatesRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchCertificatesRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchCertificatesRestResponse is not found in the empty JSON string", SearchCertificatesRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchCertificatesRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchCertificatesRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!SearchCertificatesRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchCertificatesRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchCertificatesRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchCertificatesRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchCertificatesRestResponse>() {
           @Override
           public void write(JsonWriter out, SearchCertificatesRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchCertificatesRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchCertificatesRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchCertificatesRestResponse
  * @throws IOException if the JSON string is invalid with respect to SearchCertificatesRestResponse
  */
  public static SearchCertificatesRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchCertificatesRestResponse.class);
  }

 /**
  * Convert an instance of SearchCertificatesRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

