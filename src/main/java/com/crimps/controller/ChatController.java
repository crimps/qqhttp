package com.crimps.controller;

import com.crimps.entity.ChatEntity;
import com.crimps.util.FileUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by crimps on 2017/6/12.
 */
@Controller
@RequestMapping("/chat")
public class ChatController {
    private Log log = LogFactory.getLog("userInfoLog");
    @RequestMapping("/hi")
    @ResponseBody
    public String chat(ChatEntity chatEntity) {
        log.info(chatEntity.getFg() + "#" + chatEntity.getFq() + "#" + chatEntity.getKey());
        String d = "dfd";
        //返回json串必须带有BOM格式
        return FileUtil.addBOM(d);
    }
}
