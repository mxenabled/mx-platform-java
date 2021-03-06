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
import com.mx.client.model.PaginationResponse;
import com.mx.client.model.StatementResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatementsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StatementsResponseBody {
  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private List<StatementResponse> statements = null;

  public StatementsResponseBody() { 
  }

  public StatementsResponseBody pagination(PaginationResponse pagination) {
    
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


  public StatementsResponseBody statements(List<StatementResponse> statements) {
    
    this.statements = statements;
    return this;
  }

  public StatementsResponseBody addStatementsItem(StatementResponse statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<StatementResponse>();
    }
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StatementResponse> getStatements() {
    return statements;
  }


  public void setStatements(List<StatementResponse> statements) {
    this.statements = statements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementsResponseBody statementsResponseBody = (StatementsResponseBody) o;
    return Objects.equals(this.pagination, statementsResponseBody.pagination) &&
        Objects.equals(this.statements, statementsResponseBody.statements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, statements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementsResponseBody {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

