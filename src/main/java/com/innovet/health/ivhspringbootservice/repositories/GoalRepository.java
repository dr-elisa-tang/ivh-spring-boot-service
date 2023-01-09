package com.innovet.health.ivhspringbootservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.innovet.health.ivhspringbootservice.entities.Goal;

public interface GoalRepository extends CrudRepository<Goal, Long>
{
    
}