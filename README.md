# JavaDesignPattern
design pattern written by Java

# 面向对象的六大原则
* 单一职责原则:一个类应该仅有一个引起它变化的原因。
* 开闭原则:一个类应该只可扩展,不可修改。
* 里氏替换原则:子类能够替换他们的父类。
* 依赖倒置原则:依赖于抽象,不依赖于具体类:
  1. 高层模块不依赖底层模块,二者都应该依赖于抽象。【汽车不依赖于一个具体的车轮,而应该通过set车轮来依赖于车轮的抽象】
  2. 抽象不应该依赖于具体实现, 具体实现应该依赖于抽象。【抽象的轮子也能用,不一定要具体的轮子,反而,具体的轮子应该满足抽象轮子的功能】
* 接口隔离原则:不应该强迫客户依赖于他们不用的方法。
* 最少知识原则:只和你的朋友谈话。
* 其他原则:
  * 面向接口编程
  * 优先使用组合,不是继承
  * 一个类需要的数据应该隐藏在类内部
  * 类之间应该0耦合,或只有传导耦合,换句话说,类之间要么没关系,要么只使用另一个类的接口提供的操作
  * 水平方向上尽可能统一地分布系统功能

# 26个设计模式
> 设计模式分类:

1. 创建型设计模式:
  * 单例模式
  * 工厂模式

2. 结构型设计模式:
  * 代理模式
  * 适配器模式
  
3. 行为型设计模式:
  * 观察者模式
  * 责任链模式
  * 策略模式
  * 模板方法模式
  

### 单例模式
包括:
1. CEOSingleTon【饿汉模式：声明静态变量时就已经初始化了】
2. DCLSingleTon(Double Check Lock)【双重锁模式】
  * 优点: 既能够在需要时才初始化单例，又能够保证线程安全，而且，单例对象初始化后的getInstance调用是不会进行同步锁的。
  * 缺点: DCL失效问题：JDK1.5之前的JMM（Java内存模型）中的Cache、寄存器到主内存回写顺序的规定，① 分配内存 ②创建对象和对象引用 ③让对象引用指向对象  这三个步骤的执行顺序有时会错乱
  * 解决方法: v1.5之后, 采用 volatile 关键字【volatile修饰的变量,线程在每次进行"read and load"时,都会读取该变量修改后的最终值, 注意: jvm虚拟机只是保证从主存加载到线程工作内存的值是最新的,不保证"use and assign"和"store and write"过程的同步】
3. EnumSingleTon【枚举】
  * 枚举本身就是一个单例模式
  * 优点：解决了对象反序列化的问题（任何时候，都是单例模式）
  * 关于反序列化问题：即使你的构造函数是private的，反序列化依然会通过特殊途径来调用该方法来创建这个类新的实例
  * 序列化：通过序列化，可以将一个单例的实例对象写到磁盘，然后再读回来，从而有效地获取一个实例。
4. LazySingleTon【懒汉模式：第一次调用getInstance()方法时，才进行初始化单例】
5. SingleTonManager【使用容器(如Map)实现单例模式】
6. StaticSingleTon【静态内部类单例】

### Builder模式
例子:
主要用于在原来的各种Computer的各种不同的具体实现类(如:Mac、Win10等)的基础上,对他们的构造、赋值细节都进行遮掩,用不同的Builder,去封装不同的Computer。

### 工厂模式
用一个Factory工厂类, 去对应一个具体产品(较为复杂的对象创建),这当中,工厂没有"抽象",而产品有"抽象", 具体工厂类 依赖于 产品类抽象 
* 优点: 具有同样功能方法的类抽象,可以有不同的具体实现类(多态), 工厂通过**反射**来创建这些具体类。
* 缺点: 对于同一类产品当然可以, 如果是不同功能方法的类抽象,那就有点尴尬了! 必须写一个这种类的抽象,然后给到工厂(而往往此时,工厂需要添加多一个泛型方法)

### 抽象工厂模式
抽象工厂类,多个实现,这样,对于同一类产品(抽象产品类),可以有不同加工构建,而一类产品又有不同的实现类【类似可理解为:工厂是: 一维,抽象工厂是: 二维】
相当于: adj + n  , adj表示抽象工厂的各个具体实现, 而不同的工厂具体类的不同接口,都唯一依赖一个产品的具体实现类,而不是这类产品的接口(所以可以不用反射)
* 优点: 
  1. 接口隔离原则的完美演绎, 我们只知道调用工厂接口去创建对象,而不会知道其具体工厂实现类。
* 缺点:
  1. 类文件的爆炸性增长。
  2. 不太容易扩展新的产品类。(上面说了,工厂模式共有的缺点,每增加一个新的产品类,工厂就得多出一个接口)

### 策略模式
是解耦的一种关键模式,使用者与实现,都依赖于抽象,相当于: 不同使用者  --->  同一个抽象  <--- 不同实现(根据使用的策略)

### 状态模式
与策略模式一致的解耦思想(依赖倒置原则),只是,抽象的不同实现 会根据当前设置的状态不同而被重新设置(setter)

### 责任链模式
类中有一个target成员,用于在返回false时,将事件交给这个target成员去做。
这里,可以用一个公司任务分配和执行的过程来模拟一个责任链模式:
  1. 公司中,假如分为4层,我、我的组长、组长的上司、公司老总 
  2. 公司 有一项任务 需要我去做,我会先观测这件事我是否可以做,可以,就自己来,不用麻烦上头,不可以,则交给上头去做;
  3. 我确定做不了了,任务给到组长,组长无奈之下,只好和我一样,先观测这件事他能不能搞定,搞不定的话也只好给他的上司处理。
  4. 最终下来,这件事肯定需要被解决,如果下面各级都无法完成 ,最后,只有公司老总自己吞了,因为老总没有上级了。

上面就是一条责任链 。 '我'是开始端, '老总'是末尾端

### 解释器模式
解释器模式:
给定一个语言,定义它的文法的一种表示,并定义一个解释器,该解释器使用该表示来解释语言中的句子。
这个行为型设计模式,比较不常用。
我们用一个例子来说明:表达式求职
  1. 原本,我们用Stack<Integer>去暂存数字结果,每当读到一个运算符时,就出栈与之比较,并做相应的"运算操作",得到的结果入栈。
  2. 现在,我们用Stack<ArithmeticExpression> 来存储表达式结果, 好处是:将"运算操作"具体操作封装了起来。

```
protected Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

    public StringCalculator(String expression) {

        ArithmeticExpression exp1, exp2;

        String[] elements = expression.split(" ");

        for (int i =0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(elements[++i]);
                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(elements[++i]);
                    mExpStack.push(new SubtractionExpression(exp1,exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(elements[i]));
                    break;
            }
        }
    }

    public ArithmeticExpression output(){
        return mExpStack.peek();
    }

```

### 命令模式
 * 行为型设计模式
 * 可以类比:将一系列方法调用封装,用户只需调用一个方法执行,那么这些被封装的方法就会挨个执行调用
 * 几个角色: 接收者 , 请求者, 请求命令 (不同的请求者通过绑定不同的请求命令来 间接地让 接收者 执行操作)
 * 接收者只有一个, 接收者 与 请求命令 可以 一对一 也可以 一对多 ,也就是可以有多个命令去让接受者跑不同的方法
 * 而 请求者 可以 有请求一种或多种 命令【同步情况下,依赖注入来换不同的命令】
 * 相比于传统的写法【只有 接受者 一个类】 , 命令模式多了两个类【'命令'抽象类,'请求者'类 】,那么,这里,
 * 优点: 可以在 命令实现类 和 请求者类 中对原本的请求过程做额外记录等(命令记录功能等); 以弱耦合来替代原来的强耦合
 * 缺点: 类数量增加, 代码复杂了

### 观察者模式
 1. 也称为: 订阅模式
 2. 定义: 定义对象之间的一对多的依赖关系,使得每当一个对象改变状态, 所有依赖于他的对象都会得到通过并被自动更新。
 3. 优点: 观察者与被观察者之间是抽象耦合,应对业务变化, 增强系统灵活性、可扩展性
 4. 缺点: Java中的消息通知默认是顺序执行,如果一个观察者卡顿,会影响整体的执行效率【所以,一般会用到异步方式】

### 备忘录模式
* 注重于对数据的一个备份操作
* 主要有以下三个类:
  1. 备忘录抽象类:用于存储 界面等的 数据和内部状态, 并且只受到一个创建类的作用, 可以防止外界其他类对它的干扰。
  2. 备忘录创建抽象类:用于创建一个数据备份,并让备忘录管理类进行备份数据的存储和移动操作。
  3. 备忘录存储类:不对备忘录内容进行修改和访问, 仅仅只能 将备忘录传递给其他对象【只是一个仓库而已,自己没有手脚】
  
### 迭代器模式
* 将遍历过程由一个自定义Iterator接口的实现类来完成: ①hasNext()判断 ②next() , 而这个实现类持有一个数组对象的引用
  1. Iterator<T>接口: ①hasNext():boolean  ②next():T
  2. Container<T>接口: 代表容器 ,封装除了遍历以外的其他方法如:增删查改 , 并拥有: iterator():Iterator<T> 方法
  3. 其实现类将持有的数组的具体CRUD操作实现,并在需要遍历的时候将数组传给iterator对象去遍历。
  
### 模板模式
模板模式:(抽象类 + final方法定义模板类)
* 定义: 定义一个操作中的算法的框架, 而将一些步骤延迟到子类中, 使得子类可以不改变一个算法的结构 即可重定义该算法的某些特定步骤。
* 使用环境:
  1. 多个子类有公有的方法, 并且逻辑基本相同
  2. 重要、复杂的算法,可以把核心算法设计为模板方法, 周边的相关细节功能则由各个子类实现。
  3. 重构时, 模板方法模式是一个经常使用的模式: 把相同的代码抽取到父类中,然后通过钩子函数约束其行为。

### 访问者模式
访问者模式【先有被访问类  , 再设计出 Visitor 抽象类或接口, 去定义对已有的不同类的访问方法】
* 将数据操作 与 数据结构 分离的设计模式
* 思路：
  1. 被访问的对象结构中的每一个对象都拥有（accept()方法） ， 访问者【接口】都拥有（①visit()接口方法）。
  2. 这个‘对象结构’本身是有能力管理和遍历它内部的每一个元素的。
  3. 这样，在遍历这些对象时，对每一个元素都实施accept()方法，在每一个元素的accept方法中调用访问者的visit方法，从而使访问者得以处理对象结构的每一个元素。
* 定义：封装一些作用于某种数据结构中的各个元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新操作。

### 中介者模式
中介者模式:(也称为: 调解者模式 或 调停者模式)
* 中介类包装了一系列对象相互作用的方式,使得这些对象之间不需要相互明显作用。【解耦】
* 中介类 将多对多的作用,转化成一对多的相互作用。
* 这个模式,将系统从 网状结构 变成 以调停者为中心的星型结构
* 一个 Mediator 持有多个 Colleague 的对象引用
* 每一个Colleague,都拥有 一个Mediator中介对象的引用

### 代理模式
* 静态代理
  1. 在代码运行之前, 代理类的class编译文件就存在了
  2. 缺陷:代理者与被代理者实际上还是耦合在一块
  3. 优点: 更符合OO原则

* 动态代理
  1. 相比静态代理,我可以动态对每一个被代理者,生成一个相应的代理类。
  2. 实质: 代理者 和 被代理者  解耦
  3. 无非是两个主要类：Proxy类 和  InvocationHandler接口实现类（也就是 代理类），前者负责封装和创建动态代理对象，而后者负责封装真实对象并接管真实对象的相关方法操作

* 以适用范围来区分不同代理:
  1. 远程代理: 为某个对象在不同的内存地址空间提供局部代理。使系统可以将Server部分的实现隐藏,以便Client可以不必考虑Server的存在。
  2. 虚拟代理: 使用一个代理对象 表示一个十分耗资源的对象 并在真正需要时才创建。
  3. 保护代理: 使用代理控制对原始对象的访问。该类型的代理常用于原始对象有不同访问权限的情况。
  4. 智能引用: 在访问原始对象时 执行一些自己的附加操作 并对指向原始对象的引用计数。


### 组合模式
* component【部件】
* composite【组合】
* 本质: 一个类中,可以有一个本类的数组的引用,相当于,文件和文件夹都属于文件,但是文件夹可以包含多个文件。

### 适配器模式
适配器模式:将原来的不适配的接口或类,通过新建一个具体子类,去转换为我们想要获得的接口的过程。
* 三个成员:
  1. 目的接口
  2. 源类、源接口对象
  3. Adapter(适配器)类 extends 源类 implement 目的接口

(一)类适配器模式:
以'继承'关系来连接到 源类 【Adapter(适配器)类 extends 源类 implement 目的接口】

(二)对象适配器模式:(更为灵活,因为不受父类的限制)
使用代理关系连接到 源类【Adapter类 implements 目的接口 , 内部包含源类成员】
* 优势:
  1. 更好的扩展性:对类方法接口的适配, 容易扩展新的业务模块到整体项目中,与项目有效接入。
  2. 更好的复用性:使代码的复用性提高, 将原来不适配新程序的旧的接口,适配为可用的接口
* 缺点:
  1. 过多使用适配器,会让系统变得零乱,不易整体把握。

### 装饰模式(decorator)
装饰模式(包装模式):
* 结构型设计模式
* 定义:动态给一个对象添加一些额外的职责。【装饰模式 是 生成子类 的 更灵活方案】
* 使用场景: 需要透明且动态地扩展类的功能时。
* 与代理模式的区别:
  1. 装饰模式是对客户端透明的方式扩展对象的功能,是继承关系的一个替代方案;而代理模式则是给一个对象提供一个代理对象,并由代理对象控制 对原有对象的引用
  2. 装饰模式为 被装饰类 的对象 增强功能,而代理模式只是对代理的对象施加控制,不加功能。

### 享元模式(flyweight)
享元模式 : 对象池的一种实现, 用来尽可能地减少内存使用量,适用于可能存在大量重复对象的场景,来缓存可共享的对象,避免创建过多对象
* 重点: 理清'内部状态'和'外部状态'。
* 优点:
  1. 减少程序创建的对象,降低程序的内存占用,增强程序的性能
* 缺点:
  1. 是系统更加复杂,为了使对象可以共享, 需要将一些状态外部化,使得程序的逻辑复杂化
  2. 由于享元对象的状态外部化, 读取外部状态使得运行时间稍微变长。

### 外观模式
外观模式【又称 门面模式】: 比如,手机有拨号和拍照功能,手机可以同时持有拨号类和拍照类对象引用,然后,对外提供统一的操作接口,这样,就是没人知道,手机内部有两个对象引用,也不知道手机的实际操作实际是内部两个对象的各个方法的调用。
* 精髓: '封装'。通过高层次结构的一个统一API,使得用户仅仅通过这些API,就可以基础操控整个系统 【说明这个模式是属于对高层的设计模式】
* 定义: 要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。Facade模式提供一个高层次的接口,使得子系统更易于使用。
* 使用场景:
  1. 为一个复杂子系统提供一个简单接口。
        因为:大多数模式使用时都会产生更多、更小的类,而导致子系统更具可重用性和可定制和修改,这样一来,易变性 让 '如何隐藏子系统的具体实现' 变得重要。
        所以: Facade模式提供一个简单统一的接口,对外隐藏子系统的具体实现、隔离变化。
  2. 当需要构建一个层次结构的子系统时,使用Facade模式定义子系统中每层的入口点。(可以简化子系统之间的依赖关系)
* 优点:【很多第三方SDK使用的模式,就是这种模式,让SDK容易使用的】
  1. 对客户端隐藏子系统细节,因而减少客户对子系统的耦合, 能够拥抱变化。
  2. 外观类对子系统的接口封装, 是系统更容易使用。
* 缺点:
  1. 外观类接口膨胀。【由于外观类集合了各个子系统的使用接口,外观类的API接口较多,一定程度上增加了用户的使用成本】
  2. 外观类没有遵循开闭原则, 当业务变更时, 可能要直接修改外观类。

### 桥接模式
* 桥接模式:【可以理解一下: ①笛卡尔积 ②x轴和y轴的二维关系 ③ 抽象依赖抽象, 两个抽象的各个实现随意】
* 结构型设计模式
* 定义: 将抽象部分与实现部分分离 , 使它们都可以独立进行变化。【连接 '抽象部分' 和 '实现部分'】
* 优点: 抽象和实现部分分离
* 缺点: 难把握那个'度'
