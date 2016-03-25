package com.github.shiro.chapter.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

/**
 * 
 * @ClassName: IndexController
 * @Description: TODO(默认页面)
 * @author 袁强
 * @date 2016年3月25日 下午3:06:46
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}

}
