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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * EnhanceTransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnhanceTransactionResponse {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CATEGORIZED_BY = "categorized_by";
  @SerializedName(SERIALIZED_NAME_CATEGORIZED_BY)
  private Integer categorizedBy;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_GUID = "category_guid";
  @SerializedName(SERIALIZED_NAME_CATEGORY_GUID)
  private String categoryGuid;

  public static final String SERIALIZED_NAME_DESCRIBED_BY = "described_by";
  @SerializedName(SERIALIZED_NAME_DESCRIBED_BY)
  private Integer describedBy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_TYPE = "extended_transaction_type";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_TYPE)
  private String extendedTransactionType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_BILL_PAY = "is_bill_pay";
  @SerializedName(SERIALIZED_NAME_IS_BILL_PAY)
  private Boolean isBillPay;

  public static final String SERIALIZED_NAME_IS_DIRECT_DEPOSIT = "is_direct_deposit";
  @SerializedName(SERIALIZED_NAME_IS_DIRECT_DEPOSIT)
  private Boolean isDirectDeposit;

  public static final String SERIALIZED_NAME_IS_EXPENSE = "is_expense";
  @SerializedName(SERIALIZED_NAME_IS_EXPENSE)
  private Boolean isExpense;

  public static final String SERIALIZED_NAME_IS_FEE = "is_fee";
  @SerializedName(SERIALIZED_NAME_IS_FEE)
  private Boolean isFee;

  public static final String SERIALIZED_NAME_IS_INCOME = "is_income";
  @SerializedName(SERIALIZED_NAME_IS_INCOME)
  private Boolean isIncome;

  public static final String SERIALIZED_NAME_IS_INTERNATIONAL = "is_international";
  @SerializedName(SERIALIZED_NAME_IS_INTERNATIONAL)
  private Boolean isInternational;

  public static final String SERIALIZED_NAME_IS_OVERDRAFT_FEE = "is_overdraft_fee";
  @SerializedName(SERIALIZED_NAME_IS_OVERDRAFT_FEE)
  private Boolean isOverdraftFee;

  public static final String SERIALIZED_NAME_IS_PAYROLL_ADVANCE = "is_payroll_advance";
  @SerializedName(SERIALIZED_NAME_IS_PAYROLL_ADVANCE)
  private Boolean isPayrollAdvance;

  public static final String SERIALIZED_NAME_IS_SUBSCRIPTION = "is_subscription";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIPTION)
  private Boolean isSubscription;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_CODE = "merchant_category_code";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_CODE)
  private Integer merchantCategoryCode;

  public static final String SERIALIZED_NAME_MERCHANT_GUID = "merchant_guid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_GUID)
  private String merchantGuid;

  public static final String SERIALIZED_NAME_MERCHANT_LOCATION_GUID = "merchant_location_guid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOCATION_GUID)
  private String merchantLocationGuid;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public EnhanceTransactionResponse amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21.33", value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public EnhanceTransactionResponse categorizedBy(Integer categorizedBy) {
    
    this.categorizedBy = categorizedBy;
    return this;
  }

   /**
   * Get categorizedBy
   * @return categorizedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13", value = "")

  public Integer getCategorizedBy() {
    return categorizedBy;
  }


  public void setCategorizedBy(Integer categorizedBy) {
    this.categorizedBy = categorizedBy;
  }


  public EnhanceTransactionResponse category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Rental Car & Taxi", value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public EnhanceTransactionResponse categoryGuid(String categoryGuid) {
    
    this.categoryGuid = categoryGuid;
    return this;
  }

   /**
   * Get categoryGuid
   * @return categoryGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAT-9588eaad-90a4-bb5c-66c8-1812503d0db8", value = "")

  public String getCategoryGuid() {
    return categoryGuid;
  }


  public void setCategoryGuid(String categoryGuid) {
    this.categoryGuid = categoryGuid;
  }


  public EnhanceTransactionResponse describedBy(Integer describedBy) {
    
    this.describedBy = describedBy;
    return this;
  }

   /**
   * Get describedBy
   * @return describedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Integer getDescribedBy() {
    return describedBy;
  }


  public void setDescribedBy(Integer describedBy) {
    this.describedBy = describedBy;
  }


  public EnhanceTransactionResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Uber", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EnhanceTransactionResponse extendedTransactionType(String extendedTransactionType) {
    
    this.extendedTransactionType = extendedTransactionType;
    return this;
  }

   /**
   * Get extendedTransactionType
   * @return extendedTransactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "partner_transaction_type", value = "")

  public String getExtendedTransactionType() {
    return extendedTransactionType;
  }


  public void setExtendedTransactionType(String extendedTransactionType) {
    this.extendedTransactionType = extendedTransactionType;
  }


  public EnhanceTransactionResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ID-123", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EnhanceTransactionResponse isBillPay(Boolean isBillPay) {
    
    this.isBillPay = isBillPay;
    return this;
  }

   /**
   * Get isBillPay
   * @return isBillPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsBillPay() {
    return isBillPay;
  }


  public void setIsBillPay(Boolean isBillPay) {
    this.isBillPay = isBillPay;
  }


  public EnhanceTransactionResponse isDirectDeposit(Boolean isDirectDeposit) {
    
    this.isDirectDeposit = isDirectDeposit;
    return this;
  }

   /**
   * Get isDirectDeposit
   * @return isDirectDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsDirectDeposit() {
    return isDirectDeposit;
  }


  public void setIsDirectDeposit(Boolean isDirectDeposit) {
    this.isDirectDeposit = isDirectDeposit;
  }


  public EnhanceTransactionResponse isExpense(Boolean isExpense) {
    
    this.isExpense = isExpense;
    return this;
  }

   /**
   * Get isExpense
   * @return isExpense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsExpense() {
    return isExpense;
  }


  public void setIsExpense(Boolean isExpense) {
    this.isExpense = isExpense;
  }


  public EnhanceTransactionResponse isFee(Boolean isFee) {
    
    this.isFee = isFee;
    return this;
  }

   /**
   * Get isFee
   * @return isFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsFee() {
    return isFee;
  }


  public void setIsFee(Boolean isFee) {
    this.isFee = isFee;
  }


  public EnhanceTransactionResponse isIncome(Boolean isIncome) {
    
    this.isIncome = isIncome;
    return this;
  }

   /**
   * Get isIncome
   * @return isIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsIncome() {
    return isIncome;
  }


  public void setIsIncome(Boolean isIncome) {
    this.isIncome = isIncome;
  }


  public EnhanceTransactionResponse isInternational(Boolean isInternational) {
    
    this.isInternational = isInternational;
    return this;
  }

   /**
   * Get isInternational
   * @return isInternational
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsInternational() {
    return isInternational;
  }


  public void setIsInternational(Boolean isInternational) {
    this.isInternational = isInternational;
  }


  public EnhanceTransactionResponse isOverdraftFee(Boolean isOverdraftFee) {
    
    this.isOverdraftFee = isOverdraftFee;
    return this;
  }

   /**
   * Get isOverdraftFee
   * @return isOverdraftFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsOverdraftFee() {
    return isOverdraftFee;
  }


  public void setIsOverdraftFee(Boolean isOverdraftFee) {
    this.isOverdraftFee = isOverdraftFee;
  }


  public EnhanceTransactionResponse isPayrollAdvance(Boolean isPayrollAdvance) {
    
    this.isPayrollAdvance = isPayrollAdvance;
    return this;
  }

   /**
   * Get isPayrollAdvance
   * @return isPayrollAdvance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsPayrollAdvance() {
    return isPayrollAdvance;
  }


  public void setIsPayrollAdvance(Boolean isPayrollAdvance) {
    this.isPayrollAdvance = isPayrollAdvance;
  }


  public EnhanceTransactionResponse isSubscription(Boolean isSubscription) {
    
    this.isSubscription = isSubscription;
    return this;
  }

   /**
   * Get isSubscription
   * @return isSubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsSubscription() {
    return isSubscription;
  }


  public void setIsSubscription(Boolean isSubscription) {
    this.isSubscription = isSubscription;
  }


  public EnhanceTransactionResponse memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Additional-information*on_transaction", value = "")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public EnhanceTransactionResponse merchantCategoryCode(Integer merchantCategoryCode) {
    
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5411", value = "")

  public Integer getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  public void setMerchantCategoryCode(Integer merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public EnhanceTransactionResponse merchantGuid(String merchantGuid) {
    
    this.merchantGuid = merchantGuid;
    return this;
  }

   /**
   * Get merchantGuid
   * @return merchantGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MCH-14f25b63-ef47-a38e-b2b6-d02b280b6e4e", value = "")

  public String getMerchantGuid() {
    return merchantGuid;
  }


  public void setMerchantGuid(String merchantGuid) {
    this.merchantGuid = merchantGuid;
  }


  public EnhanceTransactionResponse merchantLocationGuid(String merchantLocationGuid) {
    
    this.merchantLocationGuid = merchantLocationGuid;
    return this;
  }

   /**
   * Get merchantLocationGuid
   * @return merchantLocationGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MCL-00024e59-18b5-4d79-b879-2a7896726fea", value = "")

  public String getMerchantLocationGuid() {
    return merchantLocationGuid;
  }


  public void setMerchantLocationGuid(String merchantLocationGuid) {
    this.merchantLocationGuid = merchantLocationGuid;
  }


  public EnhanceTransactionResponse originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * Get originalDescription
   * @return originalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ubr* pending.uber.com", value = "")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  public EnhanceTransactionResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEBIT", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhanceTransactionResponse enhanceTransactionResponse = (EnhanceTransactionResponse) o;
    return Objects.equals(this.amount, enhanceTransactionResponse.amount) &&
        Objects.equals(this.categorizedBy, enhanceTransactionResponse.categorizedBy) &&
        Objects.equals(this.category, enhanceTransactionResponse.category) &&
        Objects.equals(this.categoryGuid, enhanceTransactionResponse.categoryGuid) &&
        Objects.equals(this.describedBy, enhanceTransactionResponse.describedBy) &&
        Objects.equals(this.description, enhanceTransactionResponse.description) &&
        Objects.equals(this.extendedTransactionType, enhanceTransactionResponse.extendedTransactionType) &&
        Objects.equals(this.id, enhanceTransactionResponse.id) &&
        Objects.equals(this.isBillPay, enhanceTransactionResponse.isBillPay) &&
        Objects.equals(this.isDirectDeposit, enhanceTransactionResponse.isDirectDeposit) &&
        Objects.equals(this.isExpense, enhanceTransactionResponse.isExpense) &&
        Objects.equals(this.isFee, enhanceTransactionResponse.isFee) &&
        Objects.equals(this.isIncome, enhanceTransactionResponse.isIncome) &&
        Objects.equals(this.isInternational, enhanceTransactionResponse.isInternational) &&
        Objects.equals(this.isOverdraftFee, enhanceTransactionResponse.isOverdraftFee) &&
        Objects.equals(this.isPayrollAdvance, enhanceTransactionResponse.isPayrollAdvance) &&
        Objects.equals(this.isSubscription, enhanceTransactionResponse.isSubscription) &&
        Objects.equals(this.memo, enhanceTransactionResponse.memo) &&
        Objects.equals(this.merchantCategoryCode, enhanceTransactionResponse.merchantCategoryCode) &&
        Objects.equals(this.merchantGuid, enhanceTransactionResponse.merchantGuid) &&
        Objects.equals(this.merchantLocationGuid, enhanceTransactionResponse.merchantLocationGuid) &&
        Objects.equals(this.originalDescription, enhanceTransactionResponse.originalDescription) &&
        Objects.equals(this.type, enhanceTransactionResponse.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, categorizedBy, category, categoryGuid, describedBy, description, extendedTransactionType, id, isBillPay, isDirectDeposit, isExpense, isFee, isIncome, isInternational, isOverdraftFee, isPayrollAdvance, isSubscription, memo, merchantCategoryCode, merchantGuid, merchantLocationGuid, originalDescription, type);
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
    sb.append("class EnhanceTransactionResponse {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    categorizedBy: ").append(toIndentedString(categorizedBy)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryGuid: ").append(toIndentedString(categoryGuid)).append("\n");
    sb.append("    describedBy: ").append(toIndentedString(describedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedTransactionType: ").append(toIndentedString(extendedTransactionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBillPay: ").append(toIndentedString(isBillPay)).append("\n");
    sb.append("    isDirectDeposit: ").append(toIndentedString(isDirectDeposit)).append("\n");
    sb.append("    isExpense: ").append(toIndentedString(isExpense)).append("\n");
    sb.append("    isFee: ").append(toIndentedString(isFee)).append("\n");
    sb.append("    isIncome: ").append(toIndentedString(isIncome)).append("\n");
    sb.append("    isInternational: ").append(toIndentedString(isInternational)).append("\n");
    sb.append("    isOverdraftFee: ").append(toIndentedString(isOverdraftFee)).append("\n");
    sb.append("    isPayrollAdvance: ").append(toIndentedString(isPayrollAdvance)).append("\n");
    sb.append("    isSubscription: ").append(toIndentedString(isSubscription)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    merchantLocationGuid: ").append(toIndentedString(merchantLocationGuid)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

