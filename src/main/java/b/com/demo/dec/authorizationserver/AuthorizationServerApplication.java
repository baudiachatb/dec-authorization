package b.com.demo.dec.authorizationserver;

import b.com.demo.dec.authorizationserver.repository.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//@EnableDiscoveryClient
public class AuthorizationServerApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AuthorizationServerApplication.class, args);

        UserRepo userRepo = context.getBean(UserRepo.class);

        PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);


//        jdbcClientDetailsService.addClientDetails();

//        User user = userRepo.findById(1).get();
//        User user1 = userRepo.findById(2).get();
//
//
//        user.setPassword(passwordEncoder.encode("1234"));
//        user1.setPassword(passwordEncoder.encode("1234"));
//        userRepo.save(user);
//        userRepo.save(user1);
    }

}
