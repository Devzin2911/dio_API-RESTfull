package dio.aulas.domain.service;

import dio.aulas.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
