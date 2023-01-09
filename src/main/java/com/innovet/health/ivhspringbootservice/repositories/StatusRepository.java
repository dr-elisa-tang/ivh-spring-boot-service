package com.innovet.health.ivhspringbootservice.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.innovet.health.ivhspringbootservice.entities.Status;

public interface StatusRepository extends CrudRepository<Status, Long>
{
    @Query(value = "select status_id, status_code, status_type, status from ivh.status " +
                    " where upper(trim(status_type)) = upper(trim(:statusType)) " +
                    " and upper(status) like upper(:status)", nativeQuery = true)
    Status getStatusByStatusTypeAndStatus(String statusType, String status);
}