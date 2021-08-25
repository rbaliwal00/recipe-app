package com.example.recipeapp.repostitories;

import com.example.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
