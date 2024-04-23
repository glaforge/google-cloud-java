/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2beta1;

public interface AutomatedAgentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AutomatedAgentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the Dialogflow agent environment to use.
   *
   * This project needs to either be the same project as the conversation or you
   * need to grant `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API
   * Service Agent` role in this project.
   *
   * - For ES agents, use format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/environments/&lt;Environment ID or '-'&gt;`. If environment is not
   * specified, the default `draft` environment is used. Refer to
   * [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest)
   * for more details.
   *
   * - For CX agents, use format `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID
   * or '-'&gt;`. If environment is not specified, the default `draft` environment
   * is used.
   * </pre>
   *
   * <code>
   * string agent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The agent.
   */
  java.lang.String getAgent();
  /**
   *
   *
   * <pre>
   * Required. ID of the Dialogflow agent environment to use.
   *
   * This project needs to either be the same project as the conversation or you
   * need to grant `service-&lt;Conversation Project
   * Number&gt;&#64;gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API
   * Service Agent` role in this project.
   *
   * - For ES agents, use format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agent/environments/&lt;Environment ID or '-'&gt;`. If environment is not
   * specified, the default `draft` environment is used. Refer to
   * [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2beta1#google.cloud.dialogflow.v2beta1.DetectIntentRequest)
   * for more details.
   *
   * - For CX agents, use format `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID
   * or '-'&gt;`. If environment is not specified, the default `draft` environment
   * is used.
   * </pre>
   *
   * <code>
   * string agent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for agent.
   */
  com.google.protobuf.ByteString getAgentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Configure lifetime of the Dialogflow session.
   * By default, a Dialogflow CX session remains active and its data is stored
   * for 30 minutes after the last request is sent for the session.
   * This value should be no longer than 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration session_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sessionTtl field is set.
   */
  boolean hasSessionTtl();
  /**
   *
   *
   * <pre>
   * Optional. Configure lifetime of the Dialogflow session.
   * By default, a Dialogflow CX session remains active and its data is stored
   * for 30 minutes after the last request is sent for the session.
   * This value should be no longer than 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration session_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sessionTtl.
   */
  com.google.protobuf.Duration getSessionTtl();
  /**
   *
   *
   * <pre>
   * Optional. Configure lifetime of the Dialogflow session.
   * By default, a Dialogflow CX session remains active and its data is stored
   * for 30 minutes after the last request is sent for the session.
   * This value should be no longer than 1 day.
   * </pre>
   *
   * <code>.google.protobuf.Duration session_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getSessionTtlOrBuilder();
}
