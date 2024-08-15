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
 * MonthlyCashFlowProfileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonthlyCashFlowProfileRequest {
  public static final String SERIALIZED_NAME_GOALS_CONTRIBUTION = "goals_contribution";
  @SerializedName(SERIALIZED_NAME_GOALS_CONTRIBUTION)
  private BigDecimal goalsContribution;

  public static final String SERIALIZED_NAME_USES_ESTIMATED_GOALS_CONTRIBUTION = "uses_estimated_goals_contribution";
  @SerializedName(SERIALIZED_NAME_USES_ESTIMATED_GOALS_CONTRIBUTION)
  private Boolean usesEstimatedGoalsContribution;

  public MonthlyCashFlowProfileRequest() {
  }

  public MonthlyCashFlowProfileRequest goalsContribution(BigDecimal goalsContribution) {
    
    this.goalsContribution = goalsContribution;
    return this;
  }

   /**
   * The monthly dollar amount allocated for goals.
   * @return goalsContribution
  **/
  @javax.annotation.Nullable
  public BigDecimal getGoalsContribution() {
    return goalsContribution;
  }


  public void setGoalsContribution(BigDecimal goalsContribution) {
    this.goalsContribution = goalsContribution;
  }


  public MonthlyCashFlowProfileRequest usesEstimatedGoalsContribution(Boolean usesEstimatedGoalsContribution) {
    
    this.usesEstimatedGoalsContribution = usesEstimatedGoalsContribution;
    return this;
  }

   /**
   * Determines if the user uses estimated goals contribution.
   * @return usesEstimatedGoalsContribution
  **/
  @javax.annotation.Nullable
  public Boolean getUsesEstimatedGoalsContribution() {
    return usesEstimatedGoalsContribution;
  }


  public void setUsesEstimatedGoalsContribution(Boolean usesEstimatedGoalsContribution) {
    this.usesEstimatedGoalsContribution = usesEstimatedGoalsContribution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyCashFlowProfileRequest monthlyCashFlowProfileRequest = (MonthlyCashFlowProfileRequest) o;
    return Objects.equals(this.goalsContribution, monthlyCashFlowProfileRequest.goalsContribution) &&
        Objects.equals(this.usesEstimatedGoalsContribution, monthlyCashFlowProfileRequest.usesEstimatedGoalsContribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goalsContribution, usesEstimatedGoalsContribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyCashFlowProfileRequest {\n");
    sb.append("    goalsContribution: ").append(toIndentedString(goalsContribution)).append("\n");
    sb.append("    usesEstimatedGoalsContribution: ").append(toIndentedString(usesEstimatedGoalsContribution)).append("\n");
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
    openapiFields.add("goals_contribution");
    openapiFields.add("uses_estimated_goals_contribution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MonthlyCashFlowProfileRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MonthlyCashFlowProfileRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MonthlyCashFlowProfileRequest is not found in the empty JSON string", MonthlyCashFlowProfileRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MonthlyCashFlowProfileRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MonthlyCashFlowProfileRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MonthlyCashFlowProfileRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MonthlyCashFlowProfileRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MonthlyCashFlowProfileRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MonthlyCashFlowProfileRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MonthlyCashFlowProfileRequest>() {
           @Override
           public void write(JsonWriter out, MonthlyCashFlowProfileRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MonthlyCashFlowProfileRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MonthlyCashFlowProfileRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MonthlyCashFlowProfileRequest
  * @throws IOException if the JSON string is invalid with respect to MonthlyCashFlowProfileRequest
  */
  public static MonthlyCashFlowProfileRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MonthlyCashFlowProfileRequest.class);
  }

 /**
  * Convert an instance of MonthlyCashFlowProfileRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

