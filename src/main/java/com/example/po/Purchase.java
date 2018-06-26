package com.example.po;

import com.example.entiy.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

/**
 * Created  by kzp on 2018/6/26
 * 采购类
 */
@Data
@Entity
public class Purchase extends BaseEntity {

    private String supplier;//供应商

    private Set<Desk> desk;//电脑桌

    private Set<Chair> chair;//电脑椅

    private Date batchNumber;//批次

}
