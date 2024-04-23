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
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.stitcher.v1;

public interface CdnKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.CdnKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The configuration for a Google Cloud CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GoogleCdnKey google_cdn_key = 5;</code>
   *
   * @return Whether the googleCdnKey field is set.
   */
  boolean hasGoogleCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for a Google Cloud CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GoogleCdnKey google_cdn_key = 5;</code>
   *
   * @return The googleCdnKey.
   */
  com.google.cloud.video.stitcher.v1.GoogleCdnKey getGoogleCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for a Google Cloud CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GoogleCdnKey google_cdn_key = 5;</code>
   */
  com.google.cloud.video.stitcher.v1.GoogleCdnKeyOrBuilder getGoogleCdnKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration for an Akamai CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.AkamaiCdnKey akamai_cdn_key = 6;</code>
   *
   * @return Whether the akamaiCdnKey field is set.
   */
  boolean hasAkamaiCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for an Akamai CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.AkamaiCdnKey akamai_cdn_key = 6;</code>
   *
   * @return The akamaiCdnKey.
   */
  com.google.cloud.video.stitcher.v1.AkamaiCdnKey getAkamaiCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for an Akamai CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.AkamaiCdnKey akamai_cdn_key = 6;</code>
   */
  com.google.cloud.video.stitcher.v1.AkamaiCdnKeyOrBuilder getAkamaiCdnKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration for a Media CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.MediaCdnKey media_cdn_key = 8;</code>
   *
   * @return Whether the mediaCdnKey field is set.
   */
  boolean hasMediaCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for a Media CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.MediaCdnKey media_cdn_key = 8;</code>
   *
   * @return The mediaCdnKey.
   */
  com.google.cloud.video.stitcher.v1.MediaCdnKey getMediaCdnKey();
  /**
   *
   *
   * <pre>
   * The configuration for a Media CDN key.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.MediaCdnKey media_cdn_key = 8;</code>
   */
  com.google.cloud.video.stitcher.v1.MediaCdnKeyOrBuilder getMediaCdnKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The resource name of the CDN key, in the form of
   * `projects/{project}/locations/{location}/cdnKeys/{id}`.
   * The name is ignored when creating a CDN key.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the CDN key, in the form of
   * `projects/{project}/locations/{location}/cdnKeys/{id}`.
   * The name is ignored when creating a CDN key.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The hostname this key applies to.
   * </pre>
   *
   * <code>string hostname = 4;</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * The hostname this key applies to.
   * </pre>
   *
   * <code>string hostname = 4;</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();

  com.google.cloud.video.stitcher.v1.CdnKey.CdnKeyConfigCase getCdnKeyConfigCase();
}
