#### 策略模式(strategy pattern)
### 概述
1. 定义
策略模式属于对象行为型模式,主要针对一组算法,将每一个算法封装到具有公共接口的独立实现类中,
从而使他们可以相互替换。策略模式可以使程序在不影响客户端的情况下发生变化。通常,策略模式适用于
当一个程序需要实现一种特定的服务或者功能,而且该程序有多种的实现方法时使用。
策略模式定义了算法族,分别封装起来,让他们之间可以相互替换,此模式让算法的变化独立于使用算法的客户。
2. 作用
可以动态的改变对象的行为。
3. 设计原则
设计原则是把一个类中经常改变或者将来可能改变的部分提取出来，作为一个接口，然后在类中包含这个对象的实例，这样类的实例在运行时就可以随意调用实现了这个接口的类的行为。