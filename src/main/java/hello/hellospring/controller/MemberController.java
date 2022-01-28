package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {


    //Controller에 등록하여 사용(1개만 가능, New 불필요)
    private final MemberService memberService;

   /*
    private  MemberService memberService;
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    // memberservice Contoller에 연결
    //@Autowired
    //Command : Command + N
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    


}
