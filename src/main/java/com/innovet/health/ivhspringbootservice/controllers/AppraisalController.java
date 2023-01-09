package com.innovet.health.ivhspringbootservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovet.health.ivhspringbootservice.entities.Appraisal;
import com.innovet.health.ivhspringbootservice.entities.Employee;
import com.innovet.health.ivhspringbootservice.entities.Goal;
import com.innovet.health.ivhspringbootservice.entities.Status;
import com.innovet.health.ivhspringbootservice.models.AppraisalView;
import com.innovet.health.ivhspringbootservice.services.AppraisalService;
import com.innovet.health.ivhspringbootservice.services.EmployeeService;
import com.innovet.health.ivhspringbootservice.services.GoalService;
import com.innovet.health.ivhspringbootservice.services.StatusService;

@RestController
@RequestMapping("/appraisal")
public class AppraisalController
{
    @Autowired
    private final AppraisalService appraisalService;
    private final EmployeeService employeeService;
    private final GoalService goalService;
    private final StatusService statusService;

    public AppraisalController(AppraisalService appraisalService, EmployeeService employeeService, GoalService goalService, StatusService statusService)
    {
        this.appraisalService = appraisalService;
        this.employeeService = employeeService;
        this.goalService = goalService;
        this.statusService = statusService;
    }

    @GetMapping(value = "/initiate/year/{year}")
    public ResponseEntity<List<AppraisalView>> initiateAppraisalsForAllEmployees(
        @PathVariable(name = "year") Integer year)
    {        
        List<Employee> employees = employeeService.getAllEmployees();
        List<Appraisal> appraisals = new ArrayList<Appraisal>();
        List<Goal> goals = new ArrayList<Goal>();
        Appraisal appraisal;
        Goal goal;
        Status status = statusService.getStatusByStatusTypeAndStatus("Appraisal", "Initiated");

        for (Employee e : employees)
        {
            appraisal = new Appraisal();
            
            appraisal.setEmployeeId(e.getEmployeeId());
            appraisal.setStatusId(status.getStatusId());
            appraisal.setYear(year);

            appraisals.add(appraisal);
        }

        appraisalService.createAppraisals(appraisals);

        appraisals = appraisalService.GetAppraisalsByYear(year);

        for (Appraisal a : appraisals)
        {
            goal = new Goal();

            goal.setEmployeeId(a.getEmployeeId());
            goal.setAppraisalId(a.getAppraisalId());
            goal.setGoalTypeId((long) 1);

            goals.add(goal);
            
            goal = new Goal();

            goal.setEmployeeId(a.getEmployeeId());
            goal.setAppraisalId(a.getAppraisalId());
            goal.setGoalTypeId((long) 2);

            goals.add(goal);
            
            goal = new Goal();

            goal.setEmployeeId(a.getEmployeeId());
            goal.setAppraisalId(a.getAppraisalId());
            goal.setGoalTypeId((long) 3);

            goals.add(goal);
        }

        goalService.createGoals(goals);

        return ResponseEntity.ok(appraisalService.getAppraisalViewByYear(year));
    }
    
    @GetMapping("/view/employeeId/{employeeId}")
    public ResponseEntity<List<AppraisalView>> getAppraisalViewByEmployeeId(
        @PathVariable(name = "employeeId") Long employeeId)
    {
        List<AppraisalView> appraisals = appraisalService.getAppraisalViewByEmployeeId(employeeId);
        
        return ResponseEntity.ok(appraisals);
    }
}