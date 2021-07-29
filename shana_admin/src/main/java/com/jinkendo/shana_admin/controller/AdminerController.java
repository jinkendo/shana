package com.jinkendo.shana_admin.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "管理者")
@RestController
public class AdminerController {

    @GetMapping("/ADMIN/Admin/Login.api")
    Object Login(){
        Map map = new HashMap();
        map.put("status", 200);
        return map;
    }
}
