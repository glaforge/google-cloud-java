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
// source: google/cloud/aiplatform/v1/pipeline_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class Pipeline {
  private Pipeline() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifactsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1/pipeline_jo"
          + "b.proto\022\032google.cloud.aiplatform.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032)google/cloud/aiplatform"
          + "/v1/artifact.proto\032(google/cloud/aiplatf"
          + "orm/v1/context.proto\0320google/cloud/aipla"
          + "tform/v1/encryption_spec.proto\032*google/c"
          + "loud/aiplatform/v1/execution.proto\0328goog"
          + "le/cloud/aiplatform/v1/pipeline_failure_"
          + "policy.proto\032/google/cloud/aiplatform/v1"
          + "/pipeline_state.proto\032&google/cloud/aipl"
          + "atform/v1/value.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\032\027google/rpc/status.proto\"\320\016\n\013Pipeli"
          + "neJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\024\n\014display_name"
          + "\030\002 \001(\t\0224\n\013create_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0223\n\nstart_time\030\004 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end"
          + "_time\030\005 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022.\n\rpipeline_spec\030\007 \001("
          + "\0132\027.google.protobuf.Struct\022=\n\005state\030\010 \001("
          + "\0162).google.cloud.aiplatform.v1.PipelineS"
          + "tateB\003\340A\003\022F\n\njob_detail\030\t \001(\0132-.google.c"
          + "loud.aiplatform.v1.PipelineJobDetailB\003\340A"
          + "\003\022&\n\005error\030\n \001(\0132\022.google.rpc.StatusB\003\340A"
          + "\003\022C\n\006labels\030\013 \003(\01323.google.cloud.aiplatf"
          + "orm.v1.PipelineJob.LabelsEntry\022M\n\016runtim"
          + "e_config\030\014 \001(\01325.google.cloud.aiplatform"
          + ".v1.PipelineJob.RuntimeConfig\022C\n\017encrypt"
          + "ion_spec\030\020 \001(\0132*.google.cloud.aiplatform"
          + ".v1.EncryptionSpec\022\027\n\017service_account\030\021 "
          + "\001(\t\0224\n\007network\030\022 \001(\tB#\372A \n\036compute.googl"
          + "eapis.com/Network\022\032\n\022reserved_ip_ranges\030"
          + "\031 \003(\t\022\024\n\014template_uri\030\023 \001(\t\022T\n\021template_"
          + "metadata\030\024 \001(\01324.google.cloud.aiplatform"
          + ".v1.PipelineTemplateMetadataB\003\340A\003\022\032\n\rsch"
          + "edule_name\030\026 \001(\tB\003\340A\003\032\370\005\n\rRuntimeConfig\022"
          + "]\n\nparameters\030\001 \003(\0132E.google.cloud.aipla"
          + "tform.v1.PipelineJob.RuntimeConfig.Param"
          + "etersEntryB\002\030\001\022!\n\024gcs_output_directory\030\002"
          + " \001(\tB\003\340A\002\022d\n\020parameter_values\030\003 \003(\0132J.go"
          + "ogle.cloud.aiplatform.v1.PipelineJob.Run"
          + "timeConfig.ParameterValuesEntry\022I\n\016failu"
          + "re_policy\030\004 \001(\01621.google.cloud.aiplatfor"
          + "m.v1.PipelineFailurePolicy\022b\n\017input_arti"
          + "facts\030\005 \003(\0132I.google.cloud.aiplatform.v1"
          + ".PipelineJob.RuntimeConfig.InputArtifact"
          + "sEntry\032.\n\rInputArtifact\022\025\n\013artifact_id\030\001"
          + " \001(\tH\000B\006\n\004kind\032T\n\017ParametersEntry\022\013\n\003key"
          + "\030\001 \001(\t\0220\n\005value\030\002 \001(\0132!.google.cloud.aip"
          + "latform.v1.Value:\0028\001\032N\n\024ParameterValuesE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.googl"
          + "e.protobuf.Value:\0028\001\032z\n\023InputArtifactsEn"
          + "try\022\013\n\003key\030\001 \001(\t\022R\n\005value\030\002 \001(\0132C.google"
          + ".cloud.aiplatform.v1.PipelineJob.Runtime"
          + "Config.InputArtifact:\0028\001\032-\n\013LabelsEntry\022"
          + "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:o\352Al\n%ai"
          + "platform.googleapis.com/PipelineJob\022Cpro"
          + "jects/{project}/locations/{location}/pip"
          + "elineJobs/{pipeline_job}\"+\n\030PipelineTemp"
          + "lateMetadata\022\017\n\007version\030\003 \001(\t\"\352\001\n\021Pipeli"
          + "neJobDetail\022B\n\020pipeline_context\030\001 \001(\0132#."
          + "google.cloud.aiplatform.v1.ContextB\003\340A\003\022"
          + "F\n\024pipeline_run_context\030\002 \001(\0132#.google.c"
          + "loud.aiplatform.v1.ContextB\003\340A\003\022I\n\014task_"
          + "details\030\003 \003(\0132..google.cloud.aiplatform."
          + "v1.PipelineTaskDetailB\003\340A\003\"\235\013\n\022PipelineT"
          + "askDetail\022\024\n\007task_id\030\001 \001(\003B\003\340A\003\022\033\n\016paren"
          + "t_task_id\030\014 \001(\003B\003\340A\003\022\026\n\ttask_name\030\002 \001(\tB"
          + "\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0223\n\nstart_time\030\004 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\0221\n\010end_t"
          + "ime\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022T\n\017executor_detail\030\006 \001(\01326.google.clo"
          + "ud.aiplatform.v1.PipelineTaskExecutorDet"
          + "ailB\003\340A\003\022H\n\005state\030\007 \001(\01624.google.cloud.a"
          + "iplatform.v1.PipelineTaskDetail.StateB\003\340"
          + "A\003\022=\n\texecution\030\010 \001(\0132%.google.cloud.aip"
          + "latform.v1.ExecutionB\003\340A\003\022&\n\005error\030\t \001(\013"
          + "2\022.google.rpc.StatusB\003\340A\003\022d\n\024pipeline_ta"
          + "sk_status\030\r \003(\0132A.google.cloud.aiplatfor"
          + "m.v1.PipelineTaskDetail.PipelineTaskStat"
          + "usB\003\340A\003\022O\n\006inputs\030\n \003(\0132:.google.cloud.a"
          + "iplatform.v1.PipelineTaskDetail.InputsEn"
          + "tryB\003\340A\003\022Q\n\007outputs\030\013 \003(\0132;.google.cloud"
          + ".aiplatform.v1.PipelineTaskDetail.Output"
          + "sEntryB\003\340A\003\032\274\001\n\022PipelineTaskStatus\0224\n\013up"
          + "date_time\030\001 \001(\0132\032.google.protobuf.Timest"
          + "ampB\003\340A\003\022H\n\005state\030\002 \001(\01624.google.cloud.a"
          + "iplatform.v1.PipelineTaskDetail.StateB\003\340"
          + "A\003\022&\n\005error\030\003 \001(\0132\022.google.rpc.StatusB\003\340"
          + "A\003\032L\n\014ArtifactList\022<\n\tartifacts\030\001 \003(\0132$."
          + "google.cloud.aiplatform.v1.ArtifactB\003\340A\003"
          + "\032j\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022J\n\005value\030\002 "
          + "\001(\0132;.google.cloud.aiplatform.v1.Pipelin"
          + "eTaskDetail.ArtifactList:\0028\001\032k\n\014OutputsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022J\n\005value\030\002 \001(\0132;.googl"
          + "e.cloud.aiplatform.v1.PipelineTaskDetail"
          + ".ArtifactList:\0028\001\"\246\001\n\005State\022\025\n\021STATE_UNS"
          + "PECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\r\n\t"
          + "SUCCEEDED\020\003\022\022\n\016CANCEL_PENDING\020\004\022\016\n\nCANCE"
          + "LLING\020\005\022\r\n\tCANCELLED\020\006\022\n\n\006FAILED\020\007\022\013\n\007SK"
          + "IPPED\020\010\022\021\n\rNOT_TRIGGERED\020\t\"\313\004\n\032PipelineT"
          + "askExecutorDetail\022g\n\020container_detail\030\001 "
          + "\001(\0132F.google.cloud.aiplatform.v1.Pipelin"
          + "eTaskExecutorDetail.ContainerDetailB\003\340A\003"
          + "H\000\022h\n\021custom_job_detail\030\002 \001(\0132F.google.c"
          + "loud.aiplatform.v1.PipelineTaskExecutorD"
          + "etail.CustomJobDetailB\003\340A\003H\000\032\347\001\n\017Contain"
          + "erDetail\022=\n\010main_job\030\001 \001(\tB+\340A\003\372A%\n#aipl"
          + "atform.googleapis.com/CustomJob\022J\n\025pre_c"
          + "aching_check_job\030\002 \001(\tB+\340A\003\372A%\n#aiplatfo"
          + "rm.googleapis.com/CustomJob\022\035\n\020failed_ma"
          + "in_jobs\030\003 \003(\tB\003\340A\003\022*\n\035failed_pre_caching"
          + "_check_jobs\030\004 \003(\tB\003\340A\003\032e\n\017CustomJobDetai"
          + "l\0228\n\003job\030\001 \001(\tB+\340A\003\372A%\n#aiplatform.googl"
          + "eapis.com/CustomJob\022\030\n\013failed_jobs\030\003 \003(\t"
          + "B\003\340A\003B\t\n\007detailsB\227\002\n\036com.google.cloud.ai"
          + "platform.v1B\010PipelineP\001Z>cloud.google.co"
          + "m/go/aiplatform/apiv1/aiplatformpb;aipla"
          + "tformpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032G"
          + "oogle\\Cloud\\AIPlatform\\V1\352\002\035Google::Clou"
          + "d::AIPlatform::V1\352AN\n\036compute.googleapis"
          + ".com/Network\022,projects/{project}/global/"
          + "networks/{network}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ContextProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineFailurePolicyProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "PipelineSpec",
              "State",
              "JobDetail",
              "Error",
              "Labels",
              "RuntimeConfig",
              "EncryptionSpec",
              "ServiceAccount",
              "Network",
              "ReservedIpRanges",
              "TemplateUri",
              "TemplateMetadata",
              "ScheduleName",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor,
            new java.lang.String[] {
              "Parameters",
              "GcsOutputDirectory",
              "ParameterValues",
              "FailurePolicy",
              "InputArtifacts",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifact_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifact_descriptor,
            new java.lang.String[] {
              "ArtifactId", "Kind",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_ParameterValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifactsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_RuntimeConfig_InputArtifactsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineJob_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTemplateMetadata_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineJobDetail_descriptor,
            new java.lang.String[] {
              "PipelineContext", "PipelineRunContext", "TaskDetails",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor,
            new java.lang.String[] {
              "TaskId",
              "ParentTaskId",
              "TaskName",
              "CreateTime",
              "StartTime",
              "EndTime",
              "ExecutorDetail",
              "State",
              "Execution",
              "Error",
              "PipelineTaskStatus",
              "Inputs",
              "Outputs",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_PipelineTaskStatus_descriptor,
            new java.lang.String[] {
              "UpdateTime", "State", "Error",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_ArtifactList_descriptor,
            new java.lang.String[] {
              "Artifacts",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_InputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskDetail_OutputsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor,
            new java.lang.String[] {
              "ContainerDetail", "CustomJobDetail", "Details",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_ContainerDetail_descriptor,
            new java.lang.String[] {
              "MainJob", "PreCachingCheckJob", "FailedMainJobs", "FailedPreCachingCheckJobs",
            });
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor =
        internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PipelineTaskExecutorDetail_CustomJobDetail_descriptor,
            new java.lang.String[] {
              "Job", "FailedJobs",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ArtifactProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ContextProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExecutionProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineFailurePolicyProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
