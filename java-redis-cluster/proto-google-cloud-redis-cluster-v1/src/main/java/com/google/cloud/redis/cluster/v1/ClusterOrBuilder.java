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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.redis.cluster.v1;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource in this scope including project and
   * location using the form:
   *     `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp associated with the cluster creation request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this cluster.
   * Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current state of this cluster.
   * Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.redis.cluster.v1.Cluster.State getState();

  /**
   *
   *
   * <pre>
   * Output only. System assigned, unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System assigned, unique identifier for the cluster.
   * </pre>
   *
   * <code>string uid = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes per shard.
   * </pre>
   *
   * <code>optional int32 replica_count = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the replicaCount field is set.
   */
  boolean hasReplicaCount();
  /**
   *
   *
   * <pre>
   * Optional. The number of replica nodes per shard.
   * </pre>
   *
   * <code>optional int32 replica_count = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The replicaCount.
   */
  int getReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. The authorization mode of the Redis cluster.
   * If not provided, auth feature is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AuthorizationMode authorization_mode = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for authorizationMode.
   */
  int getAuthorizationModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The authorization mode of the Redis cluster.
   * If not provided, auth feature is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.AuthorizationMode authorization_mode = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The authorizationMode.
   */
  com.google.cloud.redis.cluster.v1.AuthorizationMode getAuthorizationMode();

  /**
   *
   *
   * <pre>
   * Optional. The in-transit encryption for the Redis cluster.
   * If not provided, encryption  is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.TransitEncryptionMode transit_encryption_mode = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for transitEncryptionMode.
   */
  int getTransitEncryptionModeValue();
  /**
   *
   *
   * <pre>
   * Optional. The in-transit encryption for the Redis cluster.
   * If not provided, encryption  is disabled for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.TransitEncryptionMode transit_encryption_mode = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transitEncryptionMode.
   */
  com.google.cloud.redis.cluster.v1.TransitEncryptionMode getTransitEncryptionMode();

  /**
   *
   *
   * <pre>
   * Output only. Redis memory size in GB for the entire cluster.
   * </pre>
   *
   * <code>optional int32 size_gb = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the sizeGb field is set.
   */
  boolean hasSizeGb();
  /**
   *
   *
   * <pre>
   * Output only. Redis memory size in GB for the entire cluster.
   * </pre>
   *
   * <code>optional int32 size_gb = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeGb.
   */
  int getSizeGb();

  /**
   *
   *
   * <pre>
   * Required. Number of shards for the Redis cluster.
   * </pre>
   *
   * <code>optional int32 shard_count = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the shardCount field is set.
   */
  boolean hasShardCount();
  /**
   *
   *
   * <pre>
   * Required. Number of shards for the Redis cluster.
   * </pre>
   *
   * <code>optional int32 shard_count = 14 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The shardCount.
   */
  int getShardCount();

  /**
   *
   *
   * <pre>
   * Required. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.PscConfig> getPscConfigsList();
  /**
   *
   *
   * <pre>
   * Required. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConfig getPscConfigs(int index);
  /**
   *
   *
   * <pre>
   * Required. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getPscConfigsCount();
  /**
   *
   *
   * <pre>
   * Required. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.PscConfigOrBuilder>
      getPscConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Each PscConfig configures the consumer network where IPs will
   * be designated to the cluster for client access through Private Service
   * Connect Automation. Currently, only one PscConfig is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConfig psc_configs = 15 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConfigOrBuilder getPscConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.DiscoveryEndpoint> getDiscoveryEndpointsList();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.DiscoveryEndpoint getDiscoveryEndpoints(int index);
  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getDiscoveryEndpointsCount();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.DiscoveryEndpointOrBuilder>
      getDiscoveryEndpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Endpoints created on each given network, for Redis clients to
   * connect to the cluster. Currently only one discovery endpoint is supported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.DiscoveryEndpoint discovery_endpoints = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.DiscoveryEndpointOrBuilder getDiscoveryEndpointsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. PSC connections for discovery of the cluster topology and
   * accessing the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.redis.cluster.v1.PscConnection> getPscConnectionsList();
  /**
   *
   *
   * <pre>
   * Output only. PSC connections for discovery of the cluster topology and
   * accessing the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConnection getPscConnections(int index);
  /**
   *
   *
   * <pre>
   * Output only. PSC connections for discovery of the cluster topology and
   * accessing the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPscConnectionsCount();
  /**
   *
   *
   * <pre>
   * Output only. PSC connections for discovery of the cluster topology and
   * accessing the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.redis.cluster.v1.PscConnectionOrBuilder>
      getPscConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. PSC connections for discovery of the cluster topology and
   * accessing the cluster.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.redis.cluster.v1.PscConnection psc_connections = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.PscConnectionOrBuilder getPscConnectionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateInfo field is set.
   */
  boolean hasStateInfo();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateInfo.
   */
  com.google.cloud.redis.cluster.v1.Cluster.StateInfo getStateInfo();
  /**
   *
   *
   * <pre>
   * Output only. Additional information about the current state of the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.cluster.v1.Cluster.StateInfo state_info = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.redis.cluster.v1.Cluster.StateInfoOrBuilder getStateInfoOrBuilder();
}
