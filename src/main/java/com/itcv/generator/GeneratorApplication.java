package com.itcv.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.itcv.generator.util.CommonUtils;
import com.itcv.generator.yaml.CommonConfig;
import com.itcv.generator.config.Config;
import com.itcv.generator.util.YamlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;

import java.io.File;

@Slf4j
@SpringBootConfiguration
public class GeneratorApplication {

    /**
     * 生成 controller、dto、entity、mapper、xml、service、serviceImpl
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        YamlUtils.installYaml();//初始化配置文件
        DbType dbType = Config.DB_TYPE;
        CommonUtils.execute(dbType, CommonConfig.Db.url, CommonConfig.Db.username,
                CommonConfig.Db.password, CommonConfig.Db.driver, CommonConfig.Db.tablePrefixes,
                CommonConfig.Db.tableNames, CommonConfig.packageName, CommonConfig.Db.fieldPrefixes, CommonConfig.Db.commonField);
    }

}
