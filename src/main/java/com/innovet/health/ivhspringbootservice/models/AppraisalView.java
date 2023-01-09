package com.innovet.health.ivhspringbootservice.models;

import jakarta.persistence.*;

//This is modeled from columns fetched from a CUSTOM QUERY that can be found in the AppraisalViewRepository.java
@Entity
public class AppraisalView
{
	@Id
	@Column(name = "appraisal_id")
	private Long AppraisalId;

	@Column(name = "employee_name")
	private String EmployeeName;

	@Column(name = "supervisor_name")
	private String SupervisorName;

	@Column(name = "year")
	private Integer Year;

	@Column(name = "status_code")
	private String StatusCode;

	@Column(name = "status")
	private String Status;
	
	public Long getAppraisalId()
	{
		return AppraisalId;
	}
	
	public String getEmployeeName()
	{
		return EmployeeName;
	}

	public String getSupervisorName()
	{
		return SupervisorName;
	}

	public Integer getYear()
	{
		return Year;
	}

	public String getStatusCode()
	{
		return StatusCode;
	}

	public String getStatus()
	{
		return Status;
	}
}