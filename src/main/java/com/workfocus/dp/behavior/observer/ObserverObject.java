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

package com.workfocus.dp.behavior.observer;

/**
 * TODO 关于此类的描述
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/6/12 19:52
 * @since 1.0.0+
 */
public class ObserverObject implements Observer {
    private String name;

    private String message;

    public ObserverObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 观察者响应
     *
     * @param data 数据内容
     */
    @Override
    public void response(String data) {
        this.message = data;
        info();
    }

    public void info(){
        System.out.println(name + " 收到推送消息： " + message);
    }
}
