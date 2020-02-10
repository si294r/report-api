package com.report.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="user_id")
    private String userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="name")
    private String name;

    @Column(name="jabatan_id")
    private String jabatanId;

    @Column(name="created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_date")
    private Date updatedDate;
}
