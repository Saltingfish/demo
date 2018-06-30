package com.example.po_update;

import com.example.entiy.BaseEntity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import java.util.Set;

/**
 * Created  by kzp on 2018/6/26
 */
@Data
@Entity
public class Company extends BaseEntity {

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Asset> asset;//所有资产




}
