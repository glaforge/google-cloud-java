/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/pipeline_state.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PipelineStateProto {
  private PipelineStateProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/pipeli"
          + "ne_state.proto\022\037google.cloud.aiplatform."
          + "v1beta1*\223\002\n\rPipelineState\022\036\n\032PIPELINE_ST"
          + "ATE_UNSPECIFIED\020\000\022\031\n\025PIPELINE_STATE_QUEU"
          + "ED\020\001\022\032\n\026PIPELINE_STATE_PENDING\020\002\022\032\n\026PIPE"
          + "LINE_STATE_RUNNING\020\003\022\034\n\030PIPELINE_STATE_S"
          + "UCCEEDED\020\004\022\031\n\025PIPELINE_STATE_FAILED\020\005\022\035\n"
          + "\031PIPELINE_STATE_CANCELLING\020\006\022\034\n\030PIPELINE"
          + "_STATE_CANCELLED\020\007\022\031\n\025PIPELINE_STATE_PAU"
          + "SED\020\010B\351\001\n#com.google.cloud.aiplatform.v1"
          + "beta1B\022PipelineStateProtoP\001ZCcloud.googl"
          + "e.com/go/aiplatform/apiv1beta1/aiplatfor"
          + "mpb;aiplatformpb\252\002\037Google.Cloud.AIPlatfo"
          + "rm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1b"
          + "eta1\352\002\"Google::Cloud::AIPlatform::V1beta"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
