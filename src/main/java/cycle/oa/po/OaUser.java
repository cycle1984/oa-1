package cycle.oa.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 * @author Administrator
 *
 */
public class OaUser {
	
	private Integer id;//主键
	private String username;//用户名
	private String password;//密码
	private String loginName;//登录名
	private String tel;//电话
	private Date birthday;//出生日期
	private String xueli;//学历
	private Integer usertype;//用户类型
	
	private Department department;//所属部门,多个用户对应一个部门,用户和部门是多对一关系
	private Set<Role> roles = new HashSet<Role>();//用户和角色是多对多关系
	private Set<PermissionGroup> oaUsers = new HashSet<PermissionGroup>();//用户和权限组多对多关联

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getXueli() {
		return xueli;
	}

	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	public Integer getUsertype() {
		return usertype;
	}

	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
