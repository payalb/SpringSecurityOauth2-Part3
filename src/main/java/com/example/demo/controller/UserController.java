package com.example.demo.controller;

import java.util.Map;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public Map<String, Object> getData(OAuth2AuthenticationToken token){
		return token.getPrincipal().getAttributes();
	}
}
