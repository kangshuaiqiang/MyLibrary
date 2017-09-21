package test.bwie.com.mylibrary;

/**
 * Created by peng on 2017/9/1.
 */

public interface Api {
    public static boolean isOnline = false;
    public static final String PRODUCT = "http://www.baidu.com";
    public static final String DEVELOP = "http://169.254.222.37";
    public static final String HOST = isOnline ? PRODUCT : DEVELOP;


    public static final String MAIN_PAGE = HOST + "/mobile/index.php?act=index";//首页


}
