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
import java.math.BigDecimal;

/**
 * SpendingPlanIterationItemCreateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpendingPlanIterationItemCreateRequestBody {
  public static final String SERIALIZED_NAME_CATEGORY_GUID = "category_guid";
  @SerializedName(SERIALIZED_NAME_CATEGORY_GUID)
  private String categoryGuid;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private BigDecimal itemType;

  public static final String SERIALIZED_NAME_PLANNED_AMOUNT = "planned_amount";
  @SerializedName(SERIALIZED_NAME_PLANNED_AMOUNT)
  private BigDecimal plannedAmount;

  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_GUID = "scheduled_payment_guid";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_GUID)
  private String scheduledPaymentGuid;

  public static final String SERIALIZED_NAME_TOP_LEVEL_CATEGORY_GUID = "top_level_category_guid";
  @SerializedName(SERIALIZED_NAME_TOP_LEVEL_CATEGORY_GUID)
  private String topLevelCategoryGuid;

  public SpendingPlanIterationItemCreateRequestBody() { 
  }

  public SpendingPlanIterationItemCreateRequestBody categoryGuid(String categoryGuid) {
    
    this.categoryGuid = categoryGuid;
    return this;
  }

   /**
   * Get categoryGuid
   * @return categoryGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAT-40faf068-abb4-405c-8f6a-e883ed541fff", value = "")

  public String getCategoryGuid() {
    return categoryGuid;
  }


  public void setCategoryGuid(String categoryGuid) {
    this.categoryGuid = categoryGuid;
  }


  public SpendingPlanIterationItemCreateRequestBody itemType(BigDecimal itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public BigDecimal getItemType() {
    return itemType;
  }


  public void setItemType(BigDecimal itemType) {
    this.itemType = itemType;
  }


  public SpendingPlanIterationItemCreateRequestBody plannedAmount(BigDecimal plannedAmount) {
    
    this.plannedAmount = plannedAmount;
    return this;
  }

   /**
   * Get plannedAmount
   * @return plannedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "110", required = true, value = "")

  public BigDecimal getPlannedAmount() {
    return plannedAmount;
  }


  public void setPlannedAmount(BigDecimal plannedAmount) {
    this.plannedAmount = plannedAmount;
  }


  public SpendingPlanIterationItemCreateRequestBody scheduledPaymentGuid(String scheduledPaymentGuid) {
    
    this.scheduledPaymentGuid = scheduledPaymentGuid;
    return this;
  }

   /**
   * Get scheduledPaymentGuid
   * @return scheduledPaymentGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SCP-c731988a-712f-4f83-9b3b-0aa5b3d5208b", value = "")

  public String getScheduledPaymentGuid() {
    return scheduledPaymentGuid;
  }


  public void setScheduledPaymentGuid(String scheduledPaymentGuid) {
    this.scheduledPaymentGuid = scheduledPaymentGuid;
  }


  public SpendingPlanIterationItemCreateRequestBody topLevelCategoryGuid(String topLevelCategoryGuid) {
    
    this.topLevelCategoryGuid = topLevelCategoryGuid;
    return this;
  }

   /**
   * Get topLevelCategoryGuid
   * @return topLevelCategoryGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAT-9588eaad-90a4-bb5c-66c8-1812503d0db8", value = "")

  public String getTopLevelCategoryGuid() {
    return topLevelCategoryGuid;
  }


  public void setTopLevelCategoryGuid(String topLevelCategoryGuid) {
    this.topLevelCategoryGuid = topLevelCategoryGuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpendingPlanIterationItemCreateRequestBody spendingPlanIterationItemCreateRequestBody = (SpendingPlanIterationItemCreateRequestBody) o;
    return Objects.equals(this.categoryGuid, spendingPlanIterationItemCreateRequestBody.categoryGuid) &&
        Objects.equals(this.itemType, spendingPlanIterationItemCreateRequestBody.itemType) &&
        Objects.equals(this.plannedAmount, spendingPlanIterationItemCreateRequestBody.plannedAmount) &&
        Objects.equals(this.scheduledPaymentGuid, spendingPlanIterationItemCreateRequestBody.scheduledPaymentGuid) &&
        Objects.equals(this.topLevelCategoryGuid, spendingPlanIterationItemCreateRequestBody.topLevelCategoryGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryGuid, itemType, plannedAmount, scheduledPaymentGuid, topLevelCategoryGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingPlanIterationItemCreateRequestBody {\n");
    sb.append("    categoryGuid: ").append(toIndentedString(categoryGuid)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    plannedAmount: ").append(toIndentedString(plannedAmount)).append("\n");
    sb.append("    scheduledPaymentGuid: ").append(toIndentedString(scheduledPaymentGuid)).append("\n");
    sb.append("    topLevelCategoryGuid: ").append(toIndentedString(topLevelCategoryGuid)).append("\n");
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
