/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.fuseki.validation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jena.fuseki.validation.html.UpdateValidatorHTML;
import org.apache.jena.fuseki.validation.json.UpdateValidatorJSON;

public class UpdateValidator extends ValidatorBase {

    @Override
    protected void executeJSON(HttpServletRequest request, HttpServletResponse response) {
        executeJSON(request, response, UpdateValidatorJSON::execute);
    }

    @Override
    protected void executeHTML(HttpServletRequest request, HttpServletResponse response) {
        UpdateValidatorHTML.executeHTML(request, response);
    }
}
