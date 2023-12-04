package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.BindTeachplanMediaDto;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;

import java.util.List;

/**
 * author 25426
 * version 1.0
 * description 课程基本信息管理业务接口
 * date 2023/11/29 9:02
 */
public interface TeachplanService {
    /**
     * 查询课程计划
     * @param courseId
     * @return
     */
    public List<TeachplanDto> findTeachplanTree(long courseId);

    /**
     * 新增修改课程计划
     * @param teachplanDto  课程计划信息
     * @return void
     */
    public void saveTeachplan(SaveTeachplanDto teachplanDto);

    /**
     * 删除课程计划
     * @param teachplanId
     */
    public void deleteTeachplan(Long teachplanId);

    public void orderByTeachplan(String moveType, Long teachplanId);

    /**
     * @description 教学计划绑定媒资
     * @param bindTeachplanMediaDto
     * @return com.xuecheng.content.model.po.TeachplanMedia
     * @date 2022/9/14 22:20
     */
    public void associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);

    /**
     *  解绑教学计划与媒资信息
     */
    void unassociationMedia(Long teachPlanId, String mediaId);


    Teachplan getTeachplan(Long teachplanId);
}
