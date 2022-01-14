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
import com.mx.client.model.AccountOwnerResponse;
import com.mx.client.model.PaginationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountOwnersResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountOwnersResponseBody {
  public static final String SERIALIZED_NAME_ACCOUNT_OWNERS = "account_owners";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNERS)
  private List<AccountOwnerResponse> accountOwners = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public AccountOwnersResponseBody() { 
  }

  public AccountOwnersResponseBody accountOwners(List<AccountOwnerResponse> accountOwners) {
    
    this.accountOwners = accountOwners;
    return this;
  }

  public AccountOwnersResponseBody addAccountOwnersItem(AccountOwnerResponse accountOwnersItem) {
    if (this.accountOwners == null) {
      this.accountOwners = new ArrayList<AccountOwnerResponse>();
    }
    this.accountOwners.add(accountOwnersItem);
    return this;
  }

   /**
   * Get accountOwners
   * @return accountOwners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccountOwnerResponse> getAccountOwners() {
    return accountOwners;
  }


  public void setAccountOwners(List<AccountOwnerResponse> accountOwners) {
    this.accountOwners = accountOwners;
  }


  public AccountOwnersResponseBody pagination(PaginationResponse pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationResponse getPagination() {
    return pagination;
  }


  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountOwnersResponseBody accountOwnersResponseBody = (AccountOwnersResponseBody) o;
    return Objects.equals(this.accountOwners, accountOwnersResponseBody.accountOwners) &&
        Objects.equals(this.pagination, accountOwnersResponseBody.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountOwners, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountOwnersResponseBody {\n");
    sb.append("    accountOwners: ").append(toIndentedString(accountOwners)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

