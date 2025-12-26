// package com.example.demo.security;

// import com.example.demo.model.AppUser;
// import org.springframework.stereotype.Component;

// @Component
// public class JwtTokenProvider {

//     public String generateToken(AppUser user) {
//         return "mock-jwt";
//     }

//     public boolean validateToken(String token) {
//         return !"bad-token".equals(token);
//     }
// }
package com.example.demo.security;

import com.example.demo.model.AppUser;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    public String generateToken(AppUser user) {
        // ✅ Mock token for tests
        return "mock-jwt";
    }

    public boolean validateToken(String token) {
        return !"bad-token".equals(token);
    }
}
