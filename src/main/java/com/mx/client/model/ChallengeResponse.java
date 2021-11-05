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
import com.mx.client.model.ImageOptionResponse;
import com.mx.client.model.OptionResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ChallengeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChallengeResponse {
  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "image_data";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private String imageData;

  public static final String SERIALIZED_NAME_IMAGE_OPTIONS = "image_options";
  @SerializedName(SERIALIZED_NAME_IMAGE_OPTIONS)
  private List<ImageOptionResponse> imageOptions = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<OptionResponse> options = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ChallengeResponse fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Who is this guy?", value = "")

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public ChallengeResponse guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CRD-ce76d2e3-86bd-ec4a-ec52-eb53b5194bf5", value = "")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    this.guid = guid;
  }


  public ChallengeResponse imageData(String imageData) {
    
    this.imageData = imageData;
    return this;
  }

   /**
   * Get imageData
   * @return imageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Who is this guy?", value = "")

  public String getImageData() {
    return imageData;
  }


  public void setImageData(String imageData) {
    this.imageData = imageData;
  }


  public ChallengeResponse imageOptions(List<ImageOptionResponse> imageOptions) {
    
    this.imageOptions = imageOptions;
    return this;
  }

  public ChallengeResponse addImageOptionsItem(ImageOptionResponse imageOptionsItem) {
    if (this.imageOptions == null) {
      this.imageOptions = new ArrayList<ImageOptionResponse>();
    }
    this.imageOptions.add(imageOptionsItem);
    return this;
  }

   /**
   * Get imageOptions
   * @return imageOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ImageOptionResponse> getImageOptions() {
    return imageOptions;
  }


  public void setImageOptions(List<ImageOptionResponse> imageOptions) {
    this.imageOptions = imageOptions;
  }


  public ChallengeResponse label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Who is this guy?", value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ChallengeResponse options(List<OptionResponse> options) {
    
    this.options = options;
    return this;
  }

  public ChallengeResponse addOptionsItem(OptionResponse optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<OptionResponse>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OptionResponse> getOptions() {
    return options;
  }


  public void setOptions(List<OptionResponse> options) {
    this.options = options;
  }


  public ChallengeResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMAGE_DATA", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeResponse challengeResponse = (ChallengeResponse) o;
    return Objects.equals(this.fieldName, challengeResponse.fieldName) &&
        Objects.equals(this.guid, challengeResponse.guid) &&
        Objects.equals(this.imageData, challengeResponse.imageData) &&
        Objects.equals(this.imageOptions, challengeResponse.imageOptions) &&
        Objects.equals(this.label, challengeResponse.label) &&
        Objects.equals(this.options, challengeResponse.options) &&
        Objects.equals(this.type, challengeResponse.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, guid, imageData, imageOptions, label, options, type);
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
    sb.append("class ChallengeResponse {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    imageOptions: ").append(toIndentedString(imageOptions)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

