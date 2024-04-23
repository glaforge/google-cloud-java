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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1p4beta1;

public interface LocationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.LocationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();
  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   *
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();
  /**
   *
   *
   * <pre>
   * lat/long location coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();
}
