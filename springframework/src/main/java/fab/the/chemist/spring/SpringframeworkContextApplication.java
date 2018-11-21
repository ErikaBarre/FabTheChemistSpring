package fab.the.chemist.spring;


import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fab.the.chemist.spring.basics.BinarySearchImpl;

@Configuration
@ComponentScan //springboot le fait par defaut, mais avec @configuration il faut le preciser
public class SpringframeworkContextApplication {

	public static void main(String[] args) {
		int[] numbers = {12,6,3};
		int numberToSearch = 3;
		
		//avec constructeur
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new SortAlgorthimImpl());
		//int result = binarySearchImpl.binarySearch(numbers, numberToSearch);
		//System.out.println(result);
		
		//avec spring avec application context
		//ApplicationContext applicationContext = 
			//	new AnnotationConfigApplicationContext(SpringframeworkContextApplication.class);
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringframeworkContextApplication.class);
		
		BinarySearchImpl binarySearchImpl =applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearchImpl1 =applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
		//on constate que les 2 objkets sont identiques (meme reference). Par defaut on a un singleton bean	
				
		//prototype : on crée autant d'instance que d'object alors on place l'annotation @Scope("prototype")
		//pour les web application on a les request et session bean
		
		int result = binarySearchImpl.binarySearch(numbers, numberToSearch);
		System.out.println(result);
		//SomeSearchImpl someSearchImpl = applicationContext.getBean(SomeSearchImpl.class);
		
		applicationContext.close();
		
	}
}
