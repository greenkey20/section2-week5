package com.codestates.section2week5.member;

// 2022.10.19(수) 10h20
// 테스트 코드를 작성하지 않고, MemberTest이라는 파일에 직접 결과를 출력하여 정상적으로 작동하는지 확인
public class MemberTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        Member member = new Member(0L, "green@codestates.com", "KangGreen", "010-9876-5432");
        memberService.createMember(member);

        Member currentMember = memberService.getMember(0L);

        System.out.println("회원 가입한 유저 = " + member.getName());
        System.out.println("현재 첫번째 유저 = " + currentMember.getName());

        if (member.getName().equals(currentMember.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다"); // 회원 가입이 정상적으로 완료되었음?
        }

        memberService.deleteMember(0L);

        if (memberService.getMember(0L) == null) {
            System.out.println("회원 삭제가 정상적으로 완료되었습니다");
        }
    }
}
