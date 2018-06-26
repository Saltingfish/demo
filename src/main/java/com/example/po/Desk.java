package com.example.po;

import com.example.entiy.BaseEntity;
import com.example.enums.DeskEnum;
import sun.jvm.hotspot.debugger.cdbg.EnumType;

import javax.persistence.Entity;

/**
 * Created  by kzp on 2018/6/26
 */
@Data
@Entity
public class Desk extends BaseEntity {

    private String num;//电脑编号

    private DeskEnum colour;//颜色

    private DeskEnum size;//尺寸

    private DeskEnum status;//状态

    private float price;//价格


}
