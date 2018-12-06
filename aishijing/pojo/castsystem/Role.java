package com.chuange.aishijing.pojo.castsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author yuany
 * 角色表
 */
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ASJ_ROLE")
public class Role {
	@Id
    @NotNull
    @GeneratedValue(generator="system_uuid")
    @GenericGenerator(name="system_uuid",strategy="uuid")
	private String id;
	private String roleName;//角色名称
	private String role;//角色
	private String castname;//所属剧本
	private String sex;//角色性别
	private String age;//角色年龄
	private String roleTag;//角色标签
	private String roleBackground;//角色背景
	private String roleIllustrated;//角色说明
	private String playRequire;//试镜要求
	private String roleStory;//人物小传
	private String directorAttention;//导演关注
	private Integer clickNum;//点击数量
	private Integer playNum;//试镜数量
	private String audioFile;//音频文件
	private String subtitleFile;//字幕文件
	private String roleCategory;//角色分类
	private String scoreDepend;//评分项
	
	public String getScoreDepend() {
		return scoreDepend;
	}
	public void setScoreDepend(String scoreDepend) {
		this.scoreDepend = scoreDepend;
	}
	public String getRoleCategory() {
		return roleCategory;
	}
	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCastname() {
		return castname;
	}
	public void setCastname(String castname) {
		this.castname = castname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRoleTag() {
		return roleTag;
	}
	public void setRoleTag(String roleTag) {
		this.roleTag = roleTag;
	}
	public String getRoleBackground() {
		return roleBackground;
	}
	public void setRoleBackground(String roleBackground) {
		this.roleBackground = roleBackground;
	}
	public String getRoleIllustrated() {
		return roleIllustrated;
	}
	public void setRoleIllustrated(String roleIllustrated) {
		this.roleIllustrated = roleIllustrated;
	}
	public String getPlayRequire() {
		return playRequire;
	}
	public void setPlayRequire(String playRequire) {
		this.playRequire = playRequire;
	}
	public String getRoleStory() {
		return roleStory;
	}
	public void setRoleStory(String roleStory) {
		this.roleStory = roleStory;
	}
	public String getDirectorAttention() {
		return directorAttention;
	}
	public void setDirectorAttention(String directorAttention) {
		this.directorAttention = directorAttention;
	}
	public Integer getClickNum() {
		return clickNum;
	}
	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}
	public Integer getPlayNum() {
		return playNum;
	}
	public void setPlayNum(Integer playNum) {
		this.playNum = playNum;
	}
	public String getAudioFile() {
		return audioFile;
	}
	public void setAudioFile(String audioFile) {
		this.audioFile = audioFile;
	}
	public String getSubtitleFile() {
		return subtitleFile;
	}
	public void setSubtitleFile(String subtitleFile) {
		this.subtitleFile = subtitleFile;
	}
	public Role(@NotNull String id, String roleName, String role, String castname, String sex, String  age,
			String roleTag, String roleBackground, String roleIllustrated, String playRequire, String roleStory,
			String directorAttention, Integer clickNum, Integer playNum, String audioFile, String subtitleFile,
			String roleCategory, String scoreDepend) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.role = role;
		this.castname = castname;
		this.sex = sex;
		this.age = age;
		this.roleTag = roleTag;
		this.roleBackground = roleBackground;
		this.roleIllustrated = roleIllustrated;
		this.playRequire = playRequire;
		this.roleStory = roleStory;
		this.directorAttention = directorAttention;
		this.clickNum = clickNum;
		this.playNum = playNum;
		this.audioFile = audioFile;
		this.subtitleFile = subtitleFile;
		this.roleCategory = roleCategory;
		this.scoreDepend = scoreDepend;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", role=" + role + ", castname=" + castname + ", sex="
				+ sex + ", age=" + age + ", roleTag=" + roleTag + ", roleBackground=" + roleBackground
				+ ", roleIllustrated=" + roleIllustrated + ", playRequire=" + playRequire + ", roleStory=" + roleStory
				+ ", directorAttention=" + directorAttention + ", clickNum=" + clickNum + ", playNum=" + playNum
				+ ", audioFile=" + audioFile + ", subtitleFile=" + subtitleFile + ", roleCategory=" + roleCategory
				+ ", scoreDepend=" + scoreDepend + "]";
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
}
