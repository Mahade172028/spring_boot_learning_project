package com.example.websocketchatroom.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String date;
    private Status status;
    private String message;
}
