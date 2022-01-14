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
 * TransactionRuleUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRuleUpdateRequest {
  public static final String SERIALIZED_NAME_CATEGORY_GUID = "category_guid";
  @SerializedName(SERIALIZED_NAME_CATEGORY_GUID)
  private String categoryGuid;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MATCH_DESCRIPTION = "match_description";
  @SerializedName(SERIALIZED_NAME_MATCH_DESCRIPTION)
  private String matchDescription;

  public TransactionRuleUpdateRequest() { 
  }

  public TransactionRuleUpdateRequest categoryGuid(String categoryGuid) {
    
    this.categoryGuid = categoryGuid;
    return this;
  }

   /**
   * Get categoryGuid
   * @return categoryGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAT-b1de2a04-db08-b6ed-f6fe-ca2f5b11c2d0", value = "")

  public String getCategoryGuid() {
    return categoryGuid;
  }


  public void setCategoryGuid(String categoryGuid) {
    this.categoryGuid = categoryGuid;
  }


  public TransactionRuleUpdateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wal-mart food storage", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionRuleUpdateRequest matchDescription(String matchDescription) {
    
    this.matchDescription = matchDescription;
    return this;
  }

   /**
   * Get matchDescription
   * @return matchDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wal-mart", value = "")

  public String getMatchDescription() {
    return matchDescription;
  }


  public void setMatchDescription(String matchDescription) {
    this.matchDescription = matchDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleUpdateRequest transactionRuleUpdateRequest = (TransactionRuleUpdateRequest) o;
    return Objects.equals(this.categoryGuid, transactionRuleUpdateRequest.categoryGuid) &&
        Objects.equals(this.description, transactionRuleUpdateRequest.description) &&
        Objects.equals(this.matchDescription, transactionRuleUpdateRequest.matchDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryGuid, description, matchDescription);
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
    sb.append("class TransactionRuleUpdateRequest {\n");
    sb.append("    categoryGuid: ").append(toIndentedString(categoryGuid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    matchDescription: ").append(toIndentedString(matchDescription)).append("\n");
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

