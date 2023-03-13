package com.example.campusaccess.controller;

import com.example.campusaccess.service.IndexService;
import com.example.campusaccess.vo.DataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/china")
public class ChinaController {

    @Autowired
    private IndexService indexService;

    /**
     * 删除数据根据ID
     * @param id
     * @return
     */
    @RequestMapping("/deleteById")
    @ResponseBody
    public DataView deleteById(Integer id){
        indexService.removeById(id);
        DataView dataView = new DataView();
        dataView.setCode(200);
        dataView.setMsg("删除中国地图数据成功！");
        return dataView;


    }
}
