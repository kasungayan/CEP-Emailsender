/*
 * Copyright (c) 2005 - 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.wso2.carbon.event.output.adapter.core;

import org.wso2.carbon.event.output.adapter.core.exception.OutputEventAdapterException;
import org.wso2.carbon.event.output.adapter.core.exception.TestConnectionNotSupportedException;

import java.util.Map;

/**
 * This is a EventAdapter type. these interface let users to publish subscribe messages according to
 * some type. this type can either be local, jms or ws
 */
public interface OutputEventAdapter {

    void init() throws OutputEventAdapterException;

    void testConnect() throws TestConnectionNotSupportedException;

    void connect();

    void publish(Object message, Map<String, String> dynamicProperties);

    void disconnect();

    void destroy();

}
