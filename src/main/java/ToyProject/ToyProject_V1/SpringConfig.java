package ToyProject.ToyProject_V1;

import ToyProject.ToyProject_V1.repository.MemberRepository;
import ToyProject.ToyProject_V1.repository.MemoryMemberRepository;
import ToyProject.ToyProject_V1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {

        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
