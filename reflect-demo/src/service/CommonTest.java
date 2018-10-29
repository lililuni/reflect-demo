package service;
/**
* @Description  当需要从第一个业务方法切换到第二个业务方法的时候，
* 使用非反射方式，必须修改代码，并且重新编译运行，才可以达到效果 
* @since  2018年10月29日 上午9:35:31
* @author LiuLiBin
*/
public class CommonTest {
	  public static void main(String[] args) {
		  //new Service1().doService1();
		  //必须重新修改代码
	        new Service2().doService2();
	    }
}
