package com.report.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "project")
public class Project {

    @Id
    @Column(name = "project_id")
    private String projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name="created_by")
    private String createdBy;

    @Column(name = "created_date")
    private String createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private String updatedDate;

}
