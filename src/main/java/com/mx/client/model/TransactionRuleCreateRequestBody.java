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
import com.mx.client.model.TransactionRuleCreateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionRuleCreateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionRuleCreateRequestBody {
  public static final String SERIALIZED_NAME_TRANSACTION_RULE = "transaction_rule";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RULE)
  private TransactionRuleCreateRequest transactionRule;

  public TransactionRuleCreateRequestBody() { 
  }

  public TransactionRuleCreateRequestBody transactionRule(TransactionRuleCreateRequest transactionRule) {
    
    this.transactionRule = transactionRule;
    return this;
  }

   /**
   * Get transactionRule
   * @return transactionRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionRuleCreateRequest getTransactionRule() {
    return transactionRule;
  }


  public void setTransactionRule(TransactionRuleCreateRequest transactionRule) {
    this.transactionRule = transactionRule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRuleCreateRequestBody transactionRuleCreateRequestBody = (TransactionRuleCreateRequestBody) o;
    return Objects.equals(this.transactionRule, transactionRuleCreateRequestBody.transactionRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRuleCreateRequestBody {\n");
    sb.append("    transactionRule: ").append(toIndentedString(transactionRule)).append("\n");
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

