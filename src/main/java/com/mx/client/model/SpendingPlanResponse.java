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
 * SpendingPlanResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpendingPlanResponse {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CURRENT_ITERATION_NUMBER = "current_iteration_number";
  @SerializedName(SERIALIZED_NAME_CURRENT_ITERATION_NUMBER)
  private Integer currentIterationNumber;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public SpendingPlanResponse() { 
  }

  public SpendingPlanResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T18:08:00+00:00", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public SpendingPlanResponse currentIterationNumber(Integer currentIterationNumber) {
    
    this.currentIterationNumber = currentIterationNumber;
    return this;
  }

   /**
   * Get currentIterationNumber
   * @return currentIterationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCurrentIterationNumber() {
    return currentIterationNumber;
  }


  public void setCurrentIterationNumber(Integer currentIterationNumber) {
    this.currentIterationNumber = currentIterationNumber;
  }


  public SpendingPlanResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public SpendingPlanResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T18:09:00+00:00", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public SpendingPlanResponse userGuid(String userGuid) {
    
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USR-fa7537f3-48aa-a683-a02a-b18940482f54", value = "")

  public String getUserGuid() {
    return userGuid;
  }


  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingPlanResponse spendingPlanResponse = (SpendingPlanResponse) o;
    return Objects.equals(this.createdAt, spendingPlanResponse.createdAt) &&
        Objects.equals(this.currentIterationNumber, spendingPlanResponse.currentIterationNumber) &&
        Objects.equals(this.guid, spendingPlanResponse.guid) &&
        Objects.equals(this.updatedAt, spendingPlanResponse.updatedAt) &&
        Objects.equals(this.userGuid, spendingPlanResponse.userGuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentIterationNumber, guid, updatedAt, userGuid);
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
    sb.append("class SpendingPlanResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentIterationNumber: ").append(toIndentedString(currentIterationNumber)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
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

