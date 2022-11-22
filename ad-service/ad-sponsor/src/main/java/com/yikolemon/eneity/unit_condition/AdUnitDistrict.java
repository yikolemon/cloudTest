package com.yikolemon.eneity.unit_condition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_district")
public class AdUnitDistrict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "unit_id",nullable = false)
    private Long unitId;

    @Basic
    @Column(name = "provience",nullable = false)
    private String provience;

    @Basic
    @Column(name = "city",nullable = false)
    private String city;

    public AdUnitDistrict(Long unitId,String provience,String city){
        this.unitId=unitId;
        this.provience=provience;
        this.city=city;
    }

}
