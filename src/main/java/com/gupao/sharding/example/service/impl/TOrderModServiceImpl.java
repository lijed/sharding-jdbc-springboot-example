package com.gupao.sharding.example.service.impl;

import com.gupao.sharding.example.dal.model.TOrder;
import com.gupao.sharding.example.dal.model.TOrderMod;
import com.gupao.sharding.example.dal.mapper.TOrderModMapper;
import com.gupao.sharding.example.service.ITOrderModService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mic
 * @since 2021-08-10
 */
@Service
public class TOrderModServiceImpl extends ServiceImpl<TOrderModMapper, TOrderMod> implements ITOrderModService {

    @Autowired
    TOrderModMapper tOrderModMapper;

    Random random = new Random();

    @Override
    public void initEnvironment() throws SQLException {
        tOrderModMapper.createTableIfNotExists();
    }

    @Override
    public void processSuccess() throws SQLException {
        System.out.println("-------------- Process Success Begin ---------------");
        List<Long> orderIds = insertData();
        System.out.println("-------------- Process Success Finish --------------");
    }

    public List<Long> insertData () {
        System.out.println("---------------------------- Insert Data ----------------------------");
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i <= 100; i++) {
            TOrderMod order = new TOrderMod();
            order.setUserId(i);
            order.setAddressId(i);
            order.setStatus("INSERT_TEST");
            tOrderModMapper.insert(order);
            result.add(order.getOrderId());
        }
        return result;
    }
}
