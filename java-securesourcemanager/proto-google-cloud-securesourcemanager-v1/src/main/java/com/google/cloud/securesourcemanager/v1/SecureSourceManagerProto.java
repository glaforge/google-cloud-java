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
// source: google/cloud/securesourcemanager/v1/secure_source_manager.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securesourcemanager.v1;

public final class SecureSourceManagerProto {
  private SecureSourceManagerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Instance_HostConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Instance_HostConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Repository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Repository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Repository_URIs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Repository_URIs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_Repository_InitialConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_Repository_InitialConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_GetRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_GetRepositoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_CreateRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_CreateRepositoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securesourcemanager_v1_DeleteRepositoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securesourcemanager_v1_DeleteRepositoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/securesourcemanager/v1/se"
          + "cure_source_manager.proto\022#google.cloud."
          + "securesourcemanager.v1\032\034google/api/annot"
          + "ations.proto\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032\036google/iam/v1/iam_pol"
          + "icy.proto\032\032google/iam/v1/policy.proto\032#g"
          + "oogle/longrunning/operations.proto\032\033goog"
          + "le/protobuf/empty.proto\032\037google/protobuf"
          + "/timestamp.proto\"\273\007\n\010Instance\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\001\0224\n\013create_time\030\002 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\003 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022N\n\006"
          + "labels\030\004 \003(\01329.google.cloud.securesource"
          + "manager.v1.Instance.LabelsEntryB\003\340A\001\022G\n\005"
          + "state\030\005 \001(\01623.google.cloud.securesourcem"
          + "anager.v1.Instance.StateB\003\340A\003\022P\n\nstate_n"
          + "ote\030\n \001(\01627.google.cloud.securesourceman"
          + "ager.v1.Instance.StateNoteB\003\340A\003\022:\n\007kms_k"
          + "ey\030\013 \001(\tB)\340A\005\372A#\n!cloudkms.googleapis.co"
          + "m/CryptoKey\022R\n\013host_config\030\t \001(\01328.googl"
          + "e.cloud.securesourcemanager.v1.Instance."
          + "HostConfigB\003\340A\003\032^\n\nHostConfig\022\021\n\004html\030\001 "
          + "\001(\tB\003\340A\003\022\020\n\003api\030\002 \001(\tB\003\340A\003\022\025\n\010git_http\030\003"
          + " \001(\tB\003\340A\003\022\024\n\007git_ssh\030\004 \001(\tB\003\340A\003\032-\n\013Label"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"R"
          + "\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATI"
          + "NG\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010DELETING\020\003\022\n\n\006PAUSED"
          + "\020\004\"_\n\tStateNote\022\032\n\026STATE_NOTE_UNSPECIFIE"
          + "D\020\000\022\033\n\027PAUSED_CMEK_UNAVAILABLE\020\001\022\031\n\021INST"
          + "ANCE_RESUMING\020\002\032\002\010\001:q\352An\n+securesourcema"
          + "nager.googleapis.com/Instance\022<projects/"
          + "{project}/locations/{location}/instances"
          + "/{instance}R\001\001\"\240\005\n\nRepository\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\001\022\030\n\013description\030\002 \001(\tB\003\340A\001\022\025\n\010in"
          + "stance\030\003 \001(\tB\003\340A\003\022\020\n\003uid\030\004 \001(\tB\003\340A\003\0224\n\013c"
          + "reate_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\021\n\004etag\030\010 \001(\tB\003\340"
          + "A\001\022G\n\004uris\030\t \001(\01324.google.cloud.secureso"
          + "urcemanager.v1.Repository.URIsB\003\340A\003\022Z\n\016i"
          + "nitial_config\030\n \001(\0132=.google.cloud.secur"
          + "esourcemanager.v1.Repository.InitialConf"
          + "igB\003\340A\004\032C\n\004URIs\022\021\n\004html\030\001 \001(\tB\003\340A\003\022\026\n\tgi"
          + "t_https\030\002 \001(\tB\003\340A\003\022\020\n\003api\030\003 \001(\tB\003\340A\003\032\\\n\r"
          + "InitialConfig\022\026\n\016default_branch\030\001 \001(\t\022\022\n"
          + "\ngitignores\030\002 \003(\t\022\017\n\007license\030\003 \001(\t\022\016\n\006re"
          + "adme\030\004 \001(\t:u\352Ar\n-securesourcemanager.goo"
          + "gleapis.com/Repository\022Aprojects/{projec"
          + "t}/locations/{location}/repositories/{re"
          + "pository}\"\244\001\n\024ListInstancesRequest\022C\n\006pa"
          + "rent\030\001 \001(\tB3\340A\002\372A-\022+securesourcemanager."
          + "googleapis.com/Instance\022\021\n\tpage_size\030\002 \001"
          + "(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020"
          + "\n\010order_by\030\005 \001(\t\"\207\001\n\025ListInstancesRespon"
          + "se\022@\n\tinstances\030\001 \003(\0132-.google.cloud.sec"
          + "uresourcemanager.v1.Instance\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"W\n\022Ge"
          + "tInstanceRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+"
          + "securesourcemanager.googleapis.com/Insta"
          + "nce\"\325\001\n\025CreateInstanceRequest\022C\n\006parent\030"
          + "\001 \001(\tB3\340A\002\372A-\022+securesourcemanager.googl"
          + "eapis.com/Instance\022\030\n\013instance_id\030\002 \001(\tB"
          + "\003\340A\002\022D\n\010instance\030\003 \001(\0132-.google.cloud.se"
          + "curesourcemanager.v1.InstanceB\003\340A\002\022\027\n\nre"
          + "quest_id\030\004 \001(\tB\003\340A\001\"s\n\025DeleteInstanceReq"
          + "uest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+securesource"
          + "manager.googleapis.com/Instance\022\027\n\nreque"
          + "st_id\030\002 \001(\tB\003\340A\001\"\200\002\n\021OperationMetadata\0224"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB"
          + "\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_messag"
          + "e\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006"
          + " \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\003\"\241\001\n\027"
          + "ListRepositoriesRequest\022E\n\006parent\030\001 \001(\tB"
          + "5\340A\002\372A/\022-securesourcemanager.googleapis."
          + "com/Repository\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\022"
          + "\n\npage_token\030\003 \001(\t\022\023\n\006filter\030\004 \001(\tB\003\340A\001\""
          + "z\n\030ListRepositoriesResponse\022E\n\014repositor"
          + "ies\030\001 \003(\0132/.google.cloud.securesourceman"
          + "ager.v1.Repository\022\027\n\017next_page_token\030\002 "
          + "\001(\t\"[\n\024GetRepositoryRequest\022C\n\004name\030\001 \001("
          + "\tB5\340A\002\372A/\n-securesourcemanager.googleapi"
          + "s.com/Repository\"\306\001\n\027CreateRepositoryReq"
          + "uest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-securesour"
          + "cemanager.googleapis.com/Repository\022H\n\nr"
          + "epository\030\002 \001(\0132/.google.cloud.securesou"
          + "rcemanager.v1.RepositoryB\003\340A\002\022\032\n\rreposit"
          + "ory_id\030\003 \001(\tB\003\340A\002\"z\n\027DeleteRepositoryReq"
          + "uest\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-securesource"
          + "manager.googleapis.com/Repository\022\032\n\rall"
          + "ow_missing\030\002 \001(\010B\003\340A\0012\301\022\n\023SecureSourceMa"
          + "nager\022\306\001\n\rListInstances\0229.google.cloud.s"
          + "ecuresourcemanager.v1.ListInstancesReque"
          + "st\032:.google.cloud.securesourcemanager.v1"
          + ".ListInstancesResponse\">\332A\006parent\202\323\344\223\002/\022"
          + "-/v1/{parent=projects/*/locations/*}/ins"
          + "tances\022\263\001\n\013GetInstance\0227.google.cloud.se"
          + "curesourcemanager.v1.GetInstanceRequest\032"
          + "-.google.cloud.securesourcemanager.v1.In"
          + "stance\"<\332A\004name\202\323\344\223\002/\022-/v1/{name=project"
          + "s/*/locations/*/instances/*}\022\352\001\n\016CreateI"
          + "nstance\022:.google.cloud.securesourcemanag"
          + "er.v1.CreateInstanceRequest\032\035.google.lon"
          + "grunning.Operation\"}\312A\035\n\010Instance\022\021Opera"
          + "tionMetadata\332A\033parent,instance,instance_"
          + "id\202\323\344\223\0029\"-/v1/{parent=projects/*/locatio"
          + "ns/*}/instances:\010instance\022\326\001\n\016DeleteInst"
          + "ance\022:.google.cloud.securesourcemanager."
          + "v1.DeleteInstanceRequest\032\035.google.longru"
          + "nning.Operation\"i\312A*\n\025google.protobuf.Em"
          + "pty\022\021OperationMetadata\332A\004name\202\323\344\223\002/*-/v1"
          + "/{name=projects/*/locations/*/instances/"
          + "*}\022\322\001\n\020ListRepositories\022<.google.cloud.s"
          + "ecuresourcemanager.v1.ListRepositoriesRe"
          + "quest\032=.google.cloud.securesourcemanager"
          + ".v1.ListRepositoriesResponse\"A\332A\006parent\202"
          + "\323\344\223\0022\0220/v1/{parent=projects/*/locations/"
          + "*}/repositories\022\274\001\n\rGetRepository\0229.goog"
          + "le.cloud.securesourcemanager.v1.GetRepos"
          + "itoryRequest\032/.google.cloud.securesource"
          + "manager.v1.Repository\"?\332A\004name\202\323\344\223\0022\0220/v"
          + "1/{name=projects/*/locations/*/repositor"
          + "ies/*}\022\372\001\n\020CreateRepository\022<.google.clo"
          + "ud.securesourcemanager.v1.CreateReposito"
          + "ryRequest\032\035.google.longrunning.Operation"
          + "\"\210\001\312A\037\n\nRepository\022\021OperationMetadata\332A\037"
          + "parent,repository,repository_id\202\323\344\223\002>\"0/"
          + "v1/{parent=projects/*/locations/*}/repos"
          + "itories:\nrepository\022\335\001\n\020DeleteRepository"
          + "\022<.google.cloud.securesourcemanager.v1.D"
          + "eleteRepositoryRequest\032\035.google.longrunn"
          + "ing.Operation\"l\312A*\n\025google.protobuf.Empt"
          + "y\022\021OperationMetadata\332A\004name\202\323\344\223\0022*0/v1/{"
          + "name=projects/*/locations/*/repositories"
          + "/*}\022\243\001\n\020GetIamPolicyRepo\022\".google.iam.v1"
          + ".GetIamPolicyRequest\032\025.google.iam.v1.Pol"
          + "icy\"T\332A\010resource\202\323\344\223\002C\022A/v1/{resource=pr"
          + "ojects/*/locations/*/repositories/*}:get"
          + "IamPolicy\022\246\001\n\020SetIamPolicyRepo\022\".google."
          + "iam.v1.SetIamPolicyRequest\032\025.google.iam."
          + "v1.Policy\"W\332A\010resource\202\323\344\223\002F\"A/v1/{resou"
          + "rce=projects/*/locations/*/repositories/"
          + "*}:setIamPolicy:\001*\022\314\001\n\026TestIamPermission"
          + "sRepo\022(.google.iam.v1.TestIamPermissions"
          + "Request\032).google.iam.v1.TestIamPermissio"
          + "nsResponse\"]\332A\010resource\202\323\344\223\002L\"G/v1/{reso"
          + "urce=projects/*/locations/*/repositories"
          + "/*}:testIamPermissions:\001*\032V\312A\"securesour"
          + "cemanager.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\351\004\n\'co"
          + "m.google.cloud.securesourcemanager.v1B\030S"
          + "ecureSourceManagerProtoP\001ZYcloud.google."
          + "com/go/securesourcemanager/apiv1/secures"
          + "ourcemanagerpb;securesourcemanagerpb\252\002#G"
          + "oogle.Cloud.SecureSourceManager.V1\312\002#Goo"
          + "gle\\Cloud\\SecureSourceManager\\V1\352\002&Googl"
          + "e::Cloud::SecureSourceManager::V1\352Ax\n!cl"
          + "oudkms.googleapis.com/CryptoKey\022Sproject"
          + "s/{project}/locations/{location}/keyRing"
          + "s/{key_ring}/cryptoKeys/{crypto_key}\352A\\\n"
          + "\037privateca.googleapis.com/CaPool\0229projec"
          + "ts/{project}/locations/{location}/caPool"
          + "s/{ca_pool}\352Aw\n(compute.googleapis.com/S"
          + "erviceAttachment\022Kprojects/{project}/reg"
          + "ions/{region}/serviceAttachments/{servic"
          + "e_attachment}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securesourcemanager_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securesourcemanager_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "State",
              "StateNote",
              "KmsKey",
              "HostConfig",
            });
    internal_static_google_cloud_securesourcemanager_v1_Instance_HostConfig_descriptor =
        internal_static_google_cloud_securesourcemanager_v1_Instance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securesourcemanager_v1_Instance_HostConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Instance_HostConfig_descriptor,
            new java.lang.String[] {
              "Html", "Api", "GitHttp", "GitSsh",
            });
    internal_static_google_cloud_securesourcemanager_v1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_securesourcemanager_v1_Instance_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securesourcemanager_v1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securesourcemanager_v1_Repository_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securesourcemanager_v1_Repository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Repository_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Instance",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Uris",
              "InitialConfig",
            });
    internal_static_google_cloud_securesourcemanager_v1_Repository_URIs_descriptor =
        internal_static_google_cloud_securesourcemanager_v1_Repository_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securesourcemanager_v1_Repository_URIs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Repository_URIs_descriptor,
            new java.lang.String[] {
              "Html", "GitHttps", "Api",
            });
    internal_static_google_cloud_securesourcemanager_v1_Repository_InitialConfig_descriptor =
        internal_static_google_cloud_securesourcemanager_v1_Repository_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securesourcemanager_v1_Repository_InitialConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_Repository_InitialConfig_descriptor,
            new java.lang.String[] {
              "DefaultBranch", "Gitignores", "License", "Readme",
            });
    internal_static_google_cloud_securesourcemanager_v1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_securesourcemanager_v1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_securesourcemanager_v1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_securesourcemanager_v1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_securesourcemanager_v1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_securesourcemanager_v1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_securesourcemanager_v1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_securesourcemanager_v1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance", "RequestId",
            });
    internal_static_google_cloud_securesourcemanager_v1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_securesourcemanager_v1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_securesourcemanager_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_securesourcemanager_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_ListRepositoriesResponse_descriptor,
            new java.lang.String[] {
              "Repositories", "NextPageToken",
            });
    internal_static_google_cloud_securesourcemanager_v1_GetRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_securesourcemanager_v1_GetRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_GetRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_securesourcemanager_v1_CreateRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_securesourcemanager_v1_CreateRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_CreateRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Repository", "RepositoryId",
            });
    internal_static_google_cloud_securesourcemanager_v1_DeleteRepositoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_securesourcemanager_v1_DeleteRepositoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securesourcemanager_v1_DeleteRepositoryRequest_descriptor,
            new java.lang.String[] {
              "Name", "AllowMissing",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
