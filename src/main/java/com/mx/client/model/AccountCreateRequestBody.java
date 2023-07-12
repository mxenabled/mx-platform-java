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
import com.mx.client.model.AccountCreateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountCreateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountCreateRequestBody {
  public static final String SERIALIZED_NAME_SKIP_WEBHOOK = "skip_webhook";
  @SerializedName(SERIALIZED_NAME_SKIP_WEBHOOK)
  private Boolean skipWebhook;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountCreateRequest account;

  public AccountCreateRequestBody() { 
  }

  public AccountCreateRequestBody skipWebhook(Boolean skipWebhook) {
    
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


  public AccountCreateRequestBody account(AccountCreateRequest account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountCreateRequest getAccount() {
    return account;
  }


  public void setAccount(AccountCreateRequest account) {
    this.account = account;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateRequestBody accountCreateRequestBody = (AccountCreateRequestBody) o;
    return Objects.equals(this.skipWebhook, accountCreateRequestBody.skipWebhook) &&
        Objects.equals(this.account, accountCreateRequestBody.account);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipWebhook, account);
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
    sb.append("class AccountCreateRequestBody {\n");
    sb.append("    skipWebhook: ").append(toIndentedString(skipWebhook)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

