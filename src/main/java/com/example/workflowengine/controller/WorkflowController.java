package com.example.workflowengine.controller;

import com.example.workflowengine.model.ServiceResponse;
import com.example.workflowengine.model.bean.WorkflowRelationFilterBean;
import com.example.workflowengine.service.IWorkflowRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author deray.wang
 * @date 2019/6/20 16:48
 */
@Api(value = "WorkflowController ")
@RestController
@RequestMapping("/Workflow")
public class WorkflowController {
    @Autowired
    IWorkflowRelationService workflowRelationService;
    /**
     * 获取工作流程数据
     */
    @ApiOperation(value = "获取工作流程数据", notes = "获取工作流程数据，返回所有的工作流", response = String.class)
    @ResponseBody
    @RequestMapping(value = "/index", method = {RequestMethod.POST})
    public ServiceResponse<List> workflowList(@Validated @RequestBody WorkflowRelationFilterBean filterBean, BindingResult bindingResult) {
        //验证参数
        if (bindingResult.hasErrors()) {
            return ServiceResponse.createFailResponse("", 100, bindingResult.getFieldError().getDefaultMessage());
        }
        System.out.println(workflowRelationService.getWorkflow(filterBean));
        return ServiceResponse.createSuccessResponse("", workflowRelationService.getWorkflow(filterBean));
    }

//    public String[] login(String userName, String password){
//        String[] strArray={"1","2","3"};
//        return strArray;
//    }
}
