package com.demo.domain.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="jpa_user")
@NoArgsConstructor
@Data
@IdClass(UserEntityPK.class)
public class UserEntity  {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @NotNull
    @Column(name="user_id",nullable = false,updatable = false)
    private String userId;

    @Column(nullable = false)
    private String password;

    private String userName;

    private String email;

    private String dateOfBirth;

    private LocalDateTime createDateTime = LocalDateTime.now();

//    1:n
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////    @JoinColumn(name = "id")
//    @JoinTable(name = "jpa_notice",joinColumns = @JoinColumn(name = "create_id"))
//    private Collection<BoardEntity> boards = new ArrayList<BoardEntity>();


    @Builder
    public UserEntity(String userId, String password, String userName, String email, String dateOfBirth){
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.email =  email;
        this.dateOfBirth = dateOfBirth;
}

}
