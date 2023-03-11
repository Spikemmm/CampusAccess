package com.example.campusaccess.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.campusaccess.entity.LineTrend;
import com.example.campusaccess.entity.NocvData;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IndexMapper extends BaseMapper<NocvData> {
    @Select("select * from line_trend order by create_time desc limit 7")
    List<LineTrend> findSevenData();


}
