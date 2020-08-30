package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Melvyn on 26/Aug/2020
 */

/*
    // Put 'IndexController' Class.
    // -----------------------------
    // Demonstrating using JPA to find a record in the database.
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController (CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
*/
/*
        // Put in 'getIndexPage() method.
        // ------------------------------
        // Demonstrating using JPA to find a record in the database.
        Optional<Category> categoryOptional = categoryRepository.findByDescription ("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription ("Teaspoon");

        // Returns '-1' to show nothing was found.
        System.out.println("Cat ID is: " + categoryOptional
                .map(category -> categoryOptional.get().getId())
                .orElse(-1L));
        // Returns '-1' to show nothing was found.
        System.out.println("Uom ID is: " + unitOfMeasureOptional
                .map(unitOfMeasure -> unitOfMeasureOptional.get().getId())
                .orElse(-1L));
*/
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug ("Getting the index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}

