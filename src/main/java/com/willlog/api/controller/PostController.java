package com.willlog.api.controller;

import com.willlog.api.request.PostCreate;
import com.willlog.api.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    //Http Method
    //GET,POST, PUT, PATH, DELETE, OPTIONS, HEAD, TRACE, CONNECT
    //글등록
    //POST Method

    private final PostService postService;
  @PostMapping("/posts")
   public Map<String, String> post(@RequestBody @Valid PostCreate request){
      postService.write(request);
       return Map.of();
   }
}
