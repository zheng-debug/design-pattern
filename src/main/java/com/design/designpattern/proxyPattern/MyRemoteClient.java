package com.design.designpattern.proxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {

    public static void main(String[]  args){
        new MyRemoteClient().go();
    }

    private void go(){
        String s = null;
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:1099/HelloNaming");
            s = service.sayHello();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
