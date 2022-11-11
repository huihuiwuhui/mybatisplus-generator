package com.itcv.generator.util;

import com.itcv.generator.yaml.CommonConfig;
import org.springframework.util.ObjectUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

public class YamlUtils {

    public static void installYaml(){
        String userPath = System.getProperty("user.dir");
        InputStream inputStream;
        try {
            File file = new File(userPath+File.separator+"config"+File.separator+"common.yml");
            if(file.exists()){
                 inputStream = new FileInputStream(file);
            }else{
                inputStream =  YamlUtils.class.getClassLoader().getResourceAsStream("common.yml");
            }
            if (Objects.nonNull(inputStream)) {
                Yaml yaml = new Yaml();
                yaml.loadAs(inputStream, CommonConfig.class);
                if(ObjectUtils.isEmpty(CommonConfig.projectPath)){
                    CommonConfig.projectPath = userPath;
                }
                CommonConfig.outputXml = CommonConfig.projectPath+CommonConfig.outputXml;
                CommonConfig.outputDir = CommonConfig.projectPath+CommonConfig.outputDir;
                System.out.println(CommonConfig.outputXml);
            }else {
                System.out.println("配置文件不存在，系统将退出");
                System.exit(0);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
