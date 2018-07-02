package com.rushedstudio.domino;

import com.rushedstudio.domino.domain.Permission;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.User;
import com.rushedstudio.domino.repository.PermissionRepository;
import com.rushedstudio.domino.repository.RoleRepository;
import com.rushedstudio.domino.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.rushedstudio.domino", "com.rushedstudio.domino.api"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner init(UserRepository userRepository,
//                           RoleRepository roleRepository,
//                           PermissionRepository permissionRepository){
//        return (args) -> {
//            Permission permission1 = new Permission("admin");
//            Permission permission2 = new Permission("user");
//            permissionRepository.save(permission1);
//            permissionRepository.save(permission2);
//
//            Role role1 = new Role("administrator", permission1);
//            Role role2 = new Role("user", permission2);
//            roleRepository.save(role1);
//            roleRepository.save(role2);
//
//            User user1 = new User("user1", "passwd", "firstName", "lastName", "email@gmail.com", role2);
//            userRepository.save(user1);
//        };
//    }
}
