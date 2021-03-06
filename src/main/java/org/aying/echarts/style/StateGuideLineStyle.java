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

import org.aying.echarts.base.State;

/**
 * @author Fuchun
 * @since 1.0
 */
public class StateGuideLineStyle extends State<StateGuideLineStyle, GuideLineStyle> {

    private static final long serialVersionUID = 7897171901458993693L;

    public StateGuideLineStyle() {
        super();
    }

    public StateGuideLineStyle(GuideLineStyle normal, GuideLineStyle emphasis) {
        super(normal, emphasis);
    }
}
