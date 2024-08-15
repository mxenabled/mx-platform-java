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
import com.mx.client.model.RepositionRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * RepositionRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RepositionRequestBody {
  public static final String SERIALIZED_NAME_GOALS = "goals";
  @SerializedName(SERIALIZED_NAME_GOALS)
  private List<RepositionRequest> goals;

  public RepositionRequestBody() {
  }

  public RepositionRequestBody goals(List<RepositionRequest> goals) {
    
    this.goals = goals;
    return this;
  }

  public RepositionRequestBody addGoalsItem(RepositionRequest goalsItem) {
    if (this.goals == null) {
      this.goals = new ArrayList<>();
    }
    this.goals.add(goalsItem);
    return this;
  }

   /**
   * Get goals
   * @return goals
  **/
  @javax.annotation.Nullable
  public List<RepositionRequest> getGoals() {
    return goals;
  }


  public void setGoals(List<RepositionRequest> goals) {
    this.goals = goals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositionRequestBody repositionRequestBody = (RepositionRequestBody) o;
    return Objects.equals(this.goals, repositionRequestBody.goals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositionRequestBody {\n");
    sb.append("    goals: ").append(toIndentedString(goals)).append("\n");
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
    openapiFields.add("goals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RepositionRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RepositionRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RepositionRequestBody is not found in the empty JSON string", RepositionRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RepositionRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RepositionRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("goals") != null && !jsonObj.get("goals").isJsonNull()) {
        JsonArray jsonArraygoals = jsonObj.getAsJsonArray("goals");
        if (jsonArraygoals != null) {
          // ensure the json data is an array
          if (!jsonObj.get("goals").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `goals` to be an array in the JSON string but got `%s`", jsonObj.get("goals").toString()));
          }

          // validate the optional field `goals` (array)
          for (int i = 0; i < jsonArraygoals.size(); i++) {
            RepositionRequest.validateJsonElement(jsonArraygoals.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RepositionRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RepositionRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RepositionRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RepositionRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RepositionRequestBody>() {
           @Override
           public void write(JsonWriter out, RepositionRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RepositionRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RepositionRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RepositionRequestBody
  * @throws IOException if the JSON string is invalid with respect to RepositionRequestBody
  */
  public static RepositionRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RepositionRequestBody.class);
  }

 /**
  * Convert an instance of RepositionRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

