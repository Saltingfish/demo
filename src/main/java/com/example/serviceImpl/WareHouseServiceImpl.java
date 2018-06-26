package com.example.serviceImpl;

import com.example.po.WareHouse;
import com.example.repository.WareHouseRepository;
import com.example.service.WareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created  by kzp on 2018/6/26
 */
@Service("wareHouseService")
public class WareHouseServiceImpl implements WareHouseService {

    @Autowired
    private WareHouseRepository wareHouseRepository;


    @Override
    public WareHouse saveCell(WareHouse wareHouse) {
        return wareHouseRepository.save(wareHouse);
    }


}
