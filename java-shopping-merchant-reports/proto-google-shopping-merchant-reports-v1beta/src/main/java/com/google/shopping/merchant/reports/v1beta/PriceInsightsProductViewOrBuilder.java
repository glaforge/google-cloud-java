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
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.reports.v1beta;

public interface PriceInsightsProductViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.PriceInsightsProductView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Can be used to join data with the
   * `product_view` table.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Can be used to join data with the
   * `product_view` table.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * REST ID of the product, in the form of
   * `channel~languageCode~feedLabel~offerId`. Can be used to join data with the
   * `product_view` table.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 2;</code>
   *
   * @return Whether the offerId field is set.
   */
  boolean hasOfferId();
  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 2;</code>
   *
   * @return The offerId.
   */
  java.lang.String getOfferId();
  /**
   *
   *
   * <pre>
   * Merchant-provided id of the product.
   * </pre>
   *
   * <code>optional string offer_id = 2;</code>
   *
   * @return The bytes for offerId.
   */
  com.google.protobuf.ByteString getOfferIdBytes();

  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 3;</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();
  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 3;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   *
   *
   * <pre>
   * Title of the product.
   * </pre>
   *
   * <code>optional string title = 3;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 4;</code>
   *
   * @return Whether the brand field is set.
   */
  boolean hasBrand();
  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 4;</code>
   *
   * @return The brand.
   */
  java.lang.String getBrand();
  /**
   *
   *
   * <pre>
   * Brand of the product.
   * </pre>
   *
   * <code>optional string brand = 4;</code>
   *
   * @return The bytes for brand.
   */
  com.google.protobuf.ByteString getBrandBytes();

  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 5;</code>
   *
   * @return Whether the categoryL1 field is set.
   */
  boolean hasCategoryL1();
  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 5;</code>
   *
   * @return The categoryL1.
   */
  java.lang.String getCategoryL1();
  /**
   *
   *
   * <pre>
   * Product category (1st level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l1 = 5;</code>
   *
   * @return The bytes for categoryL1.
   */
  com.google.protobuf.ByteString getCategoryL1Bytes();

  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 6;</code>
   *
   * @return Whether the categoryL2 field is set.
   */
  boolean hasCategoryL2();
  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 6;</code>
   *
   * @return The categoryL2.
   */
  java.lang.String getCategoryL2();
  /**
   *
   *
   * <pre>
   * Product category (2nd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l2 = 6;</code>
   *
   * @return The bytes for categoryL2.
   */
  com.google.protobuf.ByteString getCategoryL2Bytes();

  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 7;</code>
   *
   * @return Whether the categoryL3 field is set.
   */
  boolean hasCategoryL3();
  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 7;</code>
   *
   * @return The categoryL3.
   */
  java.lang.String getCategoryL3();
  /**
   *
   *
   * <pre>
   * Product category (3rd level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l3 = 7;</code>
   *
   * @return The bytes for categoryL3.
   */
  com.google.protobuf.ByteString getCategoryL3Bytes();

  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 8;</code>
   *
   * @return Whether the categoryL4 field is set.
   */
  boolean hasCategoryL4();
  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 8;</code>
   *
   * @return The categoryL4.
   */
  java.lang.String getCategoryL4();
  /**
   *
   *
   * <pre>
   * Product category (4th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l4 = 8;</code>
   *
   * @return The bytes for categoryL4.
   */
  com.google.protobuf.ByteString getCategoryL4Bytes();

  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 9;</code>
   *
   * @return Whether the categoryL5 field is set.
   */
  boolean hasCategoryL5();
  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 9;</code>
   *
   * @return The categoryL5.
   */
  java.lang.String getCategoryL5();
  /**
   *
   *
   * <pre>
   * Product category (5th level) in [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   * </pre>
   *
   * <code>optional string category_l5 = 9;</code>
   *
   * @return The bytes for categoryL5.
   */
  com.google.protobuf.ByteString getCategoryL5Bytes();

  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 10;</code>
   *
   * @return Whether the productTypeL1 field is set.
   */
  boolean hasProductTypeL1();
  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 10;</code>
   *
   * @return The productTypeL1.
   */
  java.lang.String getProductTypeL1();
  /**
   *
   *
   * <pre>
   * Product type (1st level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l1 = 10;</code>
   *
   * @return The bytes for productTypeL1.
   */
  com.google.protobuf.ByteString getProductTypeL1Bytes();

  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 11;</code>
   *
   * @return Whether the productTypeL2 field is set.
   */
  boolean hasProductTypeL2();
  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 11;</code>
   *
   * @return The productTypeL2.
   */
  java.lang.String getProductTypeL2();
  /**
   *
   *
   * <pre>
   * Product type (2nd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l2 = 11;</code>
   *
   * @return The bytes for productTypeL2.
   */
  com.google.protobuf.ByteString getProductTypeL2Bytes();

  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 12;</code>
   *
   * @return Whether the productTypeL3 field is set.
   */
  boolean hasProductTypeL3();
  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 12;</code>
   *
   * @return The productTypeL3.
   */
  java.lang.String getProductTypeL3();
  /**
   *
   *
   * <pre>
   * Product type (3rd level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l3 = 12;</code>
   *
   * @return The bytes for productTypeL3.
   */
  com.google.protobuf.ByteString getProductTypeL3Bytes();

  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 13;</code>
   *
   * @return Whether the productTypeL4 field is set.
   */
  boolean hasProductTypeL4();
  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 13;</code>
   *
   * @return The productTypeL4.
   */
  java.lang.String getProductTypeL4();
  /**
   *
   *
   * <pre>
   * Product type (4th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l4 = 13;</code>
   *
   * @return The bytes for productTypeL4.
   */
  com.google.protobuf.ByteString getProductTypeL4Bytes();

  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 14;</code>
   *
   * @return Whether the productTypeL5 field is set.
   */
  boolean hasProductTypeL5();
  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 14;</code>
   *
   * @return The productTypeL5.
   */
  java.lang.String getProductTypeL5();
  /**
   *
   *
   * <pre>
   * Product type (5th level) in merchant's own [product
   * taxonomy](https://support.google.com/merchants/answer/6324406).
   * </pre>
   *
   * <code>optional string product_type_l5 = 14;</code>
   *
   * @return The bytes for productTypeL5.
   */
  com.google.protobuf.ByteString getProductTypeL5Bytes();

  /**
   *
   *
   * <pre>
   * Current price of the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 15;</code>
   *
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   *
   *
   * <pre>
   * Current price of the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 15;</code>
   *
   * @return The price.
   */
  com.google.shopping.type.Price getPrice();
  /**
   *
   *
   * <pre>
   * Current price of the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price price = 15;</code>
   */
  com.google.shopping.type.PriceOrBuilder getPriceOrBuilder();

  /**
   *
   *
   * <pre>
   * Latest suggested price for the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price suggested_price = 16;</code>
   *
   * @return Whether the suggestedPrice field is set.
   */
  boolean hasSuggestedPrice();
  /**
   *
   *
   * <pre>
   * Latest suggested price for the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price suggested_price = 16;</code>
   *
   * @return The suggestedPrice.
   */
  com.google.shopping.type.Price getSuggestedPrice();
  /**
   *
   *
   * <pre>
   * Latest suggested price for the product.
   * </pre>
   *
   * <code>.google.shopping.type.Price suggested_price = 16;</code>
   */
  com.google.shopping.type.PriceOrBuilder getSuggestedPriceOrBuilder();

  /**
   *
   *
   * <pre>
   * Predicted change in impressions as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in impressions.
   * </pre>
   *
   * <code>optional double predicted_impressions_change_fraction = 17;</code>
   *
   * @return Whether the predictedImpressionsChangeFraction field is set.
   */
  boolean hasPredictedImpressionsChangeFraction();
  /**
   *
   *
   * <pre>
   * Predicted change in impressions as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in impressions.
   * </pre>
   *
   * <code>optional double predicted_impressions_change_fraction = 17;</code>
   *
   * @return The predictedImpressionsChangeFraction.
   */
  double getPredictedImpressionsChangeFraction();

  /**
   *
   *
   * <pre>
   * Predicted change in clicks as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in clicks.
   * </pre>
   *
   * <code>optional double predicted_clicks_change_fraction = 18;</code>
   *
   * @return Whether the predictedClicksChangeFraction field is set.
   */
  boolean hasPredictedClicksChangeFraction();
  /**
   *
   *
   * <pre>
   * Predicted change in clicks as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in clicks.
   * </pre>
   *
   * <code>optional double predicted_clicks_change_fraction = 18;</code>
   *
   * @return The predictedClicksChangeFraction.
   */
  double getPredictedClicksChangeFraction();

  /**
   *
   *
   * <pre>
   * Predicted change in conversions as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in conversions).
   * </pre>
   *
   * <code>optional double predicted_conversions_change_fraction = 19;</code>
   *
   * @return Whether the predictedConversionsChangeFraction field is set.
   */
  boolean hasPredictedConversionsChangeFraction();
  /**
   *
   *
   * <pre>
   * Predicted change in conversions as a fraction after introducing the
   * suggested price compared to current active price. For example, 0.05 is a 5%
   * predicted increase in conversions).
   * </pre>
   *
   * <code>optional double predicted_conversions_change_fraction = 19;</code>
   *
   * @return The predictedConversionsChangeFraction.
   */
  double getPredictedConversionsChangeFraction();
}
