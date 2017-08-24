package com.zzh.quartztest.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Quartz")
public class QuartzController {
    @GetMapping("test")
    String test() {
        return "";
    }
}
