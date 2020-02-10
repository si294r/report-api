package com.report.api.service.impl;

import com.report.api.base.BaseService;
import com.report.api.entity.Report;
import com.report.api.model.Resume;
import com.report.api.service.ReportService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl extends BaseService implements ReportService {

    private static final Logger log = LogManager.getLogger(ReportServiceImpl.class);

    @Override
    public List<Report> getApprovedReport(String status) {
        return reportRepository.findByStatusApproval(status);
    }

    @Override
    public void save(Report report) {
        try{
            reportRepository.save(report);
        }catch (Exception e){
            log.error("error while saving report : "+e.getLocalizedMessage());
        }
    }

    @Override
    public void update(Report report) {

        try{
            Report reportUpdate = reportRepository.getOne(report.getReportId());

            if(reportUpdate != null){

                report.setBeritaAcara(report.getBeritaAcara());
                report.setAmount(report.getAmount());
                report.setApprovedBy(report.getApprovedBy());
                report.setApprovedDate(report.getApprovedDate());
                report.setStatusApproval(report.getStatusApproval());
                report.setProjectId(report.getProjectId());
                report.setReportDate(report.getReportDate());
                report.setTipe(report.getTipe());
                report.setUserId(report.getUserId());
                report.setUpdatedBy(report.getUpdatedBy());
                report.setUpdatedDate(report.getUpdatedDate());

                reportRepository.save(report);
            }

        }catch (Exception e){
            log.error("Error while updating report : "+e.getLocalizedMessage());
        }
    }

    @Override
    public void delete(Report report) {
        try{
            reportRepository.delete(report);
        }catch (Exception e){
            log.error("Error while deleting report : "+e.getLocalizedMessage());
        }
    }

    @Override
    public List<Resume> resumeReport() {

        List<Resume> resume = new ArrayList<>();
        List<Object[]> resumes = reportRepository.getDataResume();

        for(int i=0; i< resumes.size();i++){
            Object[] obj = resumes.get(i);
            Resume dto = new Resume();
            dto.setProjectId(String.valueOf(obj[0]));
            dto.setProjectName(String.valueOf(obj[1]));
            dto.setAmount(String.valueOf(obj[2]));

            resume.add(dto);
        }
        return resume;
    }

}
