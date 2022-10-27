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


package com.keyfactor.ejbca.model;

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
import java.util.HashMap;
import java.util.Map;

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
 * CreateCrlRestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-26T23:53:22.978-07:00[America/Phoenix]")
public class CreateCrlRestResponse {
  public static final String SERIALIZED_NAME_ISSUER_DN = "issuer_dn";
  @SerializedName(SERIALIZED_NAME_ISSUER_DN)
  private String issuerDn;

  public static final String SERIALIZED_NAME_LATEST_CRL_VERSION = "latest_crl_version";
  @SerializedName(SERIALIZED_NAME_LATEST_CRL_VERSION)
  private Integer latestCrlVersion;

  public static final String SERIALIZED_NAME_LATEST_DELTA_CRL_VERSION = "latest_delta_crl_version";
  @SerializedName(SERIALIZED_NAME_LATEST_DELTA_CRL_VERSION)
  private Integer latestDeltaCrlVersion;

  public static final String SERIALIZED_NAME_LATEST_PARTITION_CRL_VERSIONS = "latest_partition_crl_versions";
  @SerializedName(SERIALIZED_NAME_LATEST_PARTITION_CRL_VERSIONS)
  private Map<String, Integer> latestPartitionCrlVersions = null;

  public static final String SERIALIZED_NAME_LATEST_PARTITION_DELTA_CRL_VERSIONS = "latest_partition_delta_crl_versions";
  @SerializedName(SERIALIZED_NAME_LATEST_PARTITION_DELTA_CRL_VERSIONS)
  private Map<String, Integer> latestPartitionDeltaCrlVersions = null;

  public static final String SERIALIZED_NAME_ALL_SUCCESS = "all_success";
  @SerializedName(SERIALIZED_NAME_ALL_SUCCESS)
  private Boolean allSuccess;

  public CreateCrlRestResponse() {
  }

  public CreateCrlRestResponse issuerDn(String issuerDn) {
    
    this.issuerDn = issuerDn;
    return this;
  }

   /**
   * Issuer Distinguished Name
   * @return issuerDn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CN=ExampleCA", value = "Issuer Distinguished Name")

  public String getIssuerDn() {
    return issuerDn;
  }


  public void setIssuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
  }


  public CreateCrlRestResponse latestCrlVersion(Integer latestCrlVersion) {
    
    this.latestCrlVersion = latestCrlVersion;
    return this;
  }

   /**
   * Latest base CRL version
   * @return latestCrlVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Latest base CRL version")

  public Integer getLatestCrlVersion() {
    return latestCrlVersion;
  }


  public void setLatestCrlVersion(Integer latestCrlVersion) {
    this.latestCrlVersion = latestCrlVersion;
  }


  public CreateCrlRestResponse latestDeltaCrlVersion(Integer latestDeltaCrlVersion) {
    
    this.latestDeltaCrlVersion = latestDeltaCrlVersion;
    return this;
  }

   /**
   * Latest delta CRL version
   * @return latestDeltaCrlVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Latest delta CRL version")

  public Integer getLatestDeltaCrlVersion() {
    return latestDeltaCrlVersion;
  }


  public void setLatestDeltaCrlVersion(Integer latestDeltaCrlVersion) {
    this.latestDeltaCrlVersion = latestDeltaCrlVersion;
  }


  public CreateCrlRestResponse latestPartitionCrlVersions(Map<String, Integer> latestPartitionCrlVersions) {
    
    this.latestPartitionCrlVersions = latestPartitionCrlVersions;
    return this;
  }

  public CreateCrlRestResponse putLatestPartitionCrlVersionsItem(String key, Integer latestPartitionCrlVersionsItem) {
    if (this.latestPartitionCrlVersions == null) {
      this.latestPartitionCrlVersions = new HashMap<>();
    }
    this.latestPartitionCrlVersions.put(key, latestPartitionCrlVersionsItem);
    return this;
  }

   /**
   * Get latestPartitionCrlVersions
   * @return latestPartitionCrlVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getLatestPartitionCrlVersions() {
    return latestPartitionCrlVersions;
  }


  public void setLatestPartitionCrlVersions(Map<String, Integer> latestPartitionCrlVersions) {
    this.latestPartitionCrlVersions = latestPartitionCrlVersions;
  }


  public CreateCrlRestResponse latestPartitionDeltaCrlVersions(Map<String, Integer> latestPartitionDeltaCrlVersions) {
    
    this.latestPartitionDeltaCrlVersions = latestPartitionDeltaCrlVersions;
    return this;
  }

  public CreateCrlRestResponse putLatestPartitionDeltaCrlVersionsItem(String key, Integer latestPartitionDeltaCrlVersionsItem) {
    if (this.latestPartitionDeltaCrlVersions == null) {
      this.latestPartitionDeltaCrlVersions = new HashMap<>();
    }
    this.latestPartitionDeltaCrlVersions.put(key, latestPartitionDeltaCrlVersionsItem);
    return this;
  }

   /**
   * Get latestPartitionDeltaCrlVersions
   * @return latestPartitionDeltaCrlVersions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Integer> getLatestPartitionDeltaCrlVersions() {
    return latestPartitionDeltaCrlVersions;
  }


  public void setLatestPartitionDeltaCrlVersions(Map<String, Integer> latestPartitionDeltaCrlVersions) {
    this.latestPartitionDeltaCrlVersions = latestPartitionDeltaCrlVersions;
  }


  public CreateCrlRestResponse allSuccess(Boolean allSuccess) {
    
    this.allSuccess = allSuccess;
    return this;
  }

   /**
   * Get allSuccess
   * @return allSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllSuccess() {
    return allSuccess;
  }


  public void setAllSuccess(Boolean allSuccess) {
    this.allSuccess = allSuccess;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCrlRestResponse createCrlRestResponse = (CreateCrlRestResponse) o;
    return Objects.equals(this.issuerDn, createCrlRestResponse.issuerDn) &&
        Objects.equals(this.latestCrlVersion, createCrlRestResponse.latestCrlVersion) &&
        Objects.equals(this.latestDeltaCrlVersion, createCrlRestResponse.latestDeltaCrlVersion) &&
        Objects.equals(this.latestPartitionCrlVersions, createCrlRestResponse.latestPartitionCrlVersions) &&
        Objects.equals(this.latestPartitionDeltaCrlVersions, createCrlRestResponse.latestPartitionDeltaCrlVersions) &&
        Objects.equals(this.allSuccess, createCrlRestResponse.allSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerDn, latestCrlVersion, latestDeltaCrlVersion, latestPartitionCrlVersions, latestPartitionDeltaCrlVersions, allSuccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCrlRestResponse {\n");
    sb.append("    issuerDn: ").append(toIndentedString(issuerDn)).append("\n");
    sb.append("    latestCrlVersion: ").append(toIndentedString(latestCrlVersion)).append("\n");
    sb.append("    latestDeltaCrlVersion: ").append(toIndentedString(latestDeltaCrlVersion)).append("\n");
    sb.append("    latestPartitionCrlVersions: ").append(toIndentedString(latestPartitionCrlVersions)).append("\n");
    sb.append("    latestPartitionDeltaCrlVersions: ").append(toIndentedString(latestPartitionDeltaCrlVersions)).append("\n");
    sb.append("    allSuccess: ").append(toIndentedString(allSuccess)).append("\n");
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
    openapiFields.add("issuer_dn");
    openapiFields.add("latest_crl_version");
    openapiFields.add("latest_delta_crl_version");
    openapiFields.add("latest_partition_crl_versions");
    openapiFields.add("latest_partition_delta_crl_versions");
    openapiFields.add("all_success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCrlRestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCrlRestResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCrlRestResponse is not found in the empty JSON string", CreateCrlRestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCrlRestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCrlRestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("issuer_dn") != null && !jsonObj.get("issuer_dn").isJsonNull()) && !jsonObj.get("issuer_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer_dn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCrlRestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCrlRestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCrlRestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCrlRestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCrlRestResponse>() {
           @Override
           public void write(JsonWriter out, CreateCrlRestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCrlRestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCrlRestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCrlRestResponse
  * @throws IOException if the JSON string is invalid with respect to CreateCrlRestResponse
  */
  public static CreateCrlRestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCrlRestResponse.class);
  }

 /**
  * Convert an instance of CreateCrlRestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

