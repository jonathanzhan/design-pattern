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

package com.clexel.dp.structural.proxy.cglib;

/**
 * cglib动态代理的调用
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/29 12:44
 * @since 1.0.0+
 */
public class CglibTest {

    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        RealSubject realSubject = (RealSubject) proxy.getProxy(RealSubject.class);
        realSubject.request();
    }
}
