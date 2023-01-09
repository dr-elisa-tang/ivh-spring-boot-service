package com.innovet.health.ivhspringbootservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "appraisal")
public class Appraisal {    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "appraisal_id")
	private Long AppraisalId;
    
	@Column(name = "employee_id")
	private Long EmployeeId;
    
	@Column(name = "status_id")
	private Long StatusId;

	@Column(name = "year")
	private Integer Year;
	
	public Long getAppraisalId()
	{
		return AppraisalId;
	}
	
	public Long getEmployeeId()
	{
		return EmployeeId;
	}

    public void setEmployeeId(Long employeeId)
	{
        this.EmployeeId = employeeId;
    }
	
	public Long getStatusId()
	{
		return StatusId;
	}

    public void setStatusId(Long statusId)
	{
        this.StatusId = statusId;
    }

	public Integer getYear()
	{
		return Year;
	}

    public void setYear(Integer year)
	{
        this.Year = year;
    }
}