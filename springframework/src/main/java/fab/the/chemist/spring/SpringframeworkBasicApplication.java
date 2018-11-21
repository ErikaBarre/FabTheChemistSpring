package fab.the.chemist.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fab.the.chemist.spring.basics.BinarySearchImpl;

@SpringBootApplication
public class SpringframeworkBasicApplication {

	public static void main(String[] args) {
		int[] numbers = {12,6,3};
		int numberToSearch = 3;
		
		//avec constructeur
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new SortAlgorthimImpl());
		//int result = binarySearchImpl.binarySearch(numbers, numberToSearch);
		//System.out.println(result);
		
		//avec spring avec application context
		ApplicationContext applicationContext = SpringApplication.run(SpringframeworkBasicApplication.class, args);
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
	}
}
