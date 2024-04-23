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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.confidentialcomputing.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_Challenge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_SignedEntity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_SignedEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/confidentialcomputing/v1/"
          + "service.proto\022%google.cloud.confidential"
          + "computing.v1\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032\037google/protobuf/timestamp.proto"
          + "\032\027google/rpc/status.proto\"\245\002\n\tChallenge\022"
          + "\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\0224\n\013expi"
          + "re_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003\022\021\n\004used\030\004 \001(\010B\003\340A\003\022\026\n\ttpm_nonce\030\006"
          + " \001(\tB\003\340A\003:n\352Ak\n.confidentialcomputing.go"
          + "ogleapis.com/Challenge\0229projects/{projec"
          + "t}/locations/{location}/challenges/{uuid"
          + "}\"\235\001\n\026CreateChallengeRequest\0229\n\006parent\030\001"
          + " \001(\tB)\340A\002\372A#\n!locations.googleapis.com/L"
          + "ocation\022H\n\tchallenge\030\002 \001(\01320.google.clou"
          + "d.confidentialcomputing.v1.ChallengeB\003\340A"
          + "\002\"\304\003\n\030VerifyAttestationRequest\022I\n\tchalle"
          + "nge\030\001 \001(\tB6\340A\002\372A0\n.confidentialcomputing"
          + ".googleapis.com/Challenge\022S\n\017gcp_credent"
          + "ials\030\002 \001(\01325.google.cloud.confidentialco"
          + "mputing.v1.GcpCredentialsB\003\340A\001\022S\n\017tpm_at"
          + "testation\030\003 \001(\01325.google.cloud.confident"
          + "ialcomputing.v1.TpmAttestationB\003\340A\002\022b\n\027c"
          + "onfidential_space_info\030\004 \001(\0132<.google.cl"
          + "oud.confidentialcomputing.v1.Confidentia"
          + "lSpaceInfoB\003\340A\001\022O\n\rtoken_options\030\005 \001(\01323"
          + ".google.cloud.confidentialcomputing.v1.T"
          + "okenOptionsB\003\340A\001\"l\n\031VerifyAttestationRes"
          + "ponse\022\036\n\021oidc_claims_token\030\002 \001(\tB\003\340A\003\022/\n"
          + "\016partial_errors\030\003 \003(\0132\022.google.rpc.Statu"
          + "sB\003\340A\003\"3\n\016GcpCredentials\022!\n\031service_acco"
          + "unt_id_tokens\030\002 \003(\t\"\204\001\n\014TokenOptions\022\025\n\010"
          + "audience\030\001 \001(\tB\003\340A\001\022\022\n\005nonce\030\002 \003(\tB\003\340A\001\022"
          + "I\n\ntoken_type\030\003 \001(\01620.google.cloud.confi"
          + "dentialcomputing.v1.TokenTypeB\003\340A\001\"\217\003\n\016T"
          + "pmAttestation\022K\n\006quotes\030\001 \003(\0132;.google.c"
          + "loud.confidentialcomputing.v1.TpmAttesta"
          + "tion.Quote\022\025\n\rtcg_event_log\030\002 \001(\014\022\033\n\023can"
          + "onical_event_log\030\003 \001(\014\022\017\n\007ak_cert\030\004 \001(\014\022"
          + "\022\n\ncert_chain\030\005 \003(\014\032\326\001\n\005Quote\022\021\n\thash_al"
          + "go\030\001 \001(\005\022^\n\npcr_values\030\002 \003(\0132J.google.cl"
          + "oud.confidentialcomputing.v1.TpmAttestat"
          + "ion.Quote.PcrValuesEntry\022\021\n\traw_quote\030\003 "
          + "\001(\014\022\025\n\rraw_signature\030\004 \001(\014\0320\n\016PcrValuesE"
          + "ntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\014:\0028\001\"j\n\025"
          + "ConfidentialSpaceInfo\022Q\n\017signed_entities"
          + "\030\001 \003(\01323.google.cloud.confidentialcomput"
          + "ing.v1.SignedEntityB\003\340A\001\"w\n\014SignedEntity"
          + "\022g\n\032container_image_signatures\030\001 \003(\0132>.g"
          + "oogle.cloud.confidentialcomputing.v1.Con"
          + "tainerImageSignatureB\003\340A\001\"\257\001\n\027ContainerI"
          + "mageSignature\022\024\n\007payload\030\001 \001(\014B\003\340A\001\022\026\n\ts"
          + "ignature\030\002 \001(\014B\003\340A\001\022\027\n\npublic_key\030\003 \001(\014B"
          + "\003\340A\001\022M\n\007sig_alg\030\004 \001(\01627.google.cloud.con"
          + "fidentialcomputing.v1.SigningAlgorithmB\003"
          + "\340A\001*\177\n\020SigningAlgorithm\022!\n\035SIGNING_ALGOR"
          + "ITHM_UNSPECIFIED\020\000\022\025\n\021RSASSA_PSS_SHA256\020"
          + "\001\022\032\n\026RSASSA_PKCS1V15_SHA256\020\002\022\025\n\021ECDSA_P"
          + "256_SHA256\020\003*l\n\tTokenType\022\032\n\026TOKEN_TYPE_"
          + "UNSPECIFIED\020\000\022\023\n\017TOKEN_TYPE_OIDC\020\001\022\022\n\016TO"
          + "KEN_TYPE_PKI\020\002\022\032\n\026TOKEN_TYPE_LIMITED_AWS"
          + "\020\0032\267\004\n\025ConfidentialComputing\022\330\001\n\017CreateC"
          + "hallenge\022=.google.cloud.confidentialcomp"
          + "uting.v1.CreateChallengeRequest\0320.google"
          + ".cloud.confidentialcomputing.v1.Challeng"
          + "e\"T\332A\020parent,challenge\202\323\344\223\002;\"./v1/{paren"
          + "t=projects/*/locations/*}/challenges:\tch"
          + "allenge\022\350\001\n\021VerifyAttestation\022?.google.c"
          + "loud.confidentialcomputing.v1.VerifyAtte"
          + "stationRequest\032@.google.cloud.confidenti"
          + "alcomputing.v1.VerifyAttestationResponse"
          + "\"P\202\323\344\223\002J\"E/v1/{challenge=projects/*/loca"
          + "tions/*/challenges/*}:verifyAttestation:"
          + "\001*\032X\312A$confidentialcomputing.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\227\002\n)com.google.cloud.confid"
          + "entialcomputing.v1B\014ServiceProtoP\001Z_clou"
          + "d.google.com/go/confidentialcomputing/ap"
          + "iv1/confidentialcomputingpb;confidential"
          + "computingpb\252\002%Google.Cloud.ConfidentialC"
          + "omputing.V1\312\002%Google\\Cloud\\ConfidentialC"
          + "omputing\\V1\352\002(Google::Cloud::Confidentia"
          + "lComputing::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_confidentialcomputing_v1_Challenge_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "ExpireTime", "Used", "TpmNonce",
            });
    internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Challenge",
            });
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor,
            new java.lang.String[] {
              "Challenge",
              "GcpCredentials",
              "TpmAttestation",
              "ConfidentialSpaceInfo",
              "TokenOptions",
            });
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor,
            new java.lang.String[] {
              "OidcClaimsToken", "PartialErrors",
            });
    internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor,
            new java.lang.String[] {
              "ServiceAccountIdTokens",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TokenOptions_descriptor,
            new java.lang.String[] {
              "Audience", "Nonce", "TokenType",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor,
            new java.lang.String[] {
              "Quotes", "TcgEventLog", "CanonicalEventLog", "AkCert", "CertChain",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor,
            new java.lang.String[] {
              "HashAlgo", "PcrValues", "RawQuote", "RawSignature",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_ConfidentialSpaceInfo_descriptor,
            new java.lang.String[] {
              "SignedEntities",
            });
    internal_static_google_cloud_confidentialcomputing_v1_SignedEntity_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_confidentialcomputing_v1_SignedEntity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_SignedEntity_descriptor,
            new java.lang.String[] {
              "ContainerImageSignatures",
            });
    internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_ContainerImageSignature_descriptor,
            new java.lang.String[] {
              "Payload", "Signature", "PublicKey", "SigAlg",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
