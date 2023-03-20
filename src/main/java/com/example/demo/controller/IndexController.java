//package com.example.demo.controller;
//
//import com.example.demo.entity.Paginator;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Map;
//
//@RequiredArgsConstructor
//@Controller
//public class IndexController {
//
//    private final PostService postService;
//
//    private static final Integer POSTS_PER_PAGE = 10;
//    private static final Integer PAGES_PER_BLOCK = 5;
//
//    @GetMapping("/")
//    public String index(Model model, @LoginUser sessionUser user, @RequestParam(value = "page", defaultValue = "1") Integer page){
//
//        // 글 목록 전송
//        model.addAttribute("boardTitle", "자유게시판");
//        model.addAttribute("requestForm", "posts");
//
//        // 페이지네이션
//        try{
//            Paginator paginator = new Paginator(PAGES_PER_BLOCK, POSTS_PER_PAGE, postService.count());
//            Map<String, Object> pageInfo = paginator.getFixedBlock(page);
//
//            model.addAttribute("pageInfo", pageInfo);
//        } catch(IllegalArgumentException e){
//            model.addAttribute("pageInfo", null);
//            System.out.println(e);
////        }
//
//        model.addAttribute("posts", postService.findAllByOrderByIdDesc(page, POSTS_PER_PAGE));
//    }
//}
