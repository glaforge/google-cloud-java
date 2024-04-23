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
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2beta3;

public final class CloudTasksProto {
  private CloudTasksProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/tasks/v2beta3/cloudtasks."
          + "proto\022\032google.cloud.tasks.v2beta3\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032&google/clo"
          + "ud/tasks/v2beta3/queue.proto\032%google/clo"
          + "ud/tasks/v2beta3/task.proto\032\036google/iam/"
          + "v1/iam_policy.proto\032\032google/iam/v1/polic"
          + "y.proto\032\033google/protobuf/empty.proto\032 go"
          + "ogle/protobuf/field_mask.proto\"\267\001\n\021ListQ"
          + "ueuesRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037cl"
          + "oudtasks.googleapis.com/Queue\022\016\n\006filter\030"
          + "\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004"
          + " \001(\t\0222\n\tread_mask\030\005 \001(\0132\032.google.protobu"
          + "f.FieldMaskB\003\340A\001\"`\n\022ListQueuesResponse\0221"
          + "\n\006queues\030\001 \003(\0132!.google.cloud.tasks.v2be"
          + "ta3.Queue\022\027\n\017next_page_token\030\002 \001(\t\"|\n\017Ge"
          + "tQueueRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037clo"
          + "udtasks.googleapis.com/Queue\0222\n\tread_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001"
          + "\"\204\001\n\022CreateQueueRequest\0227\n\006parent\030\001 \001(\tB"
          + "\'\340A\002\372A!\022\037cloudtasks.googleapis.com/Queue"
          + "\0225\n\005queue\030\002 \001(\0132!.google.cloud.tasks.v2b"
          + "eta3.QueueB\003\340A\002\"|\n\022UpdateQueueRequest\0225\n"
          + "\005queue\030\001 \001(\0132!.google.cloud.tasks.v2beta"
          + "3.QueueB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goog"
          + "le.protobuf.FieldMask\"K\n\022DeleteQueueRequ"
          + "est\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037cloudtasks.go"
          + "ogleapis.com/Queue\"J\n\021PurgeQueueRequest\022"
          + "5\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037cloudtasks.google"
          + "apis.com/Queue\"J\n\021PauseQueueRequest\0225\n\004n"
          + "ame\030\001 \001(\tB\'\340A\002\372A!\n\037cloudtasks.googleapis"
          + ".com/Queue\"K\n\022ResumeQueueRequest\0225\n\004name"
          + "\030\001 \001(\tB\'\340A\002\372A!\n\037cloudtasks.googleapis.co"
          + "m/Queue\"\257\001\n\020ListTasksRequest\0226\n\006parent\030\001"
          + " \001(\tB&\340A\002\372A \022\036cloudtasks.googleapis.com/"
          + "Task\022<\n\rresponse_view\030\002 \001(\0162%.google.clo"
          + "ud.tasks.v2beta3.Task.View\022\021\n\tpage_size\030"
          + "\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"]\n\021ListTasksRe"
          + "sponse\022/\n\005tasks\030\001 \003(\0132 .google.cloud.tas"
          + "ks.v2beta3.Task\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"\204\001\n\016GetTaskRequest\0224\n\004name\030\001 \001(\tB&\340A\002\372A"
          + " \n\036cloudtasks.googleapis.com/Task\022<\n\rres"
          + "ponse_view\030\002 \001(\0162%.google.cloud.tasks.v2"
          + "beta3.Task.View\"\276\001\n\021CreateTaskRequest\0226\n"
          + "\006parent\030\001 \001(\tB&\340A\002\372A \022\036cloudtasks.google"
          + "apis.com/Task\0223\n\004task\030\002 \001(\0132 .google.clo"
          + "ud.tasks.v2beta3.TaskB\003\340A\002\022<\n\rresponse_v"
          + "iew\030\003 \001(\0162%.google.cloud.tasks.v2beta3.T"
          + "ask.View\"I\n\021DeleteTaskRequest\0224\n\004name\030\001 "
          + "\001(\tB&\340A\002\372A \n\036cloudtasks.googleapis.com/T"
          + "ask\"\204\001\n\016RunTaskRequest\0224\n\004name\030\001 \001(\tB&\340A"
          + "\002\372A \n\036cloudtasks.googleapis.com/Task\022<\n\r"
          + "response_view\030\002 \001(\0162%.google.cloud.tasks"
          + ".v2beta3.Task.View2\245\026\n\nCloudTasks\022\255\001\n\nLi"
          + "stQueues\022-.google.cloud.tasks.v2beta3.Li"
          + "stQueuesRequest\032..google.cloud.tasks.v2b"
          + "eta3.ListQueuesResponse\"@\332A\006parent\202\323\344\223\0021"
          + "\022//v2beta3/{parent=projects/*/locations/"
          + "*}/queues\022\232\001\n\010GetQueue\022+.google.cloud.ta"
          + "sks.v2beta3.GetQueueRequest\032!.google.clo"
          + "ud.tasks.v2beta3.Queue\">\332A\004name\202\323\344\223\0021\022//"
          + "v2beta3/{name=projects/*/locations/*/que"
          + "ues/*}\022\257\001\n\013CreateQueue\022..google.cloud.ta"
          + "sks.v2beta3.CreateQueueRequest\032!.google."
          + "cloud.tasks.v2beta3.Queue\"M\332A\014parent,que"
          + "ue\202\323\344\223\0028\"//v2beta3/{parent=projects/*/lo"
          + "cations/*}/queues:\005queue\022\272\001\n\013UpdateQueue"
          + "\022..google.cloud.tasks.v2beta3.UpdateQueu"
          + "eRequest\032!.google.cloud.tasks.v2beta3.Qu"
          + "eue\"X\332A\021queue,update_mask\202\323\344\223\002>25/v2beta"
          + "3/{queue.name=projects/*/locations/*/que"
          + "ues/*}:\005queue\022\225\001\n\013DeleteQueue\022..google.c"
          + "loud.tasks.v2beta3.DeleteQueueRequest\032\026."
          + "google.protobuf.Empty\">\332A\004name\202\323\344\223\0021*//v"
          + "2beta3/{name=projects/*/locations/*/queu"
          + "es/*}\022\247\001\n\nPurgeQueue\022-.google.cloud.task"
          + "s.v2beta3.PurgeQueueRequest\032!.google.clo"
          + "ud.tasks.v2beta3.Queue\"G\332A\004name\202\323\344\223\002:\"5/"
          + "v2beta3/{name=projects/*/locations/*/que"
          + "ues/*}:purge:\001*\022\247\001\n\nPauseQueue\022-.google."
          + "cloud.tasks.v2beta3.PauseQueueRequest\032!."
          + "google.cloud.tasks.v2beta3.Queue\"G\332A\004nam"
          + "e\202\323\344\223\002:\"5/v2beta3/{name=projects/*/locat"
          + "ions/*/queues/*}:pause:\001*\022\252\001\n\013ResumeQueu"
          + "e\022..google.cloud.tasks.v2beta3.ResumeQue"
          + "ueRequest\032!.google.cloud.tasks.v2beta3.Q"
          + "ueue\"H\332A\004name\202\323\344\223\002;\"6/v2beta3/{name=proj"
          + "ects/*/locations/*/queues/*}:resume:\001*\022\241"
          + "\001\n\014GetIamPolicy\022\".google.iam.v1.GetIamPo"
          + "licyRequest\032\025.google.iam.v1.Policy\"V\332A\010r"
          + "esource\202\323\344\223\002E\"@/v2beta3/{resource=projec"
          + "ts/*/locations/*/queues/*}:getIamPolicy:"
          + "\001*\022\250\001\n\014SetIamPolicy\022\".google.iam.v1.SetI"
          + "amPolicyRequest\032\025.google.iam.v1.Policy\"]"
          + "\332A\017resource,policy\202\323\344\223\002E\"@/v2beta3/{reso"
          + "urce=projects/*/locations/*/queues/*}:se"
          + "tIamPolicy:\001*\022\323\001\n\022TestIamPermissions\022(.g"
          + "oogle.iam.v1.TestIamPermissionsRequest\032)"
          + ".google.iam.v1.TestIamPermissionsRespons"
          + "e\"h\332A\024resource,permissions\202\323\344\223\002K\"F/v2bet"
          + "a3/{resource=projects/*/locations/*/queu"
          + "es/*}:testIamPermissions:\001*\022\262\001\n\tListTask"
          + "s\022,.google.cloud.tasks.v2beta3.ListTasks"
          + "Request\032-.google.cloud.tasks.v2beta3.Lis"
          + "tTasksResponse\"H\332A\006parent\202\323\344\223\0029\0227/v2beta"
          + "3/{parent=projects/*/locations/*/queues/"
          + "*}/tasks\022\237\001\n\007GetTask\022*.google.cloud.task"
          + "s.v2beta3.GetTaskRequest\032 .google.cloud."
          + "tasks.v2beta3.Task\"F\332A\004name\202\323\344\223\0029\0227/v2be"
          + "ta3/{name=projects/*/locations/*/queues/"
          + "*/tasks/*}\022\257\001\n\nCreateTask\022-.google.cloud"
          + ".tasks.v2beta3.CreateTaskRequest\032 .googl"
          + "e.cloud.tasks.v2beta3.Task\"P\332A\013parent,ta"
          + "sk\202\323\344\223\002<\"7/v2beta3/{parent=projects/*/lo"
          + "cations/*/queues/*}/tasks:\001*\022\233\001\n\nDeleteT"
          + "ask\022-.google.cloud.tasks.v2beta3.DeleteT"
          + "askRequest\032\026.google.protobuf.Empty\"F\332A\004n"
          + "ame\202\323\344\223\0029*7/v2beta3/{name=projects/*/loc"
          + "ations/*/queues/*/tasks/*}\022\246\001\n\007RunTask\022*"
          + ".google.cloud.tasks.v2beta3.RunTaskReque"
          + "st\032 .google.cloud.tasks.v2beta3.Task\"M\332A"
          + "\004name\202\323\344\223\002@\";/v2beta3/{name=projects/*/l"
          + "ocations/*/queues/*/tasks/*}:run:\001*\032M\312A\031"
          + "cloudtasks.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\200\001\n\036c"
          + "om.google.cloud.tasks.v2beta3B\017CloudTask"
          + "sProtoP\001ZCcloud.google.com/go/cloudtasks"
          + "/apiv2beta3/cloudtaskspb;cloudtaskspb\242\002\005"
          + "TASKSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2beta3.QueueProto.getDescriptor(),
              com.google.cloud.tasks.v2beta3.TaskProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_ListQueuesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_ListQueuesResponse_descriptor,
            new java.lang.String[] {
              "Queues", "NextPageToken",
            });
    internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_GetQueueRequest_descriptor,
            new java.lang.String[] {
              "Name", "ReadMask",
            });
    internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_CreateQueueRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Queue",
            });
    internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor,
            new java.lang.String[] {
              "Queue", "UpdateMask",
            });
    internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_DeleteQueueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_PurgeQueueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_PauseQueueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_ResumeQueueRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_ListTasksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ResponseView", "PageSize", "PageToken",
            });
    internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor,
            new java.lang.String[] {
              "Tasks", "NextPageToken",
            });
    internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_GetTaskRequest_descriptor,
            new java.lang.String[] {
              "Name", "ResponseView",
            });
    internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_CreateTaskRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Task", "ResponseView",
            });
    internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_DeleteTaskRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_RunTaskRequest_descriptor,
            new java.lang.String[] {
              "Name", "ResponseView",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.QueueProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TaskProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
