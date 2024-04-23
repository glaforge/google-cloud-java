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
// source: google/cloud/datacatalog/v1beta1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1beta1;

public final class Common {
  private Common() {}

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
      "\n-google/cloud/datacatalog/v1beta1/commo"
          + "n.proto\022 google.cloud.datacatalog.v1beta"
          + "1*U\n\020IntegratedSystem\022!\n\035INTEGRATED_SYST"
          + "EM_UNSPECIFIED\020\000\022\014\n\010BIGQUERY\020\001\022\020\n\014CLOUD_"
          + "PUBSUB\020\002*j\n\016ManagingSystem\022\037\n\033MANAGING_S"
          + "YSTEM_UNSPECIFIED\020\000\022\034\n\030MANAGING_SYSTEM_D"
          + "ATAPLEX\020\001\022\031\n\025MANAGING_SYSTEM_OTHER\020\002B\337\001\n"
          + "$com.google.cloud.datacatalog.v1beta1P\001Z"
          + "Fcloud.google.com/go/datacatalog/apiv1be"
          + "ta1/datacatalogpb;datacatalogpb\370\001\001\252\002 Goo"
          + "gle.Cloud.DataCatalog.V1Beta1\312\002 Google\\C"
          + "loud\\DataCatalog\\V1beta1\352\002#Google::Cloud"
          + "::DataCatalog::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
