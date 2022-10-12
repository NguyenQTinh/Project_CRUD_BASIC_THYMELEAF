package com.demo.CRUDBASIC.repositories;

import com.demo.CRUDBASIC.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
