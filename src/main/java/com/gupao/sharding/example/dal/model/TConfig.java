package com.gupao.sharding.example.dal.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mic
 * @since 2021-08-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TConfig extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value = "config_key", type = IdType.INPUT)
    private String configKey;

    private String configValue;


}
