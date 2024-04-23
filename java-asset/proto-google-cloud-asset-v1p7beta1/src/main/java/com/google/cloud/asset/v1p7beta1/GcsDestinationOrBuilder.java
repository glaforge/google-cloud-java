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
// source: google/cloud/asset/v1p7beta1/asset_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1p7beta1;

public interface GcsDestinationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p7beta1.GcsDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of the Cloud Storage object. It's the same URI that is used by
   * gsutil. Example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   *
   *
   * <pre>
   * The URI of the Cloud Storage object. It's the same URI that is used by
   * gsutil. Example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URI of the Cloud Storage object. It's the same URI that is used by
   * gsutil. Example: "gs://bucket_name/object_name". See [Viewing and
   * Editing Object
   * Metadata](https://cloud.google.com/storage/docs/viewing-editing-metadata)
   * for more information.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The URI prefix of all generated Cloud Storage objects. Example:
   * "gs://bucket_name/object_name_prefix". Each object URI is in format:
   * "gs://bucket_name/object_name_prefix/{ASSET_TYPE}/{SHARD_NUMBER} and only
   * contains assets for that type. &lt;shard number&gt; starts from 0. Example:
   * "gs://bucket_name/object_name_prefix/compute.googleapis.com/Disk/0" is
   * the first shard of output objects containing all
   * compute.googleapis.com/Disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix"
   * already exists.
   * </pre>
   *
   * <code>string uri_prefix = 2;</code>
   *
   * @return Whether the uriPrefix field is set.
   */
  boolean hasUriPrefix();
  /**
   *
   *
   * <pre>
   * The URI prefix of all generated Cloud Storage objects. Example:
   * "gs://bucket_name/object_name_prefix". Each object URI is in format:
   * "gs://bucket_name/object_name_prefix/{ASSET_TYPE}/{SHARD_NUMBER} and only
   * contains assets for that type. &lt;shard number&gt; starts from 0. Example:
   * "gs://bucket_name/object_name_prefix/compute.googleapis.com/Disk/0" is
   * the first shard of output objects containing all
   * compute.googleapis.com/Disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix"
   * already exists.
   * </pre>
   *
   * <code>string uri_prefix = 2;</code>
   *
   * @return The uriPrefix.
   */
  java.lang.String getUriPrefix();
  /**
   *
   *
   * <pre>
   * The URI prefix of all generated Cloud Storage objects. Example:
   * "gs://bucket_name/object_name_prefix". Each object URI is in format:
   * "gs://bucket_name/object_name_prefix/{ASSET_TYPE}/{SHARD_NUMBER} and only
   * contains assets for that type. &lt;shard number&gt; starts from 0. Example:
   * "gs://bucket_name/object_name_prefix/compute.googleapis.com/Disk/0" is
   * the first shard of output objects containing all
   * compute.googleapis.com/Disk assets. An INVALID_ARGUMENT error will be
   * returned if file with the same name "gs://bucket_name/object_name_prefix"
   * already exists.
   * </pre>
   *
   * <code>string uri_prefix = 2;</code>
   *
   * @return The bytes for uriPrefix.
   */
  com.google.protobuf.ByteString getUriPrefixBytes();

  com.google.cloud.asset.v1p7beta1.GcsDestination.ObjectUriCase getObjectUriCase();
}
