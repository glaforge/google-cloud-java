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
// source: google/cloud/essentialcontacts/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.essentialcontacts.v1;

public final class Service {
  private Service() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/essentialcontacts/v1/serv"
          + "ice.proto\022!google.cloud.essentialcontact"
          + "s.v1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "-google/cloud/essentialcontacts/v1/enums"
          + ".proto\032\033google/protobuf/empty.proto\032 goo"
          + "gle/protobuf/field_mask.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\345\003\n\007Contact\022\021\n\004na"
          + "me\030\001 \001(\tB\003\340A\003\022\022\n\005email\030\002 \001(\tB\003\340A\002\022i\n#not"
          + "ification_category_subscriptions\030\003 \003(\01627"
          + ".google.cloud.essentialcontacts.v1.Notif"
          + "icationCategoryB\003\340A\002\022\031\n\014language_tag\030\004 \001"
          + "(\tB\003\340A\002\022L\n\020validation_state\030\010 \001(\01622.goog"
          + "le.cloud.essentialcontacts.v1.Validation"
          + "State\0221\n\rvalidate_time\030\t \001(\0132\032.google.pr"
          + "otobuf.Timestamp:\253\001\352A\247\001\n(essentialcontac"
          + "ts.googleapis.com/Contact\022%projects/{pro"
          + "ject}/contacts/{contact}\022#folders/{folde"
          + "r}/contacts/{contact}\022/organizations/{or"
          + "ganization}/contacts/{contact}\"\210\001\n\023ListC"
          + "ontactsRequest\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\022("
          + "essentialcontacts.googleapis.com/Contact"
          + "\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003"
          + " \001(\tB\003\340A\001\"m\n\024ListContactsResponse\022<\n\010con"
          + "tacts\030\001 \003(\0132*.google.cloud.essentialcont"
          + "acts.v1.Contact\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"S\n\021GetContactRequest\022>\n\004name\030\001 \001(\tB0\340A\002"
          + "\372A*\n(essentialcontacts.googleapis.com/Co"
          + "ntact\"V\n\024DeleteContactRequest\022>\n\004name\030\001 "
          + "\001(\tB0\340A\002\372A*\n(essentialcontacts.googleapi"
          + "s.com/Contact\"\232\001\n\024CreateContactRequest\022@"
          + "\n\006parent\030\001 \001(\tB0\340A\002\372A*\022(essentialcontact"
          + "s.googleapis.com/Contact\022@\n\007contact\030\002 \001("
          + "\0132*.google.cloud.essentialcontacts.v1.Co"
          + "ntactB\003\340A\002\"\216\001\n\024UpdateContactRequest\022@\n\007c"
          + "ontact\030\002 \001(\0132*.google.cloud.essentialcon"
          + "tacts.v1.ContactB\003\340A\002\0224\n\013update_mask\030\003 \001"
          + "(\0132\032.google.protobuf.FieldMaskB\003\340A\001\"\345\001\n\026"
          + "ComputeContactsRequest\022@\n\006parent\030\001 \001(\tB0"
          + "\340A\002\372A*\022(essentialcontacts.googleapis.com"
          + "/Contact\022X\n\027notification_categories\030\006 \003("
          + "\01627.google.cloud.essentialcontacts.v1.No"
          + "tificationCategory\022\026\n\tpage_size\030\003 \001(\005B\003\340"
          + "A\001\022\027\n\npage_token\030\004 \001(\tB\003\340A\001\"p\n\027ComputeCo"
          + "ntactsResponse\022<\n\010contacts\030\001 \003(\0132*.googl"
          + "e.cloud.essentialcontacts.v1.Contact\022\027\n\017"
          + "next_page_token\030\002 \001(\t\"\375\001\n\026SendTestMessag"
          + "eRequest\022B\n\010contacts\030\001 \003(\tB0\340A\002\372A*\n(esse"
          + "ntialcontacts.googleapis.com/Contact\022B\n\010"
          + "resource\030\002 \001(\tB0\340A\002\372A*\022(essentialcontact"
          + "s.googleapis.com/Contact\022[\n\025notification"
          + "_category\030\003 \001(\01627.google.cloud.essential"
          + "contacts.v1.NotificationCategoryB\003\340A\0022\313\017"
          + "\n\030EssentialContactsService\022\230\002\n\rCreateCon"
          + "tact\0227.google.cloud.essentialcontacts.v1"
          + ".CreateContactRequest\032*.google.cloud.ess"
          + "entialcontacts.v1.Contact\"\241\001\332A\016parent,co"
          + "ntact\202\323\344\223\002\211\001\" /v1/{parent=projects/*}/co"
          + "ntacts:\007contactZ*\"\037/v1/{parent=folders/*"
          + "}/contacts:\007contactZ0\"%/v1/{parent=organ"
          + "izations/*}/contacts:\007contact\022\265\002\n\rUpdate"
          + "Contact\0227.google.cloud.essentialcontacts"
          + ".v1.UpdateContactRequest\032*.google.cloud."
          + "essentialcontacts.v1.Contact\"\276\001\332A\023contac"
          + "t,update_mask\202\323\344\223\002\241\0012(/v1/{contact.name="
          + "projects/*/contacts/*}:\007contactZ22\'/v1/{"
          + "contact.name=folders/*/contacts/*}:\007cont"
          + "actZ82-/v1/{contact.name=organizations/*"
          + "/contacts/*}:\007contact\022\376\001\n\014ListContacts\0226"
          + ".google.cloud.essentialcontacts.v1.ListC"
          + "ontactsRequest\0327.google.cloud.essentialc"
          + "ontacts.v1.ListContactsResponse\"}\332A\006pare"
          + "nt\202\323\344\223\002n\022 /v1/{parent=projects/*}/contac"
          + "tsZ!\022\037/v1/{parent=folders/*}/contactsZ\'\022"
          + "%/v1/{parent=organizations/*}/contacts\022\353"
          + "\001\n\nGetContact\0224.google.cloud.essentialco"
          + "ntacts.v1.GetContactRequest\032*.google.clo"
          + "ud.essentialcontacts.v1.Contact\"{\332A\004name"
          + "\202\323\344\223\002n\022 /v1/{name=projects/*/contacts/*}"
          + "Z!\022\037/v1/{name=folders/*/contacts/*}Z\'\022%/"
          + "v1/{name=organizations/*/contacts/*}\022\335\001\n"
          + "\rDeleteContact\0227.google.cloud.essentialc"
          + "ontacts.v1.DeleteContactRequest\032\026.google"
          + ".protobuf.Empty\"{\332A\004name\202\323\344\223\002n* /v1/{nam"
          + "e=projects/*/contacts/*}Z!*\037/v1/{name=fo"
          + "lders/*/contacts/*}Z\'*%/v1/{name=organiz"
          + "ations/*/contacts/*}\022\230\002\n\017ComputeContacts"
          + "\0229.google.cloud.essentialcontacts.v1.Com"
          + "puteContactsRequest\032:.google.cloud.essen"
          + "tialcontacts.v1.ComputeContactsResponse\""
          + "\215\001\202\323\344\223\002\206\001\022(/v1/{parent=projects/*}/conta"
          + "cts:computeZ)\022\'/v1/{parent=folders/*}/co"
          + "ntacts:computeZ/\022-/v1/{parent=organizati"
          + "ons/*}/contacts:compute\022\233\002\n\017SendTestMess"
          + "age\0229.google.cloud.essentialcontacts.v1."
          + "SendTestMessageRequest\032\026.google.protobuf"
          + ".Empty\"\264\001\202\323\344\223\002\255\001\"2/v1/{resource=projects"
          + "/*}/contacts:sendTestMessage:\001*Z6\"1/v1/{"
          + "resource=folders/*}/contacts:sendTestMes"
          + "sage:\001*Z<\"7/v1/{resource=organizations/*"
          + "}/contacts:sendTestMessage:\001*\032T\312A essent"
          + "ialcontacts.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\355\001\n%"
          + "com.google.cloud.essentialcontacts.v1P\001Z"
          + "Scloud.google.com/go/essentialcontacts/a"
          + "piv1/essentialcontactspb;essentialcontac"
          + "tspb\252\002!Google.Cloud.EssentialContacts.V1"
          + "\312\002!Google\\Cloud\\EssentialContacts\\V1\352\002$G"
          + "oogle::Cloud::EssentialContacts::V1b\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_essentialcontacts_v1_Contact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_Contact_descriptor,
            new java.lang.String[] {
              "Name",
              "Email",
              "NotificationCategorySubscriptions",
              "LanguageTag",
              "ValidationState",
              "ValidateTime",
            });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ListContactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ListContactsResponse_descriptor,
            new java.lang.String[] {
              "Contacts", "NextPageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_GetContactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_DeleteContactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_CreateContactRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Contact",
            });
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_UpdateContactRequest_descriptor,
            new java.lang.String[] {
              "Contact", "UpdateMask",
            });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ComputeContactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "NotificationCategories", "PageSize", "PageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_ComputeContactsResponse_descriptor,
            new java.lang.String[] {
              "Contacts", "NextPageToken",
            });
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_essentialcontacts_v1_SendTestMessageRequest_descriptor,
            new java.lang.String[] {
              "Contacts", "Resource", "NotificationCategory",
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
    com.google.cloud.essentialcontacts.v1.EnumsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
