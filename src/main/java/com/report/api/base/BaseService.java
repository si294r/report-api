package com.report.api.base;

import com.report.api.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    @Autowired
    public ReportRepository reportRepository;
}
