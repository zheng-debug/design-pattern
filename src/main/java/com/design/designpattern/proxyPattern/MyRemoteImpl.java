package com.design.designpattern.proxyPattern;


import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

/**
 * 实现远程接口，并继承UnicastRemoteObject类，用于创建远程对象。
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * 因为超类中的构造器声明了异常，所以本类中也必须写一个构造器，因为这意味着本构造器正在调用不安全的代码（超类构造器）
     * @throws RemoteException
     */
    protected MyRemoteImpl() throws RemoteException { }

    /**
     * 必须实现远程接口中定义的方法，不需要声明RemoteException
     * @return
     */
    @Override
    public String sayHello(){
        return "Service say Hello 树先生";
    }

    /**
     * 先产生远程对象，再使用Naming.bind()将该服务绑定到rmiRegistry，
     * 客户将使用所注册的名称去rmiRegistry（注册表）中寻找
     * @param args
     * @throws RemoteException
     */
    public static void main(String[] args) throws RemoteException {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            MyRemote service = new MyRemoteImpl();
            registry.bind("HelloNaming",service);
            //Naming.bind("rmi://localhost:1099/HelloNaming", service);
            System.out.println("==========启动RMI服务成功===========");
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
