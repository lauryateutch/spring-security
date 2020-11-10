package org.enset.service;

import org.enset.dao.RoleRepository;
import org.enset.dao.UserRepository;
import org.enset.entities.Role;
import org.enset.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Secured(value={"ROLE_ADMIN"})
public class UserRestService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(value = "/addUser")
    public User save(User user){
        return userRepository.save(user);
    }

    @RequestMapping(value = "/findUsers")
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @RequestMapping(value = "/addRole")
    public Role saveRle(Role role){
        return roleRepository.save(role);
    }

    @RequestMapping(value = "/findRoles")
    public List<Role> findRoles(){
        return roleRepository.findAll();
    }

    @RequestMapping(value = "/addRoleToUser")
    public User addRoleToUser(String username, String role){
        User user= userRepository.findById(username).get();
        Role role1= roleRepository.findById(role).get();
        user.getRoles().add(role1);
        userRepository.save(user);
        return user;
    }

}
