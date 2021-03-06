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

package org.aying.echarts.axis;

/**
 * 坐标轴类型。
 *
 * @author Fuchun
 * @since 1.0
 */
public enum AxisType {

    /**
     * 类目轴。
     */
    category,

    /**
     * 数值轴。
     */
    value,

    /**
     * 时间轴。
     */
    time,

    /**
     * 对数轴
     */
    log,

    // ---------------------------------------------------------------
    // 以下是按照坐标系分类

    /** x 轴（直角坐标） */
    x,

    /** y 轴（直角坐标） */
    y,

    /** 半役轴（极坐标）*/
    radius,

    /** 角度轴（极坐标）*/
    angle
}
