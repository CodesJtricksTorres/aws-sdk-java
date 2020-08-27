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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFlowRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFlowRequestMarshaller {

    private static final MarshallingInfo<String> FLOWNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("flowName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> KMSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsArn").build();
    private static final MarshallingInfo<StructuredPojo> TRIGGERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("triggerConfig").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEFLOWCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFlowConfig").build();
    private static final MarshallingInfo<List> DESTINATIONFLOWCONFIGLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("destinationFlowConfigList").build();
    private static final MarshallingInfo<List> TASKS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tasks").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateFlowRequestMarshaller instance = new CreateFlowRequestMarshaller();

    public static CreateFlowRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFlowRequest createFlowRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFlowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFlowRequest.getFlowName(), FLOWNAME_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getKmsArn(), KMSARN_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getTriggerConfig(), TRIGGERCONFIG_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getSourceFlowConfig(), SOURCEFLOWCONFIG_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getDestinationFlowConfigList(), DESTINATIONFLOWCONFIGLIST_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getTasks(), TASKS_BINDING);
            protocolMarshaller.marshall(createFlowRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
