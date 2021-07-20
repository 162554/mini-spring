package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author derekyi
 * @date 2020/11/24
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {
	/*
    杨过：实际上就是创建了两个map,初始化map和单例map。
    1、调用BeanDefinition的有参构造创建对象，将名称和BeanDefinition对象放入初始化map
    2、先获取单例map的value，空值->获取初始化map的value
    3、创建Bean 并实例化，放入单例map中
	*/
	@Test
	public void testBeanFactory() throws Exception {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
		beanFactory.registerBeanDefinition("helloService", beanDefinition);

		HelloService helloService = (HelloService) beanFactory.getBean("helloService");
		helloService.sayHello();


	}
}
