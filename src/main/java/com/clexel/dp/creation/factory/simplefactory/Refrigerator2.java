/*
 * Copyright  2014-2019 zhan.chang@outlook.com(Jonathan)
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

package com.clexel.dp.creation.factory.simplefactory;

/**
 * 型号2的冰箱
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/14 11:42
 * @since 1.0.0+
 */
public class Refrigerator2 implements Appliance {
    /**
     * 冰箱2的描述显示
     */
    @Override
    public void display() {
        System.out.println("型号2的冰箱");
    }
}
