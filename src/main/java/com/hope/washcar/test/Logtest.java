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
		/** ��־����*/
		Logger log = Logger.getLogger(this.getClass());

		log.debug(para1);
		log.info("���info��log��־��ͼ�����Ҫ����ΪINFO");
		log.warn("���warn��log��־��ͼ�����Ҫ����ΪWARN");
		log.error(para2);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logtest logtest = new Logtest();
		logtest.outputLog("���info��log��־��ͼ�����Ҫ����ΪDEBUG","���info��log��־��ͼ�����Ҫ����ΪERROR");


	}

}
