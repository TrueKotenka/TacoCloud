package com.example.TacoCloud.data;

import com.example.TacoCloud.dto.Ingredient;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
	private final IngredientRepository repo;

	public DataLoader(IngredientRepository repo) {
		this.repo = repo;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		repo.saveIngredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP.toString());
		repo.saveIngredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP.toString());
		repo.saveIngredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN.toString());
		repo.saveIngredient("CARN", "Carnitas", Ingredient.Type.PROTEIN.toString());
		repo.saveIngredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES.toString());
		repo.saveIngredient("LETC", "Lettuce", Ingredient.Type.VEGGIES.toString());
		repo.saveIngredient("CHED", "Cheddar", Ingredient.Type.CHEESE.toString());
		repo.saveIngredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE.toString());
		repo.saveIngredient("SLSA", "Salsa", Ingredient.Type.SAUCE.toString());
		repo.saveIngredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE.toString());
	}
}
