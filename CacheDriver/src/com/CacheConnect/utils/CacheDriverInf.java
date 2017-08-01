/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CacheConnect.utils;

public interface CacheDriverInf 
{
    // ############################# Default host and port used for Redis ###################################
    final String REDIS_HOST_CLUSTER_MODE = "yourhost";
    final int REDIS_PORT=6379;
    final int REDIS_KEY_SEED_VALUE=10000000;
    final int REDIS_MAX_KEY=1000000;
    final int REDIS_MAX_TTL=15000; 
    final String REDIS_SCHEMA_PRODUCTS="oo:qa:ruchirtest:sku";
    final String REDIS_KEY_FOR_SET = "set";
    // ######################################################################################################
    

}
