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
 * InstitutionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstitutionResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_FORGOT_PASSWORD_URL = "forgot_password_url";
  @SerializedName(SERIALIZED_NAME_FORGOT_PASSWORD_URL)
  private String forgotPasswordUrl;

  public static final String SERIALIZED_NAME_FORGOT_USERNAME_URL = "forgot_username_url";
  @SerializedName(SERIALIZED_NAME_FORGOT_USERNAME_URL)
  private String forgotUsernameUrl;

  public static final String SERIALIZED_NAME_INSTRUCTIONAL_TEXT = "instructional_text";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONAL_TEXT)
  private String instructionalText;

  public static final String SERIALIZED_NAME_MEDIUM_LOGO_URL = "medium_logo_url";
  @SerializedName(SERIALIZED_NAME_MEDIUM_LOGO_URL)
  private String mediumLogoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SMALL_LOGO_URL = "small_logo_url";
  @SerializedName(SERIALIZED_NAME_SMALL_LOGO_URL)
  private String smallLogoUrl;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_IDENTIFICATION = "supports_account_identification";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_IDENTIFICATION)
  private Boolean supportsAccountIdentification;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_STATEMENT = "supports_account_statement";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_STATEMENT)
  private Boolean supportsAccountStatement;

  public static final String SERIALIZED_NAME_SUPPORTS_ACCOUNT_VERIFICATION = "supports_account_verification";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_ACCOUNT_VERIFICATION)
  private Boolean supportsAccountVerification;

  public static final String SERIALIZED_NAME_SUPPORTS_OAUTH = "supports_oauth";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_OAUTH)
  private Boolean supportsOauth;

  public static final String SERIALIZED_NAME_SUPPORTS_TRANSACTION_HISTORY = "supports_transaction_history";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_TRANSACTION_HISTORY)
  private Boolean supportsTransactionHistory;

  public static final String SERIALIZED_NAME_TROUBLE_SIGNING_IN_URL = "trouble_signing_in_url";
  @SerializedName(SERIALIZED_NAME_TROUBLE_SIGNING_IN_URL)
  private String troubleSigningInUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public InstitutionResponse() {
  }

  public InstitutionResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InstitutionResponse forgotPasswordUrl(String forgotPasswordUrl) {
    
    this.forgotPasswordUrl = forgotPasswordUrl;
    return this;
  }

   /**
   * Get forgotPasswordUrl
   * @return forgotPasswordUrl
  **/
  @javax.annotation.Nullable
  public String getForgotPasswordUrl() {
    return forgotPasswordUrl;
  }


  public void setForgotPasswordUrl(String forgotPasswordUrl) {
    this.forgotPasswordUrl = forgotPasswordUrl;
  }


  public InstitutionResponse forgotUsernameUrl(String forgotUsernameUrl) {
    
    this.forgotUsernameUrl = forgotUsernameUrl;
    return this;
  }

   /**
   * Get forgotUsernameUrl
   * @return forgotUsernameUrl
  **/
  @javax.annotation.Nullable
  public String getForgotUsernameUrl() {
    return forgotUsernameUrl;
  }


  public void setForgotUsernameUrl(String forgotUsernameUrl) {
    this.forgotUsernameUrl = forgotUsernameUrl;
  }


  public InstitutionResponse instructionalText(String instructionalText) {
    
    this.instructionalText = instructionalText;
    return this;
  }

   /**
   * Get instructionalText
   * @return instructionalText
  **/
  @javax.annotation.Nullable
  public String getInstructionalText() {
    return instructionalText;
  }


  public void setInstructionalText(String instructionalText) {
    this.instructionalText = instructionalText;
  }


  public InstitutionResponse mediumLogoUrl(String mediumLogoUrl) {
    
    this.mediumLogoUrl = mediumLogoUrl;
    return this;
  }

   /**
   * Get mediumLogoUrl
   * @return mediumLogoUrl
  **/
  @javax.annotation.Nullable
  public String getMediumLogoUrl() {
    return mediumLogoUrl;
  }


  public void setMediumLogoUrl(String mediumLogoUrl) {
    this.mediumLogoUrl = mediumLogoUrl;
  }


  public InstitutionResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InstitutionResponse smallLogoUrl(String smallLogoUrl) {
    
    this.smallLogoUrl = smallLogoUrl;
    return this;
  }

   /**
   * Get smallLogoUrl
   * @return smallLogoUrl
  **/
  @javax.annotation.Nullable
  public String getSmallLogoUrl() {
    return smallLogoUrl;
  }


  public void setSmallLogoUrl(String smallLogoUrl) {
    this.smallLogoUrl = smallLogoUrl;
  }


  public InstitutionResponse supportsAccountIdentification(Boolean supportsAccountIdentification) {
    
    this.supportsAccountIdentification = supportsAccountIdentification;
    return this;
  }

   /**
   * Get supportsAccountIdentification
   * @return supportsAccountIdentification
  **/
  @javax.annotation.Nullable
  public Boolean getSupportsAccountIdentification() {
    return supportsAccountIdentification;
  }


  public void setSupportsAccountIdentification(Boolean supportsAccountIdentification) {
    this.supportsAccountIdentification = supportsAccountIdentification;
  }


  public InstitutionResponse supportsAccountStatement(Boolean supportsAccountStatement) {
    
    this.supportsAccountStatement = supportsAccountStatement;
    return this;
  }

   /**
   * Get supportsAccountStatement
   * @return supportsAccountStatement
  **/
  @javax.annotation.Nullable
  public Boolean getSupportsAccountStatement() {
    return supportsAccountStatement;
  }


  public void setSupportsAccountStatement(Boolean supportsAccountStatement) {
    this.supportsAccountStatement = supportsAccountStatement;
  }


  public InstitutionResponse supportsAccountVerification(Boolean supportsAccountVerification) {
    
    this.supportsAccountVerification = supportsAccountVerification;
    return this;
  }

   /**
   * Get supportsAccountVerification
   * @return supportsAccountVerification
  **/
  @javax.annotation.Nullable
  public Boolean getSupportsAccountVerification() {
    return supportsAccountVerification;
  }


  public void setSupportsAccountVerification(Boolean supportsAccountVerification) {
    this.supportsAccountVerification = supportsAccountVerification;
  }


  public InstitutionResponse supportsOauth(Boolean supportsOauth) {
    
    this.supportsOauth = supportsOauth;
    return this;
  }

   /**
   * Get supportsOauth
   * @return supportsOauth
  **/
  @javax.annotation.Nullable
  public Boolean getSupportsOauth() {
    return supportsOauth;
  }


  public void setSupportsOauth(Boolean supportsOauth) {
    this.supportsOauth = supportsOauth;
  }


  public InstitutionResponse supportsTransactionHistory(Boolean supportsTransactionHistory) {
    
    this.supportsTransactionHistory = supportsTransactionHistory;
    return this;
  }

   /**
   * Get supportsTransactionHistory
   * @return supportsTransactionHistory
  **/
  @javax.annotation.Nullable
  public Boolean getSupportsTransactionHistory() {
    return supportsTransactionHistory;
  }


  public void setSupportsTransactionHistory(Boolean supportsTransactionHistory) {
    this.supportsTransactionHistory = supportsTransactionHistory;
  }


  public InstitutionResponse troubleSigningInUrl(String troubleSigningInUrl) {
    
    this.troubleSigningInUrl = troubleSigningInUrl;
    return this;
  }

   /**
   * Get troubleSigningInUrl
   * @return troubleSigningInUrl
  **/
  @javax.annotation.Nullable
  public String getTroubleSigningInUrl() {
    return troubleSigningInUrl;
  }


  public void setTroubleSigningInUrl(String troubleSigningInUrl) {
    this.troubleSigningInUrl = troubleSigningInUrl;
  }


  public InstitutionResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionResponse institutionResponse = (InstitutionResponse) o;
    return Objects.equals(this.code, institutionResponse.code) &&
        Objects.equals(this.forgotPasswordUrl, institutionResponse.forgotPasswordUrl) &&
        Objects.equals(this.forgotUsernameUrl, institutionResponse.forgotUsernameUrl) &&
        Objects.equals(this.instructionalText, institutionResponse.instructionalText) &&
        Objects.equals(this.mediumLogoUrl, institutionResponse.mediumLogoUrl) &&
        Objects.equals(this.name, institutionResponse.name) &&
        Objects.equals(this.smallLogoUrl, institutionResponse.smallLogoUrl) &&
        Objects.equals(this.supportsAccountIdentification, institutionResponse.supportsAccountIdentification) &&
        Objects.equals(this.supportsAccountStatement, institutionResponse.supportsAccountStatement) &&
        Objects.equals(this.supportsAccountVerification, institutionResponse.supportsAccountVerification) &&
        Objects.equals(this.supportsOauth, institutionResponse.supportsOauth) &&
        Objects.equals(this.supportsTransactionHistory, institutionResponse.supportsTransactionHistory) &&
        Objects.equals(this.troubleSigningInUrl, institutionResponse.troubleSigningInUrl) &&
        Objects.equals(this.url, institutionResponse.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, forgotPasswordUrl, forgotUsernameUrl, instructionalText, mediumLogoUrl, name, smallLogoUrl, supportsAccountIdentification, supportsAccountStatement, supportsAccountVerification, supportsOauth, supportsTransactionHistory, troubleSigningInUrl, url);
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
    sb.append("class InstitutionResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    forgotPasswordUrl: ").append(toIndentedString(forgotPasswordUrl)).append("\n");
    sb.append("    forgotUsernameUrl: ").append(toIndentedString(forgotUsernameUrl)).append("\n");
    sb.append("    instructionalText: ").append(toIndentedString(instructionalText)).append("\n");
    sb.append("    mediumLogoUrl: ").append(toIndentedString(mediumLogoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    smallLogoUrl: ").append(toIndentedString(smallLogoUrl)).append("\n");
    sb.append("    supportsAccountIdentification: ").append(toIndentedString(supportsAccountIdentification)).append("\n");
    sb.append("    supportsAccountStatement: ").append(toIndentedString(supportsAccountStatement)).append("\n");
    sb.append("    supportsAccountVerification: ").append(toIndentedString(supportsAccountVerification)).append("\n");
    sb.append("    supportsOauth: ").append(toIndentedString(supportsOauth)).append("\n");
    sb.append("    supportsTransactionHistory: ").append(toIndentedString(supportsTransactionHistory)).append("\n");
    sb.append("    troubleSigningInUrl: ").append(toIndentedString(troubleSigningInUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("forgot_password_url");
    openapiFields.add("forgot_username_url");
    openapiFields.add("instructional_text");
    openapiFields.add("medium_logo_url");
    openapiFields.add("name");
    openapiFields.add("small_logo_url");
    openapiFields.add("supports_account_identification");
    openapiFields.add("supports_account_statement");
    openapiFields.add("supports_account_verification");
    openapiFields.add("supports_oauth");
    openapiFields.add("supports_transaction_history");
    openapiFields.add("trouble_signing_in_url");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstitutionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstitutionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstitutionResponse is not found in the empty JSON string", InstitutionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InstitutionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstitutionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("forgot_password_url") != null && !jsonObj.get("forgot_password_url").isJsonNull()) && !jsonObj.get("forgot_password_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forgot_password_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forgot_password_url").toString()));
      }
      if ((jsonObj.get("forgot_username_url") != null && !jsonObj.get("forgot_username_url").isJsonNull()) && !jsonObj.get("forgot_username_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forgot_username_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forgot_username_url").toString()));
      }
      if ((jsonObj.get("instructional_text") != null && !jsonObj.get("instructional_text").isJsonNull()) && !jsonObj.get("instructional_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instructional_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instructional_text").toString()));
      }
      if ((jsonObj.get("medium_logo_url") != null && !jsonObj.get("medium_logo_url").isJsonNull()) && !jsonObj.get("medium_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `medium_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("medium_logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("small_logo_url") != null && !jsonObj.get("small_logo_url").isJsonNull()) && !jsonObj.get("small_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `small_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("small_logo_url").toString()));
      }
      if ((jsonObj.get("trouble_signing_in_url") != null && !jsonObj.get("trouble_signing_in_url").isJsonNull()) && !jsonObj.get("trouble_signing_in_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trouble_signing_in_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trouble_signing_in_url").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstitutionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstitutionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstitutionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstitutionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InstitutionResponse>() {
           @Override
           public void write(JsonWriter out, InstitutionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstitutionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstitutionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstitutionResponse
  * @throws IOException if the JSON string is invalid with respect to InstitutionResponse
  */
  public static InstitutionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstitutionResponse.class);
  }

 /**
  * Convert an instance of InstitutionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

