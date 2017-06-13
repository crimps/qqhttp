package com.crimps.controller;

import com.crimps.entity.ChatEntity;
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
        return "{\"return_code\":0,\"return_message\":\"[@1243663292] com.shdic.el.httpapi \\u8bf7\\u642d\\u5efa\\u81ea\\u5df1\\u7684http\\u670d\\u52a1\\u5668! \\u514d\\u8d39\\u8bd5\\u7528\\u6b21\\u6570\\u5df2\\u7ecf\\u7528\\u5c3d\\uff0c\\u8bf7\\u8054\\u7cfb\\u4f5c\\u8005\\u6388\\u6743\\uff01\\nAccess Denied\\/Forbidden\",\"appver\":0,\"update_url\":\"\",\"return_type\":99,\"return_img\":\"\"}";
    }
}
