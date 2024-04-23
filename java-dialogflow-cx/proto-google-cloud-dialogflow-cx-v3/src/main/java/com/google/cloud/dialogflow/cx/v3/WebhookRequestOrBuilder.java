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
// source: google/cloud/dialogflow/cx/v3/webhook.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

public interface WebhookRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.WebhookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Always present. The unique identifier of the
   * [DetectIntentResponse][google.cloud.dialogflow.cx.v3.DetectIntentResponse]
   * that will be returned to the API caller.
   * </pre>
   *
   * <code>string detect_intent_response_id = 1;</code>
   *
   * @return The detectIntentResponseId.
   */
  java.lang.String getDetectIntentResponseId();
  /**
   *
   *
   * <pre>
   * Always present. The unique identifier of the
   * [DetectIntentResponse][google.cloud.dialogflow.cx.v3.DetectIntentResponse]
   * that will be returned to the API caller.
   * </pre>
   *
   * <code>string detect_intent_response_id = 1;</code>
   *
   * @return The bytes for detectIntentResponseId.
   */
  com.google.protobuf.ByteString getDetectIntentResponseIdBytes();

  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 10;</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 10;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * If [natural language text][google.cloud.dialogflow.cx.v3.TextInput] was
   * provided as input, this field will contain a copy of the text.
   * </pre>
   *
   * <code>string text = 10;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the triggerIntent field is set.
   */
  boolean hasTriggerIntent();
  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The triggerIntent.
   */
  java.lang.String getTriggerIntent();
  /**
   *
   *
   * <pre>
   * If an [intent][google.cloud.dialogflow.cx.v3.IntentInput] was provided as
   * input, this field will contain a copy of the intent identifier. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string trigger_intent = 11 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for triggerIntent.
   */
  com.google.protobuf.ByteString getTriggerIntentBytes();

  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   *
   * @return Whether the transcript field is set.
   */
  boolean hasTranscript();
  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   *
   * @return The transcript.
   */
  java.lang.String getTranscript();
  /**
   *
   *
   * <pre>
   * If [natural language speech
   * audio][google.cloud.dialogflow.cx.v3.AudioInput] was provided as input,
   * this field will contain the transcript for the audio.
   * </pre>
   *
   * <code>string transcript = 12;</code>
   *
   * @return The bytes for transcript.
   */
  com.google.protobuf.ByteString getTranscriptBytes();

  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return Whether the triggerEvent field is set.
   */
  boolean hasTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return The triggerEvent.
   */
  java.lang.String getTriggerEvent();
  /**
   *
   *
   * <pre>
   * If an [event][google.cloud.dialogflow.cx.v3.EventInput] was provided as
   * input, this field will contain the name of the event.
   * </pre>
   *
   * <code>string trigger_event = 14;</code>
   *
   * @return The bytes for triggerEvent.
   */
  com.google.protobuf.ByteString getTriggerEventBytes();

  /**
   *
   *
   * <pre>
   * If [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as input,
   * this field will contain the DTMF digits.
   * </pre>
   *
   * <code>string dtmf_digits = 17;</code>
   *
   * @return Whether the dtmfDigits field is set.
   */
  boolean hasDtmfDigits();
  /**
   *
   *
   * <pre>
   * If [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as input,
   * this field will contain the DTMF digits.
   * </pre>
   *
   * <code>string dtmf_digits = 17;</code>
   *
   * @return The dtmfDigits.
   */
  java.lang.String getDtmfDigits();
  /**
   *
   *
   * <pre>
   * If [DTMF][google.cloud.dialogflow.cx.v3.DtmfInput] was provided as input,
   * this field will contain the DTMF digits.
   * </pre>
   *
   * <code>string dtmf_digits = 17;</code>
   *
   * @return The bytes for dtmfDigits.
   */
  com.google.protobuf.ByteString getDtmfDigitsBytes();

  /**
   *
   *
   * <pre>
   * The language code specified in the [original
   * request][QueryInput.language_code].
   * </pre>
   *
   * <code>string language_code = 15;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language code specified in the [original
   * request][QueryInput.language_code].
   * </pre>
   *
   * <code>string language_code = 15;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Always present. Information about the fulfillment that triggered this
   * webhook call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.FulfillmentInfo fulfillment_info = 6;
   * </code>
   *
   * @return Whether the fulfillmentInfo field is set.
   */
  boolean hasFulfillmentInfo();
  /**
   *
   *
   * <pre>
   * Always present. Information about the fulfillment that triggered this
   * webhook call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.FulfillmentInfo fulfillment_info = 6;
   * </code>
   *
   * @return The fulfillmentInfo.
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.FulfillmentInfo getFulfillmentInfo();
  /**
   *
   *
   * <pre>
   * Always present. Information about the fulfillment that triggered this
   * webhook call.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.FulfillmentInfo fulfillment_info = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.FulfillmentInfoOrBuilder
      getFulfillmentInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the last matched intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.IntentInfo intent_info = 3;</code>
   *
   * @return Whether the intentInfo field is set.
   */
  boolean hasIntentInfo();
  /**
   *
   *
   * <pre>
   * Information about the last matched intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.IntentInfo intent_info = 3;</code>
   *
   * @return The intentInfo.
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.IntentInfo getIntentInfo();
  /**
   *
   *
   * <pre>
   * Information about the last matched intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.WebhookRequest.IntentInfo intent_info = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.IntentInfoOrBuilder getIntentInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.PageInfo page_info = 4;</code>
   *
   * @return Whether the pageInfo field is set.
   */
  boolean hasPageInfo();
  /**
   *
   *
   * <pre>
   * Information about page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.PageInfo page_info = 4;</code>
   *
   * @return The pageInfo.
   */
  com.google.cloud.dialogflow.cx.v3.PageInfo getPageInfo();
  /**
   *
   *
   * <pre>
   * Information about page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.PageInfo page_info = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3.PageInfoOrBuilder getPageInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SessionInfo session_info = 5;</code>
   *
   * @return Whether the sessionInfo field is set.
   */
  boolean hasSessionInfo();
  /**
   *
   *
   * <pre>
   * Information about session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SessionInfo session_info = 5;</code>
   *
   * @return The sessionInfo.
   */
  com.google.cloud.dialogflow.cx.v3.SessionInfo getSessionInfo();
  /**
   *
   *
   * <pre>
   * Information about session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.SessionInfo session_info = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.SessionInfoOrBuilder getSessionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user. Webhook can
   * choose to append or replace this list in
   * [WebhookResponse.fulfillment_response][google.cloud.dialogflow.cx.v3.WebhookResponse.fulfillment_response];
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage messages = 7;</code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3.ResponseMessage> getMessagesList();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user. Webhook can
   * choose to append or replace this list in
   * [WebhookResponse.fulfillment_response][google.cloud.dialogflow.cx.v3.WebhookResponse.fulfillment_response];
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage messages = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessage getMessages(int index);
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user. Webhook can
   * choose to append or replace this list in
   * [WebhookResponse.fulfillment_response][google.cloud.dialogflow.cx.v3.WebhookResponse.fulfillment_response];
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage messages = 7;</code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user. Webhook can
   * choose to append or replace this list in
   * [WebhookResponse.fulfillment_response][google.cloud.dialogflow.cx.v3.WebhookResponse.fulfillment_response];
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage messages = 7;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of rich message responses to present to the user. Webhook can
   * choose to append or replace this list in
   * [WebhookResponse.fulfillment_response][google.cloud.dialogflow.cx.v3.WebhookResponse.fulfillment_response];
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.ResponseMessage messages = 7;</code>
   */
  com.google.cloud.dialogflow.cx.v3.ResponseMessageOrBuilder getMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Custom data set in
   * [QueryParameters.payload][google.cloud.dialogflow.cx.v3.QueryParameters.payload].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 8;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Custom data set in
   * [QueryParameters.payload][google.cloud.dialogflow.cx.v3.QueryParameters.payload].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 8;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Custom data set in
   * [QueryParameters.payload][google.cloud.dialogflow.cx.v3.QueryParameters.payload].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 8;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The sentiment analysis result of the current user request. The field is
   * filled when sentiment analysis is configured to be enabled for the request.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.WebhookRequest.SentimentAnalysisResult sentiment_analysis_result = 9;
   * </code>
   *
   * @return Whether the sentimentAnalysisResult field is set.
   */
  boolean hasSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result of the current user request. The field is
   * filled when sentiment analysis is configured to be enabled for the request.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.WebhookRequest.SentimentAnalysisResult sentiment_analysis_result = 9;
   * </code>
   *
   * @return The sentimentAnalysisResult.
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.SentimentAnalysisResult
      getSentimentAnalysisResult();
  /**
   *
   *
   * <pre>
   * The sentiment analysis result of the current user request. The field is
   * filled when sentiment analysis is configured to be enabled for the request.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.WebhookRequest.SentimentAnalysisResult sentiment_analysis_result = 9;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.WebhookRequest.SentimentAnalysisResultOrBuilder
      getSentimentAnalysisResultOrBuilder();

  com.google.cloud.dialogflow.cx.v3.WebhookRequest.QueryCase getQueryCase();
}
