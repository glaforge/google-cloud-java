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
// source: google/cloud/securitycenter/v1/mitre_attack.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public interface MitreAttackOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.MitreAttack)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK tactic most closely represented by this finding, if any.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MitreAttack.Tactic primary_tactic = 1;</code>
   *
   * @return The enum numeric value on the wire for primaryTactic.
   */
  int getPrimaryTacticValue();
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK tactic most closely represented by this finding, if any.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MitreAttack.Tactic primary_tactic = 1;</code>
   *
   * @return The primaryTactic.
   */
  com.google.cloud.securitycenter.v1.MitreAttack.Tactic getPrimaryTactic();

  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK technique most closely represented by this finding, if
   * any. primary_techniques is a repeated field because there are multiple
   * levels of MITRE ATT&amp;CK techniques.  If the technique most closely
   * represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`),
   * both the sub-technique and its parent technique(s) will be listed (e.g.
   * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique primary_techniques = 2;
   * </code>
   *
   * @return A list containing the primaryTechniques.
   */
  java.util.List<com.google.cloud.securitycenter.v1.MitreAttack.Technique>
      getPrimaryTechniquesList();
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK technique most closely represented by this finding, if
   * any. primary_techniques is a repeated field because there are multiple
   * levels of MITRE ATT&amp;CK techniques.  If the technique most closely
   * represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`),
   * both the sub-technique and its parent technique(s) will be listed (e.g.
   * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique primary_techniques = 2;
   * </code>
   *
   * @return The count of primaryTechniques.
   */
  int getPrimaryTechniquesCount();
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK technique most closely represented by this finding, if
   * any. primary_techniques is a repeated field because there are multiple
   * levels of MITRE ATT&amp;CK techniques.  If the technique most closely
   * represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`),
   * both the sub-technique and its parent technique(s) will be listed (e.g.
   * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique primary_techniques = 2;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The primaryTechniques at the given index.
   */
  com.google.cloud.securitycenter.v1.MitreAttack.Technique getPrimaryTechniques(int index);
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK technique most closely represented by this finding, if
   * any. primary_techniques is a repeated field because there are multiple
   * levels of MITRE ATT&amp;CK techniques.  If the technique most closely
   * represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`),
   * both the sub-technique and its parent technique(s) will be listed (e.g.
   * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique primary_techniques = 2;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for primaryTechniques.
   */
  java.util.List<java.lang.Integer> getPrimaryTechniquesValueList();
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK technique most closely represented by this finding, if
   * any. primary_techniques is a repeated field because there are multiple
   * levels of MITRE ATT&amp;CK techniques.  If the technique most closely
   * represented by this finding is a sub-technique (e.g. `SCANNING_IP_BLOCKS`),
   * both the sub-technique and its parent technique(s) will be listed (e.g.
   * `SCANNING_IP_BLOCKS`, `ACTIVE_SCANNING`).
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique primary_techniques = 2;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of primaryTechniques at the given index.
   */
  int getPrimaryTechniquesValue(int index);

  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK tactics related to this finding, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Tactic additional_tactics = 3;
   * </code>
   *
   * @return A list containing the additionalTactics.
   */
  java.util.List<com.google.cloud.securitycenter.v1.MitreAttack.Tactic> getAdditionalTacticsList();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK tactics related to this finding, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Tactic additional_tactics = 3;
   * </code>
   *
   * @return The count of additionalTactics.
   */
  int getAdditionalTacticsCount();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK tactics related to this finding, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Tactic additional_tactics = 3;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The additionalTactics at the given index.
   */
  com.google.cloud.securitycenter.v1.MitreAttack.Tactic getAdditionalTactics(int index);
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK tactics related to this finding, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Tactic additional_tactics = 3;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for additionalTactics.
   */
  java.util.List<java.lang.Integer> getAdditionalTacticsValueList();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK tactics related to this finding, if any.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Tactic additional_tactics = 3;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of additionalTactics at the given index.
   */
  int getAdditionalTacticsValue(int index);

  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK techniques related to this finding, if any, along
   * with any of their respective parent techniques.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique additional_techniques = 4;
   * </code>
   *
   * @return A list containing the additionalTechniques.
   */
  java.util.List<com.google.cloud.securitycenter.v1.MitreAttack.Technique>
      getAdditionalTechniquesList();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK techniques related to this finding, if any, along
   * with any of their respective parent techniques.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique additional_techniques = 4;
   * </code>
   *
   * @return The count of additionalTechniques.
   */
  int getAdditionalTechniquesCount();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK techniques related to this finding, if any, along
   * with any of their respective parent techniques.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique additional_techniques = 4;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The additionalTechniques at the given index.
   */
  com.google.cloud.securitycenter.v1.MitreAttack.Technique getAdditionalTechniques(int index);
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK techniques related to this finding, if any, along
   * with any of their respective parent techniques.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique additional_techniques = 4;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for additionalTechniques.
   */
  java.util.List<java.lang.Integer> getAdditionalTechniquesValueList();
  /**
   *
   *
   * <pre>
   * Additional MITRE ATT&amp;CK techniques related to this finding, if any, along
   * with any of their respective parent techniques.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.MitreAttack.Technique additional_techniques = 4;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of additionalTechniques at the given index.
   */
  int getAdditionalTechniquesValue(int index);

  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK version referenced by the above fields. E.g. "8".
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * The MITRE ATT&amp;CK version referenced by the above fields. E.g. "8".
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
