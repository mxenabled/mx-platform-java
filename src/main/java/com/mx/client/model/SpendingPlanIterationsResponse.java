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
import com.mx.client.model.SpendingPlanIterationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SpendingPlanIterationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpendingPlanIterationsResponse {
  public static final String SERIALIZED_NAME_ITERATIONS = "iterations";
  @SerializedName(SERIALIZED_NAME_ITERATIONS)
  private List<SpendingPlanIterationResponse> iterations = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public SpendingPlanIterationsResponse() { 
  }

  public SpendingPlanIterationsResponse iterations(List<SpendingPlanIterationResponse> iterations) {
    
    this.iterations = iterations;
    return this;
  }

  public SpendingPlanIterationsResponse addIterationsItem(SpendingPlanIterationResponse iterationsItem) {
    if (this.iterations == null) {
      this.iterations = new ArrayList<SpendingPlanIterationResponse>();
    }
    this.iterations.add(iterationsItem);
    return this;
  }

   /**
   * Get iterations
   * @return iterations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SpendingPlanIterationResponse> getIterations() {
    return iterations;
  }


  public void setIterations(List<SpendingPlanIterationResponse> iterations) {
    this.iterations = iterations;
  }


  public SpendingPlanIterationsResponse pagination(PaginationResponse pagination) {
    
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
    SpendingPlanIterationsResponse spendingPlanIterationsResponse = (SpendingPlanIterationsResponse) o;
    return Objects.equals(this.iterations, spendingPlanIterationsResponse.iterations) &&
        Objects.equals(this.pagination, spendingPlanIterationsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iterations, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendingPlanIterationsResponse {\n");
    sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
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

