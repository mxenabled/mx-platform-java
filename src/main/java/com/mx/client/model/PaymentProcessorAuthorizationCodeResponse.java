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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaymentProcessorAuthorizationCodeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentProcessorAuthorizationCodeResponse {
  public static final String SERIALIZED_NAME_AUTHORIZATION_CODE = "authorization_code";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_CODE)
  private String authorizationCode;

  public PaymentProcessorAuthorizationCodeResponse() { 
  }

  public PaymentProcessorAuthorizationCodeResponse authorizationCode(String authorizationCode) {
    
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * Get authorizationCode
   * @return authorizationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sN3Ffd1nJg_iwEMuxcEo2Z5taC0RvMilfvYKsnM2XGM", value = "")

  public String getAuthorizationCode() {
    return authorizationCode;
  }


  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessorAuthorizationCodeResponse paymentProcessorAuthorizationCodeResponse = (PaymentProcessorAuthorizationCodeResponse) o;
    return Objects.equals(this.authorizationCode, paymentProcessorAuthorizationCodeResponse.authorizationCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationCode);
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
    sb.append("class PaymentProcessorAuthorizationCodeResponse {\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
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

