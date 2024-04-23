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
// source: google/cloud/dialogflow/cx/v3/session.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

public interface QueryInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.QueryInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TextInput text = 2;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TextInput text = 2;</code>
   *
   * @return The text.
   */
  com.google.cloud.dialogflow.cx.v3.TextInput getText();
  /**
   *
   *
   * <pre>
   * The natural language text to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.TextInput text = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.TextInputOrBuilder getTextOrBuilder();

  /**
   *
   *
   * <pre>
   * The intent to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.IntentInput intent = 3;</code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * The intent to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.IntentInput intent = 3;</code>
   *
   * @return The intent.
   */
  com.google.cloud.dialogflow.cx.v3.IntentInput getIntent();
  /**
   *
   *
   * <pre>
   * The intent to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.IntentInput intent = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3.IntentInputOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AudioInput audio = 5;</code>
   *
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   *
   *
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AudioInput audio = 5;</code>
   *
   * @return The audio.
   */
  com.google.cloud.dialogflow.cx.v3.AudioInput getAudio();
  /**
   *
   *
   * <pre>
   * The natural language speech audio to be processed.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AudioInput audio = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.AudioInputOrBuilder getAudioOrBuilder();

  /**
   *
   *
   * <pre>
   * The event to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EventInput event = 6;</code>
   *
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   *
   *
   * <pre>
   * The event to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EventInput event = 6;</code>
   *
   * @return The event.
   */
  com.google.cloud.dialogflow.cx.v3.EventInput getEvent();
  /**
   *
   *
   * <pre>
   * The event to be triggered.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EventInput event = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3.EventInputOrBuilder getEventOrBuilder();

  /**
   *
   *
   * <pre>
   * The DTMF event to be handled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 7;</code>
   *
   * @return Whether the dtmf field is set.
   */
  boolean hasDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF event to be handled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 7;</code>
   *
   * @return The dtmf.
   */
  com.google.cloud.dialogflow.cx.v3.DtmfInput getDtmf();
  /**
   *
   *
   * <pre>
   * The DTMF event to be handled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DtmfInput dtmf = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.DtmfInputOrBuilder getDtmfOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The language of the input. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of the input. See [Language
   * Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  com.google.cloud.dialogflow.cx.v3.QueryInput.InputCase getInputCase();
}
