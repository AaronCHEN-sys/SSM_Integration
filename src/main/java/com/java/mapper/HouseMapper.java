package com.java.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2020/11/08 21:21 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Repository
public interface HouseMapper {

    /**
     * 查询所有小区信息
     *
     * @return
     */
    List<Map<String, Object>> selectHouse();
}
