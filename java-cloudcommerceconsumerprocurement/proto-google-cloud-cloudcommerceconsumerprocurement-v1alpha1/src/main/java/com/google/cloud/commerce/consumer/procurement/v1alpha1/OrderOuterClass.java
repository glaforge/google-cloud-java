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
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public final class OrderOuterClass {
  private OrderOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Order_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemChange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemChange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_Value_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/commerce/consumer/procure"
          + "ment/v1alpha1/order.proto\0223google.cloud."
          + "commerce.consumer.procurement.v1alpha1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\037google/protobuf/time"
          + "stamp.proto\"\327\003\n\005Order\022\021\n\004name\030\001 \001(\tB\003\340A\003"
          + "\022\031\n\014display_name\030\n \001(\tB\003\340A\002\022V\n\nline_item"
          + "s\030\006 \003(\0132=.google.cloud.commerce.consumer"
          + ".procurement.v1alpha1.LineItemB\003\340A\003\022`\n\024c"
          + "ancelled_line_items\030\007 \003(\0132=.google.cloud"
          + ".commerce.consumer.procurement.v1alpha1."
          + "LineItemB\003\340A\003\0224\n\013create_time\030\010 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0224\n\013update_ti"
          + "me\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\022\014\n\004etag\030\013 \001(\t:l\352Ai\n5cloudcommerceconsu"
          + "merprocurement.googleapis.com/Order\0220bil"
          + "lingAccounts/{billing_account}/orders/{o"
          + "rder}\"\311\002\n\010LineItem\022\031\n\014line_item_id\030\001 \001(\t"
          + "B\003\340A\003\022^\n\016line_item_info\030\002 \001(\0132A.google.c"
          + "loud.commerce.consumer.procurement.v1alp"
          + "ha1.LineItemInfoB\003\340A\003\022`\n\016pending_change\030"
          + "\003 \001(\0132C.google.cloud.commerce.consumer.p"
          + "rocurement.v1alpha1.LineItemChangeB\003\340A\003\022"
          + "`\n\016change_history\030\004 \003(\0132C.google.cloud.c"
          + "ommerce.consumer.procurement.v1alpha1.Li"
          + "neItemChangeB\003\340A\003\"\365\005\n\016LineItemChange\022\026\n\t"
          + "change_id\030\001 \001(\tB\003\340A\003\022a\n\013change_type\030\002 \001("
          + "\0162G.google.cloud.commerce.consumer.procu"
          + "rement.v1alpha1.LineItemChangeTypeB\003\340A\002\022"
          + "b\n\022old_line_item_info\030\003 \001(\0132A.google.clo"
          + "ud.commerce.consumer.procurement.v1alpha"
          + "1.LineItemInfoB\003\340A\003\022]\n\022new_line_item_inf"
          + "o\030\004 \001(\0132A.google.cloud.commerce.consumer"
          + ".procurement.v1alpha1.LineItemInfo\022c\n\014ch"
          + "ange_state\030\005 \001(\0162H.google.cloud.commerce"
          + ".consumer.procurement.v1alpha1.LineItemC"
          + "hangeStateB\003\340A\003\022\031\n\014state_reason\030\006 \001(\tB\003\340"
          + "A\003\022y\n\030change_state_reason_type\030\n \001(\0162R.g"
          + "oogle.cloud.commerce.consumer.procuremen"
          + "t.v1alpha1.LineItemChangeStateReasonType"
          + "B\003\340A\003\022>\n\025change_effective_time\030\007 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013create_"
          + "time\030\010 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013update_time\030\t \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\"\207\002\n\014LineItemInfo\022@\n\005of"
          + "fer\030\r \001(\tB1\340A\001\372A+\n)commerceoffercatalog."
          + "googleapis.com/Offer\022W\n\nparameters\030\t \003(\013"
          + "2>.google.cloud.commerce.consumer.procur"
          + "ement.v1alpha1.ParameterB\003\340A\001\022\\\n\014subscri"
          + "ption\030\n \001(\0132A.google.cloud.commerce.cons"
          + "umer.procurement.v1alpha1.SubscriptionB\003"
          + "\340A\003\"\306\001\n\tParameter\022\014\n\004name\030\001 \001(\t\022S\n\005value"
          + "\030\002 \001(\0132D.google.cloud.commerce.consumer."
          + "procurement.v1alpha1.Parameter.Value\032V\n\005"
          + "Value\022\025\n\013int64_value\030\003 \001(\003H\000\022\026\n\014string_v"
          + "alue\030\004 \001(\tH\000\022\026\n\014double_value\030\005 \001(\001H\000B\006\n\004"
          + "kind\"\212\001\n\014Subscription\022.\n\nstart_time\030\003 \001("
          + "\0132\032.google.protobuf.Timestamp\022,\n\010end_tim"
          + "e\030\001 \001(\0132\032.google.protobuf.Timestamp\022\034\n\024a"
          + "uto_renewal_enabled\030\002 \001(\010*\320\001\n\022LineItemCh"
          + "angeType\022%\n!LINE_ITEM_CHANGE_TYPE_UNSPEC"
          + "IFIED\020\000\022 \n\034LINE_ITEM_CHANGE_TYPE_CREATE\020"
          + "\001\022 \n\034LINE_ITEM_CHANGE_TYPE_UPDATE\020\002\022 \n\034L"
          + "INE_ITEM_CHANGE_TYPE_CANCEL\020\003\022-\n)LINE_IT"
          + "EM_CHANGE_TYPE_REVERT_CANCELLATION\020\004*\247\002\n"
          + "\023LineItemChangeState\022&\n\"LINE_ITEM_CHANGE"
          + "_STATE_UNSPECIFIED\020\000\022+\n\'LINE_ITEM_CHANGE"
          + "_STATE_PENDING_APPROVAL\020\001\022#\n\037LINE_ITEM_C"
          + "HANGE_STATE_APPROVED\020\002\022$\n LINE_ITEM_CHAN"
          + "GE_STATE_COMPLETED\020\003\022#\n\037LINE_ITEM_CHANGE"
          + "_STATE_REJECTED\020\004\022$\n LINE_ITEM_CHANGE_ST"
          + "ATE_ABANDONED\020\005\022%\n!LINE_ITEM_CHANGE_STAT"
          + "E_ACTIVATING\020\006*\363\001\n\035LineItemChangeStateRe"
          + "asonType\0222\n.LINE_ITEM_CHANGE_STATE_REASO"
          + "N_TYPE_UNSPECIFIED\020\000\022.\n*LINE_ITEM_CHANGE"
          + "_STATE_REASON_TYPE_EXPIRED\020\001\0225\n1LINE_ITE"
          + "M_CHANGE_STATE_REASON_TYPE_USER_CANCELLE"
          + "D\020\002\0227\n3LINE_ITEM_CHANGE_STATE_REASON_TYP"
          + "E_SYSTEM_CANCELLED\020\003B\253\002\n7com.google.clou"
          + "d.commerce.consumer.procurement.v1alpha1"
          + "P\001ZYcloud.google.com/go/commerce/consume"
          + "r/procurement/apiv1alpha1/procurementpb;"
          + "procurementpb\352A\221\001\n)commerceoffercatalog."
          + "googleapis.com/Offer\022)services/{service}"
          + "/standardOffers/{offer}\0229billingAccounts"
          + "/{consumer_billing_account}/offers/{offe"
          + "r}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Order_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Order_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Order_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "LineItems",
              "CancelledLineItems",
              "CreateTime",
              "UpdateTime",
              "Etag",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItem_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItem_descriptor,
            new java.lang.String[] {
              "LineItemId", "LineItemInfo", "PendingChange", "ChangeHistory",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemChange_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemChange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemChange_descriptor,
            new java.lang.String[] {
              "ChangeId",
              "ChangeType",
              "OldLineItemInfo",
              "NewLineItemInfo",
              "ChangeState",
              "StateReason",
              "ChangeStateReasonType",
              "ChangeEffectiveTime",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_LineItemInfo_descriptor,
            new java.lang.String[] {
              "Offer", "Parameters", "Subscription",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_descriptor,
            new java.lang.String[] {
              "Name", "Value",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_Value_descriptor =
        internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_Value_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Parameter_Value_descriptor,
            new java.lang.String[] {
              "Int64Value", "StringValue", "DoubleValue", "Kind",
            });
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_commerce_consumer_procurement_v1alpha1_Subscription_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "AutoRenewalEnabled",
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
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
