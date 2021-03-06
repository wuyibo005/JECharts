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

import java.io.Serializable;

/**
 * The simple implementation of the {@code Size}.
 *
 * @author Fuchun
 * @since 1.0
 */
public class SimpleSize extends BaseSize<SimpleSize> implements Serializable {

    private static final long serialVersionUID = -5863035936376094286L;

    public SimpleSize() {
        super();
    }

    public SimpleSize(int width, int height) {
        super(width, height);
    }

    public SimpleSize(String width, String height) {
        super(width, height);
    }

    @Override
    public void appendSize(StringBuilder sb) {
        super.appendSize(sb);
    }
}
