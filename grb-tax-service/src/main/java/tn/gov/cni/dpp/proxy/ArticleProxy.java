package tn.gov.cni.dpp.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tn.gov.cni.dpp.dto.ArticleDTO;

@FeignClient(name = "article-service")
@RibbonClient(name = "article-service")
public interface ArticleProxy {
	@GetMapping("/articles/{id}")
	ArticleDTO retrieveArticle(@PathVariable("id") Long id);
	
	@GetMapping("/articles/search/findArticleByKW?ines={kw}")
	ArticleDTO retrieveArticleByKW(@PathVariable("kw") String kw);
}
