package com.innovet.health.ivhspringbootservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status
{    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "status_id")
	private Long StatusId;

    @Column(name = "status_code")
    private String StatusCode;

    @Column(name = "status_type")
    private String StatusType;

    @Column(name = "status")
    private String Status;

	public Long getStatusId()
	{
		return StatusId;
	}
	
	public String getStatusCode()
	{
		return StatusCode;
	}

    public void setStatusCode(String statusCode)
	{
        this.StatusCode = statusCode;
    }
	
	public String getStatusType()
	{
		return StatusType;
	}

    public void setStatusType(String statusType)
	{
        this.StatusType = statusType;
    }
	
	public String getStatus()
	{
		return Status;
	}

    public void setStatus(String status)
	{
        this.Status = status;
    }
}