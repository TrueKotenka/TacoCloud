package com.example.TacoCloud.data;

import com.example.TacoCloud.dto.Ingredient;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
    @Modifying
    @Query("INSERT INTO Ingredient (id, name, type) VALUES (:id, :name, :type)")
    void saveIngredient(@Param("id") String id,
                          @Param("name") String name,
                          @Param("type") String type);
}
