package edu.esprit.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.esprit.app.entities.Product;
import edu.esprit.app.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	private IProductService productService;

	public IProductService getProductService() {
		return productService;
	}

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value="/index")
	public String loadHomePage(Model model){
		
		model.addAttribute("product", new Product());
		model.addAttribute("products",productService.findAllProduct() );
		return "home";		
	}
	
	@RequestMapping(value = "/save")
	public String addProduct(@Valid Product product, BindingResult br,  Model model){
		
		if(br.hasErrors()) {
		
			model.addAttribute("products", productService.findAllProduct());
			return "home";
		}
		
		//Use merge to save or update
		productService.updateProduct(product);;
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.findAllProduct());
		return "home";
	}

	@RequestMapping(value = "/selectForUpdate")
	public String selectForUpdate(@RequestParam("selectedProd") String prodRef, Model model){

		model.addAttribute("product", productService.findProductById(prodRef));
		model.addAttribute("products", productService.findAllProduct());
		return "home";
	}
	
	@RequestMapping(value = "/delete")
	public String deleteProduct(@RequestParam("selectedProd") String prodRef, Model model){

		productService.deleteProduct(prodRef);
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.findAllProduct());
		return "home";
	}
		
	
}
