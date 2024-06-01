package com.BlogApplication.start.Service;
import java.util.List;

import com.BlogApplication.start.payload.CategoryDto;

public interface CategoryService {
  
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
    public void deleteCategory(Integer categoryId);
     
    public CategoryDto getcategory(Integer categoryId);
    
    public List<CategoryDto> getCategories();
}
