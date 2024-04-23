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
// source: google/cloud/video/stitcher/v1/companions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.stitcher.v1;

public final class CompanionsProto {
  private CompanionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_CompanionAds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_Companion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_Companion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_HtmlAdResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_HtmlAdResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_IframeAdResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_IframeAdResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_StaticAdResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_StaticAdResource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/video/stitcher/v1/compani"
          + "ons.proto\022\036google.cloud.video.stitcher.v"
          + "1\032+google/cloud/video/stitcher/v1/events"
          + ".proto\"\202\002\n\014CompanionAds\022\\\n\023display_requi"
          + "rement\030\001 \001(\0162?.google.cloud.video.stitch"
          + "er.v1.CompanionAds.DisplayRequirement\022=\n"
          + "\ncompanions\030\002 \003(\0132).google.cloud.video.s"
          + "titcher.v1.Companion\"U\n\022DisplayRequireme"
          + "nt\022#\n\037DISPLAY_REQUIREMENT_UNSPECIFIED\020\000\022"
          + "\007\n\003ALL\020\001\022\007\n\003ANY\020\002\022\010\n\004NONE\020\003\"\365\003\n\tCompanio"
          + "n\022N\n\022iframe_ad_resource\030\n \001(\01320.google.c"
          + "loud.video.stitcher.v1.IframeAdResourceH"
          + "\000\022N\n\022static_ad_resource\030\013 \001(\01320.google.c"
          + "loud.video.stitcher.v1.StaticAdResourceH"
          + "\000\022J\n\020html_ad_resource\030\014 \001(\0132..google.clo"
          + "ud.video.stitcher.v1.HtmlAdResourceH\000\022\025\n"
          + "\rapi_framework\030\001 \001(\t\022\021\n\theight_px\030\002 \001(\005\022"
          + "\020\n\010width_px\030\003 \001(\005\022\027\n\017asset_height_px\030\004 \001"
          + "(\005\022\032\n\022expanded_height_px\030\005 \001(\005\022\026\n\016asset_"
          + "width_px\030\006 \001(\005\022\031\n\021expanded_width_px\030\007 \001("
          + "\005\022\022\n\nad_slot_id\030\010 \001(\t\0225\n\006events\030\t \003(\0132%."
          + "google.cloud.video.stitcher.v1.EventB\r\n\013"
          + "ad_resource\"%\n\016HtmlAdResource\022\023\n\013html_so"
          + "urce\030\001 \001(\t\"\037\n\020IframeAdResource\022\013\n\003uri\030\001 "
          + "\001(\t\"6\n\020StaticAdResource\022\013\n\003uri\030\001 \001(\t\022\025\n\r"
          + "creative_type\030\002 \001(\tBw\n\"com.google.cloud."
          + "video.stitcher.v1B\017CompanionsProtoP\001Z>cl"
          + "oud.google.com/go/video/stitcher/apiv1/s"
          + "titcherpb;stitcherpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.video.stitcher.v1.EventsProto.getDescriptor(),
            });
    internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_stitcher_v1_CompanionAds_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_CompanionAds_descriptor,
            new java.lang.String[] {
              "DisplayRequirement", "Companions",
            });
    internal_static_google_cloud_video_stitcher_v1_Companion_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_stitcher_v1_Companion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_Companion_descriptor,
            new java.lang.String[] {
              "IframeAdResource",
              "StaticAdResource",
              "HtmlAdResource",
              "ApiFramework",
              "HeightPx",
              "WidthPx",
              "AssetHeightPx",
              "ExpandedHeightPx",
              "AssetWidthPx",
              "ExpandedWidthPx",
              "AdSlotId",
              "Events",
              "AdResource",
            });
    internal_static_google_cloud_video_stitcher_v1_HtmlAdResource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_stitcher_v1_HtmlAdResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_HtmlAdResource_descriptor,
            new java.lang.String[] {
              "HtmlSource",
            });
    internal_static_google_cloud_video_stitcher_v1_IframeAdResource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_stitcher_v1_IframeAdResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_IframeAdResource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_video_stitcher_v1_StaticAdResource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_video_stitcher_v1_StaticAdResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_StaticAdResource_descriptor,
            new java.lang.String[] {
              "Uri", "CreativeType",
            });
    com.google.cloud.video.stitcher.v1.EventsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
