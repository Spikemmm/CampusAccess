package com.example.campusaccess.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.campusaccess.entity.NocvData;
import com.example.campusaccess.service.IndexService;
import com.example.campusaccess.vo.DataView;
import com.example.campusaccess.vo.NocvDataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChinaDataAdminController {

    @Autowired
    private IndexService indexService;
    //跳转页面
    @RequestMapping("toChinaManager")
    public String toChinaData(){
        return "admin/chinadatamanager";

    }

    /**
     * 模糊查询 带有分页
     * @return
     */
    @RequestMapping("/listDataByPage")
    @ResponseBody
    public DataView listDataByPage(NocvDataVo nocvDataVo){
        // 1.创建分页的对象 当前页 每页限制大小
        IPage<NocvData> page = new Page<>(nocvDataVo.getPage(),nocvDataVo.getLimit());
        // 2.创建模糊查询条件
        QueryWrapper<NocvData> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(!(nocvDataVo.getName() == null),"name",nocvDataVo.getName());
        // 3.疫情数据确诊最多的排在最上面
        queryWrapper.orderByDesc("value");
        // 4.查询数据库
        indexService.page(page,queryWrapper);
        // 5.返回数据封装
        DataView dataView = new DataView(page.getTotal(),page.getRecords());

        return dataView;

    }
}
