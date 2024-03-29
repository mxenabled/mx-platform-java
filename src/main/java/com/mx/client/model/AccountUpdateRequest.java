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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mx.client.JSON;

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("account_subtype");
    openapiFields.add("account_type");
    openapiFields.add("apr");
    openapiFields.add("apy");
    openapiFields.add("available_balance");
    openapiFields.add("balance");
    openapiFields.add("cash_surrender_value");
    openapiFields.add("credit_limit");
    openapiFields.add("currency_code");
    openapiFields.add("death_benefit");
    openapiFields.add("interest_rate");
    openapiFields.add("is_business");
    openapiFields.add("is_closed");
    openapiFields.add("is_hidden");
    openapiFields.add("loan_amount");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("nickname");
    openapiFields.add("original_balance");
    openapiFields.add("property_type");
    openapiFields.add("skip_webhook");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountUpdateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountUpdateRequest is not found in the empty JSON string", AccountUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_subtype") != null && !jsonObj.get("account_subtype").isJsonNull()) && !jsonObj.get("account_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_subtype").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("nickname") != null && !jsonObj.get("nickname").isJsonNull()) && !jsonObj.get("nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nickname").toString()));
      }
      if ((jsonObj.get("property_type") != null && !jsonObj.get("property_type").isJsonNull()) && !jsonObj.get("property_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountUpdateRequest>() {
           @Override
           public void write(JsonWriter out, AccountUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to AccountUpdateRequest
  */
  public static AccountUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountUpdateRequest.class);
  }

 /**
  * Convert an instance of AccountUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

