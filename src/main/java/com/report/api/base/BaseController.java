package com.report.api.base;

import com.report.api.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    @Autowired
    public ReportService reportService;
}
