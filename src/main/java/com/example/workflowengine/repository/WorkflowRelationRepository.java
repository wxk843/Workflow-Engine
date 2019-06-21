package com.example.workflowengine.repository;

import com.example.workflowengine.model.entity.WorkflowRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author deray.wang
 * @date 2019/6/21 16:00
 */
public interface WorkflowRelationRepository extends JpaRepository<WorkflowRelation,Long>, JpaSpecificationExecutor<WorkflowRelation>{

}
