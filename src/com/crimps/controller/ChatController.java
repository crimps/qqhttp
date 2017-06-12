package com.crimps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xmcares on 2017/6/12.
 */
@Controller
@RequestMapping("/chat")
public class ChatController {
    @RequestMapping("/hi")
    @ResponseBody
    public Map<String, Object> getUserJson(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", 1);
        map.put("name", "Leytton");
        map.put("university", "DHU");
        return map;
    }
}
