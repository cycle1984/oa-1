package cycle.oa.po;

import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.INTERNAL;

/**
 * 角色
 * @author Administrator
 *
 */
public class Role {

	private Integer id;//主键
	private String name;//名称
	
	private Role parent;//上级
	private Set<OaUser> oaUsers = new HashSet<>();//角色和用户是多对多关系
	
}
