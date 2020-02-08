package com.demo.domain.repository;

import com.demo.domain.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {
    List<BoardEntity> findAll();
}
