/**
 * 外观模式【又称 门面模式】: 比如,手机有拨号和拍照功能,手机可以同时持有拨号类和拍照类对象引用,然后,对外提供统一的操作接口,这样,就是没人知道,手机内部有两个对象引用,也不知道手机的实际操作实际是内部两个对象的各个方法的调用。
 *
 * 精髓: '封装'。通过高层次结构的一个统一API,使得用户仅仅通过这些API,就可以基础操控整个系统 【说明这个模式是属于对高层的设计模式】
 *
 *
 * 定义: 要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。Facade模式提供一个高层次的接口,使得子系统更易于使用。
 *
 * 使用场景:
 *   1. 为一个复杂子系统提供一个简单接口。
 *       因为:大多数模式使用时都会产生更多、更小的类,而导致子系统更具可重用性和可定制和修改,这样一来,易变性 让 '如何隐藏子系统的具体实现' 变得重要。
 *       所以: Facade模式提供一个简单统一的接口,对外隐藏子系统的具体实现、隔离变化。
 *   2. 当需要构建一个层次结构的子系统时,使用Facade模式定义子系统中每层的入口点。(可以简化子系统之间的依赖关系)
 *
 * 优点:【很多第三方SDK使用的模式,就是这种模式,让SDK容易使用的】
 *   1. 对客户端隐藏子系统细节,因而减少客户对子系统的耦合, 能够拥抱变化。
 *   2. 外观类对子系统的接口封装, 是系统更容易使用。
 * 缺点:
 *   1. 外观类接口膨胀。【由于外观类集合了各个子系统的使用接口,外观类的API接口较多,一定程度上增加了用户的使用成本】
 *   2. 外观类没有遵循开闭原则, 当业务变更时, 可能要直接修改外观类。
 *
 * Created by androidjp on 16/8/20.
 */
package facade;