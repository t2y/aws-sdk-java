/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DeleteCustomActionTypeRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomActionTypeRequestMarshaller implements Marshaller<Request<DeleteCustomActionTypeRequest>, DeleteCustomActionTypeRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteCustomActionTypeRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteCustomActionTypeRequest> marshall(DeleteCustomActionTypeRequest deleteCustomActionTypeRequest) {

        if (deleteCustomActionTypeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteCustomActionTypeRequest> request = new DefaultRequest<DeleteCustomActionTypeRequest>(deleteCustomActionTypeRequest, "AWSCodePipeline");
        request.addHeader("X-Amz-Target", "CodePipeline_20150709.DeleteCustomActionType");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (deleteCustomActionTypeRequest.getCategory() != null) {
                jsonGenerator.writeFieldName("category").writeValue(deleteCustomActionTypeRequest.getCategory());
            }
            if (deleteCustomActionTypeRequest.getProvider() != null) {
                jsonGenerator.writeFieldName("provider").writeValue(deleteCustomActionTypeRequest.getProvider());
            }
            if (deleteCustomActionTypeRequest.getVersion() != null) {
                jsonGenerator.writeFieldName("version").writeValue(deleteCustomActionTypeRequest.getVersion());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
