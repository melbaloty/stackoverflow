package com.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackoverflow.models.Cateogry;

public interface CateogryRepository extends JpaRepository<Cateogry, Long> {

}
