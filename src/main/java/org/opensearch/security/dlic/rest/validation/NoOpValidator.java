/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 *
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.security.dlic.rest.validation;

import org.opensearch.common.bytes.BytesReference;
import org.opensearch.common.settings.Settings;
import org.opensearch.rest.RestRequest;

public class NoOpValidator extends AbstractConfigurationValidator {

    public NoOpValidator(final RestRequest request, BytesReference ref, final Settings opensearchSettings, Object... param) {
        super(request, ref, opensearchSettings, param);
    }

}
