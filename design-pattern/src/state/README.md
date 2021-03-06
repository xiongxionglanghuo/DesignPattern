## 状态模式：

> 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类

 * 目的：主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类中，可以把复杂的判断逻辑简化。

 * 好处：
 
   - 将与特定状态相关的行为局部化，并且将不同状态的行为分割开来。
   - 消除庞大的条件分支（简单的并且类似的逻辑，用策略）
   - 把各种状态转移逻辑分步到state的子类之间，来减少互相间的依赖。
   - 因为所有与状态有关的代码都存在于某个state中，所以通过定义新的子类可以很容易的增加新的状态和转换。
   
 * 场景：
    
    - 当一个对象行为取决于它的状态，并且它必须在运行时刻根据状态来改变他的行为时，可以考虑适用该模式 

