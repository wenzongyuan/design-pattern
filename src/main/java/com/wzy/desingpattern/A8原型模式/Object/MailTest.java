package com.wzy.desingpattern.A8原型模式.Object;

import java.util.List;

public class MailTest implements Cloneable {
    private String ip;
    private  String title;
    private String context;
    private List<String> checkProject;
    @Override
    public MailTest clone() throws CloneNotSupportedException {

        MailTest mail = null;
        mail = (MailTest) super.clone();
        return mail;
    }
    public MailTest(String ip, String title, String context, List <String> checkProject) {
        this.ip = ip;
        this.title = title;
        this.context = context;
        this.checkProject = checkProject;
    }
    public void addCheckProject(String checkProject){
        this.checkProject.add(checkProject);
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public List <String> getCheckProject() {
        return checkProject;
    }
    public void setCheckProject(List <String> checkProject) {
        this.checkProject = checkProject;
    }
    @Override
    public String toString() {
        return this.ip + this.title + this.context + this.checkProject;
    }
}
