package cycle.oa.po;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门
 * @author Administrator
 *
 */
public class Department {

	private Integer id;//主键
	private String name;//部门名称
	private String tel;//办公室电话
	
	private Department parent;//上级部门
	private Set<OaUser> oaUsers = new HashSet();//部门拥有的用户,一个部门对应多个用户
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Department getParent() {
		return parent;
	}
	public void setParent(Department parent) {
		this.parent = parent;
	}
	public Set<OaUser> getOaUsers() {
		return oaUsers;
	}
	public void setOaUsers(Set<OaUser> oaUsers) {
		this.oaUsers = oaUsers;
	}
	
}
