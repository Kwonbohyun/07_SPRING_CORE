package com.ohgiraffers.common;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {

    private int sequence;
    private String id;
    private String pwd;
    private String name;


    public MemberDTO(String s, String id, String s2) {
    }
}
