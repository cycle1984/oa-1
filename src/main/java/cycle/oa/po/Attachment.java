package cycle.oa.po;

import java.util.Date;

/*
 * 附件
 */
public class Attachment {

	private Integer id;//主键
	private String businessId;//业务主键
	private String name;//附件名称
	private String fileId;//返回存储仓库的路径 ，是一个36位的ID
	private Date upload;//上传时间
	private String username;//上传人姓名
	
	private OaUser uploadUser;//上传人
	
}
