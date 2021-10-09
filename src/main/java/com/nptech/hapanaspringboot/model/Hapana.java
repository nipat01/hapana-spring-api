package com.nptech.hapanaspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection  = "hapana")
public class Hapana {
    @Id
    private String id;

    private String titleName;
    private List<Chat> chat;

    public Hapana() {

    }

    public Hapana(String id, String titleName, List<Chat> chat) {
        this.id = id;
        this.titleName = titleName;
        this.chat = chat;
    }

    public String getId() {
        return id;
    }


    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public List<Chat> getChat() {
        return chat;
    }

    public void setChat(List<Chat> chat) {
        this.chat = chat;
    }


}

 class Chat {
    private String character;
    private String conversation;

    public Chat() {}

     public Chat(String chaaracter, String conversation) {
         this.character = chaaracter;
         this.conversation = conversation;
     }

     public String getCharacter() {
         return character;
     }

     public void setCharacter(String character) {
         this.character = character;
     }

     public String getConversation() {
         return conversation;
     }

     public void setConversation(String conversation) {
         this.conversation = conversation;
     }

     @Override
     public String toString() {
         return "chat{" +
                 "chaaracter='" + character + '\'' +
                 ", conversation='" + conversation + '\'' +
                 '}';
     }
 }