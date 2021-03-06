package cn.javareview.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import cn.javareview.ssm.exception.CustomException;
import cn.javareview.ssm.mapper.ItemsMapper;
import cn.javareview.ssm.mapper.ItemsMapperCustom;
import cn.javareview.ssm.mapper.UserMapper;
import cn.javareview.ssm.po.Items;
import cn.javareview.ssm.po.ItemsCustom;
import cn.javareview.ssm.po.ItemsQueryVo;
import cn.javareview.ssm.po.User;
import cn.javareview.ssm.service.ItemsService;

/**
 * 
 * <p>Title: ItemsServiceImpl</p>
 * <p>Description: 商品管理</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2015-4-13下午3:49:54
 * @version 1.0
 */
public class ItemsServiceImpl implements ItemsService{
	
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		//通过ItemsMapperCustom查询数据库
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		
		Items items = itemsMapper.selectByPrimaryKey(id);
		if(items==null){
			throw new CustomException("修改的商品信息不存在!");
		}
		//中间对商品信息进行业务处理
		//....
		//返回ItemsCustom
		ItemsCustom itemsCustom = null;
		//将items的属性值拷贝到itemsCustom
		if(items!=null){
			itemsCustom = new ItemsCustom();
			BeanUtils.copyProperties(items, itemsCustom);
		}
		
		
		return itemsCustom;
		
	}

	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		//添加业务校验，通常在service接口对关键参数进行校验
		//校验 id是否为空，如果为空抛出异常
		
		//更新商品信息使用updateByPrimaryKeyWithBLOBs根据id更新items表中所有字段，包括 大文本类型字段
		//updateByPrimaryKeyWithBLOBs要求必须转入id
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustom);
	}

	@Override
	public Integer selectByPrimaryKey() throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey();
	}

	@Override
	public void insertSelective(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
