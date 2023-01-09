package com.innovet.health.ivhspringbootservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovet.health.ivhspringbootservice.entities.Goal;
import com.innovet.health.ivhspringbootservice.repositories.GoalRepository;

@Service
public class GoalService
{
    @Autowired
    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository)
    {
        this.goalRepository = goalRepository;
    }

    public void createGoals(List<Goal> goals)
    {
        goalRepository.saveAll(goals);
    }    
}