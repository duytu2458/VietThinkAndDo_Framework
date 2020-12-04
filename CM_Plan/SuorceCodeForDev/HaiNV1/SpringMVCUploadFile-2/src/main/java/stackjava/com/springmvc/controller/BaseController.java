package stackjava.com.springmvc.controller;

import java.io.File;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import stackjava.com.springmvc.model.MyFile;

@Controller
public class BaseController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("myFile", new MyFile());

		return "index";
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public ResponseEntity<String> uploadFile(MyFile myFile) {
		try {
			MultipartFile multipartFile = myFile.getMultipartFile();
			String fileName = multipartFile.getOriginalFilename();
			File file = new File("D:/files", fileName);
			multipartFile.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("failed: "+e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}

}
