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
// source: google/cloud/security/privateca/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.security.privateca.v1;

public interface SubjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.privateca.v1.Subject)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The "common name" of the subject.
   * </pre>
   *
   * <code>string common_name = 1;</code>
   *
   * @return The commonName.
   */
  java.lang.String getCommonName();
  /**
   *
   *
   * <pre>
   * The "common name" of the subject.
   * </pre>
   *
   * <code>string common_name = 1;</code>
   *
   * @return The bytes for commonName.
   */
  com.google.protobuf.ByteString getCommonNameBytes();

  /**
   *
   *
   * <pre>
   * The country code of the subject.
   * </pre>
   *
   * <code>string country_code = 2;</code>
   *
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   *
   *
   * <pre>
   * The country code of the subject.
   * </pre>
   *
   * <code>string country_code = 2;</code>
   *
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString getCountryCodeBytes();

  /**
   *
   *
   * <pre>
   * The organization of the subject.
   * </pre>
   *
   * <code>string organization = 3;</code>
   *
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   *
   *
   * <pre>
   * The organization of the subject.
   * </pre>
   *
   * <code>string organization = 3;</code>
   *
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString getOrganizationBytes();

  /**
   *
   *
   * <pre>
   * The organizational_unit of the subject.
   * </pre>
   *
   * <code>string organizational_unit = 4;</code>
   *
   * @return The organizationalUnit.
   */
  java.lang.String getOrganizationalUnit();
  /**
   *
   *
   * <pre>
   * The organizational_unit of the subject.
   * </pre>
   *
   * <code>string organizational_unit = 4;</code>
   *
   * @return The bytes for organizationalUnit.
   */
  com.google.protobuf.ByteString getOrganizationalUnitBytes();

  /**
   *
   *
   * <pre>
   * The locality or city of the subject.
   * </pre>
   *
   * <code>string locality = 5;</code>
   *
   * @return The locality.
   */
  java.lang.String getLocality();
  /**
   *
   *
   * <pre>
   * The locality or city of the subject.
   * </pre>
   *
   * <code>string locality = 5;</code>
   *
   * @return The bytes for locality.
   */
  com.google.protobuf.ByteString getLocalityBytes();

  /**
   *
   *
   * <pre>
   * The province, territory, or regional state of the subject.
   * </pre>
   *
   * <code>string province = 6;</code>
   *
   * @return The province.
   */
  java.lang.String getProvince();
  /**
   *
   *
   * <pre>
   * The province, territory, or regional state of the subject.
   * </pre>
   *
   * <code>string province = 6;</code>
   *
   * @return The bytes for province.
   */
  com.google.protobuf.ByteString getProvinceBytes();

  /**
   *
   *
   * <pre>
   * The street address of the subject.
   * </pre>
   *
   * <code>string street_address = 7;</code>
   *
   * @return The streetAddress.
   */
  java.lang.String getStreetAddress();
  /**
   *
   *
   * <pre>
   * The street address of the subject.
   * </pre>
   *
   * <code>string street_address = 7;</code>
   *
   * @return The bytes for streetAddress.
   */
  com.google.protobuf.ByteString getStreetAddressBytes();

  /**
   *
   *
   * <pre>
   * The postal code of the subject.
   * </pre>
   *
   * <code>string postal_code = 8;</code>
   *
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   *
   *
   * <pre>
   * The postal code of the subject.
   * </pre>
   *
   * <code>string postal_code = 8;</code>
   *
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString getPostalCodeBytes();
}
