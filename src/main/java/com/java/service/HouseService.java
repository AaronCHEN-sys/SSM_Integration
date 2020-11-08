package com.java.service;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2020/11/08 21:24 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
public interface HouseService {

    /**
     * 查询所有小区信息
     *
     * @return
     */
    List<Map<String, Object>> findHouse();
}
