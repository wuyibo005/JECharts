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

package org.aying.echarts.base;

/**
 * @author Fuchun
 * @since 1.0
 */
public enum ThrottleType {

    /**
     * 表示只有停止动作了（即一段时间没有操作了），才会触发事件。
     */
    debounce,

    /**
     * 表示按照一定的频率触发时间。
     */
    fixRate
}
