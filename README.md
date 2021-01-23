<<<<<<< HEAD
스프링 프로젝트 개발을 위한 첫 단계
=======
>>>>>>> e45ea97db1a4c46e86992047313b48a2c1ff79c7

## 2020 - 01 - 23
### Component 스캔과 Autowired 를 이용한 자동 의존관계 설정
#### 회원 controller가 회원 service와 회원 repository를 사용할 수 있게 해준다. 
    package ToyProject.ToyProject_V1.controller;
    
    import ToyProject.ToyProject_V1.service.MemberService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    
    @Controller
    public class MemberController {
    
        private final MemberService memberService;
    
        @Autowired
        public MemberController(MemberService memberService) {
            this.memberService = memberService;
        }
    }
* 생성자에 @Autowired가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다. 
* 이렇게 객체 의존관계를 외부에서 넣어주는 것을 DI (Dependency Injection) 의존성 주입이라 한다.
-----------

### 메인 홈페이지 작업
#### HomeController 에서 작업을 통해 메인 홈페이지 Mapping 해준다.
    package ToyProject.ToyProject_V1.controller;
    
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    
    @Controller
    public class HomeController {
    
        @GetMapping("/")
        public String home() {
    
            return "home";
        }
    }
* "/"는 홈페이지 메인.