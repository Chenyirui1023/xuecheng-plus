package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * author 25426
 * version 1.0
 * description 课程分类接口
 * date 2023/11/28 9:26
 */
public interface CourseCategoryService {

    /**
     * 查询课程分类
     * @param 根节点id
     * @return 返回课程分类
     */
    List<CourseCategoryTreeDto> queryTreeNodes(String id);

}
