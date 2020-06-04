package com.springboot.dbmt.list.web;

import com.springboot.dbmt.list.service.BoardService;
import com.springboot.dbmt.list.service.dto.ModelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {

    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public Map<String, Object> getList() {
        HashMap<String, Object> resultMap= new HashMap<String, Object>();

        return resultMap;
    }
}