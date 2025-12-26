// package com.example.demo.model;

// import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// @Entity
// public class AppUser {

//     @Id
//         @GeneratedValue(strategy = GenerationType.IDENTITY)
//             private Long id;

//                 private String email;

//                     private String password;

//                         private String fullName;

//                             @Enumerated(EnumType.STRING)
//                                 private UserRole role;
//                                 }
  package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
    name = "app_user",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
    }
)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String fullName;

    @Enumerated(EnumType.STRING)
    private UserRole role;
}
                              