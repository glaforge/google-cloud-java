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
// source: google/maps/mapsplatformdatasets/v1/data_source.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.mapsplatformdatasets.v1;

/**
 *
 *
 * <pre>
 * The format of the file being uploaded.
 * </pre>
 *
 * Protobuf enum {@code google.maps.mapsplatformdatasets.v1.FileFormat}
 */
public enum FileFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified file format.
   * </pre>
   *
   * <code>FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  FILE_FORMAT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * GeoJson file.
   * </pre>
   *
   * <code>FILE_FORMAT_GEOJSON = 1;</code>
   */
  FILE_FORMAT_GEOJSON(1),
  /**
   *
   *
   * <pre>
   * KML file.
   * </pre>
   *
   * <code>FILE_FORMAT_KML = 2;</code>
   */
  FILE_FORMAT_KML(2),
  /**
   *
   *
   * <pre>
   * CSV file.
   * </pre>
   *
   * <code>FILE_FORMAT_CSV = 3;</code>
   */
  FILE_FORMAT_CSV(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified file format.
   * </pre>
   *
   * <code>FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int FILE_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * GeoJson file.
   * </pre>
   *
   * <code>FILE_FORMAT_GEOJSON = 1;</code>
   */
  public static final int FILE_FORMAT_GEOJSON_VALUE = 1;
  /**
   *
   *
   * <pre>
   * KML file.
   * </pre>
   *
   * <code>FILE_FORMAT_KML = 2;</code>
   */
  public static final int FILE_FORMAT_KML_VALUE = 2;
  /**
   *
   *
   * <pre>
   * CSV file.
   * </pre>
   *
   * <code>FILE_FORMAT_CSV = 3;</code>
   */
  public static final int FILE_FORMAT_CSV_VALUE = 3;

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
  public static FileFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FileFormat forNumber(int value) {
    switch (value) {
      case 0:
        return FILE_FORMAT_UNSPECIFIED;
      case 1:
        return FILE_FORMAT_GEOJSON;
      case 2:
        return FILE_FORMAT_KML;
      case 3:
        return FILE_FORMAT_CSV;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FileFormat> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FileFormat> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<FileFormat>() {
        public FileFormat findValueByNumber(int number) {
          return FileFormat.forNumber(number);
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
    return com.google.maps.mapsplatformdatasets.v1.DataSourceProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final FileFormat[] VALUES = values();

  public static FileFormat valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FileFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.mapsplatformdatasets.v1.FileFormat)
}
