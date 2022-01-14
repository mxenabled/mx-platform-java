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
import com.mx.client.model.MemberCreateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MemberCreateRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberCreateRequestBody {
  public static final String SERIALIZED_NAME_MEMBER = "member";
  @SerializedName(SERIALIZED_NAME_MEMBER)
  private MemberCreateRequest member;

  public static final String SERIALIZED_NAME_REFERRAL_SOURCE = "referral_source";
  @SerializedName(SERIALIZED_NAME_REFERRAL_SOURCE)
  private String referralSource;

  public static final String SERIALIZED_NAME_UI_MESSAGE_WEBVIEW_URL_SCHEME = "ui_message_webview_url_scheme";
  @SerializedName(SERIALIZED_NAME_UI_MESSAGE_WEBVIEW_URL_SCHEME)
  private String uiMessageWebviewUrlScheme;

  public MemberCreateRequestBody() { 
  }

  public MemberCreateRequestBody member(MemberCreateRequest member) {
    
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MemberCreateRequest getMember() {
    return member;
  }


  public void setMember(MemberCreateRequest member) {
    this.member = member;
  }


  public MemberCreateRequestBody referralSource(String referralSource) {
    
    this.referralSource = referralSource;
    return this;
  }

   /**
   * Get referralSource
   * @return referralSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APP", value = "")

  public String getReferralSource() {
    return referralSource;
  }


  public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
  }


  public MemberCreateRequestBody uiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
    return this;
  }

   /**
   * Get uiMessageWebviewUrlScheme
   * @return uiMessageWebviewUrlScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mx", value = "")

  public String getUiMessageWebviewUrlScheme() {
    return uiMessageWebviewUrlScheme;
  }


  public void setUiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    this.uiMessageWebviewUrlScheme = uiMessageWebviewUrlScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberCreateRequestBody memberCreateRequestBody = (MemberCreateRequestBody) o;
    return Objects.equals(this.member, memberCreateRequestBody.member) &&
        Objects.equals(this.referralSource, memberCreateRequestBody.referralSource) &&
        Objects.equals(this.uiMessageWebviewUrlScheme, memberCreateRequestBody.uiMessageWebviewUrlScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(member, referralSource, uiMessageWebviewUrlScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberCreateRequestBody {\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    referralSource: ").append(toIndentedString(referralSource)).append("\n");
    sb.append("    uiMessageWebviewUrlScheme: ").append(toIndentedString(uiMessageWebviewUrlScheme)).append("\n");
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

