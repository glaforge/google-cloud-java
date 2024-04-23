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
// source: google/cloud/websecurityscanner/v1beta/scan_run_warning_trace.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.websecurityscanner.v1beta;

public final class ScanRunWarningTraceProto {
  private ScanRunWarningTraceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRunWarningTrace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_websecurityscanner_v1beta_ScanRunWarningTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/websecurityscanner/v1beta"
          + "/scan_run_warning_trace.proto\022&google.cl"
          + "oud.websecurityscanner.v1beta\"\355\001\n\023ScanRu"
          + "nWarningTrace\022N\n\004code\030\001 \001(\0162@.google.clo"
          + "ud.websecurityscanner.v1beta.ScanRunWarn"
          + "ingTrace.Code\"\205\001\n\004Code\022\024\n\020CODE_UNSPECIFI"
          + "ED\020\000\022\036\n\032INSUFFICIENT_CRAWL_RESULTS\020\001\022\032\n\026"
          + "TOO_MANY_CRAWL_RESULTS\020\002\022\027\n\023TOO_MANY_FUZ"
          + "Z_TASKS\020\003\022\022\n\016BLOCKED_BY_IAP\020\004B\242\002\n*com.go"
          + "ogle.cloud.websecurityscanner.v1betaB\030Sc"
          + "anRunWarningTraceProtoP\001ZZcloud.google.c"
          + "om/go/websecurityscanner/apiv1beta/webse"
          + "curityscannerpb;websecurityscannerpb\252\002&G"
          + "oogle.Cloud.WebSecurityScanner.V1Beta\312\002&"
          + "Google\\Cloud\\WebSecurityScanner\\V1beta\352\002"
          + ")Google::Cloud::WebSecurityScanner::V1be"
          + "tab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRunWarningTrace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_websecurityscanner_v1beta_ScanRunWarningTrace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_websecurityscanner_v1beta_ScanRunWarningTrace_descriptor,
            new java.lang.String[] {
              "Code",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
