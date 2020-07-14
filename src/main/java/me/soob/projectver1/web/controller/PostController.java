package me.soob.projectver1.web.controller;

import lombok.RequiredArgsConstructor;
import me.soob.projectver1.domain.post.Post;
import me.soob.projectver1.service.post.PostService;
import me.soob.projectver1.web.dto.PostInsertRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public String list() {
        return "post/list";
    }

    @GetMapping("/post/write")
    public String write() {
        return "post/write";
    }

    @PostMapping("/post/write")
    public String write(PostInsertRequestDto requestDto) {
        postService.insertPost(requestDto);
        return "redirect:/";
    }



}
