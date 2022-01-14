/*
 * MX Platform API
 * The MX Platform API is a powerful, fully-featured API designed to make aggregating and enhancing financial data easy and reliable. It can seamlessly connect your app or website to tens of thousands of financial institutions.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mx.client.model;

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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * InstitutionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstitutionResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MEDIUM_LOGO_URL = "medium_logo_url";
  @SerializedName(SERIALIZED_NAME_MEDIUM_LOGO_URL)
  private String mediumLogoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SMALL_LOGO_URL = "small_logo_url";
  @SerializedName(SERIALIZED_NAME_SMALL_LOGO_URL)
  private String smallLogoUrl;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_IDENTIFICATION = "supports_account_identification";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_IDENTIFICATION)
  private Boolean supportsAccountIdentification;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_STATEMENT = "supports_account_statement";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_STATEMENT)
  private Boolean supportsAccountStatement;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_VERIFICATION = "supports_account_verification";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_VERIFICATION)
  private Boolean supportsAccountVerification;

  public static final String SERIALIZED_NAME_SUPPORTS_OAUTH = "supports_oauth";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_OAUTH)
  private Boolean supportsOauth;

  public static final String SERIALIZED_NAME_SUPPORTS_TRANSACTION_HISTORY = "supports_transaction_history";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_TRANSACTION_HISTORY)
  private Boolean supportsTransactionHistory;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public InstitutionResponse() { 
  }

  public InstitutionResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "chase", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InstitutionResponse mediumLogoUrl(String mediumLogoUrl) {
    
    this.mediumLogoUrl = mediumLogoUrl;
    return this;
  }

   /**
   * Get mediumLogoUrl
   * @return mediumLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://content.moneydesktop.com/storage/MD_Assets/Ipad%20Logos/100x100/default_100x100.png", value = "")

  public String getMediumLogoUrl() {
    return mediumLogoUrl;
  }


  public void setMediumLogoUrl(String mediumLogoUrl) {
    this.mediumLogoUrl = mediumLogoUrl;
  }


  public InstitutionResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chase Bank", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InstitutionResponse smallLogoUrl(String smallLogoUrl) {
    
    this.smallLogoUrl = smallLogoUrl;
    return this;
  }

   /**
   * Get smallLogoUrl
   * @return smallLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://content.moneydesktop.com/storage/MD_Assets/Ipad%20Logos/50x50/default_50x50.png", value = "")

  public String getSmallLogoUrl() {
    return smallLogoUrl;
  }


  public void setSmallLogoUrl(String smallLogoUrl) {
    this.smallLogoUrl = smallLogoUrl;
  }


  public InstitutionResponse supportsAccountIdentification(Boolean supportsAccountIdentification) {
    
    this.supportsAccountIdentification = supportsAccountIdentification;
    return this;
  }

   /**
   * Get supportsAccountIdentification
   * @return supportsAccountIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSupportsAccountIdentification() {
    return supportsAccountIdentification;
  }


  public void setSupportsAccountIdentification(Boolean supportsAccountIdentification) {
    this.supportsAccountIdentification = supportsAccountIdentification;
  }


  public InstitutionResponse supportsAccountStatement(Boolean supportsAccountStatement) {
    
    this.supportsAccountStatement = supportsAccountStatement;
    return this;
  }

   /**
   * Get supportsAccountStatement
   * @return supportsAccountStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSupportsAccountStatement() {
    return supportsAccountStatement;
  }


  public void setSupportsAccountStatement(Boolean supportsAccountStatement) {
    this.supportsAccountStatement = supportsAccountStatement;
  }


  public InstitutionResponse supportsAccountVerification(Boolean supportsAccountVerification) {
    
    this.supportsAccountVerification = supportsAccountVerification;
    return this;
  }

   /**
   * Get supportsAccountVerification
   * @return supportsAccountVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSupportsAccountVerification() {
    return supportsAccountVerification;
  }


  public void setSupportsAccountVerification(Boolean supportsAccountVerification) {
    this.supportsAccountVerification = supportsAccountVerification;
  }


  public InstitutionResponse supportsOauth(Boolean supportsOauth) {
    
    this.supportsOauth = supportsOauth;
    return this;
  }

   /**
   * Get supportsOauth
   * @return supportsOauth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSupportsOauth() {
    return supportsOauth;
  }


  public void setSupportsOauth(Boolean supportsOauth) {
    this.supportsOauth = supportsOauth;
  }


  public InstitutionResponse supportsTransactionHistory(Boolean supportsTransactionHistory) {
    
    this.supportsTransactionHistory = supportsTransactionHistory;
    return this;
  }

   /**
   * Get supportsTransactionHistory
   * @return supportsTransactionHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSupportsTransactionHistory() {
    return supportsTransactionHistory;
  }


  public void setSupportsTransactionHistory(Boolean supportsTransactionHistory) {
    this.supportsTransactionHistory = supportsTransactionHistory;
  }


  public InstitutionResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.chase.com", value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionResponse institutionResponse = (InstitutionResponse) o;
    return Objects.equals(this.code, institutionResponse.code) &&
        Objects.equals(this.mediumLogoUrl, institutionResponse.mediumLogoUrl) &&
        Objects.equals(this.name, institutionResponse.name) &&
        Objects.equals(this.smallLogoUrl, institutionResponse.smallLogoUrl) &&
        Objects.equals(this.supportsAccountIdentification, institutionResponse.supportsAccountIdentification) &&
        Objects.equals(this.supportsAccountStatement, institutionResponse.supportsAccountStatement) &&
        Objects.equals(this.supportsAccountVerification, institutionResponse.supportsAccountVerification) &&
        Objects.equals(this.supportsOauth, institutionResponse.supportsOauth) &&
        Objects.equals(this.supportsTransactionHistory, institutionResponse.supportsTransactionHistory) &&
        Objects.equals(this.url, institutionResponse.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, mediumLogoUrl, name, smallLogoUrl, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsOauth, supportsTransactionHistory, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    mediumLogoUrl: ").append(toIndentedString(mediumLogoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smallLogoUrl: ").append(toIndentedString(smallLogoUrl)).append("\n");
    sb.append("    supportsAccountIdentification: ").append(toIndentedString(supportsAccountIdentification)).append("\n");
    sb.append("    supportsAccountStatement: ").append(toIndentedString(supportsAccountStatement)).append("\n");
    sb.append("    supportsAccountVerification: ").append(toIndentedString(supportsAccountVerification)).append("\n");
    sb.append("    supportsOauth: ").append(toIndentedString(supportsOauth)).append("\n");
    sb.append("    supportsTransactionHistory: ").append(toIndentedString(supportsTransactionHistory)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

}

