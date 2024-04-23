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
// source: google/cloud/discoveryengine/v1alpha/user_event.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public final class UserEventProto {
  private UserEventProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_PageInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_SearchInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_SearchInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CompletionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CompletionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_TransactionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_TransactionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DocumentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DocumentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_PanelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_PanelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/discoveryengine/v1alpha/u"
          + "ser_event.proto\022$google.cloud.discoverye"
          + "ngine.v1alpha\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\0321googl"
          + "e/cloud/discoveryengine/v1alpha/common.p"
          + "roto\032\036google/protobuf/duration.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\"\355\007\n\tUserEv"
          + "ent\022\027\n\nevent_type\030\001 \001(\tB\003\340A\002\022\033\n\016user_pse"
          + "udo_id\030\002 \001(\tB\003\340A\002\022.\n\nevent_time\030\003 \001(\0132\032."
          + "google.protobuf.Timestamp\022A\n\tuser_info\030\004"
          + " \001(\0132..google.cloud.discoveryengine.v1al"
          + "pha.UserInfo\022\033\n\023direct_user_request\030\005 \001("
          + "\010\022\022\n\nsession_id\030\006 \001(\t\022A\n\tpage_info\030\007 \001(\013"
          + "2..google.cloud.discoveryengine.v1alpha."
          + "PageInfo\022\031\n\021attribution_token\030\010 \001(\t\022\016\n\006f"
          + "ilter\030\t \001(\t\022E\n\tdocuments\030\n \003(\01322.google."
          + "cloud.discoveryengine.v1alpha.DocumentIn"
          + "fo\022>\n\005panel\030\013 \001(\0132/.google.cloud.discove"
          + "ryengine.v1alpha.PanelInfo\022E\n\013search_inf"
          + "o\030\014 \001(\01320.google.cloud.discoveryengine.v"
          + "1alpha.SearchInfo\022M\n\017completion_info\030\r \001"
          + "(\01324.google.cloud.discoveryengine.v1alph"
          + "a.CompletionInfo\022O\n\020transaction_info\030\016 \001"
          + "(\01325.google.cloud.discoveryengine.v1alph"
          + "a.TransactionInfo\022\017\n\007tag_ids\030\017 \003(\t\022\025\n\rpr"
          + "omotion_ids\030\020 \003(\t\022S\n\nattributes\030\021 \003(\0132?."
          + "google.cloud.discoveryengine.v1alpha.Use"
          + "rEvent.AttributesEntry\022C\n\nmedia_info\030\022 \001"
          + "(\0132/.google.cloud.discoveryengine.v1alph"
          + "a.MediaInfo\032h\n\017AttributesEntry\022\013\n\003key\030\001 "
          + "\001(\t\022D\n\005value\030\002 \001(\01325.google.cloud.discov"
          + "eryengine.v1alpha.CustomAttribute:\0028\001\"Y\n"
          + "\010PageInfo\022\023\n\013pageview_id\030\001 \001(\t\022\025\n\rpage_c"
          + "ategory\030\002 \001(\t\022\013\n\003uri\030\003 \001(\t\022\024\n\014referrer_u"
          + "ri\030\004 \001(\t\"T\n\nSearchInfo\022\024\n\014search_query\030\001"
          + " \001(\t\022\020\n\010order_by\030\002 \001(\t\022\023\n\006offset\030\003 \001(\005H\000"
          + "\210\001\001B\t\n\007_offset\"H\n\016CompletionInfo\022\033\n\023sele"
          + "cted_suggestion\030\001 \001(\t\022\031\n\021selected_positi"
          + "on\030\002 \001(\005\"\311\001\n\017TransactionInfo\022\027\n\005value\030\001 "
          + "\001(\002B\003\340A\002H\000\210\001\001\022\025\n\010currency\030\002 \001(\tB\003\340A\002\022\026\n\016"
          + "transaction_id\030\003 \001(\t\022\020\n\003tax\030\004 \001(\002H\001\210\001\001\022\021"
          + "\n\004cost\030\005 \001(\002H\002\210\001\001\022\033\n\016discount_value\030\006 \001("
          + "\002H\003\210\001\001B\010\n\006_valueB\006\n\004_taxB\007\n\005_costB\021\n\017_di"
          + "scount_value\"\273\001\n\014DocumentInfo\022\014\n\002id\030\001 \001("
          + "\tH\000\022<\n\004name\030\002 \001(\tB,\372A)\n\'discoveryengine."
          + "googleapis.com/DocumentH\000\022\r\n\003uri\030\006 \001(\tH\000"
          + "\022\025\n\010quantity\030\003 \001(\005H\001\210\001\001\022\025\n\rpromotion_ids"
          + "\030\004 \003(\tB\025\n\023document_descriptorB\013\n\t_quanti"
          + "ty\"\224\001\n\tPanelInfo\022\025\n\010panel_id\030\002 \001(\tB\003\340A\002\022"
          + "\024\n\014display_name\030\003 \001(\t\022\033\n\016panel_position\030"
          + "\004 \001(\005H\000\210\001\001\022\031\n\014total_panels\030\005 \001(\005H\001\210\001\001B\021\n"
          + "\017_panel_positionB\017\n\r_total_panels\"\215\001\n\tMe"
          + "diaInfo\022:\n\027media_progress_duration\030\001 \001(\013"
          + "2\031.google.protobuf.Duration\022&\n\031media_pro"
          + "gress_percentage\030\002 \001(\002H\000\210\001\001B\034\n\032_media_pr"
          + "ogress_percentageB\232\002\n(com.google.cloud.d"
          + "iscoveryengine.v1alphaB\016UserEventProtoP\001"
          + "ZRcloud.google.com/go/discoveryengine/ap"
          + "iv1alpha/discoveryenginepb;discoveryengi"
          + "nepb\242\002\017DISCOVERYENGINE\252\002$Google.Cloud.Di"
          + "scoveryEngine.V1Alpha\312\002$Google\\Cloud\\Dis"
          + "coveryEngine\\V1alpha\352\002\'Google::Cloud::Di"
          + "scoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_descriptor,
            new java.lang.String[] {
              "EventType",
              "UserPseudoId",
              "EventTime",
              "UserInfo",
              "DirectUserRequest",
              "SessionId",
              "PageInfo",
              "AttributionToken",
              "Filter",
              "Documents",
              "Panel",
              "SearchInfo",
              "CompletionInfo",
              "TransactionInfo",
              "TagIds",
              "PromotionIds",
              "Attributes",
              "MediaInfo",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_AttributesEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UserEvent_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_PageInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_PageInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_PageInfo_descriptor,
            new java.lang.String[] {
              "PageviewId", "PageCategory", "Uri", "ReferrerUri",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_SearchInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_SearchInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_SearchInfo_descriptor,
            new java.lang.String[] {
              "SearchQuery", "OrderBy", "Offset",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CompletionInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_CompletionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CompletionInfo_descriptor,
            new java.lang.String[] {
              "SelectedSuggestion", "SelectedPosition",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_TransactionInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_TransactionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_TransactionInfo_descriptor,
            new java.lang.String[] {
              "Value", "Currency", "TransactionId", "Tax", "Cost", "DiscountValue",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DocumentInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_DocumentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DocumentInfo_descriptor,
            new java.lang.String[] {
              "Id", "Name", "Uri", "Quantity", "PromotionIds", "DocumentDescriptor",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_PanelInfo_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_PanelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_PanelInfo_descriptor,
            new java.lang.String[] {
              "PanelId", "DisplayName", "PanelPosition", "TotalPanels",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_MediaInfo_descriptor,
            new java.lang.String[] {
              "MediaProgressDuration", "MediaProgressPercentage",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
