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
// source: google/cloud/aiplatform/v1beta1/model.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/model."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0328google/cloud/aiplatf"
          + "orm/v1beta1/deployed_model_ref.proto\0325go"
          + "ogle/cloud/aiplatform/v1beta1/encryption"
          + "_spec.proto\032-google/cloud/aiplatform/v1b"
          + "eta1/env_var.proto\0321google/cloud/aiplatf"
          + "orm/v1beta1/explanation.proto\032\034google/pr"
          + "otobuf/struct.proto\032\037google/protobuf/tim"
          + "estamp.proto\"\250\017\n\005Model\022\014\n\004name\030\001 \001(\t\022\032\n\n"
          + "version_id\030\034 \001(\tB\006\340A\005\340A\003\022\027\n\017version_alia"
          + "ses\030\035 \003(\t\022<\n\023version_create_time\030\037 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\022<\n\023versi"
          + "on_update_time\030  \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002"
          + "\022\023\n\013description\030\003 \001(\t\022\033\n\023version_descrip"
          + "tion\030\036 \001(\t\022J\n\020predict_schemata\030\004 \001(\01320.g"
          + "oogle.cloud.aiplatform.v1beta1.PredictSc"
          + "hemata\022 \n\023metadata_schema_uri\030\005 \001(\tB\003\340A\005"
          + "\022-\n\010metadata\030\006 \001(\0132\026.google.protobuf.Val"
          + "ueB\003\340A\005\022Z\n\030supported_export_formats\030\024 \003("
          + "\01323.google.cloud.aiplatform.v1beta1.Mode"
          + "l.ExportFormatB\003\340A\003\022M\n\021training_pipeline"
          + "\030\007 \001(\tB2\340A\003\372A,\n*aiplatform.googleapis.co"
          + "m/TrainingPipeline\022P\n\016container_spec\030\t \001"
          + "(\01323.google.cloud.aiplatform.v1beta1.Mod"
          + "elContainerSpecB\003\340A\004\022\031\n\014artifact_uri\030\032 \001"
          + "(\tB\003\340A\005\022q\n$supported_deployment_resource"
          + "s_types\030\n \003(\0162>.google.cloud.aiplatform."
          + "v1beta1.Model.DeploymentResourcesTypeB\003\340"
          + "A\003\022,\n\037supported_input_storage_formats\030\013 "
          + "\003(\tB\003\340A\003\022-\n supported_output_storage_for"
          + "mats\030\014 \003(\tB\003\340A\003\0224\n\013create_time\030\r \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_"
          + "time\030\016 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022O\n\017deployed_models\030\017 \003(\01321.google.cl"
          + "oud.aiplatform.v1beta1.DeployedModelRefB"
          + "\003\340A\003\022J\n\020explanation_spec\030\027 \001(\01320.google."
          + "cloud.aiplatform.v1beta1.ExplanationSpec"
          + "\022\014\n\004etag\030\020 \001(\t\022B\n\006labels\030\021 \003(\01322.google."
          + "cloud.aiplatform.v1beta1.Model.LabelsEnt"
          + "ry\022H\n\017encryption_spec\030\030 \001(\0132/.google.clo"
          + "ud.aiplatform.v1beta1.EncryptionSpec\022P\n\021"
          + "model_source_info\030& \001(\01320.google.cloud.a"
          + "iplatform.v1beta1.ModelSourceInfoB\003\340A\003\022\036"
          + "\n\021metadata_artifact\030, \001(\tB\003\340A\003\032\332\001\n\014Expor"
          + "tFormat\022\017\n\002id\030\001 \001(\tB\003\340A\003\022g\n\023exportable_c"
          + "ontents\030\002 \003(\0162E.google.cloud.aiplatform."
          + "v1beta1.Model.ExportFormat.ExportableCon"
          + "tentB\003\340A\003\"P\n\021ExportableContent\022\"\n\036EXPORT"
          + "ABLE_CONTENT_UNSPECIFIED\020\000\022\014\n\010ARTIFACT\020\001"
          + "\022\t\n\005IMAGE\020\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\214\001\n\027DeploymentResourc"
          + "esType\022)\n%DEPLOYMENT_RESOURCES_TYPE_UNSP"
          + "ECIFIED\020\000\022\027\n\023DEDICATED_RESOURCES\020\001\022\027\n\023AU"
          + "TOMATIC_RESOURCES\020\002\022\024\n\020SHARED_RESOURCES\020"
          + "\003:\\\352AY\n\037aiplatform.googleapis.com/Model\022"
          + "6projects/{project}/locations/{location}"
          + "/models/{model}\"{\n\017PredictSchemata\022 \n\023in"
          + "stance_schema_uri\030\001 \001(\tB\003\340A\005\022\"\n\025paramete"
          + "rs_schema_uri\030\002 \001(\tB\003\340A\005\022\"\n\025prediction_s"
          + "chema_uri\030\003 \001(\tB\003\340A\005\"\205\002\n\022ModelContainerS"
          + "pec\022\031\n\timage_uri\030\001 \001(\tB\006\340A\002\340A\005\022\024\n\007comman"
          + "d\030\002 \003(\tB\003\340A\005\022\021\n\004args\030\003 \003(\tB\003\340A\005\0229\n\003env\030\004"
          + " \003(\0132\'.google.cloud.aiplatform.v1beta1.E"
          + "nvVarB\003\340A\005\0229\n\005ports\030\005 \003(\0132%.google.cloud"
          + ".aiplatform.v1beta1.PortB\003\340A\005\022\032\n\rpredict"
          + "_route\030\006 \001(\tB\003\340A\005\022\031\n\014health_route\030\007 \001(\tB"
          + "\003\340A\005\"\036\n\004Port\022\026\n\016container_port\030\003 \001(\005\"\300\001\n"
          + "\017ModelSourceInfo\022U\n\013source_type\030\001 \001(\0162@."
          + "google.cloud.aiplatform.v1beta1.ModelSou"
          + "rceInfo.ModelSourceType\"V\n\017ModelSourceTy"
          + "pe\022!\n\035MODEL_SOURCE_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006AUTOML\020\001\022\n\n\006CUSTOM\020\002\022\010\n\004BQML\020\003B\341\001\n#com."
          + "google.cloud.aiplatform.v1beta1B\nModelPr"
          + "otoP\001ZCcloud.google.com/go/aiplatform/ap"
          + "iv1beta1/aiplatformpb;aiplatformpb\252\002\037Goo"
          + "gle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cl"
          + "oud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::"
          + "AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor,
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
              "EncryptionSpec",
              "ModelSourceInfo",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor,
            new java.lang.String[] {
              "Id", "ExportableContents",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor,
            new java.lang.String[] {
              "InstanceSchemaUri", "ParametersSchemaUri", "PredictionSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri", "Command", "Args", "Env", "Ports", "PredictRoute", "HealthRoute",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_Port_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor,
            new java.lang.String[] {
              "ContainerPort",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor,
            new java.lang.String[] {
              "SourceType",
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
    com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
