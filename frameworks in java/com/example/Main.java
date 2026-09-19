package com.example;
import com.example.di.AOPProxy;
import com.example.di.Container;
import com.example.di.NotificationService;
import com.example.di.UserService;
import com.example.di.UserServices;
public class Main {
    public static void main(String[] args)  throws Exception{
        Container container =new Container(UserServices.class, NotificationService.class);
        UserService userServices = AOPProxy.createProxy(container.getService(UserService.class),UserService.class);
        System.out.println("=============================");
        userServices.registrationUser("Deeps");
        System.out.println("=============================");
      }
}
