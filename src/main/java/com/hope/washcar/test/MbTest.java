package com.hope.washcar.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * MBGTest class
 * 
 * @author zhougf
 * @date 2018/08/06
 */
public class MbTest {
    public static void main(String args[])
            throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
           List<String> warnings = new ArrayList<String>();
           boolean overwrite = true;
           MbTest mbTest = new MbTest();
            URL url = mbTest.getClass().getClassLoader().getResource("generatorConfig.xml");
           File configFile = new File(url.getPath());
           ConfigurationParser cp = new ConfigurationParser(warnings);
           Configuration config = cp.parseConfiguration(configFile);
           DefaultShellCallback callback = new DefaultShellCallback(overwrite);
           MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
           myBatisGenerator.generate(null);
    }

}