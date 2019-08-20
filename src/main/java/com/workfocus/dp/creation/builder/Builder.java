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
 * 抽象建造者角色
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/20 10:38
 * @since 1.0.0+
 */
public interface Builder {
    //产品零部件的建造方法

    /**
     * 产品零部件1的建造方法
     */
    void buildPart1();

    /**
     * 产品零部件1的建造方法
     */
    void buildPart2();

    /**
     * 产品零部件1的建造方法
     */
    void buildPart3();

    /**
     * 返回产品对象的方法
     * @return Product
     */
    Product retrieveResult();
}
