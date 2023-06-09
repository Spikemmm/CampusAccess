package com.example.campusaccess.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.campusaccess.entity.LineTrend;
import com.example.campusaccess.entity.NocvData;

import java.util.List;

public interface IndexService extends IService<NocvData> {
    List<LineTrend> findSevenData();
}
