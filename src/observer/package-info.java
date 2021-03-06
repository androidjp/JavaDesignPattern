/**
 * 观察者模式:
 * 1. 也称为: 订阅模式
 * 2. 定义: 定义对象之间的一对多的依赖关系,使得每当一个对象改变状态, 所有依赖于他的对象都会得到通过并被自动更新。
 * 3. 优点: 观察者与被观察者之间是抽象耦合,应对业务变化
 *         增强系统灵活性、可扩展性
 * 4. 缺点: Java中的消息通知默认是顺序执行,如果一个观察者卡顿,会影响整体的执行效率【所以,一般会用到异步方式】
 *
 * Created by androidjp on 16/8/17.
 */
package observer;