/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.cheddar.metrics;

import org.joda.time.DateTime;

public class MetricOrganisation {

    private final String id;
    private final String name;
    private DateTime createdAt;

    public MetricOrganisation(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public void setCreatedAt(final DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public DateTime createdAt() {
        return createdAt;
    }

}