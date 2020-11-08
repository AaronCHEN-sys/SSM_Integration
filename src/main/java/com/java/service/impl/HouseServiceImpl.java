package com.java.service.impl;

import com.java.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2020/11/08 21:23 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Service
public class HouseServiceImpl implements com.java.service.HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public List<Map<String, Object>> findHouse() {
        return houseMapper.selectHouse();
    }

}
