/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.discoveryengine.v1alpha.stub;

import static com.google.cloud.discoveryengine.v1alpha.ServingConfigServiceClient.ListServingConfigsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.discoveryengine.v1alpha.GetServingConfigRequest;
import com.google.cloud.discoveryengine.v1alpha.ListServingConfigsRequest;
import com.google.cloud.discoveryengine.v1alpha.ListServingConfigsResponse;
import com.google.cloud.discoveryengine.v1alpha.ServingConfig;
import com.google.cloud.discoveryengine.v1alpha.UpdateServingConfigRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ServingConfigServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (discoveryengine.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of updateServingConfig to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ServingConfigServiceStubSettings.Builder servingConfigServiceSettingsBuilder =
 *     ServingConfigServiceStubSettings.newBuilder();
 * servingConfigServiceSettingsBuilder
 *     .updateServingConfigSettings()
 *     .setRetrySettings(
 *         servingConfigServiceSettingsBuilder
 *             .updateServingConfigSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * ServingConfigServiceStubSettings servingConfigServiceSettings =
 *     servingConfigServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ServingConfigServiceStubSettings
    extends StubSettings<ServingConfigServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<UpdateServingConfigRequest, ServingConfig>
      updateServingConfigSettings;
  private final UnaryCallSettings<GetServingConfigRequest, ServingConfig> getServingConfigSettings;
  private final PagedCallSettings<
          ListServingConfigsRequest, ListServingConfigsResponse, ListServingConfigsPagedResponse>
      listServingConfigsSettings;

  private static final PagedListDescriptor<
          ListServingConfigsRequest, ListServingConfigsResponse, ServingConfig>
      LIST_SERVING_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListServingConfigsRequest, ListServingConfigsResponse, ServingConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListServingConfigsRequest injectToken(
                ListServingConfigsRequest payload, String token) {
              return ListServingConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListServingConfigsRequest injectPageSize(
                ListServingConfigsRequest payload, int pageSize) {
              return ListServingConfigsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListServingConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListServingConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ServingConfig> extractResources(ListServingConfigsResponse payload) {
              return payload.getServingConfigsList() == null
                  ? ImmutableList.<ServingConfig>of()
                  : payload.getServingConfigsList();
            }
          };

  private static final PagedListResponseFactory<
          ListServingConfigsRequest, ListServingConfigsResponse, ListServingConfigsPagedResponse>
      LIST_SERVING_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListServingConfigsRequest,
              ListServingConfigsResponse,
              ListServingConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListServingConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListServingConfigsRequest, ListServingConfigsResponse> callable,
                ListServingConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListServingConfigsResponse> futureResponse) {
              PageContext<ListServingConfigsRequest, ListServingConfigsResponse, ServingConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_SERVING_CONFIGS_PAGE_STR_DESC, request, context);
              return ListServingConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to updateServingConfig. */
  public UnaryCallSettings<UpdateServingConfigRequest, ServingConfig>
      updateServingConfigSettings() {
    return updateServingConfigSettings;
  }

  /** Returns the object with the settings used for calls to getServingConfig. */
  public UnaryCallSettings<GetServingConfigRequest, ServingConfig> getServingConfigSettings() {
    return getServingConfigSettings;
  }

  /** Returns the object with the settings used for calls to listServingConfigs. */
  public PagedCallSettings<
          ListServingConfigsRequest, ListServingConfigsResponse, ListServingConfigsPagedResponse>
      listServingConfigsSettings() {
    return listServingConfigsSettings;
  }

  public ServingConfigServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcServingConfigServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonServingConfigServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "discoveryengine";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "discoveryengine.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "discoveryengine.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ServingConfigServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ServingConfigServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ServingConfigServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected ServingConfigServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    updateServingConfigSettings = settingsBuilder.updateServingConfigSettings().build();
    getServingConfigSettings = settingsBuilder.getServingConfigSettings().build();
    listServingConfigsSettings = settingsBuilder.listServingConfigsSettings().build();
  }

  /** Builder for ServingConfigServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ServingConfigServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<UpdateServingConfigRequest, ServingConfig>
        updateServingConfigSettings;
    private final UnaryCallSettings.Builder<GetServingConfigRequest, ServingConfig>
        getServingConfigSettings;
    private final PagedCallSettings.Builder<
            ListServingConfigsRequest, ListServingConfigsResponse, ListServingConfigsPagedResponse>
        listServingConfigsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      updateServingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getServingConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listServingConfigsSettings = PagedCallSettings.newBuilder(LIST_SERVING_CONFIGS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateServingConfigSettings, getServingConfigSettings, listServingConfigsSettings);
      initDefaults(this);
    }

    protected Builder(ServingConfigServiceStubSettings settings) {
      super(settings);

      updateServingConfigSettings = settings.updateServingConfigSettings.toBuilder();
      getServingConfigSettings = settings.getServingConfigSettings.toBuilder();
      listServingConfigsSettings = settings.listServingConfigsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateServingConfigSettings, getServingConfigSettings, listServingConfigsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .updateServingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getServingConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listServingConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to updateServingConfig. */
    public UnaryCallSettings.Builder<UpdateServingConfigRequest, ServingConfig>
        updateServingConfigSettings() {
      return updateServingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getServingConfig. */
    public UnaryCallSettings.Builder<GetServingConfigRequest, ServingConfig>
        getServingConfigSettings() {
      return getServingConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listServingConfigs. */
    public PagedCallSettings.Builder<
            ListServingConfigsRequest, ListServingConfigsResponse, ListServingConfigsPagedResponse>
        listServingConfigsSettings() {
      return listServingConfigsSettings;
    }

    @Override
    public ServingConfigServiceStubSettings build() throws IOException {
      return new ServingConfigServiceStubSettings(this);
    }
  }
}
