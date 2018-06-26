/*
 * Copyright 2013 Nicolas Morel
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

package org.dominokit.jacksonapt.deser;

import org.dominokit.jacksonapt.JsonDeserializer;

/**
 * @author Nicolas Morel
 */
public class CharacterJsonDeserializerTest extends AbstractJsonDeserializerTest<Character> {

    @Override
    protected JsonDeserializer<Character> createDeserializer() {
        return CharacterJsonDeserializer.getInstance();
    }

    @Override
    public void testDeserializeValue() {
        assertDeserialization('e', "e");
        assertDeserialization('\u00e9', "\"\u00e9\"");
    }
}