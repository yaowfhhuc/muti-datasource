package me.test.database.mapper;

import me.test.database.model.NetElementDevice;

public interface NetElementDeviceMapper {
    int insert(NetElementDevice record);

    int insertSelective(NetElementDevice record);
    
    int selectCount();
}