package cycle.oa.po;
/**
 * 功能点(菜单)
 * @author Administrator
 *
 */

import java.util.HashSet;
import java.util.Set;

public class OaFunction {

	private Integer id;//主键
	private String name;//名称
	private String url;
	
	private OaFunction parent;//上级功能点
	
	private Set<PermissionGroup> permissionGroups = new HashSet<PermissionGroup>();//功能点和权限组多对多关系
}
