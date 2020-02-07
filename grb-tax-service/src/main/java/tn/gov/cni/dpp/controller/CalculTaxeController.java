package tn.gov.cni.dpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import tn.gov.cni.dpp.dto.ArticleDTO;
import tn.gov.cni.dpp.proxy.ArticleProxy;

@RestController
public class CalculTaxeController {
	@Autowired
	private ArticleProxy articleProxy;

	@GetMapping("/calcul/{id}")
	public String calculateTaxe(@PathVariable("id") Long id) {
		ArticleDTO articleDTO = articleProxy.retrieveArticle(id);
		if(articleDTO.getLabel().equals("a1")) {
			return "T1";
		}
		else {
			return "T2";
		}
	}
}
