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
// source: google/cloud/osconfig/v1beta/osconfig_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.osconfig.v1beta;

public final class OsConfigProto {
  private OsConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/osconfig/v1beta/osconfig_"
          + "service.proto\022\034google.cloud.osconfig.v1b"
          + "eta\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\0321google/cloud/osconfi"
          + "g/v1beta/guest_policies.proto\0324google/cl"
          + "oud/osconfig/v1beta/patch_deployments.pr"
          + "oto\032-google/cloud/osconfig/v1beta/patch_"
          + "jobs.proto\032\033google/protobuf/empty.proto2"
          + "\223\034\n\017OsConfigService\022\251\001\n\017ExecutePatchJob\022"
          + "4.google.cloud.osconfig.v1beta.ExecutePa"
          + "tchJobRequest\032&.google.cloud.osconfig.v1"
          + "beta.PatchJob\"8\202\323\344\223\0022\"-/v1beta/{parent=p"
          + "rojects/*}/patchJobs:execute:\001*\022\226\001\n\013GetP"
          + "atchJob\0220.google.cloud.osconfig.v1beta.G"
          + "etPatchJobRequest\032&.google.cloud.osconfi"
          + "g.v1beta.PatchJob\"-\202\323\344\223\002\'\022%/v1beta/{name"
          + "=projects/*/patchJobs/*}\022\246\001\n\016CancelPatch"
          + "Job\0223.google.cloud.osconfig.v1beta.Cance"
          + "lPatchJobRequest\032&.google.cloud.osconfig"
          + ".v1beta.PatchJob\"7\202\323\344\223\0021\",/v1beta/{name="
          + "projects/*/patchJobs/*}:cancel:\001*\022\247\001\n\rLi"
          + "stPatchJobs\0222.google.cloud.osconfig.v1be"
          + "ta.ListPatchJobsRequest\0323.google.cloud.o"
          + "sconfig.v1beta.ListPatchJobsResponse\"-\202\323"
          + "\344\223\002\'\022%/v1beta/{parent=projects/*}/patchJ"
          + "obs\022\354\001\n\033ListPatchJobInstanceDetails\022@.go"
          + "ogle.cloud.osconfig.v1beta.ListPatchJobI"
          + "nstanceDetailsRequest\032A.google.cloud.osc"
          + "onfig.v1beta.ListPatchJobInstanceDetails"
          + "Response\"H\332A\006parent\202\323\344\223\0029\0227/v1beta/{pare"
          + "nt=projects/*/patchJobs/*}/instanceDetai"
          + "ls\022\312\001\n\025CreatePatchDeployment\022:.google.cl"
          + "oud.osconfig.v1beta.CreatePatchDeploymen"
          + "tRequest\032-.google.cloud.osconfig.v1beta."
          + "PatchDeployment\"F\202\323\344\223\002@\",/v1beta/{parent"
          + "=projects/*}/patchDeployments:\020patch_dep"
          + "loyment\022\262\001\n\022GetPatchDeployment\0227.google."
          + "cloud.osconfig.v1beta.GetPatchDeployment"
          + "Request\032-.google.cloud.osconfig.v1beta.P"
          + "atchDeployment\"4\202\323\344\223\002.\022,/v1beta/{name=pr"
          + "ojects/*/patchDeployments/*}\022\303\001\n\024ListPat"
          + "chDeployments\0229.google.cloud.osconfig.v1"
          + "beta.ListPatchDeploymentsRequest\032:.googl"
          + "e.cloud.osconfig.v1beta.ListPatchDeploym"
          + "entsResponse\"4\202\323\344\223\002.\022,/v1beta/{parent=pr"
          + "ojects/*}/patchDeployments\022\241\001\n\025DeletePat"
          + "chDeployment\022:.google.cloud.osconfig.v1b"
          + "eta.DeletePatchDeploymentRequest\032\026.googl"
          + "e.protobuf.Empty\"4\202\323\344\223\002.*,/v1beta/{name="
          + "projects/*/patchDeployments/*}\022\372\001\n\025Updat"
          + "ePatchDeployment\022:.google.cloud.osconfig"
          + ".v1beta.UpdatePatchDeploymentRequest\032-.g"
          + "oogle.cloud.osconfig.v1beta.PatchDeploym"
          + "ent\"v\332A\034patch_deployment,update_mask\202\323\344\223"
          + "\002Q2=/v1beta/{patch_deployment.name=proje"
          + "cts/*/patchDeployments/*}:\020patch_deploym"
          + "ent\022\306\001\n\024PausePatchDeployment\0229.google.cl"
          + "oud.osconfig.v1beta.PausePatchDeployment"
          + "Request\032-.google.cloud.osconfig.v1beta.P"
          + "atchDeployment\"D\332A\004name\202\323\344\223\0027\"2/v1beta/{"
          + "name=projects/*/patchDeployments/*}:paus"
          + "e:\001*\022\311\001\n\025ResumePatchDeployment\022:.google."
          + "cloud.osconfig.v1beta.ResumePatchDeploym"
          + "entRequest\032-.google.cloud.osconfig.v1bet"
          + "a.PatchDeployment\"E\332A\004name\202\323\344\223\0028\"3/v1bet"
          + "a/{name=projects/*/patchDeployments/*}:r"
          + "esume:\001*\022\316\001\n\021CreateGuestPolicy\0226.google."
          + "cloud.osconfig.v1beta.CreateGuestPolicyR"
          + "equest\032).google.cloud.osconfig.v1beta.Gu"
          + "estPolicy\"V\332A\024parent, guest_policy\202\323\344\223\0029"
          + "\")/v1beta/{parent=projects/*}/guestPolic"
          + "ies:\014guest_policy\022\252\001\n\016GetGuestPolicy\0223.g"
          + "oogle.cloud.osconfig.v1beta.GetGuestPoli"
          + "cyRequest\032).google.cloud.osconfig.v1beta"
          + ".GuestPolicy\"8\332A\004name\202\323\344\223\002+\022)/v1beta/{na"
          + "me=projects/*/guestPolicies/*}\022\300\001\n\021ListG"
          + "uestPolicies\0226.google.cloud.osconfig.v1b"
          + "eta.ListGuestPoliciesRequest\0327.google.cl"
          + "oud.osconfig.v1beta.ListGuestPoliciesRes"
          + "ponse\":\332A\006parent\202\323\344\223\002+\022)/v1beta/{parent="
          + "projects/*}/guestPolicies\022\337\001\n\021UpdateGues"
          + "tPolicy\0226.google.cloud.osconfig.v1beta.U"
          + "pdateGuestPolicyRequest\032).google.cloud.o"
          + "sconfig.v1beta.GuestPolicy\"g\332A\030guest_pol"
          + "icy,update_mask\202\323\344\223\002F26/v1beta/{guest_po"
          + "licy.name=projects/*/guestPolicies/*}:\014g"
          + "uest_policy\022\235\001\n\021DeleteGuestPolicy\0226.goog"
          + "le.cloud.osconfig.v1beta.DeleteGuestPoli"
          + "cyRequest\032\026.google.protobuf.Empty\"8\332A\004na"
          + "me\202\323\344\223\002+*)/v1beta/{name=projects/*/guest"
          + "Policies/*}\022\352\001\n\032LookupEffectiveGuestPoli"
          + "cy\022?.google.cloud.osconfig.v1beta.Lookup"
          + "EffectiveGuestPolicyRequest\0322.google.clo"
          + "ud.osconfig.v1beta.EffectiveGuestPolicy\""
          + "W\202\323\344\223\002Q\"L/v1beta/{instance=projects/*/zo"
          + "nes/*/instances/*}:lookupEffectiveGuestP"
          + "olicy:\001*\032K\312A\027osconfig.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-pla"
          + "tformBo\n com.google.cloud.osconfig.v1bet"
          + "aB\rOsConfigProtoZ<cloud.google.com/go/os"
          + "config/apiv1beta/osconfigpb;osconfigpbb\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.osconfig.v1beta.GuestPolicies.getDescriptor(),
              com.google.cloud.osconfig.v1beta.PatchDeployments.getDescriptor(),
              com.google.cloud.osconfig.v1beta.PatchJobs.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.osconfig.v1beta.GuestPolicies.getDescriptor();
    com.google.cloud.osconfig.v1beta.PatchDeployments.getDescriptor();
    com.google.cloud.osconfig.v1beta.PatchJobs.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
