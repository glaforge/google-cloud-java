/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.examples.securitycenter.snippets;

import com.google.cloud.securitycenter.v1.FindingName;
import com.google.cloud.securitycenter.v1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1.ListAssetsResponse.ListAssetsResult;
import com.google.cloud.securitycenter.v1.ListFindingsRequest;
import com.google.cloud.securitycenter.v1.ListFindingsResponse.ListFindingsResult;
import com.google.cloud.securitycenter.v1.OrganizationName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import com.google.cloud.securitycenter.v1.SecurityMarks;
import com.google.cloud.securitycenter.v1.SourceName;
import com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.FieldMask;
import java.io.IOException;

public class SecurityMarkSnippets {

  private SecurityMarkSnippets() {
  }

  /**
   * Add security mark to an asset.
   *
   * @param assetName The asset resource to add the security mark for.
   */
  // [START securitycenter_add_security_marks]
  static SecurityMarks addToAsset(String assetName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Specify the value of 'assetName' in one of the following formats:
      //    String assetName = "organizations/{org-id}/assets/{asset-id}";
      //    String assetName = "projects/{project-id}/assets/{asset-id}";
      //    String assetName = "folders/{folder-id}/assets/{asset-id}";
      //
      // Start setting up a request to add security marks for an asset.
      ImmutableMap markMap = ImmutableMap.of("key_a", "value_a", "key_b", "value_b");

      // Add security marks and field mask for security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(assetName + "/securityMarks")
              .putAllMarks(markMap)
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_add_security_marks]

  /**
   * Clear security marks for an asset.
   *
   * @param assetName The asset resource to clear the security marks for.
   */
  // [START securitycenter_delete_security_marks]
  static SecurityMarks clearFromAsset(String assetName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Specify the value of 'assetName' in one of the following formats:
      //    String assetName = "organizations/{org-id}/assets/{asset-id}";
      //    String assetName = "projects/{project-id}/assets/{asset-id}";
      //    String assetName = "folders/{folder-id}/assets/{asset-id}";
      // Start setting up a request to clear security marks for an asset.
      // Create security mark and field mask for clearing security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder().setName(assetName + "/securityMarks").build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks cleared:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_delete_security_marks]

  /**
   * Deletes and updates a security mark for an asset.
   *
   * @param assetName The asset resource path to update and remove the security marks for.
   */
  // [START securitycenter_add_delete_security_marks]
  static SecurityMarks deleteAndUpdateMarks(String assetName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Specify the value of 'assetName' in one of the following formats:
      //    String assetName = "organizations/{org-id}/assets/{asset-id}";
      //    String assetName = "projects/{project-id}/assets/{asset-id}";
      //    String assetName = "folders/{folder-id}/assets/{asset-id}";
      // Start setting up a request to clear and update security marks for an asset.
      // Create security mark and field mask for clearing security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(assetName + "/securityMarks")
              .putMarks("key_a", "new_value_for_a")
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks updated and cleared:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_add_delete_security_marks]

  /**
   * Add security mark to a finding.
   *
   * @param findingName The finding resource path to add the security mark for.
   */
  // [START securitycenter_add_finding_security_marks]
  static SecurityMarks addToFinding(FindingName findingName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to add security marks for a finding.
      ImmutableMap markMap = ImmutableMap.of("key_a", "value_a", "key_b", "value_b");

      // Specify the value of 'findingName' in one of the following formats:
      //    FindingName.ofOrganizationSourceFindingName("org-id", "source", "finding-id");
      //    FindingName.ofProjectSourceFindingName("project-id", "source", "finding-id");
      //    FindingName.ofFolderSourceFindingName("folder-id", "source", "finding-id");
      // Add security marks and field mask for security marks.
      SecurityMarks securityMarks =
          SecurityMarks.newBuilder()
              .setName(findingName + "/securityMarks")
              .putAllMarks(markMap)
              .build();
      FieldMask updateMask =
          FieldMask.newBuilder().addPaths("marks.key_a").addPaths("marks.key_b").build();

      UpdateSecurityMarksRequest request =
          UpdateSecurityMarksRequest.newBuilder()
              .setSecurityMarks(securityMarks)
              .setUpdateMask(updateMask)
              .build();

      // Call the API.
      SecurityMarks response = client.updateSecurityMarks(request);

      System.out.println("Security Marks:");
      System.out.println(response);
      return response;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_add_finding_security_marks]

  /**
   * Lists all assets with a filter on security marks.
   *
   * @param organizationName The organization to list assets for.
   */
  // [START securitycenter_list_assets_with_security_marks]
  static ImmutableList<ListAssetsResult> listAssetsWithQueryMarks(
      OrganizationName organizationName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to list all assets filtered by a specific security mark.
      // Parent must be in one of the following formats:
      //    OrganizationName organizationName = OrganizationName.of("organization-id");
      //    ProjectName projectName = ProjectName.of("project-id");
      //    FolderName folderName = FolderName.of("folder-id");
      ListAssetsRequest request =
          ListAssetsRequest.newBuilder()
              .setParent(organizationName.toString())
              .setFilter("security_marks.marks.key_a = \"value_a\"")
              .build();

      // Call the API.
      ListAssetsPagedResponse response = client.listAssets(request);

      // This creates one list for all assets.  If your organization has a large number of assets
      // this can cause out of memory issues.  You can process them batches by returning
      // the Iterable returned response.iterateAll() directly.
      ImmutableList<ListAssetsResult> results = ImmutableList.copyOf(response.iterateAll());
      System.out.println("Assets with security mark - key_a=value_a:");
      System.out.println(results);
      return results;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_list_assets_with_security_marks]

  /**
   * List all findings with a filter on security marks.
   *
   * @param sourceName The source to list filtered findings for.
   */
  // [START securitycenter_list_findings_with_security_marks]
  static ImmutableList<ListFindingsResult> listFindingsWithQueryMarks(SourceName sourceName) {
    try (SecurityCenterClient client = SecurityCenterClient.create()) {
      // Start setting up a request to list all findings filtered by a specific security mark.
      //
      // 'parent' must be in one of the following formats:
      //    * OrganizationName organizationName = OrganizationName.of("organization-id");
      //      String parent = organizationName.getOrganization();
      //    * ProjectName projectName = ProjectName.of("project-id");
      //      String parent = projectName.getProject();
      //    * FolderName folderName = FolderName.of("folder-id");
      //      String parent = folderName.getFolder();
      // SourceName sourceName = SourceName.of(parent, {source-id});

      String filter = "NOT security_marks.marks.key_a=\"value_a\"";

      ListFindingsRequest.Builder request =
          ListFindingsRequest.newBuilder().setParent(sourceName.toString()).setFilter(filter);

      // Call the API.
      ListFindingsPagedResponse response = client.listFindings(request.build());

      // This creates one list for all findings in the filter.If your organization has a large
      // number of
      // findings this can cause out of memory issues.  You can process them batches by returning
      // the Iterable returned response.iterateAll() directly.
      ImmutableList<ListFindingsResult> results = ImmutableList.copyOf(response.iterateAll());
      System.out.println("Findings with security mark - key_a=value_a:");
      System.out.println(results);
      return results;
    } catch (IOException e) {
      throw new RuntimeException("Couldn't create client.", e);
    }
  }
  // [END securitycenter_list_findings_with_security_marks]

}
