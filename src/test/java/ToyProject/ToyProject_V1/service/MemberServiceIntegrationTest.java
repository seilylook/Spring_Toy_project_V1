package ToyProject.ToyProject_V1.service;

import ToyProject.ToyProject_V1.domain.Member;
import ToyProject.ToyProject_V1.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceIntegrationTest {

    @Autowired MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입() throws  Exception {

        Member member = new Member();
        member.setName("hello");
    }
}
