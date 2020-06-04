package com.springboot.dbmt.list.service;

import com.springboot.dbmt.list.service.dto.ModelDTO;
import com.springboot.dbmt.list.service.mybatis.BoardMybatisRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMybatisRepository boardMybatisRepository;

}