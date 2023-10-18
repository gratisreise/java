package ch15.sec03.exam02;

import ch07.sec05.exam01.Member;

import java.util.HashSet;
import java.util.Set;

import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();


        //Member 객체 저장
        /*set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));*/

        //저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size());

    }
}
