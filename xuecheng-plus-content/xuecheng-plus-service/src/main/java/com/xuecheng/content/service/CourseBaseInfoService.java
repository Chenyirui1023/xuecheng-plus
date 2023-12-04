package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * author 25426
 * version 1.0
 * description 课程信息管理接口
 * date 2023/11/27 11:15
 */
public interface CourseBaseInfoService {

    /**
     *查询课程列表
     * @param pageParams 分页参数
     * @param courseParamsDto 查询条件
     * @return 返回课程信息列表
     */
    PageResult<CourseBase> queryCourseBaseList(Long companyId,PageParams pageParams, QueryCourseParamsDto courseParamsDto);

    /**
     *新增课程
     * @param companyId 机构id
     * @param addCourseDto 添加课程信息
     * @return 返回课程详细信息
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * 根据课程id查询课程详细信息
     * @param courseId 课程id
     * @return 返回课程详细信息
     */
    CourseBaseInfoDto getCourseBaseInfo(long courseId);

    /**
     * 修改课程
     * @param companyId 机构id
     * @param dto 修改课程信息
     * @return 课程详细信息
     */
    CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

    /**
     * 删除课程
     * @param companyId
     * @param courseId
     */
    void delectCourse(Long companyId, Long courseId);



}
