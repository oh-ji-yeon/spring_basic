package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {

	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main(); // private�̶� �ܺ� ȣ�� �Ұ�
		
		// Reflection API ��� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ��� ����
		// java.lang.reflect package�� ����
		
		// Hello class�� Class��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		// Ŭ���� ����(*.class)�� �޸𸮿� �ö� ��, Ŭ���� ���ϸ��� Class��ü�� �ϳ��� �����ȴ�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)helloClass.newInstance(); // Class��ü�� ���� ������ ��ü ����
		
		Method main = helloClass.getDeclaredMethod("main"); // main()������ ������
		main.setAccessible(true); // private�� main()�� ȣ�� �����ϰ� �Ѵ�.
		main.invoke(hello); // hello.main()
	}
}
