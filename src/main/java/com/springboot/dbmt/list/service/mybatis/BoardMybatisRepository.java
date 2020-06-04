package com.springboot.dbmt.list.service.mybatis;

import com.springboot.dbmt.list.service.dto.ModelDTO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class BoardMybatisRepository {

    @Resource
    BoardMybatisMapper boardMybatisMapper;
}