package com.codingdojo.languages.controllers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.languages.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
}
