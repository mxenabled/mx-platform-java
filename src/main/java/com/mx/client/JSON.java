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


package com.mx.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountNumberResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountNumbersResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountOwnerResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountOwnersResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AccountsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AuthorizationCodeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AuthorizationCodeRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AuthorizationCodeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.AuthorizationCodeResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoriesResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CategoryUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ChallengeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ChallengesResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ConnectWidgetRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ConnectWidgetRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ConnectWidgetResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ConnectWidgetResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CredentialRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CredentialResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.CredentialsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.EnhanceTransactionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.EnhanceTransactionsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.EnhanceTransactionsRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.EnhanceTransactionsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.HoldingResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.HoldingResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.HoldingsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ImageOptionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.InstitutionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.InstitutionResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.InstitutionsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedAccountCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedAccountCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedAccountUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedAccountUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedMemberCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedMemberCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedMemberUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedMemberUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedTransactionCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedTransactionCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedTransactionUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.ManagedTransactionUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberResumeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberResumeRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberStatusResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberStatusResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MemberUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MembersResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MerchantLocationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MerchantLocationResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MerchantResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MerchantResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.MerchantsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.OAuthWindowResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.OAuthWindowResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.OptionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.PaginationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.PaymentProcessorAuthorizationCodeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.PaymentProcessorAuthorizationCodeRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.PaymentProcessorAuthorizationCodeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.PaymentProcessorAuthorizationCodeResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanAccountResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanAccountsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanIterationItemCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanIterationItemResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanIterationItemsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanIterationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanIterationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlanResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.SpendingPlansResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.StatementResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.StatementResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.StatementsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaggingsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TagsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaxDocumentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaxDocumentResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TaxDocumentsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRuleUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionRulesResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.TransactionsResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserCreateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UserUpdateRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.UsersResponseBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.WidgetRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.WidgetRequestBody.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.WidgetResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.mx.client.model.WidgetResponseBody.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
