package com.westos.web01.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Administrator on 2018/8/19.
 */
public class MybatisUtil {
    //单例类的定义
    private static MybatisUtil instance;
    //mybatis的sql连接
    private  SqlSessionFactory sqlSessionFactory;
    //私有构造函数
    private MybatisUtil(){
        String resource="mybatis.xml";
        try{
            InputStream in = Resources.getResourceAsStream(resource);
            //初始化sqlSession
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static MybatisUtil getInstance(){
        if(instance==null){
            instance=new MybatisUtil();
        }
        return instance;
    }


    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
