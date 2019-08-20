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

package com.clexel.dp.creation.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式客户端调用测试类
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/20 15:10
 * @since 1.0.0+
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizetype = new RealizeType();
        realizetype.setName("test1");

        List<String> list = new ArrayList<String>();
        list.add("1111");
        list.add("2222");
        realizetype.setList(list);

        RealizeType cloneType = (RealizeType) realizetype.clone();
        list.add("3333");
        cloneType.setName("test2");
        cloneType.setList(list);
        System.out.println(realizetype.getName());
        System.out.println(cloneType.getName());
        System.out.println(realizetype.getList());
        System.out.println(cloneType.getList());
    }
}
