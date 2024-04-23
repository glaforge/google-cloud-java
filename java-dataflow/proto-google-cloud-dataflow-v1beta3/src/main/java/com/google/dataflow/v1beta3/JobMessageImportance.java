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
// source: google/dataflow/v1beta3/messages.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Indicates the importance of the message.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.JobMessageImportance}
 */
public enum JobMessageImportance implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The message importance isn't specified, or is unknown.
   * </pre>
   *
   * <code>JOB_MESSAGE_IMPORTANCE_UNKNOWN = 0;</code>
   */
  JOB_MESSAGE_IMPORTANCE_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * The message is at the 'debug' level: typically only useful for
   * software engineers working on the code the job is running.
   * Typically, Dataflow pipeline runners do not display log messages
   * at this level by default.
   * </pre>
   *
   * <code>JOB_MESSAGE_DEBUG = 1;</code>
   */
  JOB_MESSAGE_DEBUG(1),
  /**
   *
   *
   * <pre>
   * The message is at the 'detailed' level: somewhat verbose, but
   * potentially useful to users.  Typically, Dataflow pipeline
   * runners do not display log messages at this level by default.
   * These messages are displayed by default in the Dataflow
   * monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_DETAILED = 2;</code>
   */
  JOB_MESSAGE_DETAILED(2),
  /**
   *
   *
   * <pre>
   * The message is at the 'basic' level: useful for keeping
   * track of the execution of a Dataflow pipeline.  Typically,
   * Dataflow pipeline runners display log messages at this level by
   * default, and these messages are displayed by default in the
   * Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_BASIC = 5;</code>
   */
  JOB_MESSAGE_BASIC(5),
  /**
   *
   *
   * <pre>
   * The message is at the 'warning' level: indicating a condition
   * pertaining to a job which may require human intervention.
   * Typically, Dataflow pipeline runners display log messages at this
   * level by default, and these messages are displayed by default in
   * the Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_WARNING = 3;</code>
   */
  JOB_MESSAGE_WARNING(3),
  /**
   *
   *
   * <pre>
   * The message is at the 'error' level: indicating a condition
   * preventing a job from succeeding.  Typically, Dataflow pipeline
   * runners display log messages at this level by default, and these
   * messages are displayed by default in the Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_ERROR = 4;</code>
   */
  JOB_MESSAGE_ERROR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The message importance isn't specified, or is unknown.
   * </pre>
   *
   * <code>JOB_MESSAGE_IMPORTANCE_UNKNOWN = 0;</code>
   */
  public static final int JOB_MESSAGE_IMPORTANCE_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The message is at the 'debug' level: typically only useful for
   * software engineers working on the code the job is running.
   * Typically, Dataflow pipeline runners do not display log messages
   * at this level by default.
   * </pre>
   *
   * <code>JOB_MESSAGE_DEBUG = 1;</code>
   */
  public static final int JOB_MESSAGE_DEBUG_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The message is at the 'detailed' level: somewhat verbose, but
   * potentially useful to users.  Typically, Dataflow pipeline
   * runners do not display log messages at this level by default.
   * These messages are displayed by default in the Dataflow
   * monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_DETAILED = 2;</code>
   */
  public static final int JOB_MESSAGE_DETAILED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The message is at the 'basic' level: useful for keeping
   * track of the execution of a Dataflow pipeline.  Typically,
   * Dataflow pipeline runners display log messages at this level by
   * default, and these messages are displayed by default in the
   * Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_BASIC = 5;</code>
   */
  public static final int JOB_MESSAGE_BASIC_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The message is at the 'warning' level: indicating a condition
   * pertaining to a job which may require human intervention.
   * Typically, Dataflow pipeline runners display log messages at this
   * level by default, and these messages are displayed by default in
   * the Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_WARNING = 3;</code>
   */
  public static final int JOB_MESSAGE_WARNING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The message is at the 'error' level: indicating a condition
   * preventing a job from succeeding.  Typically, Dataflow pipeline
   * runners display log messages at this level by default, and these
   * messages are displayed by default in the Dataflow monitoring UI.
   * </pre>
   *
   * <code>JOB_MESSAGE_ERROR = 4;</code>
   */
  public static final int JOB_MESSAGE_ERROR_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobMessageImportance valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobMessageImportance forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_MESSAGE_IMPORTANCE_UNKNOWN;
      case 1:
        return JOB_MESSAGE_DEBUG;
      case 2:
        return JOB_MESSAGE_DETAILED;
      case 5:
        return JOB_MESSAGE_BASIC;
      case 3:
        return JOB_MESSAGE_WARNING;
      case 4:
        return JOB_MESSAGE_ERROR;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobMessageImportance>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobMessageImportance>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JobMessageImportance>() {
            public JobMessageImportance findValueByNumber(int number) {
              return JobMessageImportance.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.dataflow.v1beta3.MessagesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final JobMessageImportance[] VALUES = values();

  public static JobMessageImportance valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobMessageImportance(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.JobMessageImportance)
}
