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

import org.aying.echarts.base.Label;
import org.aying.echarts.base.SimpleLabel;
import org.aying.echarts.style.AreaShapeStyle;
import org.aying.echarts.style.ShapeStyle;
import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 地图指定区域的具体描述模型。
 * <pre>{@code
 * Geo geo = Geo.geo("China")
 *         ... ...
 *         .regions(
 *             GeoRegion.named("广东").normalStyle()
 *         );
 * }</pre>
 *
 * @author Fuchun
 * @since 1.0
 */
public class GeoRegion implements Serializable {

    private static final long serialVersionUID = -3212079129367343670L;

    @Contract("null -> fail")
    public static GeoRegion named(String name) {
        return new GeoRegion(name);
    }

    /* 地图区域的名称，例如 '广东'，'浙江'。 */
    private String name;
    /* 该区域是否选中。默认：false */
    private Boolean selected;
    /* 该区域的多边形样式设置 */
    private Map<String, ShapeStyle> itemStyle;
    /* 该区域的标签样式设置 */
    private Map<String, Label> label;

    public GeoRegion() {
        super();
    }

    public GeoRegion(String name) {
        Objects.requireNonNull(name, "name");
        this.name = name;
    }

    public GeoRegion selected() {
        this.selected = Boolean.TRUE;
        return this;
    }

    /**
     * 设置普通状态下的多边形样式。
     *
     * @param style 多边形样式。
     */
    public GeoRegion normalStyle(AreaShapeStyle style) {
        return itemStyle("normal", style);
    }

    /**
     * 设置高亮状态下的多边形样式。
     *
     * @param style 多边形样式。
     */
    public GeoRegion emphasisStyle(AreaShapeStyle style) {
        return itemStyle("emphasis", style);
    }

    /**
     * 设置普通状态下的标签属性及样式。
     *
     * @param label 标签属性及样式。
     */
    public GeoRegion normalLabel(SimpleLabel label) {
        return label("normal", label);
    }

    /**
     * 设置高亮状态下的标签属性及样式。
     *
     * @param label 标签属性及样式。
     */
    public GeoRegion emphasisLabel(SimpleLabel label) {
        return label("emphasis", label);
    }

    protected GeoRegion label(String key, SimpleLabel label) {
        if (this.label == null) {
            this.label = new HashMap<>(2);
        }
        this.label.put(key, label);
        return this;
    }

    protected GeoRegion itemStyle(String key, ShapeStyle style) {
        if (itemStyle == null) {
            itemStyle = new HashMap<>(2);
        }
        itemStyle.put(key, style);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Map<String, ShapeStyle> getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(Map<String, ShapeStyle> itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Map<String, Label> getLabel() {
        return label;
    }

    public void setLabel(Map<String, Label> label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoRegion)) return false;
        GeoRegion geoRegion = (GeoRegion) o;
        return Objects.equals(name, geoRegion.name) &&
                Objects.equals(selected, geoRegion.selected) &&
                Objects.equals(itemStyle, geoRegion.itemStyle) &&
                Objects.equals(label, geoRegion.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, selected, itemStyle, label);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(32)
                .append(getClass()).append("{");
        sb.append("name='").append(name).append('\'');
        sb.append(", selected=").append(selected);
        sb.append(", itemStyle=").append(itemStyle);
        sb.append(", label=").append(label);
        sb.append('}');
        return sb.toString();
    }
}
