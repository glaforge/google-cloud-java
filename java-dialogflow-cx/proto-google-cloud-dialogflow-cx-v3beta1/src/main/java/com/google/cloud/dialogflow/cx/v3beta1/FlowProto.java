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
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3beta1;

public final class FlowProto {
  private FlowProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/cx/v3beta1/flo"
          + "w.proto\022\"google.cloud.dialogflow.cx.v3be"
          + "ta1\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032:"
          + "google/cloud/dialogflow/cx/v3beta1/advan"
          + "ced_settings.proto\0328google/cloud/dialogf"
          + "low/cx/v3beta1/import_strategy.proto\032-go"
          + "ogle/cloud/dialogflow/cx/v3beta1/page.pr"
          + "oto\032;google/cloud/dialogflow/cx/v3beta1/"
          + "validation_message.proto\032#google/longrun"
          + "ning/operations.proto\032\033google/protobuf/e"
          + "mpty.proto\032 google/protobuf/field_mask.p"
          + "roto\032\034google/protobuf/struct.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\266\003\n\013NluSetti"
          + "ngs\022M\n\nmodel_type\030\001 \001(\01629.google.cloud.d"
          + "ialogflow.cx.v3beta1.NluSettings.ModelTy"
          + "pe\022 \n\030classification_threshold\030\003 \001(\002\022^\n\023"
          + "model_training_mode\030\004 \001(\0162A.google.cloud"
          + ".dialogflow.cx.v3beta1.NluSettings.Model"
          + "TrainingMode\"Y\n\tModelType\022\032\n\026MODEL_TYPE_"
          + "UNSPECIFIED\020\000\022\027\n\023MODEL_TYPE_STANDARD\020\001\022\027"
          + "\n\023MODEL_TYPE_ADVANCED\020\003\"{\n\021ModelTraining"
          + "Mode\022#\n\037MODEL_TRAINING_MODE_UNSPECIFIED\020"
          + "\000\022!\n\035MODEL_TRAINING_MODE_AUTOMATIC\020\001\022\036\n\032"
          + "MODEL_TRAINING_MODE_MANUAL\020\002\"\376\006\n\004Flow\022\014\n"
          + "\004name\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023"
          + "\n\013description\030\003 \001(\t\022N\n\021transition_routes"
          + "\030\004 \003(\01323.google.cloud.dialogflow.cx.v3be"
          + "ta1.TransitionRoute\022H\n\016event_handlers\030\n "
          + "\003(\01320.google.cloud.dialogflow.cx.v3beta1"
          + ".EventHandler\022T\n\027transition_route_groups"
          + "\030\017 \003(\tB3\372A0\n.dialogflow.googleapis.com/T"
          + "ransitionRouteGroup\022E\n\014nlu_settings\030\013 \001("
          + "\0132/.google.cloud.dialogflow.cx.v3beta1.N"
          + "luSettings\022O\n\021advanced_settings\030\016 \001(\01324."
          + "google.cloud.dialogflow.cx.v3beta1.Advan"
          + "cedSettings\022i\n\034knowledge_connector_setti"
          + "ngs\030\022 \001(\0132>.google.cloud.dialogflow.cx.v"
          + "3beta1.KnowledgeConnectorSettingsB\003\340A\001\022d"
          + "\n\027multi_language_settings\030\034 \001(\0132>.google"
          + ".cloud.dialogflow.cx.v3beta1.Flow.MultiL"
          + "anguageSettingsB\003\340A\001\032u\n\025MultiLanguageSet"
          + "tings\022,\n\037enable_multi_language_detection"
          + "\030\001 \001(\010B\003\340A\001\022.\n!supported_response_langua"
          + "ge_codes\030\002 \003(\tB\003\340A\001:h\352Ae\n\036dialogflow.goo"
          + "gleapis.com/Flow\022Cprojects/{project}/loc"
          + "ations/{location}/agents/{agent}/flows/{"
          + "flow}\"\237\001\n\021CreateFlowRequest\0226\n\006parent\030\001 "
          + "\001(\tB&\340A\002\372A \022\036dialogflow.googleapis.com/F"
          + "low\022;\n\004flow\030\002 \001(\0132(.google.cloud.dialogf"
          + "low.cx.v3beta1.FlowB\003\340A\002\022\025\n\rlanguage_cod"
          + "e\030\003 \001(\t\"X\n\021DeleteFlowRequest\0224\n\004name\030\001 \001"
          + "(\tB&\340A\002\372A \n\036dialogflow.googleapis.com/Fl"
          + "ow\022\r\n\005force\030\002 \001(\010\"\210\001\n\020ListFlowsRequest\0226"
          + "\n\006parent\030\001 \001(\tB&\340A\002\372A \022\036dialogflow.googl"
          + "eapis.com/Flow\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag"
          + "e_token\030\003 \001(\t\022\025\n\rlanguage_code\030\004 \001(\t\"e\n\021"
          + "ListFlowsResponse\0227\n\005flows\030\001 \003(\0132(.googl"
          + "e.cloud.dialogflow.cx.v3beta1.Flow\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"]\n\016GetFlowRequest\0224\n"
          + "\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.googleap"
          + "is.com/Flow\022\025\n\rlanguage_code\030\002 \001(\t\"\230\001\n\021U"
          + "pdateFlowRequest\022;\n\004flow\030\001 \001(\0132(.google."
          + "cloud.dialogflow.cx.v3beta1.FlowB\003\340A\002\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.Fie"
          + "ldMask\022\025\n\rlanguage_code\030\003 \001(\t\"H\n\020TrainFl"
          + "owRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogf"
          + "low.googleapis.com/Flow\"b\n\023ValidateFlowR"
          + "equest\0224\n\004name\030\001 \001(\tB&\340A\002\372A \n\036dialogflow"
          + ".googleapis.com/Flow\022\025\n\rlanguage_code\030\002 "
          + "\001(\t\"}\n\036GetFlowValidationResultRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n.dialogflow.googleap"
          + "is.com/FlowValidationResult\022\025\n\rlanguage_"
          + "code\030\002 \001(\t\"\266\002\n\024FlowValidationResult\022\014\n\004n"
          + "ame\030\001 \001(\t\022R\n\023validation_messages\030\002 \003(\01325"
          + ".google.cloud.dialogflow.cx.v3beta1.Vali"
          + "dationMessage\022/\n\013update_time\030\003 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp:\212\001\352A\206\001\n.dialogflo"
          + "w.googleapis.com/FlowValidationResult\022Tp"
          + "rojects/{project}/locations/{location}/a"
          + "gents/{agent}/flows/{flow}/validationRes"
          + "ult\"\374\002\n\021ImportFlowRequest\0226\n\006parent\030\001 \001("
          + "\tB&\340A\002\372A \022\036dialogflow.googleapis.com/Flo"
          + "w\022\022\n\010flow_uri\030\002 \001(\tH\000\022\026\n\014flow_content\030\003 "
          + "\001(\014H\000\022Y\n\rimport_option\030\004 \001(\0162B.google.cl"
          + "oud.dialogflow.cx.v3beta1.ImportFlowRequ"
          + "est.ImportOption\022Y\n\024flow_import_strategy"
          + "\030\005 \001(\01326.google.cloud.dialogflow.cx.v3be"
          + "ta1.FlowImportStrategyB\003\340A\001\"E\n\014ImportOpt"
          + "ion\022\035\n\031IMPORT_OPTION_UNSPECIFIED\020\000\022\010\n\004KE"
          + "EP\020\001\022\014\n\010FALLBACK\020\002B\006\n\004flow\"m\n\022FlowImport"
          + "Strategy\022W\n\026global_import_strategy\030\001 \001(\016"
          + "22.google.cloud.dialogflow.cx.v3beta1.Im"
          + "portStrategyB\003\340A\001\"G\n\022ImportFlowResponse\022"
          + "1\n\004flow\030\001 \001(\tB#\372A \n\036dialogflow.googleapi"
          + "s.com/Flow\"\207\001\n\021ExportFlowRequest\0224\n\004name"
          + "\030\001 \001(\tB&\340A\002\372A \n\036dialogflow.googleapis.co"
          + "m/Flow\022\025\n\010flow_uri\030\002 \001(\tB\003\340A\001\022%\n\030include"
          + "_referenced_flows\030\004 \001(\010B\003\340A\001\"H\n\022ExportFl"
          + "owResponse\022\022\n\010flow_uri\030\001 \001(\tH\000\022\026\n\014flow_c"
          + "ontent\030\002 \001(\014H\000B\006\n\004flow2\233\021\n\005Flows\022\302\001\n\nCre"
          + "ateFlow\0225.google.cloud.dialogflow.cx.v3b"
          + "eta1.CreateFlowRequest\032(.google.cloud.di"
          + "alogflow.cx.v3beta1.Flow\"S\332A\013parent,flow"
          + "\202\323\344\223\002?\"7/v3beta1/{parent=projects/*/loca"
          + "tions/*/agents/*}/flows:\004flow\022\243\001\n\nDelete"
          + "Flow\0225.google.cloud.dialogflow.cx.v3beta"
          + "1.DeleteFlowRequest\032\026.google.protobuf.Em"
          + "pty\"F\332A\004name\202\323\344\223\0029*7/v3beta1/{name=proje"
          + "cts/*/locations/*/agents/*/flows/*}\022\302\001\n\t"
          + "ListFlows\0224.google.cloud.dialogflow.cx.v"
          + "3beta1.ListFlowsRequest\0325.google.cloud.d"
          + "ialogflow.cx.v3beta1.ListFlowsResponse\"H"
          + "\332A\006parent\202\323\344\223\0029\0227/v3beta1/{parent=projec"
          + "ts/*/locations/*/agents/*}/flows\022\257\001\n\007Get"
          + "Flow\0222.google.cloud.dialogflow.cx.v3beta"
          + "1.GetFlowRequest\032(.google.cloud.dialogfl"
          + "ow.cx.v3beta1.Flow\"F\332A\004name\202\323\344\223\0029\0227/v3be"
          + "ta1/{name=projects/*/locations/*/agents/"
          + "*/flows/*}\022\314\001\n\nUpdateFlow\0225.google.cloud"
          + ".dialogflow.cx.v3beta1.UpdateFlowRequest"
          + "\032(.google.cloud.dialogflow.cx.v3beta1.Fl"
          + "ow\"]\332A\020flow,update_mask\202\323\344\223\002D2</v3beta1/"
          + "{flow.name=projects/*/locations/*/agents"
          + "/*/flows/*}:\004flow\022\344\001\n\tTrainFlow\0224.google"
          + ".cloud.dialogflow.cx.v3beta1.TrainFlowRe"
          + "quest\032\035.google.longrunning.Operation\"\201\001\312"
          + "A/\n\025google.protobuf.Empty\022\026google.protob"
          + "uf.Struct\332A\004name\202\323\344\223\002B\"=/v3beta1/{name=p"
          + "rojects/*/locations/*/agents/*/flows/*}:"
          + "train:\001*\022\316\001\n\014ValidateFlow\0227.google.cloud"
          + ".dialogflow.cx.v3beta1.ValidateFlowReque"
          + "st\0328.google.cloud.dialogflow.cx.v3beta1."
          + "FlowValidationResult\"K\202\323\344\223\002E\"@/v3beta1/{"
          + "name=projects/*/locations/*/agents/*/flo"
          + "ws/*}:validate:\001*\022\360\001\n\027GetFlowValidationR"
          + "esult\022B.google.cloud.dialogflow.cx.v3bet"
          + "a1.GetFlowValidationResultRequest\0328.goog"
          + "le.cloud.dialogflow.cx.v3beta1.FlowValid"
          + "ationResult\"W\332A\004name\202\323\344\223\002J\022H/v3beta1/{na"
          + "me=projects/*/locations/*/agents/*/flows"
          + "/*/validationResult}\022\334\001\n\nImportFlow\0225.go"
          + "ogle.cloud.dialogflow.cx.v3beta1.ImportF"
          + "lowRequest\032\035.google.longrunning.Operatio"
          + "n\"x\312A,\n\022ImportFlowResponse\022\026google.proto"
          + "buf.Struct\202\323\344\223\002C\">/v3beta1/{parent=proje"
          + "cts/*/locations/*/agents/*}/flows:import"
          + ":\001*\022\334\001\n\nExportFlow\0225.google.cloud.dialog"
          + "flow.cx.v3beta1.ExportFlowRequest\032\035.goog"
          + "le.longrunning.Operation\"x\312A,\n\022ExportFlo"
          + "wResponse\022\026google.protobuf.Struct\202\323\344\223\002C\""
          + ">/v3beta1/{name=projects/*/locations/*/a"
          + "gents/*/flows/*}:export:\001*\032x\312A\031dialogflo"
          + "w.googleapis.com\322AYhttps://www.googleapi"
          + "s.com/auth/cloud-platform,https://www.go"
          + "ogleapis.com/auth/dialogflowB\303\001\n&com.goo"
          + "gle.cloud.dialogflow.cx.v3beta1B\tFlowPro"
          + "toP\001Z6cloud.google.com/go/dialogflow/cx/"
          + "apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cl"
          + "oud.Dialogflow.Cx.V3Beta1\352\002&Google::Clou"
          + "d::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ImportStrategyProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor,
            new java.lang.String[] {
              "ModelType", "ClassificationThreshold", "ModelTrainingMode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "TransitionRoutes",
              "EventHandlers",
              "TransitionRouteGroups",
              "NluSettings",
              "AdvancedSettings",
              "KnowledgeConnectorSettings",
              "MultiLanguageSettings",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Flow_MultiLanguageSettings_descriptor,
            new java.lang.String[] {
              "EnableMultiLanguageDetection", "SupportedResponseLanguageCodes",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Flow", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListFlowsResponse_descriptor,
            new java.lang.String[] {
              "Flows", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateFlowRequest_descriptor,
            new java.lang.String[] {
              "Flow", "UpdateMask", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_TrainFlowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ValidateFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetFlowValidationResultRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_FlowValidationResult_descriptor,
            new java.lang.String[] {
              "Name", "ValidationMessages", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FlowUri", "FlowContent", "ImportOption", "FlowImportStrategy", "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_FlowImportStrategy_descriptor,
            new java.lang.String[] {
              "GlobalImportStrategy",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ImportFlowResponse_descriptor,
            new java.lang.String[] {
              "Flow",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowRequest_descriptor,
            new java.lang.String[] {
              "Name", "FlowUri", "IncludeReferencedFlows",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ExportFlowResponse_descriptor,
            new java.lang.String[] {
              "FlowUri", "FlowContent", "Flow",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.AdvancedSettingsProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ImportStrategyProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.PageProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ValidationMessageProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
