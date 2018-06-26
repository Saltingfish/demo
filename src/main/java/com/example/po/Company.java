package com.example.po;

import com.example.entiy.BaseEntity;

import javax.persistence.Entity;
import java.util.Set;

/**
 * Created  by kzp on 2018/6/26
 */
@Data
@Entity
public class Company extends BaseEntity {

    private Set<Office> offices;//所有办公室

    private Set<WareHouse> wareHouse;//所有仓库
}
