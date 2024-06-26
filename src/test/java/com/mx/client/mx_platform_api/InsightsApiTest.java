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


package com.mx.client.mx_platform_api;

import com.mx.client.ApiException;
import com.mx.client.model.AccountsResponseBody;
import com.mx.client.model.CategoriesResponseBody;
import com.mx.client.model.InsightResponse;
import com.mx.client.model.InsightResponseBody;
import com.mx.client.model.InsightUpdateRequest;
import com.mx.client.model.InsightsResponseBody;
import com.mx.client.model.MerchantsResponseBody;
import com.mx.client.model.ScheduledPaymentsResponseBody;
import com.mx.client.model.TransactionsResponseBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InsightsApi
 */
@Disabled
public class InsightsApiTest {

    private final InsightsApi api = new InsightsApi();

    /**
     * List all accounts associated with an insight.
     *
     * Use this endpoint to list all the accounts associated with the insight.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAccountsInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        AccountsResponseBody response = api.listAccountsInsight(userGuid, insightGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List all categories associated with an insight.
     *
     * Use this endpoint to list all the categories associated with the insight.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCategoriesInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        CategoriesResponseBody response = api.listCategoriesInsight(userGuid, insightGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List insights by account
     *
     * Use this endpoint to list all insights associated with a specified account GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInsightsByAccountTest() throws ApiException {
        String accountGuid = null;
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        InsightsResponseBody response = api.listInsightsByAccount(accountGuid, userGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List all insights for a user.
     *
     * Use this endpoint to list all the insights associated with the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInsightsUserTest() throws ApiException {
        String userGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        InsightsResponseBody response = api.listInsightsUser(userGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List all merchants associated with an insight.
     *
     * Use this endpoint to list all the merchants associated with the insight.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMerchantsInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        MerchantsResponseBody response = api.listMerchantsInsight(userGuid, insightGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List all scheduled payments associated with an insight
     *
     * Use this endpoint to list all the scheduled payments associated with the insight.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listScheduledPaymentsInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        ScheduledPaymentsResponseBody response = api.listScheduledPaymentsInsight(userGuid, insightGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * List all transactions associated with an insight.
     *
     * Use this endpoint to list all the transactions associated with the insight.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTransactionsInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        Integer page = null;
        Integer recordsPerPage = null;
        TransactionsResponseBody response = api.listTransactionsInsight(userGuid, insightGuid, page, recordsPerPage);
        // TODO: test validations
    }

    /**
     * Read a specific insight.
     *
     * Use this endpoint to read the attributes of a specific insight according to its unique GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readInsightsUserTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        InsightResponseBody response = api.readInsightsUser(userGuid, insightGuid);
        // TODO: test validations
    }

    /**
     * Update insight
     *
     * Use this endpoint to update the attributes of a particular insight according to its unique GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInsightTest() throws ApiException {
        String userGuid = null;
        String insightGuid = null;
        InsightUpdateRequest insightUpdateRequest = null;
        InsightResponse response = api.updateInsight(userGuid, insightGuid, insightUpdateRequest);
        // TODO: test validations
    }

}
