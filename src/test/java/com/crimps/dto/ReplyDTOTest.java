package com.crimps.dto;

import org.junit.Test;

/**
 * Created by xmcares on 2017/6/16.
 */
public class ReplyDTOTest {
    @Test
    public void testToString() throws Exception {
        ReplyDTO replyDTO = new ReplyDTO();
        replyDTO.setReturn_code(0);
        replyDTO.setReturn_type(100);
//        replyDTO.setReturn_message("\\u8bf7\\u642d\\u5efa\\u81ea\\u5df1\\u7684http\\u670d\\u52a1\\u5668! \\u514d\\u8d39\\u8bd5\\u7528\\u6b21\\u6570\\u5df2\\u7ecf\\u7528\\u5c3d\\uff0c\\u8bf7\\u8054\\u7cfb\\u4f5c\\u8005\\u6388\\u6743\\uff01");
        replyDTO.setReturn_message("呀呀哎呀蛤");
        replyDTO.setAppver(0);
        String str = replyDTO.toString();
        System.out.println(str);
    }

}