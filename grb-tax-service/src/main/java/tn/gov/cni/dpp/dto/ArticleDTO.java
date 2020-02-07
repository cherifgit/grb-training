package tn.gov.cni.dpp.dto;

import java.io.Serializable;

public class ArticleDTO implements Serializable {
	private String label;

	public ArticleDTO() {
	}

	public ArticleDTO(String label) {
		super();
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
