package com.example.recipeapp.services;

import java.util.Optional;
import java.util.Set;

import com.example.recipeapp.commands.RecipeCommand;
import com.example.recipeapp.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
	Recipe findById(Long l);
	RecipeCommand saveRecipeCommand(RecipeCommand command);
	RecipeCommand findCommandById(Long l);
	void deleteById(Long idToDelete);
}
