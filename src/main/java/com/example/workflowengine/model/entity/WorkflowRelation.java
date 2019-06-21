package com.example.workflowengine.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * WorkflowRelation
 */
@Entity
@Table(name = "workflow_relation")
@ApiModel(value = "征信订单表头", description = "workflow_relation")
@Data
public class WorkflowRelation implements Serializable {

	@ApiModelProperty(value="主键")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//本条记录的唯一标识，主键
	@Column(name = "sid")
	private Long sid;

	//前置节点
	@ApiModelProperty(value="前置节点")
	@Column(name = "start_node")
	private String startNode;

	//后置节点
	@ApiModelProperty(value="后置节点")
	@Column(name = "end_node")
	private String endNode;

	//条件
	@ApiModelProperty(value="条件")
	@Column(name = "condition")
	private String condition;

	@ApiModelProperty(value="Workflow Sid")
	@Column(name = "workflow_sid")
	private Integer workflowSid;

	@ApiModelProperty(value="状态 0 无效 1 有效（默认值）")
	@Column(name = "status")
	private Integer status;

	//创建时间
	@ApiModelProperty(value="创建时间")
	@Column(name = "create_time")
	private Timestamp createTime;
	//更新时间
	@ApiModelProperty(value="更新时间")
	@Column(name = "update_time")
	private Timestamp updateTime;

}
