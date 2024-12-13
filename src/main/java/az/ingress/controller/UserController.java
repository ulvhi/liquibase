package az.ingress.controller;

import az.ingress.dao.entity.UserEntity;
import az.ingress.model.request.AddUserRequest;
import az.ingress.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping()
    public void addUser(@RequestBody AddUserRequest request) {
        userService.addUser(request);
    }
    @GetMapping()
    public UserEntity getUserById(@RequestParam String email, @RequestParam String password) {
        return userService.getUserByEmailAndPass(email, password);
    }
}
