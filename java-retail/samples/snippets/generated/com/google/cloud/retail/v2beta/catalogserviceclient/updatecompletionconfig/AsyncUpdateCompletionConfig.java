/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_catalogserviceclient_updatecompletionconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.retail.v2beta.CatalogServiceClient;
import com.google.cloud.retail.v2beta.CompletionConfig;
import com.google.cloud.retail.v2beta.UpdateCompletionConfigRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateCompletionConfig {

  public static void main(String[] args) throws Exception {
    asyncUpdateCompletionConfig();
  }

  public static void asyncUpdateCompletionConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      UpdateCompletionConfigRequest request =
          UpdateCompletionConfigRequest.newBuilder()
              .setCompletionConfig(CompletionConfig.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<CompletionConfig> future =
          catalogServiceClient.updateCompletionConfigCallable().futureCall(request);
      // Do something.
      CompletionConfig response = future.get();
    }
  }
}
// [END retail_v2beta_generated_catalogserviceclient_updatecompletionconfig_async]