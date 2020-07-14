package me.soob.projectver1.domain.user;

import lombok.Builder;
import lombok.Getter;
import me.soob.projectver1.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter
@Entity
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    @Column
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;


    @Builder
    public User(String email, String name, String password, String picture, Role role) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.picture = picture;
        this.role = role;
    }

}
