package com.innovet.health.ivhspringbootservice.entities;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long EmployeeId;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "start_date")
    private Date StartDate;

	@Column(name = "supervisor_id")
	private Long SupervisorId;

    @Column(name = "is_team_member")
    private Boolean IsTeamMember;

    @Column(name = "is_supervisor")
    private Boolean IsSupervisor;

    @Column(name = "is_administrator")
    private Boolean IsAdministrator;

    @Column(name = "is_executive")
    private Boolean IsExecutive;

    @Column(name = "has_timesheet")
    private Boolean HasTimesheet;
	
    public Long getEmployeeId()
    {
        return EmployeeId;
    }
	
	public String getLastName()
	{
		return LastName;
	}

    public void setLastName(String lastName)
	{
        this.LastName = lastName;
    }

	public String getFirstName()
	{
		return FirstName;
	}

    public void setFirstName(String firstName)
	{
        this.FirstName = firstName;
    }

	public Date getStartDate()
	{
		return StartDate;
	}

    public void setStartDate(Date startDate)
	{
        this.StartDate = startDate;
    }
	
	public Long getSupervisorId()
	{
		return SupervisorId;
	}

    public void setSupervisorId(Long supervisorId)
	{
        this.SupervisorId = supervisorId;
    }

    public Boolean getIsTeamMember()
    {
        return IsTeamMember;
    }

    public void setIsTeamMember(Boolean isTeamMember)
	{
        this.IsTeamMember = isTeamMember;
    }

    public Boolean getIsSupervisor()
    {
        return IsSupervisor;
    }

    public void setIsSupervisor(Boolean isSupervisor)
	{
        this.IsSupervisor = isSupervisor;
    }

    public Boolean getIsAdministrator()
    {
        return IsAdministrator;
    }

    public void setIsAdministrator(Boolean isAdministrator)
	{
        this.IsAdministrator = isAdministrator;
    }

    public Boolean getIsExecutive()
    {
        return IsExecutive;
    }

    public void setIsExecutive(Boolean isExecutive)
	{
        this.IsExecutive = isExecutive;
    }

    public Boolean getHasTimesheet()
    {
        return HasTimesheet;
    }

    public void setHasTimesheet(Boolean hasTimesheet)
	{
        this.HasTimesheet = hasTimesheet;
    }
}