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
// source: google/cloud/texttospeech/v1/cloud_tts_lrs.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.texttospeech.v1;

public final class TextToSpeechLongAudioSynthesisProto {
  private TextToSpeechLongAudioSynthesisProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/texttospeech/v1/cloud_tts"
          + "_lrs.proto\022\034google.cloud.texttospeech.v1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032,google/cloud/texttospeech/v1/c"
          + "loud_tts.proto\032#google/longrunning/opera"
          + "tions.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\231\002\n\032SynthesizeLongAudioRequest\022\016\n\006p"
          + "arent\030\001 \001(\t\022@\n\005input\030\002 \001(\0132,.google.clou"
          + "d.texttospeech.v1.SynthesisInputB\003\340A\002\022D\n"
          + "\014audio_config\030\003 \001(\0132).google.cloud.textt"
          + "ospeech.v1.AudioConfigB\003\340A\002\022\033\n\016output_gc"
          + "s_uri\030\004 \001(\tB\003\340A\002\022F\n\005voice\030\005 \001(\01322.google"
          + ".cloud.texttospeech.v1.VoiceSelectionPar"
          + "amsB\003\340A\002\"\035\n\033SynthesizeLongAudioResponse\""
          + "\244\001\n\033SynthesizeLongAudioMetadata\022.\n\nstart"
          + "_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022"
          + "8\n\020last_update_time\030\002 \001(\0132\032.google.proto"
          + "buf.TimestampB\002\030\001\022\033\n\023progress_percentage"
          + "\030\003 \001(\0012\237\003\n\037TextToSpeechLongAudioSynthesi"
          + "ze\022\252\002\n\023SynthesizeLongAudio\0228.google.clou"
          + "d.texttospeech.v1.SynthesizeLongAudioReq"
          + "uest\032\035.google.longrunning.Operation\"\271\001\312A"
          + "t\n8google.cloud.texttospeech.v1.Synthesi"
          + "zeLongAudioResponse\0228google.cloud.textto"
          + "speech.v1.SynthesizeLongAudioMetadata\202\323\344"
          + "\223\002<\"7/v1/{parent=projects/*/locations/*}"
          + ":synthesizeLongAudio:\001*\032O\312A\033texttospeech"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\362\001\n com.google."
          + "cloud.texttospeech.v1B#TextToSpeechLongA"
          + "udioSynthesisProtoP\001ZDcloud.google.com/g"
          + "o/texttospeech/apiv1/texttospeechpb;text"
          + "tospeechpb\370\001\001\252\002\034Google.Cloud.TextToSpeec"
          + "h.V1\312\002\034Google\\Cloud\\TextToSpeech\\V1\352\002\037Go"
          + "ogle::Cloud::TextToSpeech::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.texttospeech.v1.TextToSpeechProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Input", "AudioConfig", "OutputGcsUri", "Voice",
            });
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1_SynthesizeLongAudioMetadata_descriptor,
            new java.lang.String[] {
              "StartTime", "LastUpdateTime", "ProgressPercentage",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.texttospeech.v1.TextToSpeechProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
