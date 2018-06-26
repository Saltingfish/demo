package com.example.po;

import com.example.entiy.BaseEntity;
import com.example.enums.ChairEnum;
import com.example.enums.DeskEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created  by kzp on 2018/6/26
 */
@Data
@Entity
public class Chair extends BaseEntity {

    private String num;//编号

    @Enumerated(EnumType.STRING)
    private ChairEnum colour;//颜色

    @Enumerated(EnumType.STRING)
    private ChairEnum size;//尺寸

    @Enumerated(EnumType.STRING)
    private ChairEnum status;//状态

    private float price;//价格


}
