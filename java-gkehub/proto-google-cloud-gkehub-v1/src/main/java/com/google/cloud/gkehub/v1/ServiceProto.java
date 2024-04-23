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
// source: google/cloud/gkehub/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_ListMembershipsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_ListMembershipsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_ListMembershipsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_ListMembershipsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_GetMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_GetMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_CreateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_CreateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_DeleteMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_DeleteMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_UpdateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_UpdateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_GenerateConnectManifestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_GenerateConnectManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_GenerateConnectManifestResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_GenerateConnectManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_ConnectAgentResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_ConnectAgentResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_TypeMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_ListFeaturesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_ListFeaturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_ListFeaturesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_ListFeaturesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_GetFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_GetFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_CreateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_CreateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_DeleteFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_DeleteFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_UpdateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_UpdateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/gkehub/v1/service.proto\022\026"
          + "google.cloud.gkehub.v1\032\034google/api/annot"
          + "ations.proto\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032$google/cloud/gkehub/v"
          + "1/feature.proto\032\'google/cloud/gkehub/v1/"
          + "membership.proto\032#google/longrunning/ope"
          + "rations.proto\032\033google/protobuf/empty.pro"
          + "to\032 google/protobuf/field_mask.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\"\257\001\n\026ListMe"
          + "mbershipsRequest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\""
          + "\022 gkehub.googleapis.com/Membership\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001"
          + "(\tB\003\340A\001\"~\n\027ListMembershipsResponse\0225\n\tre"
          + "sources\030\001 \003(\0132\".google.cloud.gkehub.v1.M"
          + "embership\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013un"
          + "reachable\030\003 \003(\t\"N\n\024GetMembershipRequest\022"
          + "6\n\004name\030\001 \001(\tB(\340A\002\372A\"\n gkehub.googleapis"
          + ".com/Membership\"\303\001\n\027CreateMembershipRequ"
          + "est\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\022 gkehub.goog"
          + "leapis.com/Membership\022\032\n\rmembership_id\030\002"
          + " \001(\tB\003\340A\002\0229\n\010resource\030\003 \001(\0132\".google.clo"
          + "ud.gkehub.v1.MembershipB\003\340A\002\022\027\n\nrequest_"
          + "id\030\004 \001(\tB\003\340A\001\"~\n\027DeleteMembershipRequest"
          + "\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n gkehub.googleapi"
          + "s.com/Membership\022\027\n\nrequest_id\030\002 \001(\tB\003\340A"
          + "\001\022\022\n\005force\030\003 \001(\010B\003\340A\001\"\333\001\n\027UpdateMembersh"
          + "ipRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n gkehub."
          + "googleapis.com/Membership\0224\n\013update_mask"
          + "\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022"
          + "9\n\010resource\030\003 \001(\0132\".google.cloud.gkehub."
          + "v1.MembershipB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003"
          + "\340A\001\"\362\001\n\036GenerateConnectManifestRequest\0226"
          + "\n\004name\030\001 \001(\tB(\340A\002\372A\"\n gkehub.googleapis."
          + "com/Membership\022\026\n\tnamespace\030\002 \001(\tB\003\340A\001\022\022"
          + "\n\005proxy\030\003 \001(\014B\003\340A\001\022\024\n\007version\030\004 \001(\tB\003\340A\001"
          + "\022\027\n\nis_upgrade\030\005 \001(\010B\003\340A\001\022\025\n\010registry\030\006 "
          + "\001(\tB\003\340A\001\022&\n\031image_pull_secret_content\030\007 "
          + "\001(\014B\003\340A\001\"a\n\037GenerateConnectManifestRespo"
          + "nse\022>\n\010manifest\030\001 \003(\0132,.google.cloud.gke"
          + "hub.v1.ConnectAgentResource\"X\n\024ConnectAg"
          + "entResource\022.\n\004type\030\001 \001(\0132 .google.cloud"
          + ".gkehub.v1.TypeMeta\022\020\n\010manifest\030\002 \001(\t\"-\n"
          + "\010TypeMeta\022\014\n\004kind\030\001 \001(\t\022\023\n\013api_version\030\002"
          + " \001(\t\"\222\001\n\023ListFeaturesRequest\0222\n\006parent\030\001"
          + " \001(\tB\"\372A\037\022\035gkehub.googleapis.com/Feature"
          + "\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022"
          + "\016\n\006filter\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"c\n\024Lis"
          + "tFeaturesResponse\0222\n\tresources\030\001 \003(\0132\037.g"
          + "oogle.cloud.gkehub.v1.Feature\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\"E\n\021GetFeatureRequest\0220\n\004n"
          + "ame\030\001 \001(\tB\"\372A\037\n\035gkehub.googleapis.com/Fe"
          + "ature\"\245\001\n\024CreateFeatureRequest\0222\n\006parent"
          + "\030\001 \001(\tB\"\372A\037\022\035gkehub.googleapis.com/Featu"
          + "re\022\022\n\nfeature_id\030\002 \001(\t\0221\n\010resource\030\003 \001(\013"
          + "2\037.google.cloud.gkehub.v1.Feature\022\022\n\nreq"
          + "uest_id\030\004 \001(\t\"p\n\024DeleteFeatureRequest\0220\n"
          + "\004name\030\001 \001(\tB\"\372A\037\n\035gkehub.googleapis.com/"
          + "Feature\022\r\n\005force\030\002 \001(\010\022\027\n\nrequest_id\030\003 \001"
          + "(\tB\003\340A\001\"\300\001\n\024UpdateFeatureRequest\0220\n\004name"
          + "\030\001 \001(\tB\"\372A\037\n\035gkehub.googleapis.com/Featu"
          + "re\022/\n\013update_mask\030\002 \001(\0132\032.google.protobu"
          + "f.FieldMask\0221\n\010resource\030\003 \001(\0132\037.google.c"
          + "loud.gkehub.v1.Feature\022\022\n\nrequest_id\030\004 \001"
          + "(\t\"\371\001\n\021OperationMetadata\0224\n\013create_time\030"
          + "\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221"
          + "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004"
          + " \001(\tB\003\340A\003\022\032\n\rstatus_detail\030\005 \001(\tB\003\340A\003\022\035\n"
          + "\020cancel_requested\030\006 \001(\010B\003\340A\003\022\030\n\013api_vers"
          + "ion\030\007 \001(\tB\003\340A\0032\360\021\n\006GkeHub\022\264\001\n\017ListMember"
          + "ships\022..google.cloud.gkehub.v1.ListMembe"
          + "rshipsRequest\032/.google.cloud.gkehub.v1.L"
          + "istMembershipsResponse\"@\332A\006parent\202\323\344\223\0021\022"
          + "//v1/{parent=projects/*/locations/*}/mem"
          + "berships\022\250\001\n\014ListFeatures\022+.google.cloud"
          + ".gkehub.v1.ListFeaturesRequest\032,.google."
          + "cloud.gkehub.v1.ListFeaturesResponse\"=\332A"
          + "\006parent\202\323\344\223\002.\022,/v1/{parent=projects/*/lo"
          + "cations/*}/features\022\241\001\n\rGetMembership\022,."
          + "google.cloud.gkehub.v1.GetMembershipRequ"
          + "est\032\".google.cloud.gkehub.v1.Membership\""
          + ">\332A\004name\202\323\344\223\0021\022//v1/{name=projects/*/loc"
          + "ations/*/memberships/*}\022\225\001\n\nGetFeature\022)"
          + ".google.cloud.gkehub.v1.GetFeatureReques"
          + "t\032\037.google.cloud.gkehub.v1.Feature\";\332A\004n"
          + "ame\202\323\344\223\002.\022,/v1/{name=projects/*/location"
          + "s/*/features/*}\022\350\001\n\020CreateMembership\022/.g"
          + "oogle.cloud.gkehub.v1.CreateMembershipRe"
          + "quest\032\035.google.longrunning.Operation\"\203\001\312"
          + "A\037\n\nMembership\022\021OperationMetadata\332A\035pare"
          + "nt,resource,membership_id\202\323\344\223\002;\"//v1/{pa"
          + "rent=projects/*/locations/*}/memberships"
          + ":\010resource\022\330\001\n\rCreateFeature\022,.google.cl"
          + "oud.gkehub.v1.CreateFeatureRequest\032\035.goo"
          + "gle.longrunning.Operation\"z\312A\034\n\007Feature\022"
          + "\021OperationMetadata\332A\032parent,resource,fea"
          + "ture_id\202\323\344\223\0028\",/v1/{parent=projects/*/lo"
          + "cations/*}/features:\010resource\022\317\001\n\020Delete"
          + "Membership\022/.google.cloud.gkehub.v1.Dele"
          + "teMembershipRequest\032\035.google.longrunning"
          + ".Operation\"k\312A*\n\025google.protobuf.Empty\022\021"
          + "OperationMetadata\332A\004name\202\323\344\223\0021*//v1/{nam"
          + "e=projects/*/locations/*/memberships/*}\022"
          + "\306\001\n\rDeleteFeature\022,.google.cloud.gkehub."
          + "v1.DeleteFeatureRequest\032\035.google.longrun"
          + "ning.Operation\"h\312A*\n\025google.protobuf.Emp"
          + "ty\022\021OperationMetadata\332A\004name\202\323\344\223\002.*,/v1/"
          + "{name=projects/*/locations/*/features/*}"
          + "\022\343\001\n\020UpdateMembership\022/.google.cloud.gke"
          + "hub.v1.UpdateMembershipRequest\032\035.google."
          + "longrunning.Operation\"\177\312A\037\n\nMembership\022\021"
          + "OperationMetadata\332A\031name,resource,update"
          + "_mask\202\323\344\223\002;2//v1/{name=projects/*/locati"
          + "ons/*/memberships/*}:\010resource\022\327\001\n\rUpdat"
          + "eFeature\022,.google.cloud.gkehub.v1.Update"
          + "FeatureRequest\032\035.google.longrunning.Oper"
          + "ation\"y\312A\034\n\007Feature\022\021OperationMetadata\332A"
          + "\031name,resource,update_mask\202\323\344\223\00282,/v1/{n"
          + "ame=projects/*/locations/*/features/*}:\010"
          + "resource\022\333\001\n\027GenerateConnectManifest\0226.g"
          + "oogle.cloud.gkehub.v1.GenerateConnectMan"
          + "ifestRequest\0327.google.cloud.gkehub.v1.Ge"
          + "nerateConnectManifestResponse\"O\202\323\344\223\002I\022G/"
          + "v1/{name=projects/*/locations/*/membersh"
          + "ips/*}:generateConnectManifest\032I\312A\025gkehu"
          + "b.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformB\256\001\n\032com.google"
          + ".cloud.gkehub.v1B\014ServiceProtoP\001Z2cloud."
          + "google.com/go/gkehub/apiv1/gkehubpb;gkeh"
          + "ubpb\252\002\026Google.Cloud.GkeHub.V1\312\002\026Google\\C"
          + "loud\\GkeHub\\V1\352\002\031Google::Cloud::GkeHub::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkehub.v1.FeatureProto.getDescriptor(),
              com.google.cloud.gkehub.v1.MembershipProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1_ListMembershipsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1_ListMembershipsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_ListMembershipsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1_ListMembershipsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1_ListMembershipsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_ListMembershipsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gkehub_v1_GetMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1_GetMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_GetMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1_CreateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1_CreateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_CreateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MembershipId", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1_DeleteMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1_DeleteMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_DeleteMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "Force",
            });
    internal_static_google_cloud_gkehub_v1_UpdateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1_UpdateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_UpdateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1_GenerateConnectManifestRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1_GenerateConnectManifestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_GenerateConnectManifestRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Namespace",
              "Proxy",
              "Version",
              "IsUpgrade",
              "Registry",
              "ImagePullSecretContent",
            });
    internal_static_google_cloud_gkehub_v1_GenerateConnectManifestResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gkehub_v1_GenerateConnectManifestResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_GenerateConnectManifestResponse_descriptor,
            new java.lang.String[] {
              "Manifest",
            });
    internal_static_google_cloud_gkehub_v1_ConnectAgentResource_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gkehub_v1_ConnectAgentResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_ConnectAgentResource_descriptor,
            new java.lang.String[] {
              "Type", "Manifest",
            });
    internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gkehub_v1_TypeMeta_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor,
            new java.lang.String[] {
              "Kind", "ApiVersion",
            });
    internal_static_google_cloud_gkehub_v1_ListFeaturesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gkehub_v1_ListFeaturesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_ListFeaturesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1_ListFeaturesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gkehub_v1_ListFeaturesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_ListFeaturesResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken",
            });
    internal_static_google_cloud_gkehub_v1_GetFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gkehub_v1_GetFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_GetFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1_CreateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gkehub_v1_CreateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_CreateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureId", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1_DeleteFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gkehub_v1_DeleteFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_DeleteFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1_UpdateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_gkehub_v1_UpdateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_UpdateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_gkehub_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkehub.v1.FeatureProto.getDescriptor();
    com.google.cloud.gkehub.v1.MembershipProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
