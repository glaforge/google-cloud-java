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
// source: google/chat/v1/contextual_addon.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public final class ContextualAddOnProto {
  private ContextualAddOnProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ContextualAddOnMarkup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ContextualAddOnMarkup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardHeader_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_Section_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_Section_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/chat/v1/contextual_addon.proto\022"
          + "\016google.chat.v1\032\034google/chat/v1/widgets."
          + "proto\"\212\005\n\025ContextualAddOnMarkup\032\360\004\n\004Card"
          + "\022E\n\006header\030\001 \001(\01325.google.chat.v1.Contex"
          + "tualAddOnMarkup.Card.CardHeader\022D\n\010secti"
          + "ons\030\002 \003(\01322.google.chat.v1.ContextualAdd"
          + "OnMarkup.Card.Section\022K\n\014card_actions\030\003 "
          + "\003(\01325.google.chat.v1.ContextualAddOnMark"
          + "up.Card.CardAction\022\014\n\004name\030\004 \001(\t\032\331\001\n\nCar"
          + "dHeader\022\r\n\005title\030\001 \001(\t\022\020\n\010subtitle\030\002 \001(\t"
          + "\022U\n\013image_style\030\003 \001(\0162@.google.chat.v1.C"
          + "ontextualAddOnMarkup.Card.CardHeader.Ima"
          + "geStyle\022\021\n\timage_url\030\004 \001(\t\"@\n\nImageStyle"
          + "\022\033\n\027IMAGE_STYLE_UNSPECIFIED\020\000\022\t\n\005IMAGE\020\001"
          + "\022\n\n\006AVATAR\020\002\032H\n\007Section\022\016\n\006header\030\001 \001(\t\022"
          + "-\n\007widgets\030\002 \003(\0132\034.google.chat.v1.Widget"
          + "Markup\032Z\n\nCardAction\022\024\n\014action_label\030\001 \001"
          + "(\t\0226\n\010on_click\030\002 \001(\0132$.google.chat.v1.Wi"
          + "dgetMarkup.OnClickB\237\001\n\022com.google.chat.v"
          + "1B\024ContextualAddOnProtoP\001Z,cloud.google."
          + "com/go/chat/apiv1/chatpb;chatpb\252\002\023Google"
          + ".Apps.Chat.V1\312\002\023Google\\Apps\\Chat\\V1\352\002\026Go"
          + "ogle::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.chat.v1.WidgetsProto.getDescriptor(),
            });
    internal_static_google_chat_v1_ContextualAddOnMarkup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_ContextualAddOnMarkup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ContextualAddOnMarkup_descriptor,
            new java.lang.String[] {});
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor =
        internal_static_google_chat_v1_ContextualAddOnMarkup_descriptor.getNestedTypes().get(0);
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor,
            new java.lang.String[] {
              "Header", "Sections", "CardActions", "Name",
            });
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardHeader_descriptor =
        internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardHeader_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardHeader_descriptor,
            new java.lang.String[] {
              "Title", "Subtitle", "ImageStyle", "ImageUrl",
            });
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_Section_descriptor =
        internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_Section_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ContextualAddOnMarkup_Card_Section_descriptor,
            new java.lang.String[] {
              "Header", "Widgets",
            });
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardAction_descriptor =
        internal_static_google_chat_v1_ContextualAddOnMarkup_Card_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ContextualAddOnMarkup_Card_CardAction_descriptor,
            new java.lang.String[] {
              "ActionLabel", "OnClick",
            });
    com.google.chat.v1.WidgetsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
