/*
 * Copyright 2016 Aying.Org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aying.echarts;

import org.jetbrains.annotations.Contract;

import java.util.List;

/**
 * ECharts data model.
 *
 * @author Fuchun
 * @since 1.0
 */
public interface Data<T extends Data<T>> {

    @Contract("null -> fail")
    T add(Data<?> d);

    @Contract("null, _, _ -> fail; _, null, _ -> fail")
    T add(Data<?> d1, Data<?> d2, Data<?>... dn);

    List<Data<?>> getData();
}