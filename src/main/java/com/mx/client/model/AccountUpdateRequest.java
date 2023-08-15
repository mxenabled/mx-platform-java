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
 * AccountUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountUpdateRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPE = "account_subtype";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPE)
  private String accountSubtype;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_APR = "apr";
  @SerializedName(SERIALIZED_NAME_APR)
  private BigDecimal apr;

  public static final String SERIALIZED_NAME_APY = "apy";
  @SerializedName(SERIALIZED_NAME_APY)
  private BigDecimal apy;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private BigDecimal availableBalance;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_CASH_SURRENDER_VALUE = "cash_surrender_value";
  @SerializedName(SERIALIZED_NAME_CASH_SURRENDER_VALUE)
  private BigDecimal cashSurrenderValue;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "credit_limit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private BigDecimal creditLimit;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_DEATH_BENEFIT = "death_benefit";
  @SerializedName(SERIALIZED_NAME_DEATH_BENEFIT)
  private Integer deathBenefit;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private BigDecimal interestRate;

  public static final String SERIALIZED_NAME_IS_BUSINESS = "is_business";
  @SerializedName(SERIALIZED_NAME_IS_BUSINESS)
  private Boolean isBusiness;

  public static final String SERIALIZED_NAME_IS_CLOSED = "is_closed";
  @SerializedName(SERIALIZED_NAME_IS_CLOSED)
  private Boolean isClosed;

  public static final String SERIALIZED_NAME_IS_HIDDEN = "is_hidden";
  @SerializedName(SERIALIZED_NAME_IS_HIDDEN)
  private Boolean isHidden;

  public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loan_amount";
  @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
  private BigDecimal loanAmount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NICKNAME = "nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_ORIGINAL_BALANCE = "original_balance";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_BALANCE)
  private BigDecimal originalBalance;

  public static final String SERIALIZED_NAME_PROPERTY_TYPE = "property_type";
  @SerializedName(SERIALIZED_NAME_PROPERTY_TYPE)
  private String propertyType;

  public static final String SERIALIZED_NAME_SKIP_WEBHOOK = "skip_webhook";
  @SerializedName(SERIALIZED_NAME_SKIP_WEBHOOK)
  private Boolean skipWebhook;

  public AccountUpdateRequest() { 
  }

  public AccountUpdateRequest accountSubtype(String accountSubtype) {
    
    this.accountSubtype = accountSubtype;
    return this;
  }

   /**
   * Get accountSubtype
   * @return accountSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PERSONAL", value = "")

  public String getAccountSubtype() {
    return accountSubtype;
  }


  public void setAccountSubtype(String accountSubtype) {
    this.accountSubtype = accountSubtype;
  }


  public AccountUpdateRequest accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SAVINGS", value = "")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public AccountUpdateRequest apr(BigDecimal apr) {
    
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


  public AccountUpdateRequest apy(BigDecimal apy) {
    
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


  public AccountUpdateRequest availableBalance(BigDecimal availableBalance) {
    
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


  public AccountUpdateRequest balance(BigDecimal balance) {
    
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


  public AccountUpdateRequest cashSurrenderValue(BigDecimal cashSurrenderValue) {
    
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


  public AccountUpdateRequest creditLimit(BigDecimal creditLimit) {
    
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


  public AccountUpdateRequest currencyCode(String currencyCode) {
    
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


  public AccountUpdateRequest deathBenefit(Integer deathBenefit) {
    
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


  public AccountUpdateRequest interestRate(BigDecimal interestRate) {
    
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


  public AccountUpdateRequest isBusiness(Boolean isBusiness) {
    
    this.isBusiness = isBusiness;
    return this;
  }

   /**
   * Get isBusiness
   * @return isBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsBusiness() {
    return isBusiness;
  }


  public void setIsBusiness(Boolean isBusiness) {
    this.isBusiness = isBusiness;
  }


  public AccountUpdateRequest isClosed(Boolean isClosed) {
    
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


  public AccountUpdateRequest isHidden(Boolean isHidden) {
    
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


  public AccountUpdateRequest loanAmount(BigDecimal loanAmount) {
    
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


  public AccountUpdateRequest metadata(String metadata) {
    
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


  public AccountUpdateRequest name(String name) {
    
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


  public AccountUpdateRequest nickname(String nickname) {
    
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Swiss Account", value = "")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public AccountUpdateRequest originalBalance(BigDecimal originalBalance) {
    
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


  public AccountUpdateRequest propertyType(String propertyType) {
    
    this.propertyType = propertyType;
    return this;
  }

   /**
   * Get propertyType
   * @return propertyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VEHICLE", value = "")

  public String getPropertyType() {
    return propertyType;
  }


  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  public AccountUpdateRequest skipWebhook(Boolean skipWebhook) {
    
    this.skipWebhook = skipWebhook;
    return this;
  }

   /**
   * Get skipWebhook
   * @return skipWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getSkipWebhook() {
    return skipWebhook;
  }


  public void setSkipWebhook(Boolean skipWebhook) {
    this.skipWebhook = skipWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateRequest accountUpdateRequest = (AccountUpdateRequest) o;
    return Objects.equals(this.accountSubtype, accountUpdateRequest.accountSubtype) &&
        Objects.equals(this.accountType, accountUpdateRequest.accountType) &&
        Objects.equals(this.apr, accountUpdateRequest.apr) &&
        Objects.equals(this.apy, accountUpdateRequest.apy) &&
        Objects.equals(this.availableBalance, accountUpdateRequest.availableBalance) &&
        Objects.equals(this.balance, accountUpdateRequest.balance) &&
        Objects.equals(this.cashSurrenderValue, accountUpdateRequest.cashSurrenderValue) &&
        Objects.equals(this.creditLimit, accountUpdateRequest.creditLimit) &&
        Objects.equals(this.currencyCode, accountUpdateRequest.currencyCode) &&
        Objects.equals(this.deathBenefit, accountUpdateRequest.deathBenefit) &&
        Objects.equals(this.interestRate, accountUpdateRequest.interestRate) &&
        Objects.equals(this.isBusiness, accountUpdateRequest.isBusiness) &&
        Objects.equals(this.isClosed, accountUpdateRequest.isClosed) &&
        Objects.equals(this.isHidden, accountUpdateRequest.isHidden) &&
        Objects.equals(this.loanAmount, accountUpdateRequest.loanAmount) &&
        Objects.equals(this.metadata, accountUpdateRequest.metadata) &&
        Objects.equals(this.name, accountUpdateRequest.name) &&
        Objects.equals(this.nickname, accountUpdateRequest.nickname) &&
        Objects.equals(this.originalBalance, accountUpdateRequest.originalBalance) &&
        Objects.equals(this.propertyType, accountUpdateRequest.propertyType) &&
        Objects.equals(this.skipWebhook, accountUpdateRequest.skipWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSubtype, accountType, apr, apy, availableBalance, balance, cashSurrenderValue, creditLimit, currencyCode, deathBenefit, interestRate, isBusiness, isClosed, isHidden, loanAmount, metadata, name, nickname, originalBalance, propertyType, skipWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateRequest {\n");
    sb.append("    accountSubtype: ").append(toIndentedString(accountSubtype)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    apy: ").append(toIndentedString(apy)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashSurrenderValue: ").append(toIndentedString(cashSurrenderValue)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    deathBenefit: ").append(toIndentedString(deathBenefit)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isBusiness: ").append(toIndentedString(isBusiness)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    originalBalance: ").append(toIndentedString(originalBalance)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    skipWebhook: ").append(toIndentedString(skipWebhook)).append("\n");
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

