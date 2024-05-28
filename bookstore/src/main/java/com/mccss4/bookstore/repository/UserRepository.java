package com.mccss4.bookstore.repository;
import com.mccss4.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
