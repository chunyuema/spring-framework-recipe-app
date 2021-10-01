package com.chunyue.springrecipeapp.repositories;

import com.chunyue.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
