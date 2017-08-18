/*
 * Copyright (C) 2012-2017 DuyHai DOAN
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

package info.archinnov.achilles.internals.sample_classes.parser.view;

import info.archinnov.achilles.annotations.Table;
import info.archinnov.achilles.annotations.PartitionKey;
import info.archinnov.achilles.annotations.MaterializedView;
import info.archinnov.achilles.internals.sample_classes.APUnitTest;
import info.archinnov.achilles.internals.sample_classes.parser.entity.TestEntitySensor;

@APUnitTest
@MaterializedView(baseEntity = TestEntitySensor.class)
@Table
public class TestViewWithEntityAnnotation {

    @PartitionKey
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
