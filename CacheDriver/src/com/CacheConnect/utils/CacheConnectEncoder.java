/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable
 * law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 * for the specific language governing permissions and limitations under the License.
 */
package com.CacheConnect.utils;

import java.io.UnsupportedEncodingException;

import com.CacheConnect.Exception.CacheConnectException;

public class CacheConnectEncoder implements CacheDriverInf {
    CacheConnectEncoder() {
        throw new InstantiationError("No instance needs to be created");
    }

    public static byte[] encode(final String str) throws CacheConnectException {
        try {
            if (str.isEmpty()) {
                throw new CacheConnectException("value sent to redis cannot be null");
            }
            return str.getBytes(CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new CacheConnectException("Encoding was not correct");
        }

    }

    public static String encode(final byte[] data) throws CacheConnectException {
        try {
            if (data.length > 0) {
                return new String(data, CHARSET);
            }
            throw new CacheConnectException("There is no data");
        } catch (UnsupportedEncodingException e) {
            throw new CacheConnectException(e);
        }
    }

    public static byte[][] encodeBy(final String... strs) throws CacheConnectException {
        int strlg = strs.length;
        if(strlg>0)
        {    
        byte[][] additionalValues = new byte[strlg][];
        for (int i = 0; i < strlg; i++) {
            additionalValues[i] = encode(strs[i]);
        }
        return additionalValues;
        }
        else
        {
         throw new CacheConnectException("value sent to redis cannot be null");
        }
    }
}
