package com.innovet.health.ivhspringbootservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovet.health.ivhspringbootservice.entities.Appraisal;
import com.innovet.health.ivhspringbootservice.models.AppraisalView;
import com.innovet.health.ivhspringbootservice.repositories.AppraisalRepository;
import com.innovet.health.ivhspringbootservice.repositories.AppraisalViewRepository;

@Service
public class AppraisalService
{
    @Autowired
    private final AppraisalRepository appraisalRepository;
    private final AppraisalViewRepository appraisalViewRepository;

    public AppraisalService(AppraisalRepository appraisalRepository, AppraisalViewRepository appraisalViewRepository)
    {
        this.appraisalRepository = appraisalRepository;
        this.appraisalViewRepository = appraisalViewRepository;
    }

    public List<Appraisal> getAppraisals()
    {
        return appraisalRepository.findAll();
    }

    public List<Appraisal> GetAppraisalsByYear(Integer year)
    {
        return appraisalRepository.GetAppraisalsByYear(year);
    }

    public void createAppraisals(List<Appraisal> appraisals)
    {
        appraisalRepository.saveAll(appraisals);
    }

    public List<AppraisalView> getAppraisalViewByEmployeeId(Long employeeId)
    {
        return appraisalViewRepository.getAppraisalViewByEmployeeId(employeeId);
    }

    public List<AppraisalView> getAppraisalViewByYear(Integer year)
    {
        return appraisalViewRepository.getAppraisalViewByYear(year);
    }
}