package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domínio.Pessoa;

public class Program {

	public static void main(String[] args) {
	
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.close();
		emf.close();
		System.out.println("Pronto");

	}

}
