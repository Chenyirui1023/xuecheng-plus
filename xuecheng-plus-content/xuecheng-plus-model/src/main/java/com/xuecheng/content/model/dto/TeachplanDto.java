package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * author 25426
 * version 1.0
 * description 课程计划树型结构dto
 * date 2023/11/28 21:59
 */
@Data
@ToString
public class TeachplanDto extends Teachplan {

    //课程计划关联的媒资信息
    private TeachplanMedia teachplanMedia;

    //子结点
    private List<Teachplan> teachPlanTreeNodes;

}
