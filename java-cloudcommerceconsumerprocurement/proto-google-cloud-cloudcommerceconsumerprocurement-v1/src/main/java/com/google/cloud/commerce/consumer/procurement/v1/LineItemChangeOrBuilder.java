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
// source: google/cloud/commerce/consumer/procurement/v1/order.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.commerce.consumer.procurement.v1;

public interface LineItemChangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.LineItemChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Change ID.
   * All changes made within one order update operation have the same change_id.
   * </pre>
   *
   * <code>string change_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The changeId.
   */
  java.lang.String getChangeId();
  /**
   *
   *
   * <pre>
   * Output only. Change ID.
   * All changes made within one order update operation have the same change_id.
   * </pre>
   *
   * <code>string change_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for changeId.
   */
  com.google.protobuf.ByteString getChangeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Type of the change to make.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeType change_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for changeType.
   */
  int getChangeTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of the change to make.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeType change_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The changeType.
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemChangeType getChangeType();

  /**
   *
   *
   * <pre>
   * Output only. Line item info before the change.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemInfo old_line_item_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the oldLineItemInfo field is set.
   */
  boolean hasOldLineItemInfo();
  /**
   *
   *
   * <pre>
   * Output only. Line item info before the change.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemInfo old_line_item_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The oldLineItemInfo.
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemInfo getOldLineItemInfo();
  /**
   *
   *
   * <pre>
   * Output only. Line item info before the change.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemInfo old_line_item_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemInfoOrBuilder
      getOldLineItemInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Line item info after the change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1.LineItemInfo new_line_item_info = 4;
   * </code>
   *
   * @return Whether the newLineItemInfo field is set.
   */
  boolean hasNewLineItemInfo();
  /**
   *
   *
   * <pre>
   * Line item info after the change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1.LineItemInfo new_line_item_info = 4;
   * </code>
   *
   * @return The newLineItemInfo.
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemInfo getNewLineItemInfo();
  /**
   *
   *
   * <pre>
   * Line item info after the change.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1.LineItemInfo new_line_item_info = 4;
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemInfoOrBuilder
      getNewLineItemInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the change.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeState change_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for changeState.
   */
  int getChangeStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the change.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeState change_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The changeState.
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemChangeState getChangeState();

  /**
   *
   *
   * <pre>
   * Output only. Provider-supplied message explaining the LineItemChange's
   * state. Mainly used to communicate progress and ETA for provisioning in the
   * case of `PENDING_APPROVAL`, and to explain why the change request was
   * denied or canceled in the case of `REJECTED` and `CANCELED` states.
   * </pre>
   *
   * <code>string state_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateReason.
   */
  java.lang.String getStateReason();
  /**
   *
   *
   * <pre>
   * Output only. Provider-supplied message explaining the LineItemChange's
   * state. Mainly used to communicate progress and ETA for provisioning in the
   * case of `PENDING_APPROVAL`, and to explain why the change request was
   * denied or canceled in the case of `REJECTED` and `CANCELED` states.
   * </pre>
   *
   * <code>string state_reason = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateReason.
   */
  com.google.protobuf.ByteString getStateReasonBytes();

  /**
   *
   *
   * <pre>
   * Output only. Predefined enum types for why this line item change is in
   * current state. For example, a line item change's state could be
   * `LINE_ITEM_CHANGE_STATE_COMPLETED` because of end-of-term expiration,
   * immediate cancellation initiated by the user, or system-initiated
   * cancellation.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeStateReasonType change_state_reason_type = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for changeStateReasonType.
   */
  int getChangeStateReasonTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Predefined enum types for why this line item change is in
   * current state. For example, a line item change's state could be
   * `LINE_ITEM_CHANGE_STATE_COMPLETED` because of end-of-term expiration,
   * immediate cancellation initiated by the user, or system-initiated
   * cancellation.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.LineItemChangeStateReasonType change_state_reason_type = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The changeStateReasonType.
   */
  com.google.cloud.commerce.consumer.procurement.v1.LineItemChangeStateReasonType
      getChangeStateReasonType();

  /**
   *
   *
   * <pre>
   * Output only. A time at which the change became or will become (in case of
   * pending change) effective.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp change_effective_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the changeEffectiveTime field is set.
   */
  boolean hasChangeEffectiveTime();
  /**
   *
   *
   * <pre>
   * Output only. A time at which the change became or will become (in case of
   * pending change) effective.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp change_effective_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The changeEffectiveTime.
   */
  com.google.protobuf.Timestamp getChangeEffectiveTime();
  /**
   *
   *
   * <pre>
   * Output only. A time at which the change became or will become (in case of
   * pending change) effective.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp change_effective_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getChangeEffectiveTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when change was initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when change was initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when change was initiated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when change was updated, e.g. approved/rejected by
   * partners or cancelled by the user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when change was updated, e.g. approved/rejected by
   * partners or cancelled by the user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when change was updated, e.g. approved/rejected by
   * partners or cancelled by the user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
