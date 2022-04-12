package dev.kevinchilds.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import dev.kevinchilds.models.User;

public interface UserDAO extends JpaRepository<User, Integer>{
}
