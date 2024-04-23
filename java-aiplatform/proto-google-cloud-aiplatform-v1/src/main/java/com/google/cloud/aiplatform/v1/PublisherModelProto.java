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
// source: google/cloud/aiplatform/v1/publisher_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class PublisherModelProto {
  private PublisherModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenNotebooks_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenNotebooks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenFineTuningPipelines_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_DeployGke_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_DeployGke_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/publisher_m"
          + "odel.proto\022\032google.cloud.aiplatform.v1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0322google/cloud/aiplatf"
          + "orm/v1/machine_resources.proto\032&google/c"
          + "loud/aiplatform/v1/model.proto\"\335 \n\016Publi"
          + "sherModel\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\032\n\nversion_"
          + "id\030\002 \001(\tB\006\340A\005\340A\003\022`\n\024open_source_category"
          + "\030\007 \001(\0162=.google.cloud.aiplatform.v1.Publ"
          + "isherModel.OpenSourceCategoryB\003\340A\002\022W\n\021su"
          + "pported_actions\030\023 \001(\01327.google.cloud.aip"
          + "latform.v1.PublisherModel.CallToActionB\003"
          + "\340A\001\022\027\n\nframeworks\030\027 \003(\tB\003\340A\001\022Q\n\014launch_s"
          + "tage\030\035 \001(\01626.google.cloud.aiplatform.v1."
          + "PublisherModel.LaunchStageB\003\340A\001\022S\n\rversi"
          + "on_state\030% \001(\01627.google.cloud.aiplatform"
          + ".v1.PublisherModel.VersionStateB\003\340A\001\022(\n\030"
          + "publisher_model_template\030\036 \001(\tB\006\340A\005\340A\003\022J"
          + "\n\020predict_schemata\030\037 \001(\0132+.google.cloud."
          + "aiplatform.v1.PredictSchemataB\003\340A\001\032{\n\021Re"
          + "sourceReference\022\r\n\003uri\030\001 \001(\tH\000\022\027\n\rresour"
          + "ce_name\030\002 \001(\tH\000\022\026\n\010use_case\030\003 \001(\tB\002\030\001H\000\022"
          + "\031\n\013description\030\004 \001(\tB\002\030\001H\000B\013\n\treference\032"
          + "9\n\rDocumentation\022\022\n\005title\030\001 \001(\tB\003\340A\002\022\024\n\007"
          + "content\030\002 \001(\tB\003\340A\002\032\350\026\n\014CallToAction\022_\n\rv"
          + "iew_rest_api\030\001 \001(\0132C.google.cloud.aiplat"
          + "form.v1.PublisherModel.CallToAction.View"
          + "RestApiB\003\340A\001\022n\n\ropen_notebook\030\002 \001(\0132R.go"
          + "ogle.cloud.aiplatform.v1.PublisherModel."
          + "CallToAction.RegionalResourceReferencesB"
          + "\003\340A\001\022g\n\016open_notebooks\030\014 \001(\0132E.google.cl"
          + "oud.aiplatform.v1.PublisherModel.CallToA"
          + "ction.OpenNotebooksB\003\340A\001H\000\210\001\001\022s\n\022create_"
          + "application\030\003 \001(\0132R.google.cloud.aiplatf"
          + "orm.v1.PublisherModel.CallToAction.Regio"
          + "nalResourceReferencesB\003\340A\001\022z\n\031open_fine_"
          + "tuning_pipeline\030\004 \001(\0132R.google.cloud.aip"
          + "latform.v1.PublisherModel.CallToAction.R"
          + "egionalResourceReferencesB\003\340A\001\022}\n\032open_f"
          + "ine_tuning_pipelines\030\r \001(\0132O.google.clou"
          + "d.aiplatform.v1.PublisherModel.CallToAct"
          + "ion.OpenFineTuningPipelinesB\003\340A\001H\001\210\001\001\022|\n"
          + "\033open_prompt_tuning_pipeline\030\005 \001(\0132R.goo"
          + "gle.cloud.aiplatform.v1.PublisherModel.C"
          + "allToAction.RegionalResourceReferencesB\003"
          + "\340A\001\022k\n\nopen_genie\030\006 \001(\0132R.google.cloud.a"
          + "iplatform.v1.PublisherModel.CallToAction"
          + ".RegionalResourceReferencesB\003\340A\001\022S\n\006depl"
          + "oy\030\007 \001(\0132>.google.cloud.aiplatform.v1.Pu"
          + "blisherModel.CallToAction.DeployB\003\340A\001\022Z\n"
          + "\ndeploy_gke\030\016 \001(\0132A.google.cloud.aiplatf"
          + "orm.v1.PublisherModel.CallToAction.Deplo"
          + "yGkeB\003\340A\001\022z\n\031open_generation_ai_studio\030\010"
          + " \001(\0132R.google.cloud.aiplatform.v1.Publis"
          + "herModel.CallToAction.RegionalResourceRe"
          + "ferencesB\003\340A\001\022o\n\016request_access\030\t \001(\0132R."
          + "google.cloud.aiplatform.v1.PublisherMode"
          + "l.CallToAction.RegionalResourceReference"
          + "sB\003\340A\001\022y\n\030open_evaluation_pipeline\030\013 \001(\013"
          + "2R.google.cloud.aiplatform.v1.PublisherM"
          + "odel.CallToAction.RegionalResourceRefere"
          + "ncesB\003\340A\001\032\317\003\n\032RegionalResourceReferences"
          + "\022{\n\nreferences\030\001 \003(\0132b.google.cloud.aipl"
          + "atform.v1.PublisherModel.CallToAction.Re"
          + "gionalResourceReferences.ReferencesEntry"
          + "B\003\340A\002\022\022\n\005title\030\002 \001(\tB\003\340A\002\022 \n\016resource_ti"
          + "tle\030\003 \001(\tB\003\340A\001H\000\210\001\001\022#\n\021resource_use_case"
          + "\030\004 \001(\tB\003\340A\001H\001\210\001\001\022&\n\024resource_description"
          + "\030\005 \001(\tB\003\340A\001H\002\210\001\001\032o\n\017ReferencesEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022K\n\005value\030\002 \001(\0132<.google.cloud.a"
          + "iplatform.v1.PublisherModel.ResourceRefe"
          + "rence:\0028\001B\021\n\017_resource_titleB\024\n\022_resourc"
          + "e_use_caseB\027\n\025_resource_description\032x\n\013V"
          + "iewRestApi\022U\n\016documentations\030\001 \003(\01328.goo"
          + "gle.cloud.aiplatform.v1.PublisherModel.D"
          + "ocumentationB\003\340A\002\022\022\n\005title\030\002 \001(\tB\003\340A\002\032{\n"
          + "\rOpenNotebooks\022j\n\tnotebooks\030\001 \003(\0132R.goog"
          + "le.cloud.aiplatform.v1.PublisherModel.Ca"
          + "llToAction.RegionalResourceReferencesB\003\340"
          + "A\002\032\221\001\n\027OpenFineTuningPipelines\022v\n\025fine_t"
          + "uning_pipelines\030\001 \003(\0132R.google.cloud.aip"
          + "latform.v1.PublisherModel.CallToAction.R"
          + "egionalResourceReferencesB\003\340A\002\032\356\003\n\006Deplo"
          + "y\022M\n\023dedicated_resources\030\005 \001(\0132..google."
          + "cloud.aiplatform.v1.DedicatedResourcesH\000"
          + "\022M\n\023automatic_resources\030\006 \001(\0132..google.c"
          + "loud.aiplatform.v1.AutomaticResourcesH\000\022"
          + "\032\n\020shared_resources\030\007 \001(\tH\000\022\037\n\022model_dis"
          + "play_name\030\001 \001(\tB\003\340A\001\022S\n\025large_model_refe"
          + "rence\030\002 \001(\0132/.google.cloud.aiplatform.v1"
          + ".LargeModelReferenceB\003\340A\001\022K\n\016container_s"
          + "pec\030\003 \001(\0132..google.cloud.aiplatform.v1.M"
          + "odelContainerSpecB\003\340A\001\022\031\n\014artifact_uri\030\004"
          + " \001(\tB\003\340A\001\022\022\n\005title\030\010 \001(\tB\003\340A\002\022 \n\023public_"
          + "artifact_uri\030\t \001(\tB\003\340A\001B\026\n\024prediction_re"
          + "sources\032*\n\tDeployGke\022\035\n\020gke_yaml_configs"
          + "\030\001 \003(\tB\003\340A\001B\021\n\017_open_notebooksB\035\n\033_open_"
          + "fine_tuning_pipelines\"\333\001\n\022OpenSourceCate"
          + "gory\022$\n OPEN_SOURCE_CATEGORY_UNSPECIFIED"
          + "\020\000\022\017\n\013PROPRIETARY\020\001\022+\n\'GOOGLE_OWNED_OSS_"
          + "WITH_GOOGLE_CHECKPOINT\020\002\0220\n,THIRD_PARTY_"
          + "OWNED_OSS_WITH_GOOGLE_CHECKPOINT\020\003\022\024\n\020GO"
          + "OGLE_OWNED_OSS\020\004\022\031\n\025THIRD_PARTY_OWNED_OS"
          + "S\020\005\"n\n\013LaunchStage\022\034\n\030LAUNCH_STAGE_UNSPE"
          + "CIFIED\020\000\022\020\n\014EXPERIMENTAL\020\001\022\023\n\017PRIVATE_PR"
          + "EVIEW\020\002\022\022\n\016PUBLIC_PREVIEW\020\003\022\006\n\002GA\020\004\"c\n\014V"
          + "ersionState\022\035\n\031VERSION_STATE_UNSPECIFIED"
          + "\020\000\022\030\n\024VERSION_STATE_STABLE\020\001\022\032\n\026VERSION_"
          + "STATE_UNSTABLE\020\002:T\352AQ\n(aiplatform.google"
          + "apis.com/PublisherModel\022%publishers/{pub"
          + "lisher}/models/{model}B\321\001\n\036com.google.cl"
          + "oud.aiplatform.v1B\023PublisherModelProtoP\001"
          + "Z>cloud.google.com/go/aiplatform/apiv1/a"
          + "iplatformpb;aiplatformpb\252\002\032Google.Cloud."
          + "AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\"
          + "V1\352\002\035Google::Cloud::AIPlatform::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "OpenSourceCategory",
              "SupportedActions",
              "Frameworks",
              "LaunchStage",
              "VersionState",
              "PublisherModelTemplate",
              "PredictSchemata",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_ResourceReference_descriptor,
            new java.lang.String[] {
              "Uri", "ResourceName", "UseCase", "Description", "Reference",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_Documentation_descriptor,
            new java.lang.String[] {
              "Title", "Content",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor,
            new java.lang.String[] {
              "ViewRestApi",
              "OpenNotebook",
              "OpenNotebooks",
              "CreateApplication",
              "OpenFineTuningPipeline",
              "OpenFineTuningPipelines",
              "OpenPromptTuningPipeline",
              "OpenGenie",
              "Deploy",
              "DeployGke",
              "OpenGenerationAiStudio",
              "RequestAccess",
              "OpenEvaluationPipeline",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor,
            new java.lang.String[] {
              "References", "Title", "ResourceTitle", "ResourceUseCase", "ResourceDescription",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_RegionalResourceReferences_ReferencesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_ViewRestApi_descriptor,
            new java.lang.String[] {
              "Documentations", "Title",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenNotebooks_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenNotebooks_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenNotebooks_descriptor,
            new java.lang.String[] {
              "Notebooks",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenFineTuningPipelines_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_OpenFineTuningPipelines_descriptor,
            new java.lang.String[] {
              "FineTuningPipelines",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_Deploy_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "SharedResources",
              "ModelDisplayName",
              "LargeModelReference",
              "ContainerSpec",
              "ArtifactUri",
              "Title",
              "PublicArtifactUri",
              "PredictionResources",
            });
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_DeployGke_descriptor =
        internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_DeployGke_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PublisherModel_CallToAction_DeployGke_descriptor,
            new java.lang.String[] {
              "GkeYamlConfigs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
