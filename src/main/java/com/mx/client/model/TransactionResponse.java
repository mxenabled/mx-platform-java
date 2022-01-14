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
 * TransactionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_GUID = "account_guid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GUID)
  private String accountGuid;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_GUID = "category_guid";
  @SerializedName(SERIALIZED_NAME_CATEGORY_GUID)
  private String categoryGuid;

  public static final String SERIALIZED_NAME_CHECK_NUMBER_STRING = "check_number_string";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER_STRING)
  private String checkNumberString;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXTENDED_TRANSACTION_TYPE = "extended_transaction_type";
  @SerializedName(SERIALIZED_NAME_EXTENDED_TRANSACTION_TYPE)
  private String extendedTransactionType;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

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

  public static final String SERIALIZED_NAME_IS_RECURRING = "is_recurring";
  @SerializedName(SERIALIZED_NAME_IS_RECURRING)
  private Boolean isRecurring;

  public static final String SERIALIZED_NAME_IS_SUBSCRIPTION = "is_subscription";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIPTION)
  private Boolean isSubscription;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LOCALIZED_DESCRIPTION = "localized_description";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_DESCRIPTION)
  private String localizedDescription;

  public static final String SERIALIZED_NAME_LOCALIZED_MEMO = "localized_memo";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_MEMO)
  private String localizedMemo;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_MEMBER_IS_MANAGED_BY_USER = "member_is_managed_by_user";
  @SerializedName(SERIALIZED_NAME_MEMBER_IS_MANAGED_BY_USER)
  private Boolean memberIsManagedByUser;

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

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;

  public static final String SERIALIZED_NAME_POSTED_AT = "posted_at";
  @SerializedName(SERIALIZED_NAME_POSTED_AT)
  private String postedAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TOP_LEVEL_CATEGORY = "top_level_category";
  @SerializedName(SERIALIZED_NAME_TOP_LEVEL_CATEGORY)
  private String topLevelCategory;

  public static final String SERIALIZED_NAME_TRANSACTED_AT = "transacted_at";
  @SerializedName(SERIALIZED_NAME_TRANSACTED_AT)
  private String transactedAt;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public TransactionResponse() { 
  }

  public TransactionResponse accountGuid(String accountGuid) {
    
    this.accountGuid = accountGuid;
    return this;
  }

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "")

  public String getAccountGuid() {
    return accountGuid;
  }


  public void setAccountGuid(String accountGuid) {
    this.accountGuid = accountGuid;
  }


  public TransactionResponse accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "account123", value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransactionResponse amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "61.11", value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public TransactionResponse category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Groceries", value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public TransactionResponse categoryGuid(String categoryGuid) {
    
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


  public TransactionResponse checkNumberString(String checkNumberString) {
    
    this.checkNumberString = checkNumberString;
    return this;
  }

   /**
   * Get checkNumberString
   * @return checkNumberString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6812", value = "")

  public String getCheckNumberString() {
    return checkNumberString;
  }


  public void setCheckNumberString(String checkNumberString) {
    this.checkNumberString = checkNumberString;
  }


  public TransactionResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-06T09:43:42.000Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionResponse currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public TransactionResponse date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2013-09-23T00:00:00.000Z", value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public TransactionResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Whole foods", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionResponse extendedTransactionType(String extendedTransactionType) {
    
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


  public TransactionResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRN-265abee9-889b-af6a-c69b-25157db2bdd9", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public TransactionResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transaction-265abee9-889b-af6a-c69b-25157db2bdd9", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransactionResponse isBillPay(Boolean isBillPay) {
    
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


  public TransactionResponse isDirectDeposit(Boolean isDirectDeposit) {
    
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


  public TransactionResponse isExpense(Boolean isExpense) {
    
    this.isExpense = isExpense;
    return this;
  }

   /**
   * Get isExpense
   * @return isExpense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsExpense() {
    return isExpense;
  }


  public void setIsExpense(Boolean isExpense) {
    this.isExpense = isExpense;
  }


  public TransactionResponse isFee(Boolean isFee) {
    
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


  public TransactionResponse isIncome(Boolean isIncome) {
    
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


  public TransactionResponse isInternational(Boolean isInternational) {
    
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


  public TransactionResponse isOverdraftFee(Boolean isOverdraftFee) {
    
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


  public TransactionResponse isPayrollAdvance(Boolean isPayrollAdvance) {
    
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


  public TransactionResponse isRecurring(Boolean isRecurring) {
    
    this.isRecurring = isRecurring;
    return this;
  }

   /**
   * Get isRecurring
   * @return isRecurring
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsRecurring() {
    return isRecurring;
  }


  public void setIsRecurring(Boolean isRecurring) {
    this.isRecurring = isRecurring;
  }


  public TransactionResponse isSubscription(Boolean isSubscription) {
    
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


  public TransactionResponse latitude(BigDecimal latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-43.2075", value = "")

  public BigDecimal getLatitude() {
    return latitude;
  }


  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }


  public TransactionResponse localizedDescription(String localizedDescription) {
    
    this.localizedDescription = localizedDescription;
    return this;
  }

   /**
   * Get localizedDescription
   * @return localizedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a localized_description", value = "")

  public String getLocalizedDescription() {
    return localizedDescription;
  }


  public void setLocalizedDescription(String localizedDescription) {
    this.localizedDescription = localizedDescription;
  }


  public TransactionResponse localizedMemo(String localizedMemo) {
    
    this.localizedMemo = localizedMemo;
    return this;
  }

   /**
   * Get localizedMemo
   * @return localizedMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a localized_memo", value = "")

  public String getLocalizedMemo() {
    return localizedMemo;
  }


  public void setLocalizedMemo(String localizedMemo) {
    this.localizedMemo = localizedMemo;
  }


  public TransactionResponse longitude(BigDecimal longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "139.691706", value = "")

  public BigDecimal getLongitude() {
    return longitude;
  }


  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  public TransactionResponse memberGuid(String memberGuid) {
    
    this.memberGuid = memberGuid;
    return this;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")

  public String getMemberGuid() {
    return memberGuid;
  }


  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
  }


  public TransactionResponse memberIsManagedByUser(Boolean memberIsManagedByUser) {
    
    this.memberIsManagedByUser = memberIsManagedByUser;
    return this;
  }

   /**
   * Get memberIsManagedByUser
   * @return memberIsManagedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getMemberIsManagedByUser() {
    return memberIsManagedByUser;
  }


  public void setMemberIsManagedByUser(Boolean memberIsManagedByUser) {
    this.memberIsManagedByUser = memberIsManagedByUser;
  }


  public TransactionResponse memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Get memo
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a memo", value = "")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public TransactionResponse merchantCategoryCode(Integer merchantCategoryCode) {
    
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


  public TransactionResponse merchantGuid(String merchantGuid) {
    
    this.merchantGuid = merchantGuid;
    return this;
  }

   /**
   * Get merchantGuid
   * @return merchantGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MCH-7ed79542-884d-2b1b-dd74-501c5cc9d25b", value = "")

  public String getMerchantGuid() {
    return merchantGuid;
  }


  public void setMerchantGuid(String merchantGuid) {
    this.merchantGuid = merchantGuid;
  }


  public TransactionResponse merchantLocationGuid(String merchantLocationGuid) {
    
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


  public TransactionResponse metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some metadata", value = "")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public TransactionResponse originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * Get originalDescription
   * @return originalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WHOLEFDS TSQ 102", value = "")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  public TransactionResponse postedAt(String postedAt) {
    
    this.postedAt = postedAt;
    return this;
  }

   /**
   * Get postedAt
   * @return postedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-07T06:00:00.000Z", value = "")

  public String getPostedAt() {
    return postedAt;
  }


  public void setPostedAt(String postedAt) {
    this.postedAt = postedAt;
  }


  public TransactionResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POSTED", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public TransactionResponse topLevelCategory(String topLevelCategory) {
    
    this.topLevelCategory = topLevelCategory;
    return this;
  }

   /**
   * Get topLevelCategory
   * @return topLevelCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Food & Dining", value = "")

  public String getTopLevelCategory() {
    return topLevelCategory;
  }


  public void setTopLevelCategory(String topLevelCategory) {
    this.topLevelCategory = topLevelCategory;
  }


  public TransactionResponse transactedAt(String transactedAt) {
    
    this.transactedAt = transactedAt;
    return this;
  }

   /**
   * Get transactedAt
   * @return transactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-06T13:00:00.000Z", value = "")

  public String getTransactedAt() {
    return transactedAt;
  }


  public void setTransactedAt(String transactedAt) {
    this.transactedAt = transactedAt;
  }


  public TransactionResponse type(String type) {
    
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


  public TransactionResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-07T05:49:12.000Z", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public TransactionResponse userGuid(String userGuid) {
    
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


  public TransactionResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user123", value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.accountGuid, transactionResponse.accountGuid) &&
        Objects.equals(this.accountId, transactionResponse.accountId) &&
        Objects.equals(this.amount, transactionResponse.amount) &&
        Objects.equals(this.category, transactionResponse.category) &&
        Objects.equals(this.categoryGuid, transactionResponse.categoryGuid) &&
        Objects.equals(this.checkNumberString, transactionResponse.checkNumberString) &&
        Objects.equals(this.createdAt, transactionResponse.createdAt) &&
        Objects.equals(this.currencyCode, transactionResponse.currencyCode) &&
        Objects.equals(this.date, transactionResponse.date) &&
        Objects.equals(this.description, transactionResponse.description) &&
        Objects.equals(this.extendedTransactionType, transactionResponse.extendedTransactionType) &&
        Objects.equals(this.guid, transactionResponse.guid) &&
        Objects.equals(this.id, transactionResponse.id) &&
        Objects.equals(this.isBillPay, transactionResponse.isBillPay) &&
        Objects.equals(this.isDirectDeposit, transactionResponse.isDirectDeposit) &&
        Objects.equals(this.isExpense, transactionResponse.isExpense) &&
        Objects.equals(this.isFee, transactionResponse.isFee) &&
        Objects.equals(this.isIncome, transactionResponse.isIncome) &&
        Objects.equals(this.isInternational, transactionResponse.isInternational) &&
        Objects.equals(this.isOverdraftFee, transactionResponse.isOverdraftFee) &&
        Objects.equals(this.isPayrollAdvance, transactionResponse.isPayrollAdvance) &&
        Objects.equals(this.isRecurring, transactionResponse.isRecurring) &&
        Objects.equals(this.isSubscription, transactionResponse.isSubscription) &&
        Objects.equals(this.latitude, transactionResponse.latitude) &&
        Objects.equals(this.localizedDescription, transactionResponse.localizedDescription) &&
        Objects.equals(this.localizedMemo, transactionResponse.localizedMemo) &&
        Objects.equals(this.longitude, transactionResponse.longitude) &&
        Objects.equals(this.memberGuid, transactionResponse.memberGuid) &&
        Objects.equals(this.memberIsManagedByUser, transactionResponse.memberIsManagedByUser) &&
        Objects.equals(this.memo, transactionResponse.memo) &&
        Objects.equals(this.merchantCategoryCode, transactionResponse.merchantCategoryCode) &&
        Objects.equals(this.merchantGuid, transactionResponse.merchantGuid) &&
        Objects.equals(this.merchantLocationGuid, transactionResponse.merchantLocationGuid) &&
        Objects.equals(this.metadata, transactionResponse.metadata) &&
        Objects.equals(this.originalDescription, transactionResponse.originalDescription) &&
        Objects.equals(this.postedAt, transactionResponse.postedAt) &&
        Objects.equals(this.status, transactionResponse.status) &&
        Objects.equals(this.topLevelCategory, transactionResponse.topLevelCategory) &&
        Objects.equals(this.transactedAt, transactionResponse.transactedAt) &&
        Objects.equals(this.type, transactionResponse.type) &&
        Objects.equals(this.updatedAt, transactionResponse.updatedAt) &&
        Objects.equals(this.userGuid, transactionResponse.userGuid) &&
        Objects.equals(this.userId, transactionResponse.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, accountId, amount, category, categoryGuid, checkNumberString, createdAt, currencyCode, date, description, extendedTransactionType, guid, id, isBillPay, isDirectDeposit, isExpense, isFee, isIncome, isInternational, isOverdraftFee, isPayrollAdvance, isRecurring, isSubscription, latitude, localizedDescription, localizedMemo, longitude, memberGuid, memberIsManagedByUser, memo, merchantCategoryCode, merchantGuid, merchantLocationGuid, metadata, originalDescription, postedAt, status, topLevelCategory, transactedAt, type, updatedAt, userGuid, userId);
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
    sb.append("class TransactionResponse {\n");
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryGuid: ").append(toIndentedString(categoryGuid)).append("\n");
    sb.append("    checkNumberString: ").append(toIndentedString(checkNumberString)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedTransactionType: ").append(toIndentedString(extendedTransactionType)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBillPay: ").append(toIndentedString(isBillPay)).append("\n");
    sb.append("    isDirectDeposit: ").append(toIndentedString(isDirectDeposit)).append("\n");
    sb.append("    isExpense: ").append(toIndentedString(isExpense)).append("\n");
    sb.append("    isFee: ").append(toIndentedString(isFee)).append("\n");
    sb.append("    isIncome: ").append(toIndentedString(isIncome)).append("\n");
    sb.append("    isInternational: ").append(toIndentedString(isInternational)).append("\n");
    sb.append("    isOverdraftFee: ").append(toIndentedString(isOverdraftFee)).append("\n");
    sb.append("    isPayrollAdvance: ").append(toIndentedString(isPayrollAdvance)).append("\n");
    sb.append("    isRecurring: ").append(toIndentedString(isRecurring)).append("\n");
    sb.append("    isSubscription: ").append(toIndentedString(isSubscription)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    localizedDescription: ").append(toIndentedString(localizedDescription)).append("\n");
    sb.append("    localizedMemo: ").append(toIndentedString(localizedMemo)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    memberIsManagedByUser: ").append(toIndentedString(memberIsManagedByUser)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantGuid: ").append(toIndentedString(merchantGuid)).append("\n");
    sb.append("    merchantLocationGuid: ").append(toIndentedString(merchantLocationGuid)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    topLevelCategory: ").append(toIndentedString(topLevelCategory)).append("\n");
    sb.append("    transactedAt: ").append(toIndentedString(transactedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

