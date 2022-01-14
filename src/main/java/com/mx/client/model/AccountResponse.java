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
 * AccountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_APR = "apr";
  @SerializedName(SERIALIZED_NAME_APR)
  private BigDecimal apr;

  public static final String SERIALIZED_NAME_APY = "apy";
  @SerializedName(SERIALIZED_NAME_APY)
  private BigDecimal apy;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private BigDecimal availableBalance;

  public static final String SERIALIZED_NAME_AVAILABLE_CREDIT = "available_credit";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CREDIT)
  private BigDecimal availableCredit;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_CASH_BALANCE = "cash_balance";
  @SerializedName(SERIALIZED_NAME_CASH_BALANCE)
  private BigDecimal cashBalance;

  public static final String SERIALIZED_NAME_CASH_SURRENDER_VALUE = "cash_surrender_value";
  @SerializedName(SERIALIZED_NAME_CASH_SURRENDER_VALUE)
  private BigDecimal cashSurrenderValue;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "credit_limit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private BigDecimal creditLimit;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DAY_PAYMENT_IS_DUE = "day_payment_is_due";
  @SerializedName(SERIALIZED_NAME_DAY_PAYMENT_IS_DUE)
  private Integer dayPaymentIsDue;

  public static final String SERIALIZED_NAME_DEATH_BENEFIT = "death_benefit";
  @SerializedName(SERIALIZED_NAME_DEATH_BENEFIT)
  private Integer deathBenefit;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_HOLDINGS_VALUE = "holdings_value";
  @SerializedName(SERIALIZED_NAME_HOLDINGS_VALUE)
  private BigDecimal holdingsValue;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMPORTED_AT = "imported_at";
  @SerializedName(SERIALIZED_NAME_IMPORTED_AT)
  private String importedAt;

  public static final String SERIALIZED_NAME_INSTITUTION_CODE = "institution_code";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_CODE)
  private String institutionCode;

  public static final String SERIALIZED_NAME_INSURED_NAME = "insured_name";
  @SerializedName(SERIALIZED_NAME_INSURED_NAME)
  private String insuredName;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private BigDecimal interestRate;

  public static final String SERIALIZED_NAME_IS_CLOSED = "is_closed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "is_hidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_LAST_PAYMENT = "last_payment";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT)
  private BigDecimal lastPayment;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AT = "last_payment_at";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AT)
  private String lastPaymentAt;

  public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loan_amount";
  @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
  private BigDecimal loanAmount;

  public static final String SERIALIZED_NAME_MATURES_ON = "matures_on";
  @SerializedName(SERIALIZED_NAME_MATURES_ON)
  private String maturesOn;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private String memberId;

  public static final String SERIALIZED_NAME_MEMBER_IS_MANAGED_BY_USER = "member_is_managed_by_user";
  @SerializedName(SERIALIZED_NAME_MEMBER_IS_MANAGED_BY_USER)
  private Boolean memberIsManagedByUser;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_MINIMUM_BALANCE = "minimum_balance";
  @SerializedName(SERIALIZED_NAME_MINIMUM_BALANCE)
  private BigDecimal minimumBalance;

  public static final String SERIALIZED_NAME_MINIMUM_PAYMENT = "minimum_payment";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PAYMENT)
  private BigDecimal minimumPayment;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_ORIGINAL_BALANCE = "original_balance";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_BALANCE)
  private BigDecimal originalBalance;

  public static final String SERIALIZED_NAME_PAY_OUT_AMOUNT = "pay_out_amount";
  @SerializedName(SERIALIZED_NAME_PAY_OUT_AMOUNT)
  private BigDecimal payOutAmount;

  public static final String SERIALIZED_NAME_PAYMENT_DUE_AT = "payment_due_at";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DUE_AT)
  private String paymentDueAt;

  public static final String SERIALIZED_NAME_PAYOFF_BALANCE = "payoff_balance";
  @SerializedName(SERIALIZED_NAME_PAYOFF_BALANCE)
  private BigDecimal payoffBalance;

  public static final String SERIALIZED_NAME_PREMIUM_AMOUNT = "premium_amount";
  @SerializedName(SERIALIZED_NAME_PREMIUM_AMOUNT)
  private BigDecimal premiumAmount;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_STARTED_ON = "started_on";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private String startedOn;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private String subtype;

  public static final String SERIALIZED_NAME_TOTAL_ACCOUNT_VALUE = "total_account_value";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACCOUNT_VALUE)
  private BigDecimal totalAccountValue;

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

  public AccountResponse() { 
  }

  public AccountResponse accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5366", value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public AccountResponse apr(BigDecimal apr) {
    
    this.apr = apr;
    return this;
  }

   /**
   * Get apr
   * @return apr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "")

  public BigDecimal getApr() {
    return apr;
  }


  public void setApr(BigDecimal apr) {
    this.apr = apr;
  }


  public AccountResponse apy(BigDecimal apy) {
    
    this.apy = apy;
    return this;
  }

   /**
   * Get apy
   * @return apy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "")

  public BigDecimal getApy() {
    return apy;
  }


  public void setApy(BigDecimal apy) {
    this.apy = apy;
  }


  public AccountResponse availableBalance(BigDecimal availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }


  public AccountResponse availableCredit(BigDecimal availableCredit) {
    
    this.availableCredit = availableCredit;
    return this;
  }

   /**
   * Get availableCredit
   * @return availableCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getAvailableCredit() {
    return availableCredit;
  }


  public void setAvailableCredit(BigDecimal availableCredit) {
    this.availableCredit = availableCredit;
  }


  public AccountResponse balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public AccountResponse cashBalance(BigDecimal cashBalance) {
    
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * Get cashBalance
   * @return cashBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getCashBalance() {
    return cashBalance;
  }


  public void setCashBalance(BigDecimal cashBalance) {
    this.cashBalance = cashBalance;
  }


  public AccountResponse cashSurrenderValue(BigDecimal cashSurrenderValue) {
    
    this.cashSurrenderValue = cashSurrenderValue;
    return this;
  }

   /**
   * Get cashSurrenderValue
   * @return cashSurrenderValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getCashSurrenderValue() {
    return cashSurrenderValue;
  }


  public void setCashSurrenderValue(BigDecimal cashSurrenderValue) {
    this.cashSurrenderValue = cashSurrenderValue;
  }


  public AccountResponse createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T17:57:37.000Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public AccountResponse creditLimit(BigDecimal creditLimit) {
    
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "")

  public BigDecimal getCreditLimit() {
    return creditLimit;
  }


  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }


  public AccountResponse currencyCode(String currencyCode) {
    
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


  public AccountResponse dayPaymentIsDue(Integer dayPaymentIsDue) {
    
    this.dayPaymentIsDue = dayPaymentIsDue;
    return this;
  }

   /**
   * Get dayPaymentIsDue
   * @return dayPaymentIsDue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "")

  public Integer getDayPaymentIsDue() {
    return dayPaymentIsDue;
  }


  public void setDayPaymentIsDue(Integer dayPaymentIsDue) {
    this.dayPaymentIsDue = dayPaymentIsDue;
  }


  public AccountResponse deathBenefit(Integer deathBenefit) {
    
    this.deathBenefit = deathBenefit;
    return this;
  }

   /**
   * Get deathBenefit
   * @return deathBenefit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public Integer getDeathBenefit() {
    return deathBenefit;
  }


  public void setDeathBenefit(Integer deathBenefit) {
    this.deathBenefit = deathBenefit;
  }


  public AccountResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public AccountResponse holdingsValue(BigDecimal holdingsValue) {
    
    this.holdingsValue = holdingsValue;
    return this;
  }

   /**
   * Get holdingsValue
   * @return holdingsValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getHoldingsValue() {
    return holdingsValue;
  }


  public void setHoldingsValue(BigDecimal holdingsValue) {
    this.holdingsValue = holdingsValue;
  }


  public AccountResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1040434698", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AccountResponse importedAt(String importedAt) {
    
    this.importedAt = importedAt;
    return this;
  }

   /**
   * Get importedAt
   * @return importedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-13T17:57:37.000Z", value = "")

  public String getImportedAt() {
    return importedAt;
  }


  public void setImportedAt(String importedAt) {
    this.importedAt = importedAt;
  }


  public AccountResponse institutionCode(String institutionCode) {
    
    this.institutionCode = institutionCode;
    return this;
  }

   /**
   * Get institutionCode
   * @return institutionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "chase", value = "")

  public String getInstitutionCode() {
    return institutionCode;
  }


  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }


  public AccountResponse insuredName(String insuredName) {
    
    this.insuredName = insuredName;
    return this;
  }

   /**
   * Get insuredName
   * @return insuredName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Frodo Baggins", value = "")

  public String getInsuredName() {
    return insuredName;
  }


  public void setInsuredName(String insuredName) {
    this.insuredName = insuredName;
  }


  public AccountResponse interestRate(BigDecimal interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "")

  public BigDecimal getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  public AccountResponse isClosed(Boolean isClosed) {
    
    this.isClosed = isClosed;
    return this;
  }

   /**
   * Get isClosed
   * @return isClosed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsClosed() {
    return isClosed;
  }


  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }


  public AccountResponse isHidden(Boolean isHidden) {
    
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsHidden() {
    return isHidden;
  }


  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public AccountResponse lastPayment(BigDecimal lastPayment) {
    
    this.lastPayment = lastPayment;
    return this;
  }

   /**
   * Get lastPayment
   * @return lastPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "")

  public BigDecimal getLastPayment() {
    return lastPayment;
  }


  public void setLastPayment(BigDecimal lastPayment) {
    this.lastPayment = lastPayment;
  }


  public AccountResponse lastPaymentAt(String lastPaymentAt) {
    
    this.lastPaymentAt = lastPaymentAt;
    return this;
  }

   /**
   * Get lastPaymentAt
   * @return lastPaymentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-13T17:57:37.000Z", value = "")

  public String getLastPaymentAt() {
    return lastPaymentAt;
  }


  public void setLastPaymentAt(String lastPaymentAt) {
    this.lastPaymentAt = lastPaymentAt;
  }


  public AccountResponse loanAmount(BigDecimal loanAmount) {
    
    this.loanAmount = loanAmount;
    return this;
  }

   /**
   * Get loanAmount
   * @return loanAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000.0", value = "")

  public BigDecimal getLoanAmount() {
    return loanAmount;
  }


  public void setLoanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
  }


  public AccountResponse maturesOn(String maturesOn) {
    
    this.maturesOn = maturesOn;
    return this;
  }

   /**
   * Get maturesOn
   * @return maturesOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-13T17:57:37.000Z", value = "")

  public String getMaturesOn() {
    return maturesOn;
  }


  public void setMaturesOn(String maturesOn) {
    this.maturesOn = maturesOn;
  }


  public AccountResponse memberGuid(String memberGuid) {
    
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


  public AccountResponse memberId(String memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "member123", value = "")

  public String getMemberId() {
    return memberId;
  }


  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public AccountResponse memberIsManagedByUser(Boolean memberIsManagedByUser) {
    
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


  public AccountResponse metadata(String metadata) {
    
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


  public AccountResponse minimumBalance(BigDecimal minimumBalance) {
    
    this.minimumBalance = minimumBalance;
    return this;
  }

   /**
   * Get minimumBalance
   * @return minimumBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.0", value = "")

  public BigDecimal getMinimumBalance() {
    return minimumBalance;
  }


  public void setMinimumBalance(BigDecimal minimumBalance) {
    this.minimumBalance = minimumBalance;
  }


  public AccountResponse minimumPayment(BigDecimal minimumPayment) {
    
    this.minimumPayment = minimumPayment;
    return this;
  }

   /**
   * Get minimumPayment
   * @return minimumPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "")

  public BigDecimal getMinimumPayment() {
    return minimumPayment;
  }


  public void setMinimumPayment(BigDecimal minimumPayment) {
    this.minimumPayment = minimumPayment;
  }


  public AccountResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test account 2", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountResponse nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Checking", value = "")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public AccountResponse originalBalance(BigDecimal originalBalance) {
    
    this.originalBalance = originalBalance;
    return this;
  }

   /**
   * Get originalBalance
   * @return originalBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "")

  public BigDecimal getOriginalBalance() {
    return originalBalance;
  }


  public void setOriginalBalance(BigDecimal originalBalance) {
    this.originalBalance = originalBalance;
  }


  public AccountResponse payOutAmount(BigDecimal payOutAmount) {
    
    this.payOutAmount = payOutAmount;
    return this;
  }

   /**
   * Get payOutAmount
   * @return payOutAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "")

  public BigDecimal getPayOutAmount() {
    return payOutAmount;
  }


  public void setPayOutAmount(BigDecimal payOutAmount) {
    this.payOutAmount = payOutAmount;
  }


  public AccountResponse paymentDueAt(String paymentDueAt) {
    
    this.paymentDueAt = paymentDueAt;
    return this;
  }

   /**
   * Get paymentDueAt
   * @return paymentDueAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-13T17:57:37.000Z", value = "")

  public String getPaymentDueAt() {
    return paymentDueAt;
  }


  public void setPaymentDueAt(String paymentDueAt) {
    this.paymentDueAt = paymentDueAt;
  }


  public AccountResponse payoffBalance(BigDecimal payoffBalance) {
    
    this.payoffBalance = payoffBalance;
    return this;
  }

   /**
   * Get payoffBalance
   * @return payoffBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "")

  public BigDecimal getPayoffBalance() {
    return payoffBalance;
  }


  public void setPayoffBalance(BigDecimal payoffBalance) {
    this.payoffBalance = payoffBalance;
  }


  public AccountResponse premiumAmount(BigDecimal premiumAmount) {
    
    this.premiumAmount = premiumAmount;
    return this;
  }

   /**
   * Get premiumAmount
   * @return premiumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "")

  public BigDecimal getPremiumAmount() {
    return premiumAmount;
  }


  public void setPremiumAmount(BigDecimal premiumAmount) {
    this.premiumAmount = premiumAmount;
  }


  public AccountResponse routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "68899990000000", value = "")

  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public AccountResponse startedOn(String startedOn) {
    
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-13T17:57:37.000Z", value = "")

  public String getStartedOn() {
    return startedOn;
  }


  public void setStartedOn(String startedOn) {
    this.startedOn = startedOn;
  }


  public AccountResponse subtype(String subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "")

  public String getSubtype() {
    return subtype;
  }


  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }


  public AccountResponse totalAccountValue(BigDecimal totalAccountValue) {
    
    this.totalAccountValue = totalAccountValue;
    return this;
  }

   /**
   * Get totalAccountValue
   * @return totalAccountValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "")

  public BigDecimal getTotalAccountValue() {
    return totalAccountValue;
  }


  public void setTotalAccountValue(BigDecimal totalAccountValue) {
    this.totalAccountValue = totalAccountValue;
  }


  public AccountResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SAVINGS", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public AccountResponse updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-10-13T18:08:00.000Z", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public AccountResponse userGuid(String userGuid) {
    
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


  public AccountResponse userId(String userId) {
    
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
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.accountNumber, accountResponse.accountNumber) &&
        Objects.equals(this.apr, accountResponse.apr) &&
        Objects.equals(this.apy, accountResponse.apy) &&
        Objects.equals(this.availableBalance, accountResponse.availableBalance) &&
        Objects.equals(this.availableCredit, accountResponse.availableCredit) &&
        Objects.equals(this.balance, accountResponse.balance) &&
        Objects.equals(this.cashBalance, accountResponse.cashBalance) &&
        Objects.equals(this.cashSurrenderValue, accountResponse.cashSurrenderValue) &&
        Objects.equals(this.createdAt, accountResponse.createdAt) &&
        Objects.equals(this.creditLimit, accountResponse.creditLimit) &&
        Objects.equals(this.currencyCode, accountResponse.currencyCode) &&
        Objects.equals(this.dayPaymentIsDue, accountResponse.dayPaymentIsDue) &&
        Objects.equals(this.deathBenefit, accountResponse.deathBenefit) &&
        Objects.equals(this.guid, accountResponse.guid) &&
        Objects.equals(this.holdingsValue, accountResponse.holdingsValue) &&
        Objects.equals(this.id, accountResponse.id) &&
        Objects.equals(this.importedAt, accountResponse.importedAt) &&
        Objects.equals(this.institutionCode, accountResponse.institutionCode) &&
        Objects.equals(this.insuredName, accountResponse.insuredName) &&
        Objects.equals(this.interestRate, accountResponse.interestRate) &&
        Objects.equals(this.isClosed, accountResponse.isClosed) &&
        Objects.equals(this.isHidden, accountResponse.isHidden) &&
        Objects.equals(this.lastPayment, accountResponse.lastPayment) &&
        Objects.equals(this.lastPaymentAt, accountResponse.lastPaymentAt) &&
        Objects.equals(this.loanAmount, accountResponse.loanAmount) &&
        Objects.equals(this.maturesOn, accountResponse.maturesOn) &&
        Objects.equals(this.memberGuid, accountResponse.memberGuid) &&
        Objects.equals(this.memberId, accountResponse.memberId) &&
        Objects.equals(this.memberIsManagedByUser, accountResponse.memberIsManagedByUser) &&
        Objects.equals(this.metadata, accountResponse.metadata) &&
        Objects.equals(this.minimumBalance, accountResponse.minimumBalance) &&
        Objects.equals(this.minimumPayment, accountResponse.minimumPayment) &&
        Objects.equals(this.name, accountResponse.name) &&
        Objects.equals(this.nickname, accountResponse.nickname) &&
        Objects.equals(this.originalBalance, accountResponse.originalBalance) &&
        Objects.equals(this.payOutAmount, accountResponse.payOutAmount) &&
        Objects.equals(this.paymentDueAt, accountResponse.paymentDueAt) &&
        Objects.equals(this.payoffBalance, accountResponse.payoffBalance) &&
        Objects.equals(this.premiumAmount, accountResponse.premiumAmount) &&
        Objects.equals(this.routingNumber, accountResponse.routingNumber) &&
        Objects.equals(this.startedOn, accountResponse.startedOn) &&
        Objects.equals(this.subtype, accountResponse.subtype) &&
        Objects.equals(this.totalAccountValue, accountResponse.totalAccountValue) &&
        Objects.equals(this.type, accountResponse.type) &&
        Objects.equals(this.updatedAt, accountResponse.updatedAt) &&
        Objects.equals(this.userGuid, accountResponse.userGuid) &&
        Objects.equals(this.userId, accountResponse.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, apr, apy, availableBalance, availableCredit, balance, cashBalance, cashSurrenderValue, createdAt, creditLimit, currencyCode, dayPaymentIsDue, deathBenefit, guid, holdingsValue, id, importedAt, institutionCode, insuredName, interestRate, isClosed, isHidden, lastPayment, lastPaymentAt, loanAmount, maturesOn, memberGuid, memberId, memberIsManagedByUser, metadata, minimumBalance, minimumPayment, name, nickname, originalBalance, payOutAmount, paymentDueAt, payoffBalance, premiumAmount, routingNumber, startedOn, subtype, totalAccountValue, type, updatedAt, userGuid, userId);
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
    sb.append("class AccountResponse {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    apy: ").append(toIndentedString(apy)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    cashSurrenderValue: ").append(toIndentedString(cashSurrenderValue)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dayPaymentIsDue: ").append(toIndentedString(dayPaymentIsDue)).append("\n");
    sb.append("    deathBenefit: ").append(toIndentedString(deathBenefit)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    holdingsValue: ").append(toIndentedString(holdingsValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importedAt: ").append(toIndentedString(importedAt)).append("\n");
    sb.append("    institutionCode: ").append(toIndentedString(institutionCode)).append("\n");
    sb.append("    insuredName: ").append(toIndentedString(insuredName)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    lastPayment: ").append(toIndentedString(lastPayment)).append("\n");
    sb.append("    lastPaymentAt: ").append(toIndentedString(lastPaymentAt)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    maturesOn: ").append(toIndentedString(maturesOn)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    memberIsManagedByUser: ").append(toIndentedString(memberIsManagedByUser)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    minimumBalance: ").append(toIndentedString(minimumBalance)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    originalBalance: ").append(toIndentedString(originalBalance)).append("\n");
    sb.append("    payOutAmount: ").append(toIndentedString(payOutAmount)).append("\n");
    sb.append("    paymentDueAt: ").append(toIndentedString(paymentDueAt)).append("\n");
    sb.append("    payoffBalance: ").append(toIndentedString(payoffBalance)).append("\n");
    sb.append("    premiumAmount: ").append(toIndentedString(premiumAmount)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    totalAccountValue: ").append(toIndentedString(totalAccountValue)).append("\n");
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

