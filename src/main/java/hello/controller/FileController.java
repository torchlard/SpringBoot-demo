package hello.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/file")
public class FileController {
  private static final Logger logger = LoggerFactory.getLogger(FileController.class);

  @RequestMapping(value = "upload")
  @ResponseBody
  public String upload(@RequestParam("roncoFile") MultipartFile file ){
    if (file.isEmpty()){
      return "Empty file";
    }

    String fileName = file.getOriginalFilename();
    logger.info("file uploaded name: " + fileName);

    String suffixName = fileName.substring(fileName.indexOf("."));
    logger.info("suffix name: " + suffixName);

    String filePath = "/home/lkit/tmp/files/";
    fileName = UUID.randomUUID() + suffixName;
    File dest = new File(filePath + fileName);

    if (!dest.getParentFile().exists()){
      dest.getParentFile().mkdirs();
    }
    
    try {
      file.transferTo(dest);
      return "upload success";
    } catch(IOException e){
      e.printStackTrace();
    }

    return "upload failed";  
  }
  
  
}














