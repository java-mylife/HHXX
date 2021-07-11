package Api_Test.log;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;

@Data
@Slf4j

/***
 * 1.logger - log4j 依赖； 创建logger对象；
 * 2。需要安装lombok 引入Slf4j 依赖，用注解@Slf4j,省去了创建对象；
 */
public class Logdemo {

    private static Logger logger = Logger.getLogger(Logdemo.class);
    public static void main(String[] args) {
        logger.info("卧槽");
        log.info("哈哈哈");
    }
    private static Logger logger1 = Logger.getLogger(Logdemo.class);//获取当前类的日志；
}
