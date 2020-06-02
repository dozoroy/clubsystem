//package com.lyh.ssm.crud.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 基础返回类型，
// * messages 用于保存返回的信息
// * level 用于保存信息的级别
// * Level 为枚举类型
// */
//public class BaseModel {
//    private List<String> messages = new ArrayList<String>();
//    private Level level = Level.info;
//    private Boolean success = true;
//
//    public Boolean getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(Boolean success) {
//        this.success = success;
//    }
//
//    public List<String> getMessages() {
//        return messages;
//    }
//
//    public void setMessages(List<String> messages) {
//        this.messages = messages;
//    }
//
//    public Level getLevel() {
//        return level;
//    }
//
//    public void setLevel(Level level) {
//        this.level = level;
//    }
//
//    public enum Level {
//        info,
//        warn,
//        error
//    }
//
//    public void addMessage(String message) {
//        this.messages.add(message);
//    }
//}
