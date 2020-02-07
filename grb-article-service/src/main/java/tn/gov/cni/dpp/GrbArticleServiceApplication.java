package tn.gov.cni.dpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ApplicationContext;

import tn.gov.cni.dpp.domaine.Article;
import tn.gov.cni.dpp.repository.ArticleRepository;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableDiscoveryClient
public class GrbArticleServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GrbArticleServiceApplication.class, args);
		ArticleRepository articleRepository = applicationContext.getBean(ArticleRepository.class);
		
		Article article=new Article("pantallon");
		articleRepository.save(article);

		Article article2=new Article("chemise");
		articleRepository.save(article2);
		
		Article article3=new Article("cravate");
		articleRepository.save(article3);
	}

}
