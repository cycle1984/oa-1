package cycle.oa.po;

import java.util.HashSet;
import java.util.Set;

/*
 * 权限组
 */
public class PermissionGroup {

	private Integer id;//主键
	private String name;//名称
	
	private Set<OaUser> oaUsers = new HashSet<OaUser>();//权限组和用户多对多关联
	private Set<OaFunction> permissionGroups = new HashSet<OaFunction>();//权限组和功能点多对多关系
}
