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
// source: google/cloud/beyondcorp/appconnections/v1/app_connections_service.proto

package com.google.cloud.beyondcorp.appconnections.v1;

public final class AppConnectionsServiceProto {
  private AppConnectionsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/beyondcorp/appconnections"
          + "/v1/app_connections_service.proto\022)googl"
          + "e.cloud.beyondcorp.appconnections.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032#google/"
          + "longrunning/operations.proto\032 google/pro"
          + "tobuf/field_mask.proto\032\037google/protobuf/"
          + "timestamp.proto\"\271\001\n\031ListAppConnectionsRe"
          + "quest\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\022\'beyondcor"
          + "p.googleapis.com/AppConnection\022\026\n\tpage_s"
          + "ize\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022"
          + "\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003"
          + "\340A\001\"\235\001\n\032ListAppConnectionsResponse\022Q\n\017ap"
          + "p_connections\030\001 \003(\01328.google.cloud.beyon"
          + "dcorp.appconnections.v1.AppConnection\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 "
          + "\003(\t\"X\n\027GetAppConnectionRequest\022=\n\004name\030\001"
          + " \001(\tB/\340A\002\372A)\n\'beyondcorp.googleapis.com/"
          + "AppConnection\"\211\002\n\032CreateAppConnectionReq"
          + "uest\022?\n\006parent\030\001 \001(\tB/\340A\002\372A)\022\'beyondcorp"
          + ".googleapis.com/AppConnection\022\036\n\021app_con"
          + "nection_id\030\002 \001(\tB\003\340A\001\022U\n\016app_connection\030"
          + "\003 \001(\01328.google.cloud.beyondcorp.appconne"
          + "ctions.v1.AppConnectionB\003\340A\002\022\027\n\nrequest_"
          + "id\030\004 \001(\tB\003\340A\001\022\032\n\rvalidate_only\030\005 \001(\010B\003\340A"
          + "\001\"\372\001\n\032UpdateAppConnectionRequest\0224\n\013upda"
          + "te_mask\030\001 \001(\0132\032.google.protobuf.FieldMas"
          + "kB\003\340A\002\022U\n\016app_connection\030\002 \001(\01328.google."
          + "cloud.beyondcorp.appconnections.v1.AppCo"
          + "nnectionB\003\340A\002\022\027\n\nrequest_id\030\003 \001(\tB\003\340A\001\022\032"
          + "\n\rvalidate_only\030\004 \001(\010B\003\340A\001\022\032\n\rallow_miss"
          + "ing\030\005 \001(\010B\003\340A\001\"\220\001\n\032DeleteAppConnectionRe"
          + "quest\022=\n\004name\030\001 \001(\tB/\340A\002\372A)\n\'beyondcorp."
          + "googleapis.com/AppConnection\022\027\n\nrequest_"
          + "id\030\002 \001(\tB\003\340A\001\022\032\n\rvalidate_only\030\003 \001(\010B\003\340A"
          + "\001\"\332\001\n\034ResolveAppConnectionsRequest\022?\n\006pa"
          + "rent\030\001 \001(\tB/\340A\002\372A)\022\'beyondcorp.googleapi"
          + "s.com/AppConnection\022H\n\020app_connector_id\030"
          + "\002 \001(\tB.\340A\002\372A(\n&beyondcorp.googleapis.com"
          + "/AppConnector\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n"
          + "\npage_token\030\004 \001(\tB\003\340A\001\"\317\002\n\035ResolveAppCon"
          + "nectionsResponse\022}\n\026app_connection_detai"
          + "ls\030\001 \003(\0132].google.cloud.beyondcorp.appco"
          + "nnections.v1.ResolveAppConnectionsRespon"
          + "se.AppConnectionDetails\022\027\n\017next_page_tok"
          + "en\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\032\200\001\n\024AppCon"
          + "nectionDetails\022P\n\016app_connection\030\001 \001(\01328"
          + ".google.cloud.beyondcorp.appconnections."
          + "v1.AppConnection\022\026\n\016recent_mig_vms\030\002 \003(\t"
          + "\"\231\n\n\rAppConnection\022\021\n\004name\030\001 \001(\tB\003\340A\002\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\022Y\n\006labels\030\004 \003("
          + "\0132D.google.cloud.beyondcorp.appconnectio"
          + "ns.v1.AppConnection.LabelsEntryB\003\340A\001\022\031\n\014"
          + "display_name\030\005 \001(\tB\003\340A\001\022\020\n\003uid\030\006 \001(\tB\003\340A"
          + "\003\022P\n\004type\030\007 \001(\0162=.google.cloud.beyondcor"
          + "p.appconnections.v1.AppConnection.TypeB\003"
          + "\340A\002\022o\n\024application_endpoint\030\010 \001(\0132L.goog"
          + "le.cloud.beyondcorp.appconnections.v1.Ap"
          + "pConnection.ApplicationEndpointB\003\340A\002\022\027\n\n"
          + "connectors\030\t \003(\tB\003\340A\001\022R\n\005state\030\n \001(\0162>.g"
          + "oogle.cloud.beyondcorp.appconnections.v1"
          + ".AppConnection.StateB\003\340A\003\022V\n\007gateway\030\013 \001"
          + "(\0132@.google.cloud.beyondcorp.appconnecti"
          + "ons.v1.AppConnection.GatewayB\003\340A\001\032;\n\023App"
          + "licationEndpoint\022\021\n\004host\030\001 \001(\tB\003\340A\002\022\021\n\004p"
          + "ort\030\002 \001(\005B\003\340A\002\032\207\002\n\007Gateway\022X\n\004type\030\002 \001(\016"
          + "2E.google.cloud.beyondcorp.appconnection"
          + "s.v1.AppConnection.Gateway.TypeB\003\340A\002\022\020\n\003"
          + "uri\030\003 \001(\tB\003\340A\003\022\031\n\014ingress_port\030\004 \001(\005B\003\340A"
          + "\003\022A\n\013app_gateway\030\005 \001(\tB,\340A\002\372A&\n$beyondco"
          + "rp.googleapis.com/AppGateway\"2\n\004Type\022\024\n\020"
          + "TYPE_UNSPECIFIED\020\000\022\024\n\020GCP_REGIONAL_MIG\020\001"
          + "\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\001\"+\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022\r\n"
          + "\tTCP_PROXY\020\001\"_\n\005State\022\025\n\021STATE_UNSPECIFI"
          + "ED\020\000\022\014\n\010CREATING\020\001\022\013\n\007CREATED\020\002\022\014\n\010UPDAT"
          + "ING\020\003\022\014\n\010DELETING\020\004\022\010\n\004DOWN\020\005:u\352Ar\n\'beyo"
          + "ndcorp.googleapis.com/AppConnection\022Gpro"
          + "jects/{project}/locations/{location}/app"
          + "Connections/{app_connection}\"\215\002\n\036AppConn"
          + "ectionOperationMetadata\0224\n\013create_time\030\001"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 "
          + "\001(\tB\003\340A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013ap"
          + "i_version\030\007 \001(\tB\003\340A\0032\352\014\n\025AppConnectionsS"
          + "ervice\022\346\001\n\022ListAppConnections\022D.google.c"
          + "loud.beyondcorp.appconnections.v1.ListAp"
          + "pConnectionsRequest\032E.google.cloud.beyon"
          + "dcorp.appconnections.v1.ListAppConnectio"
          + "nsResponse\"C\202\323\344\223\0024\0222/v1/{parent=projects"
          + "/*/locations/*}/appConnections\332A\006parent\022"
          + "\323\001\n\020GetAppConnection\022B.google.cloud.beyo"
          + "ndcorp.appconnections.v1.GetAppConnectio"
          + "nRequest\0328.google.cloud.beyondcorp.appco"
          + "nnections.v1.AppConnection\"A\202\323\344\223\0024\0222/v1/"
          + "{name=projects/*/locations/*/appConnecti"
          + "ons/*}\332A\004name\022\244\002\n\023CreateAppConnection\022E."
          + "google.cloud.beyondcorp.appconnections.v"
          + "1.CreateAppConnectionRequest\032\035.google.lo"
          + "ngrunning.Operation\"\246\001\202\323\344\223\002D\"2/v1/{paren"
          + "t=projects/*/locations/*}/appConnections"
          + ":\016app_connection\332A\'parent,app_connection"
          + ",app_connection_id\312A/\n\rAppConnection\022\036Ap"
          + "pConnectionOperationMetadata\022\246\002\n\023UpdateA"
          + "ppConnection\022E.google.cloud.beyondcorp.a"
          + "ppconnections.v1.UpdateAppConnectionRequ"
          + "est\032\035.google.longrunning.Operation\"\250\001\202\323\344"
          + "\223\002S2A/v1/{app_connection.name=projects/*"
          + "/locations/*/appConnections/*}:\016app_conn"
          + "ection\332A\032app_connection,update_mask\312A/\n\r"
          + "AppConnection\022\036AppConnectionOperationMet"
          + "adata\022\370\001\n\023DeleteAppConnection\022E.google.c"
          + "loud.beyondcorp.appconnections.v1.Delete"
          + "AppConnectionRequest\032\035.google.longrunnin"
          + "g.Operation\"{\202\323\344\223\0024*2/v1/{name=projects/"
          + "*/locations/*/appConnections/*}\332A\004name\312A"
          + "7\n\025google.protobuf.Empty\022\036AppConnectionO"
          + "perationMetadata\022\367\001\n\025ResolveAppConnectio"
          + "ns\022G.google.cloud.beyondcorp.appconnecti"
          + "ons.v1.ResolveAppConnectionsRequest\032H.go"
          + "ogle.cloud.beyondcorp.appconnections.v1."
          + "ResolveAppConnectionsResponse\"K\202\323\344\223\002<\022:/"
          + "v1/{parent=projects/*/locations/*}/appCo"
          + "nnections:resolve\332A\006parent\032M\312A\031beyondcor"
          + "p.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformB\212\004\n-com.google"
          + ".cloud.beyondcorp.appconnections.v1B\032App"
          + "ConnectionsServiceProtoP\001ZUcloud.google."
          + "com/go/beyondcorp/appconnections/apiv1/a"
          + "ppconnectionspb;appconnectionspb\252\002)Googl"
          + "e.Cloud.BeyondCorp.AppConnections.V1\312\002)G"
          + "oogle\\Cloud\\BeyondCorp\\AppConnections\\V1"
          + "\352\002-Google::Cloud::BeyondCorp::AppConnect"
          + "ions::V1\352Ao\n&beyondcorp.googleapis.com/A"
          + "ppConnector\022Eprojects/{project}/location"
          + "s/{location}/appConnectors/{app_connecto"
          + "r}\352Ai\n$beyondcorp.googleapis.com/AppGate"
          + "way\022Aprojects/{project}/locations/{locat"
          + "ion}/appGateways/{app_gateway}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ListAppConnectionsResponse_descriptor,
            new java.lang.String[] {
              "AppConnections", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_GetAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_CreateAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AppConnectionId", "AppConnection", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_UpdateAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "AppConnection", "RequestId", "ValidateOnly", "AllowMissing",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_DeleteAppConnectionRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AppConnectorId", "PageSize", "PageToken",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor,
            new java.lang.String[] {
              "AppConnectionDetails", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_ResolveAppConnectionsResponse_AppConnectionDetails_descriptor,
            new java.lang.String[] {
              "AppConnection", "RecentMigVms",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "DisplayName",
              "Uid",
              "Type",
              "ApplicationEndpoint",
              "Connectors",
              "State",
              "Gateway",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_ApplicationEndpoint_descriptor,
            new java.lang.String[] {
              "Host", "Port",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_Gateway_descriptor,
            new java.lang.String[] {
              "Type", "Uri", "IngressPort", "AppGateway",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor =
        internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnection_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_appconnections_v1_AppConnectionOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
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
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
