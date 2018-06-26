package com.example.po;

import com.example.entiy.BaseEntity;

import javax.persistence.Entity;
import java.util.Set;

/**
 * Created  by kzp on 2018/6/26
 * 仓库
 */
@Data
@Entity
public class WareHouse extends BaseEntity {

    private Set<Desk> desks;//在仓库中的电脑桌

    private Set<Chair> chairs;//在仓库中的电脑椅


}
