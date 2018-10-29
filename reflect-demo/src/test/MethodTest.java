package test;

import java.lang.reflect.Method;

import pojo.HeroPlus;

/**
* @Description 测试 利用反射机制获取成员方法
* @since  2018年10月28日 上午11:00:33
* @author LiuLiBin
*/
public class MethodTest {
	public static void main(String[] args) {
	
	 HeroPlus h = new HeroPlus();
	 
     try {
         // 获取这个名字叫做setName，参数类型是String的方法
         Method m = h.getClass().getMethod("setName", String.class);
         // 对h对象，调用这个方法
         m.invoke(h, "盖伦");
         // 使用传统的方式，调用getName方法
         System.out.println(h.getName());

     } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }

 }
}
