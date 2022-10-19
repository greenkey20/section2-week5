package com.codestates.section2week5.member;

import java.util.HashMap;
import java.util.Map;

// 2022.10.19(수) 9h55
public class MemberRepository {
    // 클래스 변수
    private static Map<Long, Member> members = new HashMap<>();

    // 인스턴스 메서드
    public void postMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Member getMember(Long memberId) {
        return members.get(memberId);
    }

    public void deleteMember(Long memberId) {
        members.remove(memberId);
    }
}
