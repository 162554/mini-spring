package org.springframework.test.ioc;

/**
 * @author derekyi
 * @date 2020/11/22
 */
public class HelloService {
    public String name;

	public HelloService(String name) {
		this.name = name;
	}

	public String sayHello() {
		System.out.println("hello");
		return "hello";
	}
}
