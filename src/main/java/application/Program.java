package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com"); 
		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com"); 
		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com"); 
		System.out.println(p1); 
		System.out.println(p2); 
		System.out.println(p3); 
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
