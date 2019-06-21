package com.example.workflowengine.service.impl;

import com.example.workflowengine.model.bean.WorkflowRelationFilterBean;
import com.example.workflowengine.model.entity.WorkflowRelation;
import com.example.workflowengine.repository.WorkflowRelationRepository;
import com.example.workflowengine.service.IWorkflowRelationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import javax.persistence.criteria.Predicate;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author deray.wang
 * @date 2019/6/21 15:53
 */
@Service
public class WorkflowRelationServiceImpl implements IWorkflowRelationService {
    @Autowired
    private WorkflowRelationRepository workflowRelationRepository;
    @Override
    public List getWorkflow(WorkflowRelationFilterBean filterBean){
        Specification<WorkflowRelation> specification = getSpecification(filterBean);
        List<WorkflowRelation> workflowRelations = new ArrayList<>();
        workflowRelations = workflowRelationRepository.findAll(specification);
        return workflowRelations;
    }

    private Specification<WorkflowRelation> getSpecification(WorkflowRelationFilterBean filterBean) {
        return (root, query, cb) -> {
            List<Predicate> list = new ArrayList<>();
            //
            if (filterBean.getWorkflowSid()!=null) {
                list.add(cb.equal(root.get("workflowSid"), filterBean.getWorkflowSid()));
            }
//            if (filterBean.getDisplayTag()!=null && filterBean.getDisplayTag()>0) {
//                list.add(cb.equal(root.get("displayTag"), filterBean.getDisplayTag()));
//            }
//            // 客户类型
//            if (filterBean.getCustType()!=null && filterBean.getCustType()>0 ) {
//                list.add(cb.equal(root.get("custType"), filterBean.getCustType()));
//            }

            list.add(cb.equal(root.get("status"), 1));

            Predicate[] p = new Predicate[list.size()];

            return cb.and(list.toArray(p));
        };
    }
}
