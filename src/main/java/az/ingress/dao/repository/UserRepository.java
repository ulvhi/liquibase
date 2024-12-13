package az.ingress.dao.repository;

import az.ingress.dao.entity.UserEntity;
import az.ingress.model.enums.Status;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmailAndPasswordAndStatus(String email, String password, Status status);
}
