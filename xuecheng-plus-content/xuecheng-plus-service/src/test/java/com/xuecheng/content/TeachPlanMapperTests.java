package com.xuecheng.content;

import com.xuecheng.content.mapper.TeachplanMapper;
import com.xuecheng.content.model.dto.TeachplanDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * author 25426
 * version 1.0
 * description TODO
 * date 2023/11/29 8:54
 */
@SpringBootTest
public class TeachPlanMapperTests {

    @Autowired
    TeachplanMapper teachplanMapper;

    @Test
    public void testTeachplanMapper(){
        List<TeachplanDto> teachplanDtos = teachplanMapper.selectTreeNodes(25);
        System.out.println(teachplanDtos);
    }

}
