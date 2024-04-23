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
// source: google/maps/routing/v2/route.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.routing.v2;

public interface RouteTravelAdvisoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routing.v2.RouteTravelAdvisory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Contains information about tolls on the route. This field is only populated
   * if tolls are expected on the route. If this field is set, but the
   * `estimatedPrice` subfield is not populated, then the route contains tolls,
   * but the estimated price is unknown. If this field is not set, then there
   * are no tolls expected on the route.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 2;</code>
   *
   * @return Whether the tollInfo field is set.
   */
  boolean hasTollInfo();
  /**
   *
   *
   * <pre>
   * Contains information about tolls on the route. This field is only populated
   * if tolls are expected on the route. If this field is set, but the
   * `estimatedPrice` subfield is not populated, then the route contains tolls,
   * but the estimated price is unknown. If this field is not set, then there
   * are no tolls expected on the route.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 2;</code>
   *
   * @return The tollInfo.
   */
  com.google.maps.routing.v2.TollInfo getTollInfo();
  /**
   *
   *
   * <pre>
   * Contains information about tolls on the route. This field is only populated
   * if tolls are expected on the route. If this field is set, but the
   * `estimatedPrice` subfield is not populated, then the route contains tolls,
   * but the estimated price is unknown. If this field is not set, then there
   * are no tolls expected on the route.
   * </pre>
   *
   * <code>.google.maps.routing.v2.TollInfo toll_info = 2;</code>
   */
  com.google.maps.routing.v2.TollInfoOrBuilder getTollInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the route without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 3;</code>
   */
  java.util.List<com.google.maps.routing.v2.SpeedReadingInterval> getSpeedReadingIntervalsList();
  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the route without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 3;</code>
   */
  com.google.maps.routing.v2.SpeedReadingInterval getSpeedReadingIntervals(int index);
  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the route without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 3;</code>
   */
  int getSpeedReadingIntervalsCount();
  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the route without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 3;</code>
   */
  java.util.List<? extends com.google.maps.routing.v2.SpeedReadingIntervalOrBuilder>
      getSpeedReadingIntervalsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Speed reading intervals detailing traffic density. Applicable in case of
   * `TRAFFIC_AWARE` and `TRAFFIC_AWARE_OPTIMAL` routing preferences.
   * The intervals cover the entire polyline of the route without overlap.
   * The start point of a specified interval is the same as the end point of the
   * preceding interval.
   *
   * Example:
   *
   *     polyline: A ---- B ---- C ---- D ---- E ---- F ---- G
   *     speed_reading_intervals: [A,C), [C,D), [D,G).
   * </pre>
   *
   * <code>repeated .google.maps.routing.v2.SpeedReadingInterval speed_reading_intervals = 3;</code>
   */
  com.google.maps.routing.v2.SpeedReadingIntervalOrBuilder getSpeedReadingIntervalsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The predicted fuel consumption in microliters.
   * </pre>
   *
   * <code>int64 fuel_consumption_microliters = 5;</code>
   *
   * @return The fuelConsumptionMicroliters.
   */
  long getFuelConsumptionMicroliters();

  /**
   *
   *
   * <pre>
   * Returned route may have restrictions that are not suitable for requested
   * travel mode or route modifiers.
   * </pre>
   *
   * <code>bool route_restrictions_partially_ignored = 6;</code>
   *
   * @return The routeRestrictionsPartiallyIgnored.
   */
  boolean getRouteRestrictionsPartiallyIgnored();

  /**
   *
   *
   * <pre>
   * If present, contains the total fare or ticket costs on this route
   * This property is only returned for `TRANSIT` requests and only
   * for routes where fare information is available for all transit steps.
   * </pre>
   *
   * <code>.google.type.Money transit_fare = 7;</code>
   *
   * @return Whether the transitFare field is set.
   */
  boolean hasTransitFare();
  /**
   *
   *
   * <pre>
   * If present, contains the total fare or ticket costs on this route
   * This property is only returned for `TRANSIT` requests and only
   * for routes where fare information is available for all transit steps.
   * </pre>
   *
   * <code>.google.type.Money transit_fare = 7;</code>
   *
   * @return The transitFare.
   */
  com.google.type.Money getTransitFare();
  /**
   *
   *
   * <pre>
   * If present, contains the total fare or ticket costs on this route
   * This property is only returned for `TRANSIT` requests and only
   * for routes where fare information is available for all transit steps.
   * </pre>
   *
   * <code>.google.type.Money transit_fare = 7;</code>
   */
  com.google.type.MoneyOrBuilder getTransitFareOrBuilder();
}
