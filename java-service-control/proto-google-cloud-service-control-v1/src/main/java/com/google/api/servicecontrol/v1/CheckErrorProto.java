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
// source: google/api/servicecontrol/v1/check_error.proto

// Protobuf Java Version: 3.25.3
package com.google.api.servicecontrol.v1;

public final class CheckErrorProto {
  private CheckErrorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_servicecontrol_v1_CheckError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_CheckError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/api/servicecontrol/v1/check_err"
          + "or.proto\022\034google.api.servicecontrol.v1\032\027"
          + "google/rpc/status.proto\"\256\005\n\nCheckError\022;"
          + "\n\004code\030\001 \001(\0162-.google.api.servicecontrol"
          + ".v1.CheckError.Code\022\017\n\007subject\030\004 \001(\t\022\016\n\006"
          + "detail\030\002 \001(\t\022\"\n\006status\030\003 \001(\0132\022.google.rp"
          + "c.Status\"\235\004\n\004Code\022\032\n\026ERROR_CODE_UNSPECIF"
          + "IED\020\000\022\r\n\tNOT_FOUND\020\005\022\025\n\021PERMISSION_DENIE"
          + "D\020\007\022\026\n\022RESOURCE_EXHAUSTED\020\010\022\031\n\025SERVICE_N"
          + "OT_ACTIVATED\020h\022\024\n\020BILLING_DISABLED\020k\022\023\n\017"
          + "PROJECT_DELETED\020l\022\023\n\017PROJECT_INVALID\020r\022\024"
          + "\n\020CONSUMER_INVALID\020}\022\026\n\022IP_ADDRESS_BLOCK"
          + "ED\020m\022\023\n\017REFERER_BLOCKED\020n\022\026\n\022CLIENT_APP_"
          + "BLOCKED\020o\022\026\n\022API_TARGET_BLOCKED\020z\022\023\n\017API"
          + "_KEY_INVALID\020i\022\023\n\017API_KEY_EXPIRED\020p\022\025\n\021A"
          + "PI_KEY_NOT_FOUND\020q\022\026\n\022INVALID_CREDENTIAL"
          + "\020{\022!\n\034NAMESPACE_LOOKUP_UNAVAILABLE\020\254\002\022\037\n"
          + "\032SERVICE_STATUS_UNAVAILABLE\020\255\002\022\037\n\032BILLIN"
          + "G_STATUS_UNAVAILABLE\020\256\002\022/\n*CLOUD_RESOURC"
          + "E_MANAGER_BACKEND_UNAVAILABLE\020\261\002B\352\001\n com"
          + ".google.api.servicecontrol.v1B\017CheckErro"
          + "rProtoP\001ZJcloud.google.com/go/servicecon"
          + "trol/apiv1/servicecontrolpb;servicecontr"
          + "olpb\370\001\001\252\002\036Google.Cloud.ServiceControl.V1"
          + "\312\002\036Google\\Cloud\\ServiceControl\\V1\352\002!Goog"
          + "le::Cloud::ServiceControl::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_api_servicecontrol_v1_CheckError_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_CheckError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_servicecontrol_v1_CheckError_descriptor,
            new java.lang.String[] {
              "Code", "Subject", "Detail", "Status",
            });
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
