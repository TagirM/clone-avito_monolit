package com.tagir.api.cloneavito.repositories;

import com.tagir.api.cloneavito.models.Product;
import com.tagir.api.cloneavito.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
