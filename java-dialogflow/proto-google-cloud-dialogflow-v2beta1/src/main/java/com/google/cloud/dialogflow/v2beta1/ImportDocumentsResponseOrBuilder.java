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
// source: google/cloud/dialogflow/v2beta1/document.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2beta1;

public interface ImportDocumentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  java.util.List<com.google.rpc.Status> getWarningsList();
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  com.google.rpc.Status getWarnings(int index);
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  int getWarningsCount();
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getWarningsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getWarningsOrBuilder(int index);
}
