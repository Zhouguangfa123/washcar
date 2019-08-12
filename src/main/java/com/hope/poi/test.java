/*
package com.hope.poi;

import com.hope.poi.util.WordUtils;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

*/
/**
 * test
 *
 * @author zhougf
 * @date 2019/8/12
 *//*

public class test {
    private static final String FILE_PATH = "/template/person.docx";
    public static void main(String[] ars) {
        WordUtils wordUtil=new WordUtils();
        Map<String, Object> params = new HashMap<>(4);
        params.put("${name}", "周末人");

        try{
            Map<String,Object> header = new HashMap<>(16);
            header.put("width", 100);
            header.put("height", 150);
            header.put("type", "jpg");
            header.put("content", WordUtils.inputStream2ByteArray(new FileInputStream("C:/Users/Administrator/Desktop/jar包/11.jpg"), true));
            params.put("${header}",header);
            Map<String,Object> header2 = new HashMap<String, Object>();
            header2.put("width", 100);
            header2.put("height", 150);
            header2.put("type", "jpg");
            header2.put("content", WordUtils.inputStream2ByteArray(new FileInputStream("C:/Users/Administrator/Desktop/jar包/22.jpg"), true));
            params.put("${header2}",header2);
            List<String[]> testList = new ArrayList<String[]>();
            testList.add(new String[]{"1","1AA","1BB","1CC"});
            testList.add(new String[]{"2","2AA","2BB","2CC"});
            testList.add(new String[]{"3","3AA","3BB","3CC"});
            testList.add(new String[]{"4","4AA","4BB","4CC"});
            String path="C:/Users/Administrator/Desktop/jar包/mobanFile.docx";  //模板文件位置
            URL url = test.class.getResource(FILE_PATH);
            String fileName= new String("测试文档.docx".getBytes("UTF-8"),"iso-8859-1");    //生成word文件的文件名
            wordUtil.getWord(path,params,testList,fileName,null);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
*/
