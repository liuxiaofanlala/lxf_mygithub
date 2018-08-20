package com.westos.web01.mybatis;

import com.westos.web01.bean.Haohan;
import com.westos.web01.bean.News;
import com.westos.web01.dao.HaohanDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * 对mybatis进行测试
 * Created by Administrator on 2018/8/19.
 */
public class Client {
    public static void main(String[] args){
        SqlSessionFactory sqlsesstionFactory = MybatisUtil.getInstance().getSqlSessionFactory();
        //创建数据库连接
        SqlSession session = sqlsesstionFactory.openSession();
        //获取对应的mapper接口
        HaohanDao haohandao = session.getMapper(HaohanDao.class);
        //查询新闻信息
        List<News> news = haohandao.listNews();


        System.out.println(news);
        System.out.println(haohandao.listSubjects());
        //关闭连接
        session.close();
    }
}
