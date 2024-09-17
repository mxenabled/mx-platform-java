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
import com.mx.client.model.MicrodepositRequestBody;
import com.mx.client.model.MicrodepositResponseBody;
import com.mx.client.model.MicrodepositVerifyRequestBody;
import com.mx.client.model.MicrodepositsResponseBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MicrodepositsApi
 */
@Disabled
public class MicrodepositsApiTest {

    private final MicrodepositsApi api = new MicrodepositsApi();

    /**
     * Verify a Microdeposit
     *
     * Use this endpoint to verify the amounts deposited into the account during a microdeposit verification. The verification has not successfully completed until the &#x60;status&#x60; is &#x60;VERIFIED&#x60;. Poll the &#x60;/users/{user_guid}/micro_deposits/{micro_deposit_guid}&#x60; (read microdeposit) endpoint until you see this status or an error state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void microDepositsMicrodepositGuidVerifyPutTest() throws ApiException {
        String microdepositGuid = null;
        MicrodepositVerifyRequestBody microdepositVerifyRequestBody = null;
        MicrodepositResponseBody response = api.microDepositsMicrodepositGuidVerifyPut(microdepositGuid, microdepositVerifyRequestBody);
        // TODO: test validations
    }

    /**
     * List all microdeposits for a user
     *
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUserGuidMicroDepositsGetTest() throws ApiException {
        String userGuid = null;
        MicrodepositsResponseBody response = api.usersUserGuidMicroDepositsGet(userGuid);
        // TODO: test validations
    }

    /**
     * Delete a microdeposit
     *
     * Use this endpoint to delete the specified microdeposit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUserGuidMicroDepositsMicroDepositGuidDeleteTest() throws ApiException {
        String microDepositGuid = null;
        String userGuid = null;
        api.usersUserGuidMicroDepositsMicroDepositGuidDelete(microDepositGuid, userGuid);
        // TODO: test validations
    }

    /**
     * Read a microdeposit for a user
     *
     * Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID. &lt;br&gt;&lt;/br&gt; Webhooks for microdeposit status changes are triggered when a status changes. The actual status of the microdeposit guid updates every minute. You may force a status update by calling the read microdeposit endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUserGuidMicroDepositsMicroDepositGuidGetTest() throws ApiException {
        String userGuid = null;
        String microDepositGuid = null;
        MicrodepositResponseBody response = api.usersUserGuidMicroDepositsMicroDepositGuidGet(userGuid, microDepositGuid);
        // TODO: test validations
    }

    /**
     * Create a microdeposit
     *
     * Use this endpoint to create a microdeposit. The response will include the new microdeposit record with a status of INITIATED.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersUserGuidMicroDepositsPostTest() throws ApiException {
        String userGuid = null;
        MicrodepositRequestBody microdepositRequestBody = null;
        MicrodepositResponseBody response = api.usersUserGuidMicroDepositsPost(userGuid, microdepositRequestBody);
        // TODO: test validations
    }

}
