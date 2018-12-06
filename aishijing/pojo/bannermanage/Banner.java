package com.chuange.aishijing.pojo.bannermanage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 轮播图管理
 */
@Entity
@Table(name="ASJ_BANNER")
public class Banner {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	@Column(nullable=false)
	private String recommendLoc;
	private String linkto;
	private String showterminal;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRecommendLoc() {
		return recommendLoc;
	}
	public void setRecommendLoc(String recommendLoc) {
		this.recommendLoc = recommendLoc;
	}
	public String getLinkto() {
		return linkto;
	}
	public void setLinkto(String linkto) {
		this.linkto = linkto;
	}
	public String getShowterminal() {
		return showterminal;
	}
	public void setShowterminal(String showterminal) {
		this.showterminal = showterminal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Banner(@NotNull String id, String recommendLoc, String linkto, String showterminal, String status) {
		super();
		this.id = id;
		this.recommendLoc = recommendLoc;
		this.linkto = linkto;
		this.showterminal = showterminal;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", recommendLoc=" + recommendLoc + ", linkto=" + linkto + ", showterminal="
				+ showterminal + ", status=" + status + "]";
	}
	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
