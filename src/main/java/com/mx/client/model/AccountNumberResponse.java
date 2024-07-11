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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AccountNumberResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountNumberResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_GUID = "account_guid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GUID)
  private String accountGuid;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_LOAN_GUARANTOR = "loan_guarantor";
  @SerializedName(SERIALIZED_NAME_LOAN_GUARANTOR)
  private String loanGuarantor;

  public static final String SERIALIZED_NAME_INSTITUTION_NUMBER = "institution_number";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NUMBER)
  private String institutionNumber;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_PASSED_VALIDATION = "passed_validation";
  @SerializedName(SERIALIZED_NAME_PASSED_VALIDATION)
  private Boolean passedValidation;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_TRANSIT_NUMBER = "transit_number";
  @SerializedName(SERIALIZED_NAME_TRANSIT_NUMBER)
  private String transitNumber;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public AccountNumberResponse() {
  }

  public AccountNumberResponse accountGuid(String accountGuid) {
    
    this.accountGuid = accountGuid;
    return this;
  }

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @javax.annotation.Nullable
  public String getAccountGuid() {
    return accountGuid;
  }


  public void setAccountGuid(String accountGuid) {
    this.accountGuid = accountGuid;
  }


  public AccountNumberResponse accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public AccountNumberResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public AccountNumberResponse loanGuarantor(String loanGuarantor) {
    
    this.loanGuarantor = loanGuarantor;
    return this;
  }

   /**
   * Get loanGuarantor
   * @return loanGuarantor
  **/
  @javax.annotation.Nullable
  public String getLoanGuarantor() {
    return loanGuarantor;
  }


  public void setLoanGuarantor(String loanGuarantor) {
    this.loanGuarantor = loanGuarantor;
  }


  public AccountNumberResponse institutionNumber(String institutionNumber) {
    
    this.institutionNumber = institutionNumber;
    return this;
  }

   /**
   * Get institutionNumber
   * @return institutionNumber
  **/
  @javax.annotation.Nullable
  public String getInstitutionNumber() {
    return institutionNumber;
  }


  public void setInstitutionNumber(String institutionNumber) {
    this.institutionNumber = institutionNumber;
  }


  public AccountNumberResponse memberGuid(String memberGuid) {
    
    this.memberGuid = memberGuid;
    return this;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @javax.annotation.Nullable
  public String getMemberGuid() {
    return memberGuid;
  }


  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
  }


  public AccountNumberResponse passedValidation(Boolean passedValidation) {
    
    this.passedValidation = passedValidation;
    return this;
  }

   /**
   * Get passedValidation
   * @return passedValidation
  **/
  @javax.annotation.Nullable
  public Boolean getPassedValidation() {
    return passedValidation;
  }


  public void setPassedValidation(Boolean passedValidation) {
    this.passedValidation = passedValidation;
  }


  public AccountNumberResponse routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public AccountNumberResponse transitNumber(String transitNumber) {
    
    this.transitNumber = transitNumber;
    return this;
  }

   /**
   * Get transitNumber
   * @return transitNumber
  **/
  @javax.annotation.Nullable
  public String getTransitNumber() {
    return transitNumber;
  }


  public void setTransitNumber(String transitNumber) {
    this.transitNumber = transitNumber;
  }


  public AccountNumberResponse userGuid(String userGuid) {
    
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @javax.annotation.Nullable
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
    AccountNumberResponse accountNumberResponse = (AccountNumberResponse) o;
    return Objects.equals(this.accountGuid, accountNumberResponse.accountGuid) &&
        Objects.equals(this.accountNumber, accountNumberResponse.accountNumber) &&
        Objects.equals(this.guid, accountNumberResponse.guid) &&
        Objects.equals(this.loanGuarantor, accountNumberResponse.loanGuarantor) &&
        Objects.equals(this.institutionNumber, accountNumberResponse.institutionNumber) &&
        Objects.equals(this.memberGuid, accountNumberResponse.memberGuid) &&
        Objects.equals(this.passedValidation, accountNumberResponse.passedValidation) &&
        Objects.equals(this.routingNumber, accountNumberResponse.routingNumber) &&
        Objects.equals(this.transitNumber, accountNumberResponse.transitNumber) &&
        Objects.equals(this.userGuid, accountNumberResponse.userGuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, accountNumber, guid, loanGuarantor, institutionNumber, memberGuid, passedValidation, routingNumber, transitNumber, userGuid);
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
    sb.append("class AccountNumberResponse {\n");
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    loanGuarantor: ").append(toIndentedString(loanGuarantor)).append("\n");
    sb.append("    institutionNumber: ").append(toIndentedString(institutionNumber)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    passedValidation: ").append(toIndentedString(passedValidation)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    transitNumber: ").append(toIndentedString(transitNumber)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("account_guid");
    openapiFields.add("account_number");
    openapiFields.add("guid");
    openapiFields.add("loan_guarantor");
    openapiFields.add("institution_number");
    openapiFields.add("member_guid");
    openapiFields.add("passed_validation");
    openapiFields.add("routing_number");
    openapiFields.add("transit_number");
    openapiFields.add("user_guid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccountNumberResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccountNumberResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountNumberResponse is not found in the empty JSON string", AccountNumberResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccountNumberResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountNumberResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_guid") != null && !jsonObj.get("account_guid").isJsonNull()) && !jsonObj.get("account_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_guid").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("loan_guarantor") != null && !jsonObj.get("loan_guarantor").isJsonNull()) && !jsonObj.get("loan_guarantor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loan_guarantor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loan_guarantor").toString()));
      }
      if ((jsonObj.get("institution_number") != null && !jsonObj.get("institution_number").isJsonNull()) && !jsonObj.get("institution_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_number").toString()));
      }
      if ((jsonObj.get("member_guid") != null && !jsonObj.get("member_guid").isJsonNull()) && !jsonObj.get("member_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_guid").toString()));
      }
      if ((jsonObj.get("routing_number") != null && !jsonObj.get("routing_number").isJsonNull()) && !jsonObj.get("routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routing_number").toString()));
      }
      if ((jsonObj.get("transit_number") != null && !jsonObj.get("transit_number").isJsonNull()) && !jsonObj.get("transit_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transit_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transit_number").toString()));
      }
      if ((jsonObj.get("user_guid") != null && !jsonObj.get("user_guid").isJsonNull()) && !jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountNumberResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountNumberResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountNumberResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountNumberResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountNumberResponse>() {
           @Override
           public void write(JsonWriter out, AccountNumberResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountNumberResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountNumberResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountNumberResponse
  * @throws IOException if the JSON string is invalid with respect to AccountNumberResponse
  */
  public static AccountNumberResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountNumberResponse.class);
  }

 /**
  * Convert an instance of AccountNumberResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

