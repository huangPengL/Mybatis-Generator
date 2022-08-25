package com.hpl;

import com.hpl.advertise;

public interface advertiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(advertise record);

    int insertSelective(advertise record);

    advertise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(advertise record);

    int updateByPrimaryKey(advertise record);
}