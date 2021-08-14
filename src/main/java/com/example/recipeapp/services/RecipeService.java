package com.example.recipeapp.services;

import java.util.Set;

import com.example.recipeapp.domain.Recipe;

public interface RecipeService {
	Set<Recipe> getRecipes();
}
