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

package com.clexel.dp.structural.proxy.staticproxy;

/**
 * 静态代理的客户端调用
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/29 10:12
 * @since 1.0.0+
 */
public class ProxyClient {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
