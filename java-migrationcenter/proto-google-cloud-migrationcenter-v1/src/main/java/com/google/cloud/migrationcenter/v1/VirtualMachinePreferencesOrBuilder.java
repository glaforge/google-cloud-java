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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

public interface VirtualMachinePreferencesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.VirtualMachinePreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Target product for assets using this preference set.
   * Specify either target product or business goal, but
   * not both.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeMigrationTargetProduct target_product = 2;</code>
   *
   * @return The enum numeric value on the wire for targetProduct.
   */
  int getTargetProductValue();
  /**
   *
   *
   * <pre>
   * Target product for assets using this preference set.
   * Specify either target product or business goal, but
   * not both.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeMigrationTargetProduct target_product = 2;</code>
   *
   * @return The targetProduct.
   */
  com.google.cloud.migrationcenter.v1.ComputeMigrationTargetProduct getTargetProduct();

  /**
   *
   *
   * <pre>
   * Region preferences for assets using this preference set.
   * If you are unsure which value to set, the migration service API region is
   * often a good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RegionPreferences region_preferences = 3;</code>
   *
   * @return Whether the regionPreferences field is set.
   */
  boolean hasRegionPreferences();
  /**
   *
   *
   * <pre>
   * Region preferences for assets using this preference set.
   * If you are unsure which value to set, the migration service API region is
   * often a good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RegionPreferences region_preferences = 3;</code>
   *
   * @return The regionPreferences.
   */
  com.google.cloud.migrationcenter.v1.RegionPreferences getRegionPreferences();
  /**
   *
   *
   * <pre>
   * Region preferences for assets using this preference set.
   * If you are unsure which value to set, the migration service API region is
   * often a good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.RegionPreferences region_preferences = 3;</code>
   */
  com.google.cloud.migrationcenter.v1.RegionPreferencesOrBuilder getRegionPreferencesOrBuilder();

  /**
   *
   *
   * <pre>
   * Commitment plan to consider when calculating costs for virtual machine
   * insights and recommendations.
   * If you are unsure which value to set, a 3 year commitment plan is often a
   * good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.CommitmentPlan commitment_plan = 4;</code>
   *
   * @return The enum numeric value on the wire for commitmentPlan.
   */
  int getCommitmentPlanValue();
  /**
   *
   *
   * <pre>
   * Commitment plan to consider when calculating costs for virtual machine
   * insights and recommendations.
   * If you are unsure which value to set, a 3 year commitment plan is often a
   * good value to start with.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.CommitmentPlan commitment_plan = 4;</code>
   *
   * @return The commitmentPlan.
   */
  com.google.cloud.migrationcenter.v1.CommitmentPlan getCommitmentPlan();

  /**
   *
   *
   * <pre>
   * Sizing optimization strategy specifies the preferred strategy used when
   * extrapolating usage data to calculate insights and recommendations for a
   * virtual machine.
   * If you are unsure which value to set, a moderate sizing optimization
   * strategy is often a good value to start with.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.SizingOptimizationStrategy sizing_optimization_strategy = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for sizingOptimizationStrategy.
   */
  int getSizingOptimizationStrategyValue();
  /**
   *
   *
   * <pre>
   * Sizing optimization strategy specifies the preferred strategy used when
   * extrapolating usage data to calculate insights and recommendations for a
   * virtual machine.
   * If you are unsure which value to set, a moderate sizing optimization
   * strategy is often a good value to start with.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.SizingOptimizationStrategy sizing_optimization_strategy = 5;
   * </code>
   *
   * @return The sizingOptimizationStrategy.
   */
  com.google.cloud.migrationcenter.v1.SizingOptimizationStrategy getSizingOptimizationStrategy();

  /**
   *
   *
   * <pre>
   * Compute Engine preferences concern insights and recommendations for Compute
   * Engine target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEnginePreferences compute_engine_preferences = 6;
   * </code>
   *
   * @return Whether the computeEnginePreferences field is set.
   */
  boolean hasComputeEnginePreferences();
  /**
   *
   *
   * <pre>
   * Compute Engine preferences concern insights and recommendations for Compute
   * Engine target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEnginePreferences compute_engine_preferences = 6;
   * </code>
   *
   * @return The computeEnginePreferences.
   */
  com.google.cloud.migrationcenter.v1.ComputeEnginePreferences getComputeEnginePreferences();
  /**
   *
   *
   * <pre>
   * Compute Engine preferences concern insights and recommendations for Compute
   * Engine target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEnginePreferences compute_engine_preferences = 6;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.ComputeEnginePreferencesOrBuilder
      getComputeEnginePreferencesOrBuilder();

  /**
   *
   *
   * <pre>
   * Preferences concerning insights and recommendations for
   * Google Cloud VMware Engine.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.VmwareEnginePreferences vmware_engine_preferences = 7;
   * </code>
   *
   * @return Whether the vmwareEnginePreferences field is set.
   */
  boolean hasVmwareEnginePreferences();
  /**
   *
   *
   * <pre>
   * Preferences concerning insights and recommendations for
   * Google Cloud VMware Engine.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.VmwareEnginePreferences vmware_engine_preferences = 7;
   * </code>
   *
   * @return The vmwareEnginePreferences.
   */
  com.google.cloud.migrationcenter.v1.VmwareEnginePreferences getVmwareEnginePreferences();
  /**
   *
   *
   * <pre>
   * Preferences concerning insights and recommendations for
   * Google Cloud VMware Engine.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.VmwareEnginePreferences vmware_engine_preferences = 7;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.VmwareEnginePreferencesOrBuilder
      getVmwareEnginePreferencesOrBuilder();

  /**
   *
   *
   * <pre>
   * Preferences concerning Sole Tenant nodes and virtual machines.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences sole_tenancy_preferences = 8;
   * </code>
   *
   * @return Whether the soleTenancyPreferences field is set.
   */
  boolean hasSoleTenancyPreferences();
  /**
   *
   *
   * <pre>
   * Preferences concerning Sole Tenant nodes and virtual machines.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences sole_tenancy_preferences = 8;
   * </code>
   *
   * @return The soleTenancyPreferences.
   */
  com.google.cloud.migrationcenter.v1.SoleTenancyPreferences getSoleTenancyPreferences();
  /**
   *
   *
   * <pre>
   * Preferences concerning Sole Tenant nodes and virtual machines.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.SoleTenancyPreferences sole_tenancy_preferences = 8;
   * </code>
   */
  com.google.cloud.migrationcenter.v1.SoleTenancyPreferencesOrBuilder
      getSoleTenancyPreferencesOrBuilder();
}
