/*
 * Copyright  2014-2019 jonathan.zhan.chang@gmail.com(Jonathan)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.workfocus.dp.creation.builder;

/**
 * 指挥者角色
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/20 10:41
 * @since 1.0.0+
 */
public class Director {
    private Builder builder;

    /**
     * 指挥者角色构造方法，传入建造者对象
     * @param builder Builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品的构造方法,负责调用各个零件的建造方法，比如产品的生产熟悉怒等
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }
}
