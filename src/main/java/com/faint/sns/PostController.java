package com.faint.sns;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.faint.domain.PostVO;
import com.faint.service.BoardService;


@Controller
@RequestMapping("/post/*")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value = "/register" , method = RequestMethod.GET)
	public void registerGET(PostVO post, Model model) throws Exception {
		logger.info("register get .....");
	}
	
/*	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(PostVO post, Model model)throws Exception {
		logger.info("regist post.......");
		logger.info(post.toString());
		
		service.regist(post);
		
		model.addAttribute("result","success");
		
		//return "/post/success";
		return "redirect:/post/post";
	}*/
	
	@RequestMapping(value ="/register" , method = RequestMethod.POST)
	public String registPOST(PostVO post, RedirectAttributes rttr) throws
	Exception {
		logger.info("regist post...........");
		logger.info(post.toString());
		
		service.regist(post);
		
		rttr.addFlashAttribute("msg","success");
		return "redirect:/post/post";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	  public void listAll(Model model) throws Exception {

	    logger.info("show all list......................");
	    model.addAttribute("list", service.listAll());
	  }
	
	
	
	
	
	
	
}
