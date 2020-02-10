package com.report.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="jabatan")
public class Jabatan {

    @Id
    @Column(name="jabatan_id")
    private String jabatanId;

    @Column(name = "jabatan_name")
    private String jabatanName;

    @Column(name="created_by")
    private String createdBy;

    @Column(name = "created_date")
    private String createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private String updatedDate;
}
