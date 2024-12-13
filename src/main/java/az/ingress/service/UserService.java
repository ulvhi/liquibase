package az.ingress.service;

import az.ingress.dao.entity.UserEntity;
import az.ingress.model.enums.Status;
import az.ingress.model.request.AddUserRequest;

public interface UserService {
    void addUser(AddUserRequest request);
    UserEntity getUserByEmailAndPass(String email, String password);
}
