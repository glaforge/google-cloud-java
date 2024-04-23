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
// source: google/cloud/speech/v2/cloud_speech.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.speech.v2;

public interface SpeechAdaptationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.SpeechAdaptation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;
   * </code>
   */
  java.util.List<com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet>
      getPhraseSetsList();
  /**
   *
   *
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;
   * </code>
   */
  com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet getPhraseSets(int index);
  /**
   *
   *
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;
   * </code>
   */
  int getPhraseSetsCount();
  /**
   *
   *
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSetOrBuilder>
      getPhraseSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of inline or referenced PhraseSets.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSet phrase_sets = 1;
   * </code>
   */
  com.google.cloud.speech.v2.SpeechAdaptation.AdaptationPhraseSetOrBuilder getPhraseSetsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  java.util.List<com.google.cloud.speech.v2.CustomClass> getCustomClassesList();
  /**
   *
   *
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  com.google.cloud.speech.v2.CustomClass getCustomClasses(int index);
  /**
   *
   *
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  int getCustomClassesCount();
  /**
   *
   *
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v2.CustomClassOrBuilder>
      getCustomClassesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of inline CustomClasses. Existing CustomClass resources can be
   * referenced directly in a PhraseSet.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v2.CustomClass custom_classes = 2;</code>
   */
  com.google.cloud.speech.v2.CustomClassOrBuilder getCustomClassesOrBuilder(int index);
}
