package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description 分页查询参数
 */


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    //当前页码
    private Long pageNo = 1L;

    //每页记录数
    private Long pageSize = 30L;


}
