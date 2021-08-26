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

  public static final String SERIALIZED_NAME_INSTITUTION_NUMBER = "institution_number";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NUMBER)
  private String institutionNumber;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_TRANSIT_NUMBER = "transit_number";
  @SerializedName(SERIALIZED_NAME_TRANSIT_NUMBER)
  private String transitNumber;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;


  public AccountNumberResponse accountGuid(String accountGuid) {
    
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


  public AccountNumberResponse accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "")

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
  @ApiModelProperty(example = "ACN-8899832e-e5b4-42cd-aa25-bbf1dc889a8f", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
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
  @ApiModelProperty(example = "123", value = "")

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
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")

  public String getMemberGuid() {
    return memberGuid;
  }


  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
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
  @ApiModelProperty(example = "68899990000000", value = "")

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
  @ApiModelProperty(example = "12345", value = "")

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
    AccountNumberResponse accountNumberResponse = (AccountNumberResponse) o;
    return Objects.equals(this.accountGuid, accountNumberResponse.accountGuid) &&
        Objects.equals(this.accountNumber, accountNumberResponse.accountNumber) &&
        Objects.equals(this.guid, accountNumberResponse.guid) &&
        Objects.equals(this.institutionNumber, accountNumberResponse.institutionNumber) &&
        Objects.equals(this.memberGuid, accountNumberResponse.memberGuid) &&
        Objects.equals(this.routingNumber, accountNumberResponse.routingNumber) &&
        Objects.equals(this.transitNumber, accountNumberResponse.transitNumber) &&
        Objects.equals(this.userGuid, accountNumberResponse.userGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, accountNumber, guid, institutionNumber, memberGuid, routingNumber, transitNumber, userGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountNumberResponse {\n");
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    institutionNumber: ").append(toIndentedString(institutionNumber)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
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

}

