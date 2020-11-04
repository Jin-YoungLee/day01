package com.koreait.day01.controller;

import com.koreait.day01.model.MultiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api") //localhost:9090/api
public class GetController {
    //localhost:9090/api/getMethod
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")

    public String getRequest() {
        //path가 이름이 된다. (/getMethod)
        return "getMethod() 호출!";
    }

    //localhost:9090/api/getParameter?id=apple&password=1234
    @GetMapping("/getParameter")
    public String getPara(@RequestParam String id, @RequestParam String password) {
        System.out.println("id :" + id);
        System.out.println("password :" + password);
        return "getPara() 호출";
    }

    /*
     * id
     * name
     * email
     * age
     * */
    //localhost:9090/api/getMultiParameter?id=apple&name=김사과&email=apple@apple.com&age=20
    @GetMapping("/getMultiParameter")
//    public String getMultiPara(
//            @RequestParam String id,
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam int age
//    ) {
//        System.out.println("id : " + id);
//        System.out.println("name : " + name);
//        System.out.println("email : " + email);
//        System.out.println("age : " + age);
//        return "OK";
//    }

    public MultiParam getMultiPara(MultiParam multiParam) {
        System.out.println("id : " + multiParam.getId());
        System.out.println("name : " + multiParam.getName());
        System.out.println("email : " + multiParam.getEmail());
        System.out.println("age : " + multiParam.getAge());
        return multiParam;
    }

}
