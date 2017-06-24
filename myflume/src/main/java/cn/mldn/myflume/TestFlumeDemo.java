package cn.mldn.myflume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 注意：如果此时想要本程序生效的话，那么必须需要在远程的linux 程序中，修改配置文件<br>
 * vim /usr/local/flume/conf/flume.conf<br>
 * 设置为：a1.sources.r1.type = avro<br>
 * @author paul
 *
 */
public class TestFlumeDemo {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(TestFlumeDemo.class);
	public static void main(String[] args) {
		
		for (int x = 0 ; x < 10 ; x ++) {
			LOGGER.info("mldn.cn");
		} 
	}
}
