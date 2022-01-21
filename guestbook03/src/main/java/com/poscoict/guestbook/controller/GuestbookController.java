package com.poscoict.guestbook.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.poscoict.guestbook.repository.GuestbookRepository;
import com.poscoict.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookRepository gmaillistRepository;
	
	// index 페이지로 돌아가기
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = gmaillistRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
	// 방명록에 사람 추가하기
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		// 입력이 제대로 되어있을 경우만 삽입이 가능하도록 해준다.
		if(vo.getName()!=null && vo.getPassword()!=null && vo.getMessage()!=null && 
			!vo.getName().equals("") && !vo.getPassword().equals("") && !vo.getMessage().equals("")){
			gmaillistRepository.insert(vo);		
		}
		return "redirect:/";
	}
	
	// 방명록 삭제하기(get 방식으로 deletform으로 이동해준다.)
	@RequestMapping(value = "/delete/{no}", method = RequestMethod.GET)
	public String delete(@PathVariable("no") int no) {
		return "/WEB-INF/views/deleteform.jsp?no=" + no;	
	}
	
	// 방명록 삭제하기(post 방식으로 비밀번호가 일치하면 삭제시킨다.)
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(
			@RequestParam(value="no", required=true, defaultValue="") Integer no,
			@RequestParam(value="password", required=true, defaultValue="") String password) {
		
		GuestbookVo vo = new GuestbookVo();
		vo = gmaillistRepository.selectOne(no);
		
		if(vo.getPassword().equals(password)){
			// 비밀번호가 같아야만 삭제에 성공한다.
			gmaillistRepository.delete(no);
		}
		return "redirect:/";
	}
	
}
