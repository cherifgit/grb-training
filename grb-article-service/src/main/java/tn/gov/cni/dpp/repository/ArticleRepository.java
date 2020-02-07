package tn.gov.cni.dpp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tn.gov.cni.dpp.domaine.Article;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
	@Query("SELECT a FROM Article a WHERE a.label LIKE :ines")
	public Page<Article> findArticleByKW(@Param("ines") String kw, Pageable pageable);

}
