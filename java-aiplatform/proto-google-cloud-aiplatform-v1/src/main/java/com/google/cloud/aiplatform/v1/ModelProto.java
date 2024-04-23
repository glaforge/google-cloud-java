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
// source: google/cloud/aiplatform/v1/model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_DataStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_DataStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_BaseModelSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_BaseModelSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_LargeModelReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelGardenSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelGardenSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenieSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenieSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Port_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Probe_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Probe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/model.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/dep"
          + "loyed_model_ref.proto\0320google/cloud/aipl"
          + "atform/v1/encryption_spec.proto\032(google/"
          + "cloud/aiplatform/v1/env_var.proto\032,googl"
          + "e/cloud/aiplatform/v1/explanation.proto\032"
          + "\036google/protobuf/duration.proto\032\034google/"
          + "protobuf/struct.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\377\024\n\005Model\022\014\n\004name\030\001 \001(\t\022\032"
          + "\n\nversion_id\030\034 \001(\tB\006\340A\005\340A\003\022\027\n\017version_al"
          + "iases\030\035 \003(\t\022<\n\023version_create_time\030\037 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022<\n\023ver"
          + "sion_update_time\030  \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340"
          + "A\002\022\023\n\013description\030\003 \001(\t\022\033\n\023version_descr"
          + "iption\030\036 \001(\t\022E\n\020predict_schemata\030\004 \001(\0132+"
          + ".google.cloud.aiplatform.v1.PredictSchem"
          + "ata\022 \n\023metadata_schema_uri\030\005 \001(\tB\003\340A\005\022-\n"
          + "\010metadata\030\006 \001(\0132\026.google.protobuf.ValueB"
          + "\003\340A\005\022U\n\030supported_export_formats\030\024 \003(\0132."
          + ".google.cloud.aiplatform.v1.Model.Export"
          + "FormatB\003\340A\003\022M\n\021training_pipeline\030\007 \001(\tB2"
          + "\340A\003\372A,\n*aiplatform.googleapis.com/Traini"
          + "ngPipeline\022C\n\014pipeline_job\030/ \001(\tB-\340A\001\372A\'"
          + "\n%aiplatform.googleapis.com/PipelineJob\022"
          + "K\n\016container_spec\030\t \001(\0132..google.cloud.a"
          + "iplatform.v1.ModelContainerSpecB\003\340A\004\022\031\n\014"
          + "artifact_uri\030\032 \001(\tB\003\340A\005\022l\n$supported_dep"
          + "loyment_resources_types\030\n \003(\01629.google.c"
          + "loud.aiplatform.v1.Model.DeploymentResou"
          + "rcesTypeB\003\340A\003\022,\n\037supported_input_storage"
          + "_formats\030\013 \003(\tB\003\340A\003\022-\n supported_output_"
          + "storage_formats\030\014 \003(\tB\003\340A\003\0224\n\013create_tim"
          + "e\030\r \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\0224\n\013update_time\030\016 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\022J\n\017deployed_models\030\017 \003(\0132"
          + ",.google.cloud.aiplatform.v1.DeployedMod"
          + "elRefB\003\340A\003\022E\n\020explanation_spec\030\027 \001(\0132+.g"
          + "oogle.cloud.aiplatform.v1.ExplanationSpe"
          + "c\022\014\n\004etag\030\020 \001(\t\022=\n\006labels\030\021 \003(\0132-.google"
          + ".cloud.aiplatform.v1.Model.LabelsEntry\022?"
          + "\n\ndata_stats\030\025 \001(\0132+.google.cloud.aiplat"
          + "form.v1.Model.DataStats\022C\n\017encryption_sp"
          + "ec\030\030 \001(\0132*.google.cloud.aiplatform.v1.En"
          + "cryptionSpec\022K\n\021model_source_info\030& \001(\0132"
          + "+.google.cloud.aiplatform.v1.ModelSource"
          + "InfoB\003\340A\003\022U\n\023original_model_info\030\" \001(\01323"
          + ".google.cloud.aiplatform.v1.Model.Origin"
          + "alModelInfoB\003\340A\003\022\036\n\021metadata_artifact\030, "
          + "\001(\tB\003\340A\003\022Q\n\021base_model_source\0302 \001(\01321.go"
          + "ogle.cloud.aiplatform.v1.Model.BaseModel"
          + "SourceB\003\340A\001\032\325\001\n\014ExportFormat\022\017\n\002id\030\001 \001(\t"
          + "B\003\340A\003\022b\n\023exportable_contents\030\002 \003(\0162@.goo"
          + "gle.cloud.aiplatform.v1.Model.ExportForm"
          + "at.ExportableContentB\003\340A\003\"P\n\021ExportableC"
          + "ontent\022\"\n\036EXPORTABLE_CONTENT_UNSPECIFIED"
          + "\020\000\022\014\n\010ARTIFACT\020\001\022\t\n\005IMAGE\020\002\032\334\001\n\tDataStat"
          + "s\022!\n\031training_data_items_count\030\001 \001(\003\022#\n\033"
          + "validation_data_items_count\030\002 \001(\003\022\035\n\025tes"
          + "t_data_items_count\030\003 \001(\003\022\"\n\032training_ann"
          + "otations_count\030\004 \001(\003\022$\n\034validation_annot"
          + "ations_count\030\005 \001(\003\022\036\n\026test_annotations_c"
          + "ount\030\006 \001(\003\032K\n\021OriginalModelInfo\0226\n\005model"
          + "\030\001 \001(\tB\'\340A\003\372A!\n\037aiplatform.googleapis.co"
          + "m/Model\032\252\001\n\017BaseModelSource\022L\n\023model_gar"
          + "den_source\030\001 \001(\0132-.google.cloud.aiplatfo"
          + "rm.v1.ModelGardenSourceH\000\022?\n\014genie_sourc"
          + "e\030\002 \001(\0132\'.google.cloud.aiplatform.v1.Gen"
          + "ieSourceH\000B\010\n\006source\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\214\001\n\027Deployme"
          + "ntResourcesType\022)\n%DEPLOYMENT_RESOURCES_"
          + "TYPE_UNSPECIFIED\020\000\022\027\n\023DEDICATED_RESOURCE"
          + "S\020\001\022\027\n\023AUTOMATIC_RESOURCES\020\002\022\024\n\020SHARED_R"
          + "ESOURCES\020\003:\\\352AY\n\037aiplatform.googleapis.c"
          + "om/Model\0226projects/{project}/locations/{"
          + "location}/models/{model}\"(\n\023LargeModelRe"
          + "ference\022\021\n\004name\030\001 \001(\tB\003\340A\002\"3\n\021ModelGarde"
          + "nSource\022\036\n\021public_model_name\030\001 \001(\tB\003\340A\002\""
          + "*\n\013GenieSource\022\033\n\016base_model_uri\030\001 \001(\tB\003"
          + "\340A\002\"{\n\017PredictSchemata\022 \n\023instance_schem"
          + "a_uri\030\001 \001(\tB\003\340A\005\022\"\n\025parameters_schema_ur"
          + "i\030\002 \001(\tB\003\340A\005\022\"\n\025prediction_schema_uri\030\003 "
          + "\001(\tB\003\340A\005\"\223\004\n\022ModelContainerSpec\022\031\n\timage"
          + "_uri\030\001 \001(\tB\006\340A\002\340A\005\022\024\n\007command\030\002 \003(\tB\003\340A\005"
          + "\022\021\n\004args\030\003 \003(\tB\003\340A\005\0224\n\003env\030\004 \003(\0132\".googl"
          + "e.cloud.aiplatform.v1.EnvVarB\003\340A\005\0224\n\005por"
          + "ts\030\005 \003(\0132 .google.cloud.aiplatform.v1.Po"
          + "rtB\003\340A\005\022\032\n\rpredict_route\030\006 \001(\tB\003\340A\005\022\031\n\014h"
          + "ealth_route\030\007 \001(\tB\003\340A\005\0229\n\ngrpc_ports\030\t \003"
          + "(\0132 .google.cloud.aiplatform.v1.PortB\003\340A"
          + "\005\022:\n\022deployment_timeout\030\n \001(\0132\031.google.p"
          + "rotobuf.DurationB\003\340A\005\022\"\n\025shared_memory_s"
          + "ize_mb\030\013 \001(\003B\003\340A\005\022=\n\rstartup_probe\030\014 \001(\013"
          + "2!.google.cloud.aiplatform.v1.ProbeB\003\340A\005"
          + "\022<\n\014health_probe\030\r \001(\0132!.google.cloud.ai"
          + "platform.v1.ProbeB\003\340A\005\"\036\n\004Port\022\026\n\016contai"
          + "ner_port\030\003 \001(\005\"\223\002\n\017ModelSourceInfo\022P\n\013so"
          + "urce_type\030\001 \001(\0162;.google.cloud.aiplatfor"
          + "m.v1.ModelSourceInfo.ModelSourceType\022\014\n\004"
          + "copy\030\002 \001(\010\"\237\001\n\017ModelSourceType\022!\n\035MODEL_"
          + "SOURCE_TYPE_UNSPECIFIED\020\000\022\n\n\006AUTOML\020\001\022\n\n"
          + "\006CUSTOM\020\002\022\010\n\004BQML\020\003\022\020\n\014MODEL_GARDEN\020\004\022\t\n"
          + "\005GENIE\020\005\022\031\n\025CUSTOM_TEXT_EMBEDDING\020\006\022\017\n\013M"
          + "ARKETPLACE\020\007\"\243\001\n\005Probe\022<\n\004exec\030\001 \001(\0132,.g"
          + "oogle.cloud.aiplatform.v1.Probe.ExecActi"
          + "onH\000\022\026\n\016period_seconds\030\002 \001(\005\022\027\n\017timeout_"
          + "seconds\030\003 \001(\005\032\035\n\nExecAction\022\017\n\007command\030\001"
          + " \003(\tB\014\n\nprobe_typeB\310\001\n\036com.google.cloud."
          + "aiplatform.v1B\nModelProtoP\001Z>cloud.googl"
          + "e.com/go/aiplatform/apiv1/aiplatformpb;a"
          + "iplatformpb\252\002\032Google.Cloud.AIPlatform.V1"
          + "\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::"
          + "Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "VersionAliases",
              "VersionCreateTime",
              "VersionUpdateTime",
              "DisplayName",
              "Description",
              "VersionDescription",
              "PredictSchemata",
              "MetadataSchemaUri",
              "Metadata",
              "SupportedExportFormats",
              "TrainingPipeline",
              "PipelineJob",
              "ContainerSpec",
              "ArtifactUri",
              "SupportedDeploymentResourcesTypes",
              "SupportedInputStorageFormats",
              "SupportedOutputStorageFormats",
              "CreateTime",
              "UpdateTime",
              "DeployedModels",
              "ExplanationSpec",
              "Etag",
              "Labels",
              "DataStats",
              "EncryptionSpec",
              "ModelSourceInfo",
              "OriginalModelInfo",
              "MetadataArtifact",
              "BaseModelSource",
            });
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor,
            new java.lang.String[] {
              "Id", "ExportableContents",
            });
    internal_static_google_cloud_aiplatform_v1_Model_DataStats_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Model_DataStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_DataStats_descriptor,
            new java.lang.String[] {
              "TrainingDataItemsCount",
              "ValidationDataItemsCount",
              "TestDataItemsCount",
              "TrainingAnnotationsCount",
              "ValidationAnnotationsCount",
              "TestAnnotationsCount",
            });
    internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_OriginalModelInfo_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_aiplatform_v1_Model_BaseModelSource_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_Model_BaseModelSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_BaseModelSource_descriptor,
            new java.lang.String[] {
              "ModelGardenSource", "GenieSource", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_LargeModelReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_LargeModelReference_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ModelGardenSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ModelGardenSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelGardenSource_descriptor,
            new java.lang.String[] {
              "PublicModelName",
            });
    internal_static_google_cloud_aiplatform_v1_GenieSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_GenieSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenieSource_descriptor,
            new java.lang.String[] {
              "BaseModelUri",
            });
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor,
            new java.lang.String[] {
              "InstanceSchemaUri", "ParametersSchemaUri", "PredictionSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Command",
              "Args",
              "Env",
              "Ports",
              "PredictRoute",
              "HealthRoute",
              "GrpcPorts",
              "DeploymentTimeout",
              "SharedMemorySizeMb",
              "StartupProbe",
              "HealthProbe",
            });
    internal_static_google_cloud_aiplatform_v1_Port_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Port_descriptor,
            new java.lang.String[] {
              "ContainerPort",
            });
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor,
            new java.lang.String[] {
              "SourceType", "Copy",
            });
    internal_static_google_cloud_aiplatform_v1_Probe_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_Probe_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Probe_descriptor,
            new java.lang.String[] {
              "Exec", "PeriodSeconds", "TimeoutSeconds", "ProbeType",
            });
    internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor =
        internal_static_google_cloud_aiplatform_v1_Probe_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Probe_ExecAction_descriptor,
            new java.lang.String[] {
              "Command",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
