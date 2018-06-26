package com.example.po;

import com.example.entiy.BaseEntity;

import javax.persistence.Entity;
import java.util.Set;

/**
 * Created  by kzp on 2018/6/26
 */
@Data
@Entity
public class Office extends BaseEntity {

    private String num;//办公室号

    private Set<Desk> desks;//对应的电脑桌

    private Set<Chair> chairs;//对应的椅子

}
