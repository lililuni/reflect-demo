package test;
/*
 * 测试 利用反射获取类对象
 */
import pojo.Hero;

public class ObjectTest {
	
	public static void main(String[] args) {
        String className = "pogo.Hero";
		try {
        	//获取类对象的第一种方式
            Class pClass1 = Class.forName(className);
            //获取类对象的第二种方式
            Class pClass2 = Hero.class;
            //获取类对象的第三种方式
            Class pClass3 = new Hero().getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 }
}
