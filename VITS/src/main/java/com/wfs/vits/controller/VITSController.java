package com.wfs.vits.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.excelupload.service.ExcelUpload;
import com.wfs.vits.UserService;
import com.wfs.vits.dao.User;

@Controller
@RequestMapping("vits")
public class VITSController {
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public String index(Model model) {
		ModelAndView mv = new ModelAndView("index");
		List<User> userList = userService.findUser();
		for(User user: userList) {
			System.out.println(user.getName()+" "+ user.getEmail());
		}
		return "index";
	}
	@GetMapping("/editor")
	public String editor(Model model) {
		ModelAndView mv = new ModelAndView("htmlEditor");
		List<User> userList = userService.findUser();
		for(User user: userList) {
			System.out.println(user.getName()+" "+ user.getEmail());
		}
		return "htmlEditor";
	}
	
	@GetMapping("/fileuploadview")
	public String uploadFile(Model model) {
		ModelAndView mv = new ModelAndView("htmlEditor");
		List<User> userList = userService.findUser();
		for(User user: userList) {
			System.out.println(user.getName()+" "+ user.getEmail());
		}
		return "fileuploader";
	}
	
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String submit(@RequestParam("file") final MultipartFile file, final ModelMap modelMap) {
		File convFile = new File(file.getOriginalFilename());
	    try {
			convFile.createNewFile();
			 FileOutputStream fos = new FileOutputStream(convFile);
			 fos.write(file.getBytes());
			 new ExcelUpload(convFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		
        modelMap.addAttribute("file", file);
        return "fileUploadView";
    }
	
	
}
