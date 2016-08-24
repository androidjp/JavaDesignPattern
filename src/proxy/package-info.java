/**
 * 静态代理
 * 1.在代码运行之前, 代理类的class编译文件就存在了
 * 2.缺陷:代理者与被代理者实际上还是耦合在一块
 * 3.优点: 更符合OO原则
 *
 * 动态代理
 * 1. 相比静态代理,我可以动态对每一个被代理者,生成一个相应的代理类。
 * 2. 实质: 代理者 和 被代理者  解耦
 *
 *
 * 以适用范围来区分不同代理:
 * 1. 远程代理: 为某个对象在不同的内存地址空间提供局部代理。使系统可以将Server部分的实现隐藏,以便Client可以不必考虑Server的存在。
 * 2. 虚拟代理: 使用一个代理对象 表示一个十分耗资源的对象 并在真正需要时才创建。
 * 3. 保护代理: 使用代理控制对原始对象的访问。该类型的代理常用于原始对象有不同访问权限的情况。
 * 4. 智能引用: 在访问原始对象时 执行一些自己的附加操作 并对指向原始对象的引用计数。
 *
 * Created by androidjp on 16/8/19.
 */
package proxy;
