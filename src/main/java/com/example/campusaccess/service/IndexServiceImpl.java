package com.example.campusaccess.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.campusaccess.dao.IndexMapper;
import com.example.campusaccess.entity.NocvData;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, NocvData> implements IndexService{
}
