package com.example.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/prajwal", method = {RequestMethod.GET, RequestMethod.POST})
public class BackendController {

    @GetMapping(path = "/get", produces = "application/json")
    public Map<String, String> helloGet() {
            HashMap<String, String> map = new HashMap<>();
            map.put("Service", "backend");
            map.put("Request", "Get");
            map.put("API-Manager", "WSO2");
            return map;
    }
    
//    @PostMapping(path="/post",consumes = "application/json", produces = "application/json")
//    public Map<String, String> helloPost() {
//            HashMap<String, String> map = new HashMap<>();
//            map.put("Service", "backend");
//            map.put("Request", "Post");
//            map.put("API-Manager", "WSO2");
//            return map;
//    }
}
