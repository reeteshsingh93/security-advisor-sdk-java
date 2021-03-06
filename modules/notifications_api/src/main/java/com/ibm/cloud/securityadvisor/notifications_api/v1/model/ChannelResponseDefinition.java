/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.securityadvisor.notifications_api.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response including channels.
 */
public class ChannelResponseDefinition extends GenericModel {

  /**
   * Type of callback URL.
   */
  public interface Type {
    /** Webhook. */
    String WEBHOOK = "Webhook";
  }

  @SerializedName("channel_id")
  protected String channelId;
  protected String name;
  protected String description;
  protected String type;
  protected ChannelResponseDefinitionSeverity severity;
  protected String endpoint;
  protected Boolean enabled;
  protected List<ChannelResponseDefinitionAlertSourceItem> alertSource;
  protected String frequency;

  /**
   * Gets the channelId.
   *
   * unique id of the channel.
   *
   * @return the channelId
   */
  public String getChannelId() {
    return channelId;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the description.
   *
   * A one sentence description of this `Channel`.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the type.
   *
   * Type of callback URL.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the severity.
   *
   * Severity of the notification.
   *
   * @return the severity
   */
  public ChannelResponseDefinitionSeverity getSeverity() {
    return severity;
  }

  /**
   * Gets the endpoint.
   *
   * The callback URL which receives the notification.
   *
   * @return the endpoint
   */
  public String getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the enabled.
   *
   * Channel is enabled or not. Default is disabled.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }

  /**
   * Gets the alertSource.
   *
   * @return the alertSource
   */
  public List<ChannelResponseDefinitionAlertSourceItem> getAlertSource() {
    return alertSource;
  }

  /**
   * Gets the frequency.
   *
   * @return the frequency
   */
  public String getFrequency() {
    return frequency;
  }
}

