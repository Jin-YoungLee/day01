package com.koreait.day01.controller;

import com.koreait.day01.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    //localhost:9090/api/postMethod
    @PostMapping(value = "/postMethod")

    public MultiParam postMethod(@RequestBody MultiParam multiParam) {

        return multiParam;
    }

    @PutMapping("/putMethod")
    public void put() {

    }

    @PatchMapping("/patchMethod")
    public void patch() {

    }
    

    @DeleteMapping("/deleteMethod")
    public void delete() {

    }


}
