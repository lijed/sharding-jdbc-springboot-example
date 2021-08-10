package com.gupao.sharding.example.controller;


import com.gupao.sharding.example.service.ITConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mic
 * @since 2021-08-09
 */
@RestController
@RequestMapping("/t-config")
public class TConfigController {

    @Autowired
    ITConfigService itConfigService;

    @GetMapping("/{key}")
    public String getValue(@PathVariable("key") String key) {
        return itConfigService.getById(key).getConfigValue();
    }
}
