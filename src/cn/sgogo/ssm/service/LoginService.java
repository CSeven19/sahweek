package cn.sgogo.ssm.service;

import cn.sgogo.ssm.po.User;

/**
 * 
 * <p>Title: ItemsService</p>
 * <p>Description:商品管理service </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:48:09
 * @version 1.0
 */
public interface LoginService {
	
	//查询user
	public User finduserbyusername(String username) throws Exception;
}
