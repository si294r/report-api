package com.report.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "report")
public class Report {

    @Id
    @Column(name = "report_id")
    private String reportId;

    @Column(name = "berita_acara")
    private String beritaAcara;

    @Column(name="tipe")
    private String tipe;

    @Column(name="amount")
    private Integer amount;

    @Column(name = "project_id")
    private String projectId;

    @Column(name="user_id")
    private String userId;

    @Column(name="created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "report_date")
    private Date reportDate;

    @Column(name = "approved_by")
    private String approvedBy;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "approval_status")
    private String statusApproval;
}
