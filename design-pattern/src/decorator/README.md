## 装饰者模式：
 * 目的：动态地给一个对象添加一些额外的职责，比如增加功能。为了已有功能动态地添加更多功能的一种方式。简单来说就是，为了使得当前对象做了一些额外的不属于他本身的事情。
 * 解耦,让耦合的双方依赖于抽象（接口），而不是具体的实现，从而使得各自的变化不会影响另外一边
 * 场景：
    1. 当系统需要新功能的时候，是向旧的类中添加的代码。这些新加的代码通常装饰了原有类的核心职责或主要行为。
 * 优点：
    1. 有效地把类的核心职责和装饰功能区分开了，而且可以去除相关类中重复的装饰逻辑。
    2. 我们原来的"装饰逻辑"其实就是简单的set对象属性，比如一个人要穿衣服裤子，我们只会set裤子属性、set衣服属性到人这个对象中，但是如果需要拓展人的这个对象属性，要开始穿外套了，这样代码重构就会很繁琐，使用装饰模式，把装饰功能区分开，在不影响原有的代码基础上，新增装饰对象。


#### 失败的设计：

![失败的设计](http://p95stksgt.bkt.clouddn.com/%E8%A3%85%E9%A5%B0%E8%80%85%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F1.jpeg)

#### 装饰者模式：

![装饰者模式](http://p95stksgt.bkt.clouddn.com/%E8%A3%85%E9%A5%B0%E8%80%85%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F2.jpeg)

