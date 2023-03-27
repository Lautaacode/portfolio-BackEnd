package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Media;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RMedia extends CrudRepository<Media,Long> {
}
