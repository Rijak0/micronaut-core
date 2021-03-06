/*
 * Copyright 2017-2019 original authors
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
package io.micronaut.web.router.version.resolution;

import java.util.Optional;

/**
 * Resolves a version from a given object.
 *
 * @param <T> The type of object to resolve from
 * @param <R> The type of version returned
 */
public interface VersionResolver<T, R> {

    /**
     * Resolves a version from a given object.
     *
     * @param object The type of object to resolve from
     * @return An optional object representing the version
     */
    Optional<R> resolve(T object);

}

