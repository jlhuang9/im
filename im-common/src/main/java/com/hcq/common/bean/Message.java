package com.hcq.common.bean;

public class Message {
    //消息id
    private String id;
    //发送时间
    private long fromTimestamp;
    //服务器时间
    private long serverTimestamp;
    //消息
    private String context;
    //发送方
    private String from;
    //接收方
    private String to;
    //0 to个人 ，1 to群
    private int toType;
    //0 普通消息，1 图片消息，2 语音消息，3 视频消息，4 文件消息
    private int msgType;



}
