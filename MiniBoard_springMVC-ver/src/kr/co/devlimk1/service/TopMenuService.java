package kr.co.devlimk1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.devlimk1.beans.BoardInfoBean;
import kr.co.devlimk1.dao.TopMenuDao;

@Service
public class TopMenuService {
	
	@Autowired
	private TopMenuDao topMenuDao;
	
	public List<BoardInfoBean> getTopMenuList(){
		List<BoardInfoBean> topMenuList=topMenuDao.selectTopMenuList();
		return topMenuList;
	}
}
