package com.design.designpattern.templateMethod;


/**
 * 注意事项：
 *      1、当子类必须提供某个算法（方法）的实现时，这个方法可以被定义为抽象方法由子类实现。
 *      2、当算法中存在可选的步骤时，可以采用钩子方法。由子类自行判断是否需要覆盖钩子方法或者使用默认操作。
 *      3、每一个具体的子类必须实现抽象方法，并为模板方法算法中未定义步骤提供完整的实现过程。
 *      4、算法内的步骤不必切割的过细，避免在子类大量实现抽象方法，也不能过于简略，导致没有弹性。
 *      5、底层组件可以挂勾到高级组件上，但是高层组件会决定什么时候调用低级组件（别调用我，我会调用你）
 */
public abstract class TemplateClass {

    final void templateMethod(){ //模板方法，避免子类更改算法执行过程，所以定义为final；

        //模板方法定义了一连串的算法步骤，每个步骤由一个方法代表，可以在抽象类中进行实现，也可以延迟到子类中进行实现。
        primitiveOperation1();
        primitiveOperation2();
        primitiveOperation3();
        hock(); // 钩子方法
    }

    //定义为抽象方法，必须由子类实现
    abstract void primitiveOperation1();

    //定义为抽象方法，必须由子类实现
    abstract void primitiveOperation2();

    final void primitiveOperation3(){ //将方法定义为final，子类无法覆盖，可以直接被抽象类或者子类调用。
        //具体实现
    }

    void hock(){}; //钩子方法，默认不做任何事情，子类可以根据实际情况决定是否覆盖。


}
