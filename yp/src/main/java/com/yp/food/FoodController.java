package com.yp.food;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
public class FoodController {

    @RequestMapping(method = RequestMethod.GET, path = "/findFood/{mainIngredient}")
    public ResponseEntity<List<Food>> findFood(@PathVariable("mainIngredient")  String mainIngredient) {
        if(mainIngredient.equalsIgnoreCase("Potato")){
            return ok(getPotatoDishes());
        } else {
            return ok(Arrays.asList(new Food()));
        }
    }

    private List<Food> getPotatoDishes() {
        Food food = new Food();
        food.setName("Aloo Do Pyaza");
        List<Food> foodList = new ArrayList<>();
        foodList.add(food);
        food = new Food();
        food.setName("Gobhi Aloo");
        foodList.add(food);
        return foodList;
    }

}
