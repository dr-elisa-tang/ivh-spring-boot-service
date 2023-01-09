package com.innovet.health.ivhspringbootservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "goal")
public class Goal
{    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "goal_id")
	private Long GoalId;
    
	@Column(name = "employee_id")
	private Long EmployeeId;

	@Column(name = "appraisal_id")
	private Long AppraisalId;
    
	@Column(name = "goal_type_id")
	private Long GoalTypeId;

    @Column(name = "goal")
    private String Goal;
    
	@Column(name = "rating_id")
	private Long RatingId;

	public Long getGoalId()
	{
		return GoalId;
	}
	
	public Long getAppraisalId()
	{
		return AppraisalId;
	}

    public void setAppraisalId(Long appraisalId)
	{
        this.AppraisalId = appraisalId;
    }
	
	public Long getEmployeeId()
	{
		return EmployeeId;
	}

    public void setEmployeeId(Long employeeId)
	{
        this.EmployeeId = employeeId;
    }
	
	public Long getGoalTypeId()
	{
		return GoalTypeId;
	}

    public void setGoalTypeId(Long goalTypeId)
	{
        this.GoalTypeId = goalTypeId;
    }
	
	public String getGoal()
	{
		return Goal;
	}

    public void setGoal(String goal)
	{
        this.Goal = goal;
    }
}