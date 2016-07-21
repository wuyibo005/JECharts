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

package org.aying.echarts.style;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.aying.echarts.base.LineType;

/**
 * 线条样式。
 *
 * @author Fuchun
 * @since 1.0
 */
@JsonDeserialize(as = SimpleLineStyle.class)
public interface LineStyle extends ShadowStyle {

    /**
     * 线条宽度。
     */
    Integer getWidth();

    /**
     * 线条类型。
     */
    LineType getType();
}
