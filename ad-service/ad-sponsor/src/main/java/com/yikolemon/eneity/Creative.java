package com.yikolemon.eneity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ad_creative")
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "name",nullable = false)
    private String name;

    @Basic
    @Column(name = "type",nullable = false)
    private Integer type;

    @Basic
    @Column(name = "material_type",nullable = false)
    private Integer materialType;

    @Basic
    @Column(name = "height",nullable = false)
    private Integer height;

    @Basic
    @Column(name = "width",nullable = false)
    private Integer width;

    //物料的大小
    @Basic
    @Column(name = "size",nullable = false)
    private Long size;

    //持续的时常，视频不为0
    @Basic
    @Column(name = "duration",nullable = false)
    private Integer duration;

    //审核状态
    @Basic
    @Column(name = "audit_status",nullable = false)
    private Integer auditStatus;

    @Basic
    @Column(name = "url",nullable = false)
    private String url;

    @Basic
    @Column(name = "create_time",nullable = false)
    private Date creatTime;

    @Basic
    @Column(name = "update_time",nullable = false)
    private Date updateTime;

}
