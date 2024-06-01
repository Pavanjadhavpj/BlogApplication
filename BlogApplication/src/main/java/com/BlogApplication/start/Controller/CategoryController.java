package com.BlogApplication.start.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogApplication.start.Service.CategoryService;
import com.BlogApplication.start.payload.ApiResponse;
import com.BlogApplication.start.payload.CategoryDto;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/")
	public ResponseEntity<CategoryDto> createNewCategory(@RequestBody CategoryDto categoryDto) {
		CategoryDto createCatDto = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<CategoryDto>(createCatDto, HttpStatus.CREATED);
	}

	@PutMapping("/{catId}")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryId,
			@PathVariable Integer catId) {
		CategoryDto updateCategoryDto = this.categoryService.updateCategory(categoryId, catId);
		return new ResponseEntity<CategoryDto>(updateCategoryDto, HttpStatus.OK);
	}

	@DeleteMapping("/{catId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer catId) {
		this.categoryService.deleteCategory(catId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Category is deleted Succesful", true), HttpStatus.OK);
	}

	@GetMapping("/{catId}")
	public ResponseEntity<CategoryDto> getcategory(@PathVariable Integer catId) {
		CategoryDto categoryDto = this.categoryService.getcategory(catId);
		return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
	}
    
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategories(CategoryDto categoryDto) {
		List<CategoryDto> categoryDtos = this.categoryService.getCategories();
		return ResponseEntity.ok(categoryDtos);
	}
}
