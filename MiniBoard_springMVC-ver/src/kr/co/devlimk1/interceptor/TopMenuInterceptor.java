package kr.co.devlimk1.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.devlimk1.beans.BoardInfoBean;
import kr.co.devlimk1.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor {

	// Interceptor는 자동주입을 통해서 Bean을 주입받지 못한다.
	//@Autowired (x)
	// 생성자로 주입받자.
	private TopMenuService topMenuService;
	
	public TopMenuInterceptor(TopMenuService topMenuService) {
			this.topMenuService=topMenuService;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		List<BoardInfoBean> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);

		return true;// 다음 단계 넘어가기 위해 true
	}
}
