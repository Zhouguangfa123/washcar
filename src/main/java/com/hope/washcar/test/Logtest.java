/**
 * 
 */
package com.hope.washcar.test;

import org.apache.log4j.Logger;

/**
 * 
 * @author wangzhaorui
 * @date 2018/09/07
 */
public class Logtest {

	/**
	 * @param args
	 */
	public void outputLog(String para1, String para2) {
		/** 日志管理*/
		Logger log = Logger.getLogger(this.getClass());

		log.debug(para1);
		log.info("输出info的log日志最低级别需要设置为INFO");
		log.warn("输出warn的log日志最低级别需要设置为WARN");
		log.error(para2);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logtest logtest = new Logtest();
		logtest.outputLog("输出info的log日志最低级别需要设置为DEBUG","输出info的log日志最低级别需要设置为ERROR");


	}

}
