package com.innovet.health.ivhspringbootservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovet.health.ivhspringbootservice.entities.Status;
import com.innovet.health.ivhspringbootservice.repositories.StatusRepository;

@Service
public class StatusService
{
    @Autowired
    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository)
    {
        this.statusRepository = statusRepository;
    }
    
    public Status getStatusByStatusTypeAndStatus(String statusType, String status)
    {
        return statusRepository.getStatusByStatusTypeAndStatus(statusType, status);
    }
}