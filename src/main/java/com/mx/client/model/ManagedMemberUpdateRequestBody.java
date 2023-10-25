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
import com.mx.client.model.ManagedMemberUpdateRequest;
import java.io.IOException;
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
 * ManagedMemberUpdateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ManagedMemberUpdateRequestBody {
  public static final String SERIALIZED_NAME_MEMBER = "member";
  @SerializedName(SERIALIZED_NAME_MEMBER)
  private ManagedMemberUpdateRequest member;

  public ManagedMemberUpdateRequestBody() {
  }

  public ManagedMemberUpdateRequestBody member(ManagedMemberUpdateRequest member) {
    
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @javax.annotation.Nullable
  public ManagedMemberUpdateRequest getMember() {
    return member;
  }


  public void setMember(ManagedMemberUpdateRequest member) {
    this.member = member;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedMemberUpdateRequestBody managedMemberUpdateRequestBody = (ManagedMemberUpdateRequestBody) o;
    return Objects.equals(this.member, managedMemberUpdateRequestBody.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedMemberUpdateRequestBody {\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
    openapiFields.add("member");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManagedMemberUpdateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManagedMemberUpdateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManagedMemberUpdateRequestBody is not found in the empty JSON string", ManagedMemberUpdateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManagedMemberUpdateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManagedMemberUpdateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `member`
      if (jsonObj.get("member") != null && !jsonObj.get("member").isJsonNull()) {
        ManagedMemberUpdateRequest.validateJsonElement(jsonObj.get("member"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagedMemberUpdateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagedMemberUpdateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagedMemberUpdateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagedMemberUpdateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagedMemberUpdateRequestBody>() {
           @Override
           public void write(JsonWriter out, ManagedMemberUpdateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagedMemberUpdateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagedMemberUpdateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagedMemberUpdateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ManagedMemberUpdateRequestBody
  */
  public static ManagedMemberUpdateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagedMemberUpdateRequestBody.class);
  }

 /**
  * Convert an instance of ManagedMemberUpdateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

