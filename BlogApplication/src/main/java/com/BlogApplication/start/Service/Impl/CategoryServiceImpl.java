package com.BlogApplication.start.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogApplication.start.Entities.Category;
import com.BlogApplication.start.Exception.ResourceNotFoundException;
import com.BlogApplication.start.Repository.CategoryRepo;
import com.BlogApplication.start.Service.CategoryService;
import com.BlogApplication.start.payload.CategoryDto;

@Service
public class CategoryServiceImpl implements CategoryService {
    
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category=this.modelMapper.map(categoryDto,Category.class);
		Category saveCategory= this.categoryRepo.save(category);
		return this.modelMapper.map(saveCategory,CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
	  Category category=this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category ","Category Id", categoryId));
	  category.setCategoryTitle(categoryDto.getCategoryTitle());
	  category.setCategoryDescription(categoryDto.getCategoryDescription());
	  Category updateCategory =this.categoryRepo.save(category);
	  
		return this.modelMapper.map(updateCategory,CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
	  Category category=this.categoryRepo.findById(categoryId)
			  .orElseThrow(()-> new ResourceNotFoundException("Category", "Category Id", categoryId));
	  this.categoryRepo.delete(category);
	}

	@Override
	public CategoryDto getcategory(Integer categoryId) {
		Category category=this.categoryRepo.findById(categoryId)
				.orElseThrow(()-> new ResourceNotFoundException("Category","Category Id", categoryId));
		return this.modelMapper.map(category,CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categorys=this.categoryRepo.findAll();
	 List<CategoryDto> categoryDtos=categorys.stream().map((cat)-> this.modelMapper.map(cat,CategoryDto.class )).collect(Collectors.toList());
		return categoryDtos;
	}
	

}
