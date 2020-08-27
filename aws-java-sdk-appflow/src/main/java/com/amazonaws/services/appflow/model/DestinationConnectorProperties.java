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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This stores the information that is required to query a particular connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DestinationConnectorProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConnectorProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     */
    private RedshiftDestinationProperties redshift;
    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     */
    private S3DestinationProperties s3;
    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     */
    private SalesforceDestinationProperties salesforce;
    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     */
    private SnowflakeDestinationProperties snowflake;
    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     */
    private EventBridgeDestinationProperties eventBridge;

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The properties required to query Amazon Redshift.
     */

    public void setRedshift(RedshiftDestinationProperties redshift) {
        this.redshift = redshift;
    }

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @return The properties required to query Amazon Redshift.
     */

    public RedshiftDestinationProperties getRedshift() {
        return this.redshift;
    }

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The properties required to query Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withRedshift(RedshiftDestinationProperties redshift) {
        setRedshift(redshift);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @param s3
     *        The properties required to query Amazon S3.
     */

    public void setS3(S3DestinationProperties s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @return The properties required to query Amazon S3.
     */

    public S3DestinationProperties getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @param s3
     *        The properties required to query Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withS3(S3DestinationProperties s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The properties required to query Salesforce.
     */

    public void setSalesforce(SalesforceDestinationProperties salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @return The properties required to query Salesforce.
     */

    public SalesforceDestinationProperties getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The properties required to query Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withSalesforce(SalesforceDestinationProperties salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The properties required to query Snowflake.
     */

    public void setSnowflake(SnowflakeDestinationProperties snowflake) {
        this.snowflake = snowflake;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @return The properties required to query Snowflake.
     */

    public SnowflakeDestinationProperties getSnowflake() {
        return this.snowflake;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The properties required to query Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withSnowflake(SnowflakeDestinationProperties snowflake) {
        setSnowflake(snowflake);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The properties required to query Amazon EventBridge.
     */

    public void setEventBridge(EventBridgeDestinationProperties eventBridge) {
        this.eventBridge = eventBridge;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @return The properties required to query Amazon EventBridge.
     */

    public EventBridgeDestinationProperties getEventBridge() {
        return this.eventBridge;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The properties required to query Amazon EventBridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withEventBridge(EventBridgeDestinationProperties eventBridge) {
        setEventBridge(eventBridge);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRedshift() != null)
            sb.append("Redshift: ").append(getRedshift()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getSnowflake() != null)
            sb.append("Snowflake: ").append(getSnowflake()).append(",");
        if (getEventBridge() != null)
            sb.append("EventBridge: ").append(getEventBridge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConnectorProperties == false)
            return false;
        DestinationConnectorProperties other = (DestinationConnectorProperties) obj;
        if (other.getRedshift() == null ^ this.getRedshift() == null)
            return false;
        if (other.getRedshift() != null && other.getRedshift().equals(this.getRedshift()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getSalesforce() == null ^ this.getSalesforce() == null)
            return false;
        if (other.getSalesforce() != null && other.getSalesforce().equals(this.getSalesforce()) == false)
            return false;
        if (other.getSnowflake() == null ^ this.getSnowflake() == null)
            return false;
        if (other.getSnowflake() != null && other.getSnowflake().equals(this.getSnowflake()) == false)
            return false;
        if (other.getEventBridge() == null ^ this.getEventBridge() == null)
            return false;
        if (other.getEventBridge() != null && other.getEventBridge().equals(this.getEventBridge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedshift() == null) ? 0 : getRedshift().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getSnowflake() == null) ? 0 : getSnowflake().hashCode());
        hashCode = prime * hashCode + ((getEventBridge() == null) ? 0 : getEventBridge().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConnectorProperties clone() {
        try {
            return (DestinationConnectorProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DestinationConnectorPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
