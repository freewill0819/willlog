package com.willlog.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Slf4j
@RestController
public class PostController {

    //Http Method
    //GET,POST, PUT, PATH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
    //글등록
    //POST Method

  @PostMapping("/posts")
   public String post(@RequestParam Map<String, String> params){

      log.info("params={}", params);
       return "Hello World";
   }
}
