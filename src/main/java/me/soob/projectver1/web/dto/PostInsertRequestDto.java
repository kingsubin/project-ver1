package me.soob.projectver1.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.soob.projectver1.domain.post.Post;

@Getter
@NoArgsConstructor
public class PostInsertRequestDto {

    private String title;
    private String author;
    private String content;

    @Builder
    public PostInsertRequestDto(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .author(author)
                .content(content)
                .build();
    }

}
