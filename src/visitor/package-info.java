/**
 * 访问者模式
 * 1. 将数据操作 与 数据结构 分离的设计模式
 * 2. 思路：
 *   被访问的对象结构中的每一个对象都拥有（accept()方法） ， 访问者【接口】都拥有（①visit()接口方法）。
 *   这个‘对象结构’本身是有能力管理和遍历它内部的每一个元素的。
 *   这样，在遍历这些对象时，对每一个元素都实施accept()方法，在每一个元素的accept方法中调用访问者的visit方法，从而使访问者得以处理对象结构的每一个元素。
 * 3. 定义：
 *   封装一些作用于某种数据结构中的各个元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新操作。
 * Created by androidjp on 16-8-9.
 */
package visitor;