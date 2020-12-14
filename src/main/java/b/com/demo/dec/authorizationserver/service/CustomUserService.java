package b.com.demo.dec.authorizationserver.service;

import b.com.demo.dec.authorizationserver.entities.CustomUserDetail;
import b.com.demo.dec.authorizationserver.entities.User;
import b.com.demo.dec.authorizationserver.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.getUserByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        UserDetails customUserDetail = new CustomUserDetail(user.get());
//        CustomUserDetail customUserDetail = new CustomUserDetail(user.get())
//        return User.builder()
//                .username("bau")
//                .password(passwordEncoder.encode("1234"))
//                .roles("admin", "user")
//                .BUILD();
        return customUserDetail;
    }
}
