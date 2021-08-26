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
import com.mx.client.model.TaggingResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaggingsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TaggingsResponseBody {
  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private PaginationResponse pagination;

  public static final String SERIALIZED_NAME_TAGGINGS = "taggings";
  @SerializedName(SERIALIZED_NAME_TAGGINGS)
  private List<TaggingResponse> taggings = null;


  public TaggingsResponseBody pagination(PaginationResponse pagination) {
    
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


  public TaggingsResponseBody taggings(List<TaggingResponse> taggings) {
    
    this.taggings = taggings;
    return this;
  }

  public TaggingsResponseBody addTaggingsItem(TaggingResponse taggingsItem) {
    if (this.taggings == null) {
      this.taggings = new ArrayList<TaggingResponse>();
    }
    this.taggings.add(taggingsItem);
    return this;
  }

   /**
   * Get taggings
   * @return taggings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaggingResponse> getTaggings() {
    return taggings;
  }


  public void setTaggings(List<TaggingResponse> taggings) {
    this.taggings = taggings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaggingsResponseBody taggingsResponseBody = (TaggingsResponseBody) o;
    return Objects.equals(this.pagination, taggingsResponseBody.pagination) &&
        Objects.equals(this.taggings, taggingsResponseBody.taggings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, taggings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaggingsResponseBody {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    taggings: ").append(toIndentedString(taggings)).append("\n");
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

