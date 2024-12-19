/*
 * Copyright 2023-present ByteChef Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytechef.component.pinecone.action;

import static com.bytechef.component.definition.ComponentDsl.action;

import com.bytechef.component.definition.ActionContext;
import com.bytechef.component.definition.ComponentDsl.ModifiableActionDefinition;
import com.bytechef.component.definition.Parameters;

/**
 * @author Monika Kušter
 */
public class PineconeQueryAction {

    public static final ModifiableActionDefinition ACTION_DEFINITION = action("query")
        .title("Query")
        .description("")
        .properties()
        .output()
        .perform(PineconeQueryAction::perform);

    private PineconeQueryAction() {
    }

    protected static Object perform(
        Parameters inputParameters, Parameters connectionParameters, ActionContext actionContext) {

        // TODO
        return null;
    }
}
