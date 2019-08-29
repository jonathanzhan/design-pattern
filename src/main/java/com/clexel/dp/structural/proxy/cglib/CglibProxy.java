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

package com.clexel.dp.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author Jonathan
 * @version 1.0.0
 * @date 2019/8/29 12:17
 * @since 1.0.0+
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * 通过Enhancer 创建代理对象
     */
    private Enhancer enhancer = new Enhancer();

    /**
     * 通过class对象获取代理对象
     * @param clazz class对象
     * @return 代理对象
     */
    public Object getProxy(Class<?> clazz) {
        //设置enhancer对象的父类
        enhancer.setSuperclass(clazz);
        //设置enhancer的回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     *
     * @param object 被代理对象
     * @param method 被代理对象的方法
     * @param args 被代理对象的方法参数
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before 动态代理");
        //调用新生成的cglib的代理对象,所属的父类的被代理方法
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("after 动态代理");
        return result;
    }
}
