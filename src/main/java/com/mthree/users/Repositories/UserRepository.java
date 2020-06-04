package com.mthree.users.Repositories;

import com.mthree.users.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
