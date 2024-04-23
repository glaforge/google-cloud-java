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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Type of the match which can be applied to different ways of matching, like
 * Dictionary, regular expression and intersecting with findings of another
 * info type.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.MatchingType}
 */
public enum MatchingType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Invalid.
   * </pre>
   *
   * <code>MATCHING_TYPE_UNSPECIFIED = 0;</code>
   */
  MATCHING_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Full match.
   *
   * - Dictionary: join of Dictionary results matched complete finding quote
   * - Regex: all regex matches fill a finding quote start to end
   * - Exclude info type: completely inside affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_FULL_MATCH = 1;</code>
   */
  MATCHING_TYPE_FULL_MATCH(1),
  /**
   *
   *
   * <pre>
   * Partial match.
   *
   * - Dictionary: at least one of the tokens in the finding matches
   * - Regex: substring of the finding matches
   * - Exclude info type: intersects with affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_PARTIAL_MATCH = 2;</code>
   */
  MATCHING_TYPE_PARTIAL_MATCH(2),
  /**
   *
   *
   * <pre>
   * Inverse match.
   *
   * - Dictionary: no tokens in the finding match the dictionary
   * - Regex: finding doesn't match the regex
   * - Exclude info type: no intersection with affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_INVERSE_MATCH = 3;</code>
   */
  MATCHING_TYPE_INVERSE_MATCH(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Invalid.
   * </pre>
   *
   * <code>MATCHING_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MATCHING_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Full match.
   *
   * - Dictionary: join of Dictionary results matched complete finding quote
   * - Regex: all regex matches fill a finding quote start to end
   * - Exclude info type: completely inside affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_FULL_MATCH = 1;</code>
   */
  public static final int MATCHING_TYPE_FULL_MATCH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Partial match.
   *
   * - Dictionary: at least one of the tokens in the finding matches
   * - Regex: substring of the finding matches
   * - Exclude info type: intersects with affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_PARTIAL_MATCH = 2;</code>
   */
  public static final int MATCHING_TYPE_PARTIAL_MATCH_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Inverse match.
   *
   * - Dictionary: no tokens in the finding match the dictionary
   * - Regex: finding doesn't match the regex
   * - Exclude info type: no intersection with affecting info types findings
   * </pre>
   *
   * <code>MATCHING_TYPE_INVERSE_MATCH = 3;</code>
   */
  public static final int MATCHING_TYPE_INVERSE_MATCH_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MatchingType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchingType forNumber(int value) {
    switch (value) {
      case 0:
        return MATCHING_TYPE_UNSPECIFIED;
      case 1:
        return MATCHING_TYPE_FULL_MATCH;
      case 2:
        return MATCHING_TYPE_PARTIAL_MATCH;
      case 3:
        return MATCHING_TYPE_INVERSE_MATCH;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchingType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<MatchingType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<MatchingType>() {
        public MatchingType findValueByNumber(int number) {
          return MatchingType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(9);
  }

  private static final MatchingType[] VALUES = values();

  public static MatchingType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MatchingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.MatchingType)
}
