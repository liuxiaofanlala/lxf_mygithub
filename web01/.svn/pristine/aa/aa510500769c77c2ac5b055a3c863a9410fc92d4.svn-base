package com.westos.web01.fanshe;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2018/8/19.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1. 利用反射创建一个对象
        //加载一个类
        Class<?> haohancls = Class.forName("com.westos.web01.bean.Haohan");
        //创建类的实例
        Object haohan = haohancls.newInstance();

        //查看对象属性
        Field[] fields = haohan.getClass().getDeclaredFields();
        for(Field f :fields){
            System.out.println("fieldname:"+f.getName());
            System.out.println("fieldtype:"+f.getType());
        }

        Method[] methods = haohan.getClass().getMethods();
        for(Method m:methods){
            System.out.println(m.getName());
            System.out.println("参数："+m.getParameters());
        }
        //执行一个方法setXingming
        Method m1 = haohan.getClass().getMethod("setXingming", String.class);

        //执行m1
        m1.invoke(haohan,new Object[]{"宋江"});

        System.out.println(haohan);
        Map map=new HashMap<>();
        map.put("xingming","卢俊义");
        map.put("xuhao",1);

        //使用反射进行映射
        for(Object key:map.keySet()){
            String strkey=(String)key;
            Object value=map.get(key);
            for (Method m :methods){
                if(m.getName().equals("set"+StringUtils.capitalize(strkey))){
                    System.out.println(m.getName());
                    m.invoke(haohan,new Object[]{value});
                }
            }
        }
        //输出映射后的对象
        System.out.println(haohan);
    }
}
