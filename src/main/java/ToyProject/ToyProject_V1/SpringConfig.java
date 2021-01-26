package ToyProject.ToyProject_V1;

import ToyProject.ToyProject_V1.repository.JpaMemberRepository;
import ToyProject.ToyProject_V1.repository.MemberRepository;
import ToyProject.ToyProject_V1.repository.MemoryMemberRepository;
import ToyProject.ToyProject_V1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;


@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
