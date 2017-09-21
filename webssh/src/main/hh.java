package main;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.junge.User;

@Service
public class hh {
	
	@Resource
    private  SessionFactory sessionFactory;


//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//		hh h=new hh();
//		h.test();
//		
////		   Configuration config=new Configuration().configure();
////		  // ServiceRegistry s= (ServiceRegistry) new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
////		   StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
////		   StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder.build();
////		   SessionFactory factory=config.buildSessionFactory(registry);
////		   Session session = factory.openSession();
////		Resource resource=new ClassPathResource("spring_hibernate.xml");
////        BeanFactory factory=new XmlBeanFactory(resource);
////      SessionFactory sessionFactory=(SessionFactory)factory.getBean("sessionFactory");
////      Session session = sessionFactory.openSession();
//		
//		
//		// TODO Auto-generated method stub
////		Configuration configuration =new AnnotationConfiguration();
////		 configuration.configure();
////	        SchemaExport export = new SchemaExport(configuration);
////	        export.execute(true, true, false, true);
////	        SessionFactory factory = configuration.buildSessionFactory();
////	        Session session = factory.openSession();
////	        Session session = factory.getCurrentSession();
//	   
////	        base user=new base();
////	        user.setA(11);
////	        user.setPd("0000");
////	        user.setPh("111111");
//		
//		
////	     session.beginTransaction();
////	        User user = new User();
////	        user.setName("成都");
////	        user.setId(3);
////	        user.setPassword("123456");
////        
////	        session.save(user);
////	        session.getTransaction().commit();
//////	        session.close();
//	}
	@Test
	public void test(){
//		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
//		SessionFactory session = (SessionFactory)ac.getBean("sessionFactory");
//		System.out.println(sessionFactory);
		System.out.println("junge"+sessionFactory);
		Session session=sessionFactory.getCurrentSession();
		if(session!=null)System.out.println("junge");
		else System.out.println("6666");
		//System.out.println("error");
		
	}

}
