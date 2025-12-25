// package com.example.demo.service.impl;

// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.AuthResponse;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.model.AppUser;
// import com.example.demo.model.UserRole;
// import com.example.demo.repository.AppUserRepository;
// import com.example.demo.security.JwtTokenProvider;
// import com.example.demo.service.AuthService;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;

// @Service
// public class AuthServiceImpl implements AuthService {
    
//     private final AppUserRepository userRepository;
//     private final PasswordEncoder passwordEncoder;
//     private final JwtTokenProvider jwtTokenProvider;
    
//     public AuthServiceImpl(AppUserRepository userRepository, PasswordEncoder passwordEncoder,
//                           JwtTokenProvider jwtTokenProvider) {
//         this.userRepository = userRepository;
//         this.passwordEncoder = passwordEncoder;
//         this.jwtTokenProvider = jwtTokenProvider;
//     }
    
//     @Override
//     public AuthResponse register(RegisterRequest request) {
//         if (userRepository.findByEmail(request.getEmail()).isPresent()) {
//             throw new IllegalArgumentException("Email already exists");
//         }
        
//         AppUser user = AppUser.builder()
//                 .email(request.getEmail())
//                 .password(passwordEncoder.encode(request.getPassword()))
//                 .role(UserRole.CLINICIAN)
//                 .build();
        
//         AppUser saved = userRepository.save(user);
//         String token = jwtTokenProvider.createToken(saved.getEmail(), saved.getRole().name());
        
//         return AuthResponse.builder()
//                 .token(token)
//                 .email(saved.getEmail())
//                 .build();
//     }
    
//     @Override
//     public AuthResponse login(AuthRequest request) {
//         AppUser user = userRepository.findByEmail(request.getEmail())
//                 .orElseThrow(() -> new RuntimeException("not found"));
        
//         if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
//             throw new RuntimeException("Invalid credentials");
//         }
        
//         String token = jwtTokenProvider.createToken(user.getEmail(), user.getRole().name());
        
//         return AuthResponse.builder()
//                 .token(token)
//                 .email(user.getEmail())
//                 .build();
//     }
// }
@Service
public class AuthServiceImpl implements AuthService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public AuthServiceImpl(
            PasswordEncoder passwordEncoder,
            UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public AuthResponse register(RegisterRequest request) {

        User user = new User();
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);

        return new AuthResponse(user.getEmail(), user.getFullName(), "Registered");
    }
}
