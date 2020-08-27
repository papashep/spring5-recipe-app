package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by Melvyn on 26/Aug/2020
 */

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController (CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription ("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription ("Teaspoon");
//        System.out.println ("Cat Id is : " + categoryOptional.get ().getId ());
//        System.out.println ("Uom Id is : " + unitOfMeasureOptional.get ().getId ());

        System.out.println("Cat ID is: " + categoryOptional
                .map(category -> categoryOptional.get().getId())
                .orElse(-1L));

        System.out.println("Uom ID is: " + unitOfMeasureOptional
                .map(unitOfMeasure -> unitOfMeasureOptional.get().getId())
                .orElse(-1L));

        return "index";
    }
}

