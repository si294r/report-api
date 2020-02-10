package com.report.api.repositories;

import com.report.api.entity.Report;
import com.report.api.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, String> {

    public List<Report> findByStatusApproval(String status);

    @Query(value = "select a.project_id,a.project_name, sum(b.amount) as amount from project a left join report b on a.project_id = b. project_id where b.approval_status = \"approved\"",nativeQuery = true)
    public List<Object[]> getDataResume();
}
