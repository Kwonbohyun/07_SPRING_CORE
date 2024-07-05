package com.ohgiraffers.secion01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Member;


public class Application {
    public static void main(String[] args) {

        System.out.println(Member);

        // XML 설정 파일을 기반으로 ApplicationContext 생성
        ApplicationContext context =
                new GenericXmlApplicationContext("section01/xmlconfig.spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member.getPersonalAccount());

        System.out.println(member.getPersonalAccount().deposit(10000));

        System.out.println(member.getPersonalAccount().getBalance());

        System.out.println(member.getPersonalAccount().withDraw(5000));

        System.out.println(member.getPersonalAccount().getBalance());


    }
}
