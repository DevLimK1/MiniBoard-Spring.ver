package kr.co.devlimk1.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.devlimk1.beans.BoardInfoBean;
import kr.co.devlimk1.mapper.TopMenuMapper;

@Repository
public class TopMenuDao {
	@Autowired
	private TopMenuMapper topMenuMapper;
	
	public List<BoardInfoBean> selectTopMenuList(){
		List<BoardInfoBean> topMenuList=topMenuMapper.selectTopMenuList();
		return topMenuList;
	}
}
