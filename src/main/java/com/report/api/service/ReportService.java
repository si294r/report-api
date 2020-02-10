package com.report.api.service;

import com.report.api.entity.Report;
import com.report.api.model.Resume;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ReportService {

    public List<Report> getApprovedReport(String status);

    public void save(Report report);

    public void update(Report report);

    public void delete(Report report);

    public List<Resume> resumeReport();
}
