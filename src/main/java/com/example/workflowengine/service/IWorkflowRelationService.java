package com.example.workflowengine.service;

import com.example.workflowengine.model.bean.WorkflowRelationFilterBean;
import java.util.List;

/**
 * @author deray.wang
 * @date 2019/6/21 15:49
 */
public interface IWorkflowRelationService {
    List getWorkflow(WorkflowRelationFilterBean filterBean);
}
