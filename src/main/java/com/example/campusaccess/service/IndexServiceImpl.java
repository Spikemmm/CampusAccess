package com.example.campusaccess.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.campusaccess.dao.IndexMapper;
import com.example.campusaccess.entity.LineTrend;
import com.example.campusaccess.entity.NocvData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, NocvData> implements IndexService{

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<LineTrend> findSevenData() {
        List<LineTrend> list = indexMapper.findSevenData();
        return list;
    }
}
