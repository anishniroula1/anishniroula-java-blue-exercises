package com.techelevator;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.techelevator.image.Image;
import com.techelevator.image.ImageDAO;
import com.techelevator.logininfo.User;

@Controller
@SessionAttributes("loginuser")
public class FileUploadController {

	@Autowired
	private ImageDAO imageDao;
	
	@RequestMapping (path="/fileupload", method=RequestMethod.GET)
	public String displayFileUploadPage(ModelMap map) {
		if (map.get("loginuser") == null) {
			return "redirect:/login";
		}		
		
		 User user = (User) map.get("loginuser");
		return "fileupload";
		
	}
	/*
	 * Single File Upload
	 */
//	@RequestMapping (path="/fileupload", method=RequestMethod.POST)
//	public String handleFileUpload(Image fileDetail, HttpServletRequest servletRequest, ModelMap map) {
//		
//		//String fileFolderPath = servletRequest.getServletContext().getRealPath("file");
//		String fileFolderPath= "/Users/aniroula/Exercise/Exercise/src/main/webapp/img/image/";
//		File filePath = new File(fileFolderPath);
//		if (!filePath.exists()) {
//			filePath.mkdirs();
//		}
//			
//		File file = new File(fileFolderPath, fileDetail.getImageName());
//		
//		try {
//			fileDetail.getFile().transferTo(file);
//			imageDao.saveImage(fileDetail);
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

//		return "redirect:/complete";
//	
//	}
	
	/*
	 * Multiple File Upload
	 */
	@RequestMapping (path="/fileupload", method=RequestMethod.POST)
	public String handleFileUpload(Image fileDetail,ModelMap map, @RequestParam String userName) {
		
		String fileFolderPath= "/Users/aniroula/Exercise/Exercise/src/main/webapp/upload/file/"+userName;
		File filePath = new File(fileFolderPath);
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
		List<MultipartFile> files = fileDetail.getFile();
        List<String> fileNames = new ArrayList<String>();
        if (null != files && files.size() > 0)
        {
            for (MultipartFile multipartFile : files) {
 
                String fileName = multipartFile.getOriginalFilename();
                fileNames.add(fileName);
 
                File imageFile = new File(fileFolderPath, fileName);
                try
                {
                    multipartFile.transferTo(imageFile);
                    
                    imageDao.saveImage(fileDetail);
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
		

		return "redirect:/complete";
	
	}
	
	
}
