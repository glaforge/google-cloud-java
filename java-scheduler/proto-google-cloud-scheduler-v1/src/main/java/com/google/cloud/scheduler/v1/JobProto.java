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
// source: google/cloud/scheduler/v1/job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.scheduler.v1;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_RetryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/scheduler/v1/job.proto\022\031g"
          + "oogle.cloud.scheduler.v1\032\031google/api/res"
          + "ource.proto\032&google/cloud/scheduler/v1/t"
          + "arget.proto\032\036google/protobuf/duration.pr"
          + "oto\032\037google/protobuf/timestamp.proto\032\027go"
          + "ogle/rpc/status.proto\"\313\006\n\003Job\022\014\n\004name\030\001 "
          + "\001(\t\022\023\n\013description\030\002 \001(\t\022@\n\rpubsub_targe"
          + "t\030\004 \001(\0132\'.google.cloud.scheduler.v1.Pubs"
          + "ubTargetH\000\022P\n\026app_engine_http_target\030\005 \001"
          + "(\0132..google.cloud.scheduler.v1.AppEngine"
          + "HttpTargetH\000\022<\n\013http_target\030\006 \001(\0132%.goog"
          + "le.cloud.scheduler.v1.HttpTargetH\000\022\020\n\010sc"
          + "hedule\030\024 \001(\t\022\021\n\ttime_zone\030\025 \001(\t\0224\n\020user_"
          + "update_time\030\t \001(\0132\032.google.protobuf.Time"
          + "stamp\0223\n\005state\030\n \001(\0162$.google.cloud.sche"
          + "duler.v1.Job.State\022\"\n\006status\030\013 \001(\0132\022.goo"
          + "gle.rpc.Status\0221\n\rschedule_time\030\021 \001(\0132\032."
          + "google.protobuf.Timestamp\0225\n\021last_attemp"
          + "t_time\030\022 \001(\0132\032.google.protobuf.Timestamp"
          + "\022<\n\014retry_config\030\023 \001(\0132&.google.cloud.sc"
          + "heduler.v1.RetryConfig\0223\n\020attempt_deadli"
          + "ne\030\026 \001(\0132\031.google.protobuf.Duration\"X\n\005S"
          + "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007ENABLED\020\001"
          + "\022\n\n\006PAUSED\020\002\022\014\n\010DISABLED\020\003\022\021\n\rUPDATE_FAI"
          + "LED\020\004:Z\352AW\n!cloudscheduler.googleapis.co"
          + "m/Job\0222projects/{project}/locations/{loc"
          + "ation}/jobs/{job}B\010\n\006target\"\342\001\n\013RetryCon"
          + "fig\022\023\n\013retry_count\030\001 \001(\005\0225\n\022max_retry_du"
          + "ration\030\002 \001(\0132\031.google.protobuf.Duration\022"
          + "7\n\024min_backoff_duration\030\003 \001(\0132\031.google.p"
          + "rotobuf.Duration\0227\n\024max_backoff_duration"
          + "\030\004 \001(\0132\031.google.protobuf.Duration\022\025\n\rmax"
          + "_doublings\030\005 \001(\005Bh\n\035com.google.cloud.sch"
          + "eduler.v1B\010JobProtoP\001Z;cloud.google.com/"
          + "go/scheduler/apiv1/schedulerpb;scheduler"
          + "pbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.scheduler.v1.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_scheduler_v1_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "PubsubTarget",
              "AppEngineHttpTarget",
              "HttpTarget",
              "Schedule",
              "TimeZone",
              "UserUpdateTime",
              "State",
              "Status",
              "ScheduleTime",
              "LastAttemptTime",
              "RetryConfig",
              "AttemptDeadline",
              "Target",
            });
    internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1_RetryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_RetryConfig_descriptor,
            new java.lang.String[] {
              "RetryCount",
              "MaxRetryDuration",
              "MinBackoffDuration",
              "MaxBackoffDuration",
              "MaxDoublings",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.scheduler.v1.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
