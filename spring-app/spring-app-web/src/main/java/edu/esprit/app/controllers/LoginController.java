package edu.esprit.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.esprit.app.entities.Product;
import edu.esprit.app.entities.User;
import edu.esprit.app.service.IProductService;
import edu.esprit.app.service.IUserService;

@Controller
public class LoginController {

	@Autowired
	private IUserService userService;
	
	@Autowired
	private IProductService productService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login")
	public String loadLoginPage(Model model) {

		model.addAttribute("user", new User());

		return "login";
	}

	@RequestMapping(value = "/doLogin")
	public String doLogin(Model model, String firstName, String lastName) {

		model.addAttribute("user", new User());
		
		if (userService.authenticateUser(firstName, lastName)) {
			model.addAttribute("product", new Product());
			model.addAttribute("products",productService.findAllProduct() );
			return "home";	
		}

		return "login";
	}

	public IProductService getProductService() {
		return productService;
	}

	public void setProductService(IProductService productService) {
		this.productService = productService;
	}
	
	

}
