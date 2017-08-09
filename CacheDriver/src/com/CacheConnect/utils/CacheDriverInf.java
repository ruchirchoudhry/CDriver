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
    public static final String REDIS_HOST_CLUSTER_MODE = "yourhost";
    public static final String REDIS_HOST_MODE = "yourhost";
    public static final int REDIS_PORT=6379;
    public static final int REDIS_KEY_SEED_VALUE=10000000;
    public static final int REDIS_MAX_KEY=1000000;
    public static final int REDIS_MAX_TTL=15000; 
    public static final String REDIS_SCHEMA_PRODUCTS="oo:qa:ruchirtest:sku";
    public static final String REDIS_KEY_FOR_SET = "set";
    // ######################################################################################################
    public static final String CHARSET="UTF-8";
    public static final String CHARSET_16 = "UTF-16";
    public static final byte DOLLAR_BYTE = '$';
    public static final byte ASTERISK_BYTE = '*';
    public static final byte PLUS_BYTE = '+';
    public static final byte MINUS_BYTE = '-';
    public static final byte COLON_BYTE = ':';
    public static final String ASK_RESPONSE = "ASK";
    public static final String MOVED_RESPONSE = "MOVED";
    public static final String CLUSTERDOWN_RESPONSE = "CLUSTERDOWN";
    public static final String BUSY_RESPONSE = "BUSY";
    
    public static final String CLUSTER_NODES = "nodes";
    public static final String CLUSTER_MEET = "meet";
    public static final String CLUSTER_RESET = "reset";
    public static final String CLUSTER_ADDSLOTS = "addslots";
    public static final String CLUSTER_DELSLOTS = "delslots";
    public static final String CLUSTER_INFO = "info";
    public static final String CLUSTER_GETKEYSINSLOT = "getkeysinslot";
    public static final String CLUSTER_SETSLOT = "setslot";
    public static final String CLUSTER_SETSLOT_NODE = "node";
    public static final String CLUSTER_SETSLOT_MIGRATING = "migrating";
    public static final String CLUSTER_SETSLOT_IMPORTING = "importing";
    public static final String CLUSTER_SETSLOT_STABLE = "stable";
    public static final String CLUSTER_FORGET = "forget";
    public static final String CLUSTER_FLUSHSLOT = "flushslots";
    public static final String CLUSTER_KEYSLOT = "keyslot";
    public static final String CLUSTER_COUNTKEYINSLOT = "countkeysinslot";
    public static final String CLUSTER_SAVECONFIG = "saveconfig";
    public static final String CLUSTER_REPLICATE = "replicate";
    public static final String CLUSTER_SLAVES = "slaves";
    public static final String CLUSTER_FAILOVER = "failover";
    public static final String CLUSTER_SLOTS = "slots";
    public static final String PUBSUB_CHANNELS = "channels";
    public static final String PUBSUB_NUMSUB = "numsub";
    public static final String PUBSUB_NUM_PAT = "numpat";   
    public static final String NOSCRIPT_RESPONSE = "NOSCRIPT";
    public static final byte[][] EMPTY_ARGS = new byte[0][];
    


}
