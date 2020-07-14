package me.soob.projectver1.service.post;

import lombok.RequiredArgsConstructor;
import me.soob.projectver1.domain.post.Post;
import me.soob.projectver1.domain.post.PostRepository;
import me.soob.projectver1.web.dto.PostInsertRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long insertPost(PostInsertRequestDto requestDto) {
        return postRepository.save(requestDto.toEntity()).getId();
    }

}
