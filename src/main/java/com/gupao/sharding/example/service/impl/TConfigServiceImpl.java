package com.gupao.sharding.example.service.impl;

import com.gupao.sharding.example.dal.mapper.TOrderModMapper;
import com.gupao.sharding.example.dal.model.TConfig;
import com.gupao.sharding.example.dal.mapper.TConfigMapper;
import com.gupao.sharding.example.service.ITConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mic
 * @since 2021-08-09
 */
@Service
public class TConfigServiceImpl extends ServiceImpl<TConfigMapper, TConfig> implements ITConfigService {



}
