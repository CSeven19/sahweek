package cn.javareview.ssm.mapper;

import java.util.List;

import cn.javareview.ssm.po.JapaneseLanguageList;
import cn.javareview.ssm.po.JapaneseLanguageListQueryVo;

public interface JapaneseLanguageListMapper {
	List<JapaneseLanguageList> SelectAllList(JapaneseLanguageListQueryVo japaneseLanguageListQueryVo);
}
