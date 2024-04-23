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
// source: google/cloud/talent/v4beta1/filters.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4beta1;

public interface CommuteFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CommuteFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The method of transportation to calculate the commute time for.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CommuteMethod commute_method = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for commuteMethod.
   */
  int getCommuteMethodValue();
  /**
   *
   *
   * <pre>
   * Required. The method of transportation to calculate the commute time for.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.CommuteMethod commute_method = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The commuteMethod.
   */
  com.google.cloud.talent.v4beta1.CommuteMethod getCommuteMethod();

  /**
   *
   *
   * <pre>
   * Required. The latitude and longitude of the location to calculate the
   * commute time from.
   * </pre>
   *
   * <code>.google.type.LatLng start_coordinates = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the startCoordinates field is set.
   */
  boolean hasStartCoordinates();
  /**
   *
   *
   * <pre>
   * Required. The latitude and longitude of the location to calculate the
   * commute time from.
   * </pre>
   *
   * <code>.google.type.LatLng start_coordinates = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The startCoordinates.
   */
  com.google.type.LatLng getStartCoordinates();
  /**
   *
   *
   * <pre>
   * Required. The latitude and longitude of the location to calculate the
   * commute time from.
   * </pre>
   *
   * <code>.google.type.LatLng start_coordinates = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.type.LatLngOrBuilder getStartCoordinatesOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The maximum travel time in seconds. The maximum allowed value is
   * `3600s` (one hour). Format is `123s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration travel_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the travelDuration field is set.
   */
  boolean hasTravelDuration();
  /**
   *
   *
   * <pre>
   * Required. The maximum travel time in seconds. The maximum allowed value is
   * `3600s` (one hour). Format is `123s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration travel_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The travelDuration.
   */
  com.google.protobuf.Duration getTravelDuration();
  /**
   *
   *
   * <pre>
   * Required. The maximum travel time in seconds. The maximum allowed value is
   * `3600s` (one hour). Format is `123s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration travel_duration = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getTravelDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * If `true`, jobs without street level addresses may also be returned.
   * For city level addresses, the city center is used. For state and coarser
   * level addresses, text matching is used.
   * If this field is set to `false` or isn't specified, only jobs that include
   * street level addresses will be returned by commute search.
   * </pre>
   *
   * <code>bool allow_imprecise_addresses = 4;</code>
   *
   * @return The allowImpreciseAddresses.
   */
  boolean getAllowImpreciseAddresses();

  /**
   *
   *
   * <pre>
   * Specifies the traffic density to use when calculating commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter.RoadTraffic road_traffic = 5;</code>
   *
   * @return Whether the roadTraffic field is set.
   */
  boolean hasRoadTraffic();
  /**
   *
   *
   * <pre>
   * Specifies the traffic density to use when calculating commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter.RoadTraffic road_traffic = 5;</code>
   *
   * @return The enum numeric value on the wire for roadTraffic.
   */
  int getRoadTrafficValue();
  /**
   *
   *
   * <pre>
   * Specifies the traffic density to use when calculating commute time.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CommuteFilter.RoadTraffic road_traffic = 5;</code>
   *
   * @return The roadTraffic.
   */
  com.google.cloud.talent.v4beta1.CommuteFilter.RoadTraffic getRoadTraffic();

  /**
   *
   *
   * <pre>
   * The departure time used to calculate traffic impact, represented as
   * [google.type.TimeOfDay][google.type.TimeOfDay] in local time zone.
   *
   * Currently traffic model is restricted to hour level resolution.
   * </pre>
   *
   * <code>.google.type.TimeOfDay departure_time = 6;</code>
   *
   * @return Whether the departureTime field is set.
   */
  boolean hasDepartureTime();
  /**
   *
   *
   * <pre>
   * The departure time used to calculate traffic impact, represented as
   * [google.type.TimeOfDay][google.type.TimeOfDay] in local time zone.
   *
   * Currently traffic model is restricted to hour level resolution.
   * </pre>
   *
   * <code>.google.type.TimeOfDay departure_time = 6;</code>
   *
   * @return The departureTime.
   */
  com.google.type.TimeOfDay getDepartureTime();
  /**
   *
   *
   * <pre>
   * The departure time used to calculate traffic impact, represented as
   * [google.type.TimeOfDay][google.type.TimeOfDay] in local time zone.
   *
   * Currently traffic model is restricted to hour level resolution.
   * </pre>
   *
   * <code>.google.type.TimeOfDay departure_time = 6;</code>
   */
  com.google.type.TimeOfDayOrBuilder getDepartureTimeOrBuilder();

  com.google.cloud.talent.v4beta1.CommuteFilter.TrafficOptionCase getTrafficOptionCase();
}
