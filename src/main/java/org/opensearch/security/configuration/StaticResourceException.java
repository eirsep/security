/*
 * Copyright 2015-2019 floragunn GmbH
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
 *
 */

package org.opensearch.security.configuration;

import java.io.IOException;

import org.opensearch.OpenSearchException;
import org.opensearch.common.io.stream.StreamInput;

public class StaticResourceException extends OpenSearchException {

    public StaticResourceException(StreamInput in) throws IOException {
        super(in);
    }

    public StaticResourceException(String msg, Object... args) {
        super(msg, args);
    }

    public StaticResourceException(String msg, Throwable cause, Object... args) {
        super(msg, cause, args);
    }

    public StaticResourceException(Throwable cause) {
        super(cause);
    }

}
