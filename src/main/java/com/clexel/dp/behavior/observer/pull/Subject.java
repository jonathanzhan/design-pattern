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

package com.clexel.dp.behavior.observer.pull;


import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题对象
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/12 16:50
 * @since 1.0.0+
 */
public abstract class Subject {
    /**
     * 定义保存观察者对象的聚集
     */
    protected List<Observer> observers = new ArrayList<>();

    /**
     * 增加观察者对象
     * @param o 观察者对象
     */
    protected void add(Observer o) {
        observers.add(o);
    }

    /**
     * 删除观察者对象
     * @param o 观察者对象
     */
    protected void remove(Observer o) {
        observers.remove(o);
    }

    /**
     * 定义通知所有观察者对象的抽象方法
     */
    protected void notifyObserver() {
        for (Observer observer : observers) {
            observer.response(this);
        }
    }

}
