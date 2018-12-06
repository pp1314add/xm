package com.chuange.aishijing.pojo.bannermanage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 推荐剧本表
 */
@Entity
@Table(name="ASJ_RECOMMENDCAST")
public class RecommendCast {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String castname;
	private String showterminal;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCastname() {
		return castname;
	}
	public void setCastname(String castname) {
		this.castname = castname;
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
	@Override
	public String toString() {
		return "RecommendCast [id=" + id + ", castname=" + castname + ", showterminal=" + showterminal + ", status="
				+ status + "]";
	}
	public RecommendCast(@NotNull String id, String castname, String showterminal, String status) {
		super();
		this.id = id;
		this.castname = castname;
		this.showterminal = showterminal;
		this.status = status;
	}
	public RecommendCast() {
		super();
		// TODO Auto-generated constructor stub
	}
}
