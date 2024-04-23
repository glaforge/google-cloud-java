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

public interface InstanceGroupManagersRecreateInstancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return A list containing the instances.
   */
  java.util.List<java.lang.String> getInstancesList();
  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @return The count of instances.
   */
  int getInstancesCount();
  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the element to return.
   * @return The instances at the given index.
   */
  java.lang.String getInstances(int index);
  /**
   *
   *
   * <pre>
   * The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * </pre>
   *
   * <code>repeated string instances = 29097598;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the instances at the given index.
   */
  com.google.protobuf.ByteString getInstancesBytes(int index);
}
