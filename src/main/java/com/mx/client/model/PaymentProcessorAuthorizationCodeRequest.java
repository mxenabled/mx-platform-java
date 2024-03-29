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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PaymentProcessorAuthorizationCodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentProcessorAuthorizationCodeRequest {
  public static final String SERIALIZED_NAME_ACCOUNT_GUID = "account_guid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GUID)
  private String accountGuid;

  public static final String SERIALIZED_NAME_MEMBER_GUID = "member_guid";
  @SerializedName(SERIALIZED_NAME_MEMBER_GUID)
  private String memberGuid;

  public static final String SERIALIZED_NAME_USER_GUID = "user_guid";
  @SerializedName(SERIALIZED_NAME_USER_GUID)
  private String userGuid;

  public PaymentProcessorAuthorizationCodeRequest() {
  }

  public PaymentProcessorAuthorizationCodeRequest accountGuid(String accountGuid) {
    
    this.accountGuid = accountGuid;
    return this;
  }

   /**
   * Get accountGuid
   * @return accountGuid
  **/
  @javax.annotation.Nullable
  public String getAccountGuid() {
    return accountGuid;
  }


  public void setAccountGuid(String accountGuid) {
    this.accountGuid = accountGuid;
  }


  public PaymentProcessorAuthorizationCodeRequest memberGuid(String memberGuid) {
    
    this.memberGuid = memberGuid;
    return this;
  }

   /**
   * Get memberGuid
   * @return memberGuid
  **/
  @javax.annotation.Nullable
  public String getMemberGuid() {
    return memberGuid;
  }


  public void setMemberGuid(String memberGuid) {
    this.memberGuid = memberGuid;
  }


  public PaymentProcessorAuthorizationCodeRequest userGuid(String userGuid) {
    
    this.userGuid = userGuid;
    return this;
  }

   /**
   * Get userGuid
   * @return userGuid
  **/
  @javax.annotation.Nullable
  public String getUserGuid() {
    return userGuid;
  }


  public void setUserGuid(String userGuid) {
    this.userGuid = userGuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessorAuthorizationCodeRequest paymentProcessorAuthorizationCodeRequest = (PaymentProcessorAuthorizationCodeRequest) o;
    return Objects.equals(this.accountGuid, paymentProcessorAuthorizationCodeRequest.accountGuid) &&
        Objects.equals(this.memberGuid, paymentProcessorAuthorizationCodeRequest.memberGuid) &&
        Objects.equals(this.userGuid, paymentProcessorAuthorizationCodeRequest.userGuid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGuid, memberGuid, userGuid);
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
    sb.append("class PaymentProcessorAuthorizationCodeRequest {\n");
    sb.append("    accountGuid: ").append(toIndentedString(accountGuid)).append("\n");
    sb.append("    memberGuid: ").append(toIndentedString(memberGuid)).append("\n");
    sb.append("    userGuid: ").append(toIndentedString(userGuid)).append("\n");
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
    openapiFields.add("account_guid");
    openapiFields.add("member_guid");
    openapiFields.add("user_guid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentProcessorAuthorizationCodeRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentProcessorAuthorizationCodeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentProcessorAuthorizationCodeRequest is not found in the empty JSON string", PaymentProcessorAuthorizationCodeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentProcessorAuthorizationCodeRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentProcessorAuthorizationCodeRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_guid") != null && !jsonObj.get("account_guid").isJsonNull()) && !jsonObj.get("account_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_guid").toString()));
      }
      if ((jsonObj.get("member_guid") != null && !jsonObj.get("member_guid").isJsonNull()) && !jsonObj.get("member_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_guid").toString()));
      }
      if ((jsonObj.get("user_guid") != null && !jsonObj.get("user_guid").isJsonNull()) && !jsonObj.get("user_guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_guid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentProcessorAuthorizationCodeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentProcessorAuthorizationCodeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentProcessorAuthorizationCodeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentProcessorAuthorizationCodeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentProcessorAuthorizationCodeRequest>() {
           @Override
           public void write(JsonWriter out, PaymentProcessorAuthorizationCodeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentProcessorAuthorizationCodeRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentProcessorAuthorizationCodeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentProcessorAuthorizationCodeRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentProcessorAuthorizationCodeRequest
  */
  public static PaymentProcessorAuthorizationCodeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentProcessorAuthorizationCodeRequest.class);
  }

 /**
  * Convert an instance of PaymentProcessorAuthorizationCodeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

