package com.example.po_update;

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

    private Set<Asset> assets;//采购的资产

}
