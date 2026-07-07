package org.example;

public class Notification {

    private MessageService messageService;

    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(){
        messageService.sendMessage();
    }
}
