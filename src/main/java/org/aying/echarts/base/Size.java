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
 * 表示组件、模块、图形（标）等的尺寸。
 *
 * @author Fuchun
 * @since 1.0
 */
public interface Size<S extends Size<S>> {

    /**
     * 返回宽度。{@code String} or {@code Number}
     */
    Object getWidth();

    void setWidth(Object width);

    /**
     * 返回高度。{@code String} or {@code Number}
     */
    Object getHeight();

    void setHeight(Object height);

    S autoWidth();

    S autoHeight();

    S width(int width);

    S width(String width);

    S height(int height);

    S height(String height);
}