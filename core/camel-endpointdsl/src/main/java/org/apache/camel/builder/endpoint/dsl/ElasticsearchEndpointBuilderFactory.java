/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The elasticsearch component is used for interfacing with ElasticSearch server
 * using REST API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ElasticsearchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Elastichsearch Rest component.
     */
    public interface ElasticsearchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedElasticsearchEndpointBuilder advanced() {
            return (AdvancedElasticsearchEndpointBuilder) this;
        }
        /**
         * Name of the cluster.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder clusterName(String clusterName) {
            setProperty("clusterName", clusterName);
            return this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder connectionTimeout(
                int connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * The time in ms to wait before connection will timeout.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder disconnect(boolean disconnect) {
            setProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Disconnect after it finish calling the producer.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder disconnect(String disconnect) {
            setProperty("disconnect", disconnect);
            return this;
        }
        /**
         * Enable SSL.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder enableSSL(boolean enableSSL) {
            setProperty("enableSSL", enableSSL);
            return this;
        }
        /**
         * Enable SSL.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder enableSSL(String enableSSL) {
            setProperty("enableSSL", enableSSL);
            return this;
        }
        /**
         * Comma separated list with ip:port formatted remote transport
         * addresses to use.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder hostAddresses(String hostAddresses) {
            setProperty("hostAddresses", hostAddresses);
            return this;
        }
        /**
         * The name of the index to act against.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder indexName(String indexName) {
            setProperty("indexName", indexName);
            return this;
        }
        /**
         * The type of the index to act against.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder indexType(String indexType) {
            setProperty("indexType", indexType);
            return this;
        }
        /**
         * The time in ms before retry.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder maxRetryTimeout(int maxRetryTimeout) {
            setProperty("maxRetryTimeout", maxRetryTimeout);
            return this;
        }
        /**
         * The time in ms before retry.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder maxRetryTimeout(
                String maxRetryTimeout) {
            setProperty("maxRetryTimeout", maxRetryTimeout);
            return this;
        }
        /**
         * What operation to perform.
         * The option is a
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder operation(
                ElasticsearchOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * What operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder scrollKeepAliveMs(
                int scrollKeepAliveMs) {
            setProperty("scrollKeepAliveMs", scrollKeepAliveMs);
            return this;
        }
        /**
         * Time in ms during which elasticsearch will keep search context alive.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder scrollKeepAliveMs(
                String scrollKeepAliveMs) {
            setProperty("scrollKeepAliveMs", scrollKeepAliveMs);
            return this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder socketTimeout(int socketTimeout) {
            setProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * The timeout in ms to wait before the socket will timeout.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder socketTimeout(String socketTimeout) {
            setProperty("socketTimeout", socketTimeout);
            return this;
        }
        /**
         * Enable scroll usage.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder useScroll(boolean useScroll) {
            setProperty("useScroll", useScroll);
            return this;
        }
        /**
         * Enable scroll usage.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder useScroll(String useScroll) {
            setProperty("useScroll", useScroll);
            return this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder waitForActiveShards(
                int waitForActiveShards) {
            setProperty("waitForActiveShards", waitForActiveShards);
            return this;
        }
        /**
         * Index creation waits for the write consistency number of shards to be
         * available.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default ElasticsearchEndpointBuilder waitForActiveShards(
                String waitForActiveShards) {
            setProperty("waitForActiveShards", waitForActiveShards);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Elastichsearch Rest component.
     */
    public interface AdvancedElasticsearchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ElasticsearchEndpointBuilder basic() {
            return (ElasticsearchEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedElasticsearchEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedElasticsearchEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedElasticsearchEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedElasticsearchEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.elasticsearch.ElasticsearchOperation</code> enum.
     */
    enum ElasticsearchOperation {
        Index,
        Update,
        Bulk,
        BulkIndex,
        GetById,
        MultiGet,
        MultiSearch,
        Delete,
        DeleteIndex,
        Search,
        Exists,
        Ping,
        Info;
    }
    /**
     * The elasticsearch component is used for interfacing with ElasticSearch
     * server using REST API.
     * Maven coordinates: org.apache.camel:camel-elasticsearch-rest
     */
    default ElasticsearchEndpointBuilder elasticsearch(String path) {
        class ElasticsearchEndpointBuilderImpl extends AbstractEndpointBuilder implements ElasticsearchEndpointBuilder, AdvancedElasticsearchEndpointBuilder {
            public ElasticsearchEndpointBuilderImpl(String path) {
                super("elasticsearch-rest", path);
            }
        }
        return new ElasticsearchEndpointBuilderImpl(path);
    }
}