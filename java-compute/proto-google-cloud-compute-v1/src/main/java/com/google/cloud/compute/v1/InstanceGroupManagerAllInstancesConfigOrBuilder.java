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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface InstanceGroupManagerAllInstancesConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerAllInstancesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   *
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   *
   * @return The properties.
   */
  com.google.cloud.compute.v1.InstancePropertiesPatch getProperties();
  /**
   *
   *
   * <pre>
   * Properties to set on all instances in the group. You can add or modify properties using the instanceGroupManagers.patch or regionInstanceGroupManagers.patch. After setting allInstancesConfig on the group, you must update the group's instances to apply the configuration. To apply the configuration, set the group's updatePolicy.type field to use proactive updates or use the applyUpdatesToInstances method.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstancePropertiesPatch properties = 147688755;</code>
   */
  com.google.cloud.compute.v1.InstancePropertiesPatchOrBuilder getPropertiesOrBuilder();
}
