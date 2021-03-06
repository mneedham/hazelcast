/*
 * Copyright (c) 2008-2015, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.client.impl.protocol.parameters;

import com.hazelcast.annotation.EncodeMethod;
import com.hazelcast.annotation.GenerateParameters;
import com.hazelcast.nio.serialization.Data;

import java.util.Collection;

@GenerateParameters(id = 2, name = "Queue", ns = "Hazelcast.Client.Protocol.Queue")
public interface QueueTemplate {

    @EncodeMethod(id = 1)
    void offer(String name, Data value, long timeoutMillis);

    @EncodeMethod(id = 1)
    void put(String name, Data value);

    @EncodeMethod(id = 2)
    void size(String name);

    @EncodeMethod(id = 3)
    void remove(String name, Data value);

    @EncodeMethod(id = 4)
    void poll(String name);

    @EncodeMethod(id = 4)
    void take(String name, long timeoutMillis);

    @EncodeMethod(id = 5)
    void peek(String name);

    @EncodeMethod(id = 6)
    void iterator(String name);

    @EncodeMethod(id = 7)
    void drainTo(String name);

    @EncodeMethod(id = 7)
    void drainToMaxSize(String name, int maxSize);

    @EncodeMethod(id = 8)
    void contains(String name, Data value);

    @EncodeMethod(id = 9)
    void containsAll(String name, Collection<Data> dataList);

    @EncodeMethod(id = 10)
    void compareAndRemoveAll(String name, Collection<Data> dataList);

    @EncodeMethod(id = 11)
    void compareAndRetainAll(String name, Collection<Data> dataList);

    @EncodeMethod(id = 12)
    void clear(String name);

    @EncodeMethod(id = 13)
    void addAll(String name, Collection<Data> dataList);

    @EncodeMethod(id = 14)
    void addListener(String name, boolean includeValue);

    @EncodeMethod(id = 15)
    void removeListener(String name, String registrationId);

    @EncodeMethod(id = 16)
    void remainingCapacity(String name);

    @EncodeMethod(id = 17)
    void isEmpty(String name);

}
