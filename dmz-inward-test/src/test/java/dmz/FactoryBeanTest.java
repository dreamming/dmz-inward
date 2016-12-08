package dmz;

import com.dmz.test.bean.ClassRoom;
import com.dmz.test.bean.IPerson;
import com.dmz.test.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by dmz on 2016/12/2.
 */
public class FactoryBeanTest {
    //加载资源文件下
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    //加载项目路径下
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("SpringBean3.xml");
    //覆盖默认加载bean的Resource
//          FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:SpringBean.xml");
    //从Class路径下加载
//        ClassPathXmlApplicationContext ctx =
//                new ClassPathXmlApplicationContext(
//                new String[] {"SpringBean3.xml"}, ResourceTest.class);
    //classloader加载资源文件
//        URL a = new ApplicationContext().getClass().getClassLoader().getResource("SpringBean.xml");

    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("spring-beans.xml");
//        以下的加载方式不建议使用!!!
//        ClassPathResource resource = new ClassPathResource("spring-beans.xml");
//        DefaultListableBeanFactory context = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(context);
//        reader.loadBeanDefinitions(resource);

        IPerson person = context.getBean("person", IPerson.class);
        person.sayHello();
        IPerson per = context.getBean("logPerson", IPerson.class);
        per.sayHello();

        ClassRoom classRoom = context.getBean("classRoom", ClassRoom.class);

        System.out.println( context.getBean("logPerson").getClass());
        System.out.println(context.getBean("person").getClass());
        System.out.println("-------------------------------------");
        System.out.println(context.getBean(BeanFactory.FACTORY_BEAN_PREFIX+"logPerson").getClass());
        System.out.println("-------------------------------------");

//        ClassPathResource resource = new ClassPathResource("spring-beans.xml");
//        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
//        System.out.println(beanFactory.getBean("logPerson").getClass());
//        System.out.println(beanFactory.getBean("person").getClass());
//        System.out.println(beanFactory.getBean("&logPerson").getClass());
    }
}
