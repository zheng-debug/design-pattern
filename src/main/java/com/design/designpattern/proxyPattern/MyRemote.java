package com.design.designpattern.proxyPattern;

import java.rmi.*;

/**
 * 代理模式：为另一个对象提供一个替身或占位符以控制对这个对象的访问。
 *      使用代理模式创建代表对象，让代表对象控制对某对象的访问，被代理的对象可以是远程的对象、创建开销大的对象或需要安全控制的对象。
 *
 * 远程代理接口，扩展Remote接口。所有远程方法必须声明RemoteException。
 *
 * 远程代理：远程代理可以作为另一个JVM上对象的本地代表。
 *      调用代理的方法,会被代理利用网络转发到远程执行,
 *      并且结果会通过网络返回给代理，再由代理将结果转给客户。
 *
 * 虚拟代理：虚拟代理作为创建开销大的对象的代表。
 *      虚拟代理经常直到我们真正需要一个对象的时候才创建它。
 *      当对象在创建前和创建中时，由虚拟代理来扮演对象的替身。
 *      对象创建后,代理就会将请求直接委托给对象。
 */
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;
}
