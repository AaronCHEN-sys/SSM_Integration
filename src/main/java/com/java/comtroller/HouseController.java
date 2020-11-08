package com.java.comtroller;

import com.java.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Description:	   <br/>
 * Date:     2020/11/08 21:24 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     * 查询所有小区信息
     *
     * @return
     */
    @RequestMapping("/getHouse.do")
    @ResponseBody
    public List<Map<String, Object>> getHouse() {
        return houseService.findHouse();
    }
}
