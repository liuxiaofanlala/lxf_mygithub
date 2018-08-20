package com.westos.web01.service;

import com.westos.web01.bean.Haohan;
import com.westos.web01.dao.HaohanDao;
import com.westos.web01.mybatis.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Created by Administrator on 2018/8/19.
 */
public class HaohanServiceMybatisImpl implements HaohanServiceInterface {
    @Override
    public Haohan findaHaohan(Integer xuhao) {
        SqlSessionFactory sqlsesstionFactory = MybatisUtil.getInstance().getSqlSessionFactory();
        //创建数据库连接
        SqlSession session = sqlsesstionFactory.openSession();
        //获取对应的mapper接口
        HaohanDao haohandao = session.getMapper(HaohanDao.class);
        Haohan result = haohandao.getHaohanByxuhao(xuhao);
        session.close();
        return result;
    }

    @Override
    public List<Haohan> listHaohan() {
        return null;
    }

    @Override
    public Haohan addHaohan(Haohan haohan) {
        return null;
    }

    @Override
    public Haohan updateHaohan(Haohan haohan) {
        return null;
    }

    @Override
    public Haohan removeHaohan(Integer xuhao) {
        return null;
    }
}
