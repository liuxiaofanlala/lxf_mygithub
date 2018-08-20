package com.westos.web01.factory;

import com.westos.web01.service.HaohanServiceImpl;
import com.westos.web01.service.HaohanServiceInterface;
import com.westos.web01.service.HaohanServiceMybatisImpl;

/**
 * Created by Administrator on 2018/8/19.
 */
public class HaohanServiceFactory {
    public static HaohanServiceInterface create(Integer servicetype){
        if(servicetype==0){
            return new HaohanServiceImpl();
        }else{
            return new HaohanServiceMybatisImpl();
        }
    }
}
