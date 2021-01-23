package ToyProject.ToyProject_V1.service;

import ToyProject.ToyProject_V1.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
}
