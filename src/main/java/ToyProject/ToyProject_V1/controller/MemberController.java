package ToyProject.ToyProject_V1.controller;

import ToyProject.ToyProject_V1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {

        this.memberService = memberService;
    }

    @GetMapping(value = "/members/new")
    public String createForm() {

        return "members/createMemberForm";
    }
}
