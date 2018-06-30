package com.example.po_update;

import com.example.entiy.BaseEntity;
import com.example.enums.DeskAndChairEnum;

import java.util.Date;

/**
 * Created  by kzp on 2018/6/29
 */
public class Asset extends BaseEntity{

    private String officeNum;//办公室编号

    private long typeId;//是电脑桌 椅子 办公室 还是什么

    private String colour;//电脑桌椅的颜色

    private String size;//电脑桌椅的大小

    private DeskAndChairEnum deskAndChairEnum;//对应的电脑桌椅的状态

    private int companyId;//对应公司ID

    private int officeId;//对应的办公室ID

    private int WareHouse;//对应的仓库的ID

    private float price;//价格

    private Date batchNumber;//批次


}
