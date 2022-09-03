package com.mikseros.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikseros.springboot.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long>{

}
