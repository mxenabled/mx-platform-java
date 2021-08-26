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

/**
 * ConnectWidgetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectWidgetRequest {
  public static final String SERIALIZED_NAME_COLOR_SCHEME = "color_scheme";
  @SerializedName(SERIALIZED_NAME_COLOR_SCHEME)
  private String colorScheme;

  public static final String SERIALIZED_NAME_CURRENT_INSTITUTION_CODE = "current_institution_code";
  @SerializedName(SERIALIZED_NAME_CURRENT_INSTITUTION_CODE)
  private String currentInstitutionCode;

  public static final String SERIALIZED_NAME_CURRENT_MEMBER_GUID = "current_member_guid";
  @SerializedName(SERIALIZED_NAME_CURRENT_MEMBER_GUID)
  private String currentMemberGuid;

  public static final String SERIALIZED_NAME_DISABLE_INSTITUTION_SEARCH = "disable_institution_search";
  @SerializedName(SERIALIZED_NAME_DISABLE_INSTITUTION_SEARCH)
  private Boolean disableInstitutionSearch;

  public static final String SERIALIZED_NAME_INCLUDE_TRANSACTIONS = "include_transactions";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TRANSACTIONS)
  private Boolean includeTransactions;

  public static final String SERIALIZED_NAME_IS_MOBILE_WEBVIEW = "is_mobile_webview";
  @SerializedName(SERIALIZED_NAME_IS_MOBILE_WEBVIEW)
  private Boolean isMobileWebview;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_UI_MESSAGE_VERSION = "ui_message_version";
  @SerializedName(SERIALIZED_NAME_UI_MESSAGE_VERSION)
  private Integer uiMessageVersion;

  public static final String SERIALIZED_NAME_UI_MESSAGE_WEBVIEW_URL_SCHEME = "ui_message_webview_url_scheme";
  @SerializedName(SERIALIZED_NAME_UI_MESSAGE_WEBVIEW_URL_SCHEME)
  private String uiMessageWebviewUrlScheme;

  public static final String SERIALIZED_NAME_UPDATE_CREDENTIALS = "update_credentials";
  @SerializedName(SERIALIZED_NAME_UPDATE_CREDENTIALS)
  private Boolean updateCredentials;

  public static final String SERIALIZED_NAME_WAIT_FOR_FULL_AGGREGATION = "wait_for_full_aggregation";
  @SerializedName(SERIALIZED_NAME_WAIT_FOR_FULL_AGGREGATION)
  private Boolean waitForFullAggregation;


  public ConnectWidgetRequest colorScheme(String colorScheme) {
    
    this.colorScheme = colorScheme;
    return this;
  }

   /**
   * Get colorScheme
   * @return colorScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "light", value = "")

  public String getColorScheme() {
    return colorScheme;
  }


  public void setColorScheme(String colorScheme) {
    this.colorScheme = colorScheme;
  }


  public ConnectWidgetRequest currentInstitutionCode(String currentInstitutionCode) {
    
    this.currentInstitutionCode = currentInstitutionCode;
    return this;
  }

   /**
   * Get currentInstitutionCode
   * @return currentInstitutionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "chase", value = "")

  public String getCurrentInstitutionCode() {
    return currentInstitutionCode;
  }


  public void setCurrentInstitutionCode(String currentInstitutionCode) {
    this.currentInstitutionCode = currentInstitutionCode;
  }


  public ConnectWidgetRequest currentMemberGuid(String currentMemberGuid) {
    
    this.currentMemberGuid = currentMemberGuid;
    return this;
  }

   /**
   * Get currentMemberGuid
   * @return currentMemberGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b", value = "")

  public String getCurrentMemberGuid() {
    return currentMemberGuid;
  }


  public void setCurrentMemberGuid(String currentMemberGuid) {
    this.currentMemberGuid = currentMemberGuid;
  }


  public ConnectWidgetRequest disableInstitutionSearch(Boolean disableInstitutionSearch) {
    
    this.disableInstitutionSearch = disableInstitutionSearch;
    return this;
  }

   /**
   * Get disableInstitutionSearch
   * @return disableInstitutionSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDisableInstitutionSearch() {
    return disableInstitutionSearch;
  }


  public void setDisableInstitutionSearch(Boolean disableInstitutionSearch) {
    this.disableInstitutionSearch = disableInstitutionSearch;
  }


  public ConnectWidgetRequest includeTransactions(Boolean includeTransactions) {
    
    this.includeTransactions = includeTransactions;
    return this;
  }

   /**
   * Get includeTransactions
   * @return includeTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIncludeTransactions() {
    return includeTransactions;
  }


  public void setIncludeTransactions(Boolean includeTransactions) {
    this.includeTransactions = includeTransactions;
  }


  public ConnectWidgetRequest isMobileWebview(Boolean isMobileWebview) {
    
    this.isMobileWebview = isMobileWebview;
    return this;
  }

   /**
   * Get isMobileWebview
   * @return isMobileWebview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsMobileWebview() {
    return isMobileWebview;
  }


  public void setIsMobileWebview(Boolean isMobileWebview) {
    this.isMobileWebview = isMobileWebview;
  }


  public ConnectWidgetRequest mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aggregation", value = "")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public ConnectWidgetRequest uiMessageVersion(Integer uiMessageVersion) {
    
    this.uiMessageVersion = uiMessageVersion;
    return this;
  }

   /**
   * Get uiMessageVersion
   * @return uiMessageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getUiMessageVersion() {
    return uiMessageVersion;
  }


  public void setUiMessageVersion(Integer uiMessageVersion) {
    this.uiMessageVersion = uiMessageVersion;
  }


  public ConnectWidgetRequest uiMessageWebviewUrlScheme(String uiMessageWebviewUrlScheme) {
    
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


  public ConnectWidgetRequest updateCredentials(Boolean updateCredentials) {
    
    this.updateCredentials = updateCredentials;
    return this;
  }

   /**
   * Get updateCredentials
   * @return updateCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getUpdateCredentials() {
    return updateCredentials;
  }


  public void setUpdateCredentials(Boolean updateCredentials) {
    this.updateCredentials = updateCredentials;
  }


  public ConnectWidgetRequest waitForFullAggregation(Boolean waitForFullAggregation) {
    
    this.waitForFullAggregation = waitForFullAggregation;
    return this;
  }

   /**
   * Get waitForFullAggregation
   * @return waitForFullAggregation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getWaitForFullAggregation() {
    return waitForFullAggregation;
  }


  public void setWaitForFullAggregation(Boolean waitForFullAggregation) {
    this.waitForFullAggregation = waitForFullAggregation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectWidgetRequest connectWidgetRequest = (ConnectWidgetRequest) o;
    return Objects.equals(this.colorScheme, connectWidgetRequest.colorScheme) &&
        Objects.equals(this.currentInstitutionCode, connectWidgetRequest.currentInstitutionCode) &&
        Objects.equals(this.currentMemberGuid, connectWidgetRequest.currentMemberGuid) &&
        Objects.equals(this.disableInstitutionSearch, connectWidgetRequest.disableInstitutionSearch) &&
        Objects.equals(this.includeTransactions, connectWidgetRequest.includeTransactions) &&
        Objects.equals(this.isMobileWebview, connectWidgetRequest.isMobileWebview) &&
        Objects.equals(this.mode, connectWidgetRequest.mode) &&
        Objects.equals(this.uiMessageVersion, connectWidgetRequest.uiMessageVersion) &&
        Objects.equals(this.uiMessageWebviewUrlScheme, connectWidgetRequest.uiMessageWebviewUrlScheme) &&
        Objects.equals(this.updateCredentials, connectWidgetRequest.updateCredentials) &&
        Objects.equals(this.waitForFullAggregation, connectWidgetRequest.waitForFullAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorScheme, currentInstitutionCode, currentMemberGuid, disableInstitutionSearch, includeTransactions, isMobileWebview, mode, uiMessageVersion, uiMessageWebviewUrlScheme, updateCredentials, waitForFullAggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectWidgetRequest {\n");
    sb.append("    colorScheme: ").append(toIndentedString(colorScheme)).append("\n");
    sb.append("    currentInstitutionCode: ").append(toIndentedString(currentInstitutionCode)).append("\n");
    sb.append("    currentMemberGuid: ").append(toIndentedString(currentMemberGuid)).append("\n");
    sb.append("    disableInstitutionSearch: ").append(toIndentedString(disableInstitutionSearch)).append("\n");
    sb.append("    includeTransactions: ").append(toIndentedString(includeTransactions)).append("\n");
    sb.append("    isMobileWebview: ").append(toIndentedString(isMobileWebview)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    uiMessageVersion: ").append(toIndentedString(uiMessageVersion)).append("\n");
    sb.append("    uiMessageWebviewUrlScheme: ").append(toIndentedString(uiMessageWebviewUrlScheme)).append("\n");
    sb.append("    updateCredentials: ").append(toIndentedString(updateCredentials)).append("\n");
    sb.append("    waitForFullAggregation: ").append(toIndentedString(waitForFullAggregation)).append("\n");
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

