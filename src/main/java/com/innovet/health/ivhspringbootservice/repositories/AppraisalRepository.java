package com.innovet.health.ivhspringbootservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.innovet.health.ivhspringbootservice.entities.Appraisal;

public interface AppraisalRepository extends CrudRepository<Appraisal, Long>
{
    List<Appraisal> findAll();

    @Query(value = "select * from ivh.appraisal where year = :year", nativeQuery = true)
    List<Appraisal> GetAppraisalsByYear(Integer year);
}