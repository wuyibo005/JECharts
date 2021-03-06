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
 * 图形样式。
 *
 * @author Fuchun
 * @since 1.0
 */
@JsonDeserialize(as = SimpleShapeStyle.class)
public interface ShapeStyle extends ShadowStyle {

    /**
     * 图形的描边颜色。支持的格式同 color。
     */
    String getBorderColor();

    /**
     * 描边线宽。为 0 时无描边。
     */
    Integer getBorderWidth();

    /**
     * 柱条的描边类型，默认为实线（{@code slider}）。
     */
    LineType getBorderType();

    /**
     * 文本样式（极少数会用到）
     */
    TextStyle getTextStyle();
}
