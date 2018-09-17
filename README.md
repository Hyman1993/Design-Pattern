# 设计模式/デザインパターン/Design Pattern
设计模式/デザインパターン/Design Pattern

一、策略模式 Strategy Pattern
    原理：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。原则就是：
  分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者。
  
二、装饰着模式 Decorator Pattern
    原理：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性。
  就像打包一个快递一样。子类去调用父类的方法，并在自己的方法中对其进行加强。
  
三、观察者模式 Observer Pattern
    原理： 对象之间多对一依赖的一种设计方法，被依赖的对象为Subject，依赖的对象为Observer,Subject通知Observer变化。
  多对1： Observer 对 Subject。 其业务类型，有点类似于订阅邮件。
  
四、单例模式 Single Pattern
   原理：私有化构造方法，对外提供全局访问的返回单一对象的方法。确保一个类最多只有一个实例，并提供一个全局访问点。
         多线程中保持一致性。
         饱汉式和饿汉式。
         
五、工厂模式 Factory Patterns
    1.简单工厂模式原理
      定义一个创建对象的类（工厂类），由这个类来封装实例化对象的行为。外部从工程类中获取相应实例。
    2.工厂方法模式（重要）
      定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
    3.抽象工厂模式（重要）
      定义了一个接口用于创建相关或有依赖关系的对象族，而无需明确指定具体类。用一个接口引用去调用工厂方法，在主程序中创建具体的接口引用对象。
      有点类似于策略模式。
      
六、命令模式 Command Pattern
    将请求、命令、动作等封装成对象，这样可以让项目使用这些对象来参数化其他对象。使得命令的请求者和执行者解耦。
