package kr.co.devlimk1.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.co.devlimk1.beans.BoardInfoBean;

public interface TopMenuMapper {

	@Select("SELECT board_info_idx,board_info_name FROM board_info_table")
	List<BoardInfoBean> selectTopMenuList();
}
