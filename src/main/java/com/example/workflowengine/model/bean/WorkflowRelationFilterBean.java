package com.example.workflowengine.model.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author deray.wang
 * @date 2019/6/21 12:00
 */
@ApiModel("WorkflowRelationFilterBean")
@Data
public class WorkflowRelationFilterBean {
    @ApiModelProperty(value = "workflowSid")
    @NotBlank(message = "workflowSid不能为空")
    private String workflowSid;

}
