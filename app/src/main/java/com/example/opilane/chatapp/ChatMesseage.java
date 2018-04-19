package com.example.opilane.chatapp;




import java.util.Date;

public class ChatMesseage {
    private String messeageText;
    private String messeageUser;
    private long messeagetime;

    public ChatMesseage(String messeageText, String messeageUser, long messeagetime) {
        this.messeageText = messeageText;
        this.messeageUser = messeageUser;
        this.messeagetime = new Date().getTime();
    }

    public ChatMesseage(){}

    public String getMesseageText() {
        return messeageText;
    }

    public void setMesseageText(String messeageText) {
        this.messeageText = messeageText;
    }

    public String getMesseageUser() {
        return messeageUser;
    }

    public void setMesseageUser(String messeageUser) {
        this.messeageUser = messeageUser;
    }

    public long getMesseagetime() {
        return messeagetime;
    }

    public void setMesseagetime(long messeagetime) {
        this.messeagetime = messeagetime;
    }
}
