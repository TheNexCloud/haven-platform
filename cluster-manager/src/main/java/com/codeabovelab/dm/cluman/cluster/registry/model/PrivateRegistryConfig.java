/*
 * Copyright 2016 Code Above Lab LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeabovelab.dm.cluman.cluster.registry.model;


import com.codeabovelab.dm.cluman.cluster.registry.RegistryType;
import com.codeabovelab.dm.common.kv.mapping.KvMapping;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * Configuration for registry service
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PrivateRegistryConfig extends DockerRegistryConfig implements RegistryCredentials {

    @NotNull
    @KvMapping
    private String url;

    {
        setRegistryType(RegistryType.PRIVATE);
    }

    @Override
    public PrivateRegistryConfig clone() {
        return (PrivateRegistryConfig) super.clone();
    }
}
