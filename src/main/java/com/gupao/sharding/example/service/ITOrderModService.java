package com.gupao.sharding.example.service;

import com.gupao.sharding.example.dal.model.TOrderMod;
import com.baomidou.mybatisplus.extension.service.IService;

import java.sql.SQLException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mic
 * @since 2021-08-10
 */
public interface ITOrderModService extends IService<TOrderMod> {
    void initEnvironment() throws SQLException;

    void processSuccess() throws SQLException;
}
