package com.westos.web01.dao;

import com.westos.web01.bean.Haohan;
import com.westos.web01.bean.News;
import com.westos.web01.bean.Subject;

import java.util.List;

/**
 * Created by Administrator on 2018/8/19.
 */
public interface HaohanDao {
    //根据好汉序号获取好汉信息
    Haohan getHaohanByxuhao(Integer xuhao);
    //查询所有新闻
    List<News> listNews();
    //查询所有新闻类别
    List<Subject> listSubjects();
}
