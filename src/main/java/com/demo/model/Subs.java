package com.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Subs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Reporter> reporterId;
	public Subs() {}
	
	public Subs(Long userId, List<Reporter> reporterId) {
		this.userId = userId;
		this.reporterId = reporterId;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Reporter> getReporterId() {
		return reporterId;
	}
	public void setReporterId(List<Reporter> reporterId) {
		this.reporterId = reporterId;
	}
	
	
}
