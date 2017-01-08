/**
 * 原型模式，也可称为"克隆模式"
 * 作用：备份对象信息，便于进行rollback，即原操作数据先被完全克隆一份用于被操作，当操作修改失败或者未修改时，克隆数据不会覆盖原数据。保证了commit()的有效性。
 * 用法：
 * 1. 被使用的类需要实现Cloneable接口
 * 2. XXXSession 单例类，用于备份（缓存）该类对象信息
 * 3. XXXOperator 实际操作类，每次需要操作对象信息时，都需要从XXXSession中获取对象的克隆者，修改操作真的确认后，原对象才被覆盖。
 * Created by androidjp on 2017/1/8.
 */
package prototype;