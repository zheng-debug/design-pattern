package com.design.designpattern.commandPattern;

/**
 * 命令模式：
 *      1：命令模式将发出请求的对象和执行请求的对象解耦。
 *      2：在被解耦的两者之间是通过命令对象沟通的，命令对象中封装了接收者的一个或者一组动作。
 *      3：调用者通过调用命令对象的execute()方法发出请求，使得接收者的动作被调用。
 *      4：调用者可以接受命令当作参数，甚至在运行的过程中动态进行。
 *      5：命令可以进行撤销，具体方法是通过undo()方法回到execute()方法被执行前的状态。
 *      6：宏命令是命令的一种延申，允许一次性执行多个命令。宏方法也支持撤销。
 *      7：命令也可以用来实现日志和事务系统。
 */
public interface Command {
    public void execcute();
    public void undo();
}
