package com.innovet.health.ivhspringbootservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.innovet.health.ivhspringbootservice.models.AppraisalView;

public interface AppraisalViewRepository extends CrudRepository<AppraisalView, Long>
{
    //Custom query used for display purposes and references the Appraisals model
    @Query(value = "select a.appraisal_id" +
                        ", e.last_name || ', ' || e.first_name as employee_name" +
                        ", s.last_name || ', ' || s.first_name as supervisor_name" +
                        ", a.year" +
                        ", st.status_code" +
                        ", st.status" +
                    " from ivh.employee e" +
                        " join ivh.supervisor s on e.supervisor_id = s.supervisor_id" +
                        " left join ivh.appraisal a on e.employee_id = a.employee_id" +
                        " join ivh.status st on a.status_id = st.status_id" +
                    " where e.employee_id = :employeeId", nativeQuery = true)
    List<AppraisalView> getAppraisalViewByEmployeeId(Long employeeId);

    @Query(value = "select a.appraisal_id" +
                        ", e.last_name || ', ' || e.first_name as employee_name" +
                        ", s.last_name || ', ' || s.first_name as supervisor_name" +
                        ", a.year" +
                        ", st.status_code" +
                        ", st.status" +
                    " from ivh.employee e" +
                        " join ivh.supervisor s on e.supervisor_id = s.supervisor_id" +
                        " left join ivh.appraisal a on e.employee_id = a.employee_id" +
                        " join ivh.status st on a.status_id = st.status_id" +
                    " where a.year = :year", nativeQuery = true)
    List<AppraisalView> getAppraisalViewByYear(Integer year);
}