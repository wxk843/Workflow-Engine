package com.example.workflowengine.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deray.wang
 * @date 2019/6/20 16:48
 */
@Api(value = "WorkflowController ")
@RestController
@RequestMapping("/Workflow")
public class WorkflowController {
    /**
     * 用户登录
     */
    @ApiOperation(value = "查询用户接口", notes = "查询用户，返回所有的用户", response = String.class)
    @ResponseBody
    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String[] login(String userName, String password){
        String[] strArray={"1","2","3"};
        return strArray;
    }
}
