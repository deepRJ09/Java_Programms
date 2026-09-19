package com.example.di;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Container {
private Map<Class<?>, Object> services=new HashMap<>();
public Container(Class<?>...classes)throws Exception{
    for(Class<?> clazz:classes){
        if (clazz.isAnnotationPresent(Service.class)){
            Object service = clazz.getDeclaredConstructor().newInstance();
            services.put(clazz,service);
            for (Class<?> serviceInterface : clazz.getInterfaces()) {
                services.put(serviceInterface,service);
            }


        }
    }
for ( Object Service : services.values()){
    for (Field field : Service.getClass().getDeclaredFields()){
        if (field.isAnnotationPresent(Inject.class)){
            field.setAccessible(true);
            field.set(Service,services.get(field.getType()));
        }
    }
}

}
public <T> T getService(Class<T> clazz){
    return clazz.cast(services.get(clazz));
}
}
