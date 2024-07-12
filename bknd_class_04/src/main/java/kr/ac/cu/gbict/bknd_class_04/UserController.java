package kr.ac.cu.gbict.bknd_class_04;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/user/{userId")
    public Optional<User> getUser(@PathVariable("userid") Long userId) {
        return this.userRepository.findById(userId);
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User entity, HttpServletRequest response) {
        User user = this.userRepository.save(entity);
        return this.userRepository.save(entity);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User entity) {
        entity.setId(userId);
        return this.userRepository.save(entity);
    }

    
}
