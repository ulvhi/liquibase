package az.ingress.service;

import az.ingress.dao.entity.UserEntity;
import az.ingress.dao.repository.UserRepository;
import az.ingress.model.enums.Status;
import az.ingress.model.request.AddUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceHandler implements UserService {
    private final UserRepository userRepository;

    @Override
    public void addUser(AddUserRequest request) {
        UserEntity builder = UserEntity.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .username(request.getUsername())
                .status(Status.ACTIVE)
                .build();
        userRepository.save(builder);
    }

    @Override
    public UserEntity getUserByEmailAndPass(String email, String password) {
        return userRepository.findByEmailAndPasswordAndStatus(email,password, Status.ACTIVE).orElseThrow(RuntimeException::new);
    }
}
