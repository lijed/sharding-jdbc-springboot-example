package com.gupao.sharding.example.controller;


import com.gupao.sharding.example.service.ITOrderModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mic
 * @since 2021-08-10
 */
@RestController
@RequestMapping("/t-order-mod")
public class TOrderModController {

    @Autowired
    private ITOrderModService itOrderModService;

    @GetMapping
    public void init() throws SQLException {
        itOrderModService.initEnvironment();
        itOrderModService.processSuccess();
    }
}
