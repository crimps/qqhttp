package com.crimps.dto;

/**
 * Created by xmcares on 2017/6/13.
 */
public class ReplyDTO {
//    {"return_code":0,"return_message":"aaa","appver":0,"update_url":"","return_type":104}
//    return_type=是正整数才会输出，
//    =100时，从return_img取图片的网络地址；
//    =101时，从return_info取QQ音乐的歌曲数字ID
//    return_message=输出的文字

//    {"return_code":0,
// "return_message":"[@1243663292] com.shdic.el.httpapi \u8bf7\u642d\u5efa\u81ea\u5df1\u7684http\u670d\u52a1\u5668! \u514d\u8d39\u8bd5\u7528\u6b21\u6570\u5df2\u7ecf\u7528\u5c3d\uff0c\u8bf7\u8054\u7cfb\u4f5c\u8005\u6388\u6743\uff01\nAccess Denied\/Forbidden",
// "appver":0
// ,"update_url":"",
// "return_type":403,
// "return_img":""}

    private String return_code;
    private String return_message;
    private String appver;
    private String update_url;
    private String return_type;
    private String return_img;

    public String getReturn_img() {
        return return_img;
    }

    public void setReturn_img(String return_img) {
        this.return_img = return_img;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_message() {
        return return_message;
    }

    public void setReturn_message(String return_message) {
        this.return_message = return_message;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getUpdate_url() {
        return update_url;
    }

    public void setUpdate_url(String update_url) {
        this.update_url = update_url;
    }

    public String getReturn_type() {
        return return_type;
    }

    public void setReturn_type(String return_type) {
        this.return_type = return_type;
    }
}
