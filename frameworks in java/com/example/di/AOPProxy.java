package com.example.di;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class AOPProxy {
    public static <T> T  createProxy(T target, Class<T> interfaceType){
    return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.isAnnotationPresent(LogExecutionTime.class)){
                            long start=System.currentTimeMillis();
                            Object result =method.invoke(target,args);
                            long end=System.currentTimeMillis();
                            System.out.println("Execution time: "+(end-start)+"ms");
                            return result;
                        }
                     return method.invoke(target,args);
                    }
                }

        ));
    }
}
