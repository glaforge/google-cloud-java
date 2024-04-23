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
// source: google/cloud/video/transcoder/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.transcoder.v1;

public interface MuxStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.transcoder.v1.MuxStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique key for this multiplexed stream. HLS media manifests will be
   * named `MuxStream.key` with the `.m3u8` extension suffix.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * A unique key for this multiplexed stream. HLS media manifests will be
   * named `MuxStream.key` with the `.m3u8` extension suffix.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * The name of the generated file. The default is `MuxStream.key` with the
   * extension suffix corresponding to the `MuxStream.container`.
   *
   * Individual segments also have an incremental 10-digit zero-padded suffix
   * starting from 0 before the extension, such as `mux_stream0000000123.ts`.
   * </pre>
   *
   * <code>string file_name = 2;</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   *
   *
   * <pre>
   * The name of the generated file. The default is `MuxStream.key` with the
   * extension suffix corresponding to the `MuxStream.container`.
   *
   * Individual segments also have an incremental 10-digit zero-padded suffix
   * starting from 0 before the extension, such as `mux_stream0000000123.ts`.
   * </pre>
   *
   * <code>string file_name = 2;</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();

  /**
   *
   *
   * <pre>
   * The container format. The default is `mp4`
   *
   * Supported container formats:
   *
   * - `ts`
   * - `fmp4`- the corresponding file extension is `.m4s`
   * - `mp4`
   * - `vtt`
   *
   * See also:
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats)
   * </pre>
   *
   * <code>string container = 3;</code>
   *
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   *
   *
   * <pre>
   * The container format. The default is `mp4`
   *
   * Supported container formats:
   *
   * - `ts`
   * - `fmp4`- the corresponding file extension is `.m4s`
   * - `mp4`
   * - `vtt`
   *
   * See also:
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats)
   * </pre>
   *
   * <code>string container = 3;</code>
   *
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString getContainerBytes();

  /**
   *
   *
   * <pre>
   * List of `ElementaryStream.key`s multiplexed in this stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   *
   * @return A list containing the elementaryStreams.
   */
  java.util.List<java.lang.String> getElementaryStreamsList();
  /**
   *
   *
   * <pre>
   * List of `ElementaryStream.key`s multiplexed in this stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   *
   * @return The count of elementaryStreams.
   */
  int getElementaryStreamsCount();
  /**
   *
   *
   * <pre>
   * List of `ElementaryStream.key`s multiplexed in this stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The elementaryStreams at the given index.
   */
  java.lang.String getElementaryStreams(int index);
  /**
   *
   *
   * <pre>
   * List of `ElementaryStream.key`s multiplexed in this stream.
   * </pre>
   *
   * <code>repeated string elementary_streams = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the elementaryStreams at the given index.
   */
  com.google.protobuf.ByteString getElementaryStreamsBytes(int index);

  /**
   *
   *
   * <pre>
   * Segment settings for `ts`, `fmp4` and `vtt`.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.SegmentSettings segment_settings = 5;</code>
   *
   * @return Whether the segmentSettings field is set.
   */
  boolean hasSegmentSettings();
  /**
   *
   *
   * <pre>
   * Segment settings for `ts`, `fmp4` and `vtt`.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.SegmentSettings segment_settings = 5;</code>
   *
   * @return The segmentSettings.
   */
  com.google.cloud.video.transcoder.v1.SegmentSettings getSegmentSettings();
  /**
   *
   *
   * <pre>
   * Segment settings for `ts`, `fmp4` and `vtt`.
   * </pre>
   *
   * <code>.google.cloud.video.transcoder.v1.SegmentSettings segment_settings = 5;</code>
   */
  com.google.cloud.video.transcoder.v1.SegmentSettingsOrBuilder getSegmentSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Identifier of the encryption configuration to use. If omitted, output will
   * be unencrypted.
   * </pre>
   *
   * <code>string encryption_id = 7;</code>
   *
   * @return The encryptionId.
   */
  java.lang.String getEncryptionId();
  /**
   *
   *
   * <pre>
   * Identifier of the encryption configuration to use. If omitted, output will
   * be unencrypted.
   * </pre>
   *
   * <code>string encryption_id = 7;</code>
   *
   * @return The bytes for encryptionId.
   */
  com.google.protobuf.ByteString getEncryptionIdBytes();
}
