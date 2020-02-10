package com.report.api.controller;

import com.report.api.base.BaseController;
import com.report.api.constant.CommonConstant;
import com.report.api.entity.Report;
import com.report.api.model.ResponseState;
import com.report.api.model.Resume;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/report")
public class ReportController extends BaseController {

    @GetMapping("")
    @ResponseBody
    public List<Report> getAllReport(){
        return reportService.getApprovedReport("approved");
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseState save(Report report){
        ResponseState response = new ResponseState();

        try{
            reportService.save(report);
            response.setState(CommonConstant.RESPONSE_STATUS.OK.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.OK.getValue());
        }catch (Exception e){
            response.setState(CommonConstant.RESPONSE_STATUS.FAILED.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.FAILED.getValue() + " : " + e.getLocalizedMessage());
        }
        return response;
    }

    @PostMapping("/update")
    @ResponseBody
    public ResponseState update(Report report){
        ResponseState response = new ResponseState();

        try{
            reportService.update(report);
            response.setState(CommonConstant.RESPONSE_STATUS.OK.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.OK.getValue());
        }catch (Exception e){
            response.setState(CommonConstant.RESPONSE_STATUS.FAILED.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.FAILED.getValue() + " : " + e.getLocalizedMessage());
        }
        return response;
    }

    @DeleteMapping("/Delete")
    @ResponseBody
    public ResponseState delete(Report report){
        ResponseState response = new ResponseState();

        try{
            reportService.delete(report);
            response.setState(CommonConstant.RESPONSE_STATUS.OK.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.OK.getValue());
        }catch (Exception e){
            response.setState(CommonConstant.RESPONSE_STATUS.FAILED.getValue());
            response.setMessage(CommonConstant.RESPONSE_MSG.FAILED.getValue() + " : " + e.getLocalizedMessage());
        }
        return response;
    }

    @GetMapping("/Resume")
    @ResponseBody
    public List<Resume> getAllDataResume(){
        return reportService.resumeReport();
    }
}
