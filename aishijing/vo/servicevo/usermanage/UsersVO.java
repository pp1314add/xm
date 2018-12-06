package com.chuange.aishijing.vo.servicevo.usermanage;


import java.util.List;

import com.chuange.aishijing.pojo.userManage.UserLable;
import com.chuange.aishijing.pojo.userManage.UserMovie;
import com.chuange.aishijing.vo.CommonResponseVO;

public class UsersVO extends CommonResponseVO{
	private List<UserMovie> movies;
	private List<UserLable> friends;
	private List<UserLable> jobs;
	private List<UserLable> specials;
	
	public List<UserLable> getFriends() {
		return friends;
	}

	public void setFriends(List<UserLable> friends) {
		this.friends = friends;
	}

	public List<UserLable> getJobs() {
		return jobs;
	}

	public void setJobs(List<UserLable> jobs) {
		this.jobs = jobs;
	}

	public List<UserLable> getSpecials() {
		return specials;
	}

	public void setSpecials(List<UserLable> specials) {
		this.specials = specials;
	}

	public List<UserMovie> getMovies() {
		return movies;
	}

	public void setMovies(List<UserMovie> movies) {
		this.movies = movies;
	}
	
}
