package cn.javareview.ssm.mapper;

import cn.javareview.ssm.po.Items;
import cn.javareview.ssm.po.ItemsCustom;
import cn.javareview.ssm.po.ItemsExample;
import cn.javareview.ssm.po.ItemsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}