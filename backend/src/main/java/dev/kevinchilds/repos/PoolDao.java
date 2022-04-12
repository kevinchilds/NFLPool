package dev.kevinchilds.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.kevinchilds.models.Pool;

public interface PoolDao extends JpaRepository<Pool, Integer>{
    List<Pool> findAllByUserId(Integer id);
}
