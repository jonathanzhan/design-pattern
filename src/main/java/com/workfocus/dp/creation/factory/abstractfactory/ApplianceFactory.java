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

package com.workfocus.dp.creation.factory.abstractfactory;


/**
 * 家电的抽象工厂接口
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/14 18:57
 * @since 1.0.0+
 */
public interface ApplianceFactory {
    /**
     * 电视的生产方法接口
     * @return appliance
     */
    Television buildTelevision();


    /**
     * 冰箱的生产方法接口
     * @return appliance
     */
    Refrigerator buildRefrigerator();
}
