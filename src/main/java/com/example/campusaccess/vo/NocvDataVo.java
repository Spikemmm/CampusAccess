package com.example.campusaccess.vo;

import com.example.campusaccess.entity.NocvData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NocvDataVo extends NocvData {
    private Integer page;
    private Integer limit;
}
