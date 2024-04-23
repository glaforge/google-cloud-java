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
// source: google/cloud/securitycenter/v1/security_health_analytics_custom_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public final class SecurityHealthAnalyticsCustomConfigProto {
  private SecurityHealthAnalyticsCustomConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_CustomConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_CustomConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_Property_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_Property_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_CustomConfig_ResourceSelector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_CustomConfig_ResourceSelector_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/securitycenter/v1/securit"
          + "y_health_analytics_custom_config.proto\022\036"
          + "google.cloud.securitycenter.v1\032\026google/t"
          + "ype/expr.proto\"\221\005\n\014CustomConfig\022$\n\tpredi"
          + "cate\030\001 \001(\0132\021.google.type.Expr\022T\n\rcustom_"
          + "output\030\002 \001(\0132=.google.cloud.securitycent"
          + "er.v1.CustomConfig.CustomOutputSpec\022X\n\021r"
          + "esource_selector\030\003 \001(\0132=.google.cloud.se"
          + "curitycenter.v1.CustomConfig.ResourceSel"
          + "ector\022G\n\010severity\030\004 \001(\01625.google.cloud.s"
          + "ecuritycenter.v1.CustomConfig.Severity\022\023"
          + "\n\013description\030\005 \001(\t\022\026\n\016recommendation\030\006 "
          + "\001(\t\032\265\001\n\020CustomOutputSpec\022Z\n\nproperties\030\001"
          + " \003(\0132F.google.cloud.securitycenter.v1.Cu"
          + "stomConfig.CustomOutputSpec.Property\032E\n\010"
          + "Property\022\014\n\004name\030\001 \001(\t\022+\n\020value_expressi"
          + "on\030\002 \001(\0132\021.google.type.Expr\032*\n\020ResourceS"
          + "elector\022\026\n\016resource_types\030\001 \003(\t\"Q\n\010Sever"
          + "ity\022\030\n\024SEVERITY_UNSPECIFIED\020\000\022\014\n\010CRITICA"
          + "L\020\001\022\010\n\004HIGH\020\002\022\n\n\006MEDIUM\020\003\022\007\n\003LOW\020\004B\202\002\n\"c"
          + "om.google.cloud.securitycenter.v1B(Secur"
          + "ityHealthAnalyticsCustomConfigProtoP\001ZJc"
          + "loud.google.com/go/securitycenter/apiv1/"
          + "securitycenterpb;securitycenterpb\252\002\036Goog"
          + "le.Cloud.SecurityCenter.V1\312\002\036Google\\Clou"
          + "d\\SecurityCenter\\V1\352\002!Google::Cloud::Sec"
          + "urityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.type.ExprProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_CustomConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_CustomConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_CustomConfig_descriptor,
            new java.lang.String[] {
              "Predicate",
              "CustomOutput",
              "ResourceSelector",
              "Severity",
              "Description",
              "Recommendation",
            });
    internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_descriptor =
        internal_static_google_cloud_securitycenter_v1_CustomConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_descriptor,
            new java.lang.String[] {
              "Properties",
            });
    internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_Property_descriptor =
        internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_Property_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_CustomConfig_CustomOutputSpec_Property_descriptor,
            new java.lang.String[] {
              "Name", "ValueExpression",
            });
    internal_static_google_cloud_securitycenter_v1_CustomConfig_ResourceSelector_descriptor =
        internal_static_google_cloud_securitycenter_v1_CustomConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v1_CustomConfig_ResourceSelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_CustomConfig_ResourceSelector_descriptor,
            new java.lang.String[] {
              "ResourceTypes",
            });
    com.google.type.ExprProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
