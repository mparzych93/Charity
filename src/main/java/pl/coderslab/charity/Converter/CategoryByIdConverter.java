package pl.coderslab.charity.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.repository.CategoryRepository;

@Component
public class CategoryByIdConverter implements Converter<String, Category> {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryByIdConverter(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category convert(String id) {
        return categoryRepository.findById(Long.parseLong(id));
    }
}
