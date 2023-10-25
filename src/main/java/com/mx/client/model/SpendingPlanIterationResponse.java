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
 * SpendingPlanIterationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpendingPlanIterationResponse {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_END_ON = "end_on";
  @SerializedName(SERIALIZED_NAME_END_ON)
  private String endOn;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_ITERATION_NUMBER = "iteration_number";
  @SerializedName(SERIALIZED_NAME_ITERATION_NUMBER)
  private Integer iterationNumber;

  public static final String SERIALIZED_NAME_SPENDING_PLAN_GUID = "spending_plan_guid";
  @SerializedName(SERIALIZED_NAME_SPENDING_PLAN_GUID)
  private String spendingPlanGuid;

  public static final String SERIALIZED_NAME_START_ON = "start_on";
  @SerializedName(SERIALIZED_NAME_START_ON)
  private String startOn;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public SpendingPlanIterationResponse() { 
  }

  public SpendingPlanIterationResponse createdAt(String createdAt) {
    
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


  public SpendingPlanIterationResponse endOn(String endOn) {
    
    this.endOn = endOn;
    return this;
  }

   /**
   * Get endOn
   * @return endOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-31", value = "")

  public String getEndOn() {
    return endOn;
  }


  public void setEndOn(String endOn) {
    this.endOn = endOn;
  }


  public SpendingPlanIterationResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SPI-848e6648-3fa3-4632-ac8f-e65f03167102", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public SpendingPlanIterationResponse iterationNumber(Integer iterationNumber) {
    
    this.iterationNumber = iterationNumber;
    return this;
  }

   /**
   * Get iterationNumber
   * @return iterationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getIterationNumber() {
    return iterationNumber;
  }


  public void setIterationNumber(Integer iterationNumber) {
    this.iterationNumber = iterationNumber;
  }


  public SpendingPlanIterationResponse spendingPlanGuid(String spendingPlanGuid) {
    
    this.spendingPlanGuid = spendingPlanGuid;
    return this;
  }

   /**
   * Get spendingPlanGuid
   * @return spendingPlanGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SPL-dbfe201d-c341-4bff-93c0-62a918d0b600", value = "")

  public String getSpendingPlanGuid() {
    return spendingPlanGuid;
  }


  public void setSpendingPlanGuid(String spendingPlanGuid) {
    this.spendingPlanGuid = spendingPlanGuid;
  }


  public SpendingPlanIterationResponse startOn(String startOn) {
    
    this.startOn = startOn;
    return this;
  }

   /**
   * Get startOn
   * @return startOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-05-01", value = "")

  public String getStartOn() {
    return startOn;
  }


  public void setStartOn(String startOn) {
    this.startOn = startOn;
  }


  public SpendingPlanIterationResponse updatedAt(String updatedAt) {
    
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


  public SpendingPlanIterationResponse userGuid(String userGuid) {
    
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USR-72086f59-6684-4adf-8f29-c4d32db43cd7", value = "")

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
    SpendingPlanIterationResponse spendingPlanIterationResponse = (SpendingPlanIterationResponse) o;
    return Objects.equals(this.createdAt, spendingPlanIterationResponse.createdAt) &&
        Objects.equals(this.endOn, spendingPlanIterationResponse.endOn) &&
        Objects.equals(this.guid, spendingPlanIterationResponse.guid) &&
        Objects.equals(this.iterationNumber, spendingPlanIterationResponse.iterationNumber) &&
        Objects.equals(this.spendingPlanGuid, spendingPlanIterationResponse.spendingPlanGuid) &&
        Objects.equals(this.startOn, spendingPlanIterationResponse.startOn) &&
        Objects.equals(this.updatedAt, spendingPlanIterationResponse.updatedAt) &&
        Objects.equals(this.userGuid, spendingPlanIterationResponse.userGuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, endOn, guid, iterationNumber, spendingPlanGuid, startOn, updatedAt, userGuid);
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
    sb.append("class SpendingPlanIterationResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    iterationNumber: ").append(toIndentedString(iterationNumber)).append("\n");
    sb.append("    spendingPlanGuid: ").append(toIndentedString(spendingPlanGuid)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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
