package com.dns.pjdocker8.controller;

import com.dns.pjdocker8.domain.Member;
import com.dns.pjdocker8.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final MemberService memberService;

    @RequestMapping("/")
    public String index(Model model) {


        model.addAttribute("members", memberService.getMembers());
        return "index";
    }

    @PostMapping("/member/join")
    public String save(Member member) {
        log.info("MSG: Member Save");
        log.info(member.getName());
        log.info(member.getPw());
        log.info(member.getEmail());

        memberService.save(member);
        return "redirect:/";
    }

}