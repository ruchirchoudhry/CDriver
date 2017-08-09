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
package com.CacheConnect.Redis;

import java.net.Socket;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocketFactory;

import com.CacheConnect.Controller.ConnectorClient;
import com.CacheConnect.utils.CacheDriverInf;

public class CacheContoller implements ConnectorClient,CacheDriverInf {
    
    private String host;
    private int port;
    private boolean ssl;
    private SSLSocketFactory sslSocketFactory;
    private SSLParameters sslParam;
    private HostnameVerifier hostNameVerifier;
    private Socket socketConnection;
    

    public CacheContoller()
    {
        
    }
    public CacheContoller(final String host)
    {
        this.host=REDIS_HOST_MODE;// non cluster mode
    }
    public CacheContoller(final String host,final int port)
    {
        this.host=REDIS_HOST_MODE;// non cluster mode
        this.port=REDIS_PORT;// non cluster mode port
    }
    public CacheContoller(final String host,final int port,final boolean ssl)
    {
        this.host=REDIS_HOST_MODE;// non cluster mode
        this.port=REDIS_PORT;// non cluster mode port
        this.ssl=ssl;
        
    }
    public CacheContoller(final String host,final int port,final boolean ssl, SSLSocketFactory sslSocketFactory, SSLParameters sslParam,HostnameVerifier hostNameVerifier)
    {
        this.host=REDIS_HOST_MODE;// non cluster mode
        this.port=REDIS_PORT;// non cluster mode port
        this.ssl=ssl;
        this.sslSocketFactory=sslSocketFactory;
        this.sslParam=sslParam;
        this.hostNameVerifier=hostNameVerifier;
        
    }
    String CONST_URL="TEST-Hello";

    @Override
    public void connect() {
       
        
    }

    @Override
    public void getConnectionPool() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void disconnect() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void disconnectPool() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getSizeOfPoolConnection() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setSiseOfPoolConnection() {
        // TODO Auto-generated method stub
        
    }
    public boolean isActiveConnection()
    {
        return null!=socketConnection && socketConnection.isBound() && !socketConnection.isClosed()&& socketConnection.isConnected() && !socketConnection.isInputShutdown()
                &&!socketConnection.isOutputShutdown();
        
    }
}
