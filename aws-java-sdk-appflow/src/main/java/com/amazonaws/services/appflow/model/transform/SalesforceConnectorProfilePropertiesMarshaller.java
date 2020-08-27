/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SalesforceConnectorProfilePropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SalesforceConnectorProfilePropertiesMarshaller {

    private static final MarshallingInfo<String> INSTANCEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceUrl").build();
    private static final MarshallingInfo<Boolean> ISSANDBOXENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isSandboxEnvironment").build();

    private static final SalesforceConnectorProfilePropertiesMarshaller instance = new SalesforceConnectorProfilePropertiesMarshaller();

    public static SalesforceConnectorProfilePropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SalesforceConnectorProfileProperties salesforceConnectorProfileProperties, ProtocolMarshaller protocolMarshaller) {

        if (salesforceConnectorProfileProperties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(salesforceConnectorProfileProperties.getInstanceUrl(), INSTANCEURL_BINDING);
            protocolMarshaller.marshall(salesforceConnectorProfileProperties.getIsSandboxEnvironment(), ISSANDBOXENVIRONMENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
