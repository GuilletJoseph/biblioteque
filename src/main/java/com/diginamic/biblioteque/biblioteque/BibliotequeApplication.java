package com.diginamic.biblioteque.biblioteque;

import java.beans.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.Client;
import entities.Emprunt;
import entities.Livre;

public class BibliotequeApplication {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("biblioteque");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Scanner in = new Scanner(System.in);  
		
		Emprunt emprunt=new Emprunt();
		
		 System.out.print("Ajouter ID d'emprunt: ");    
	       String idEmp = in.next();          
	       emprunt =entityManager.find(Emprunt.class, 1);
			System.out.println(emprunt.getId()+" "+ emprunt.getDateDebut()+ " "+emprunt.getDateFin());		 
			System.out.println(emprunt.getLivres());
					
			Client client =new Client();
			
			System.out.print("Ajouter ID client: ");    
		       String idCli = in.next();
		
		
		       client =entityManager.find(Client.class, 1);
				System.out.println(client.getNom()+" "+client.getPrenom());		 
				//System.out.println(client.getEmprunts());	
		
	entityManager.close();
	entityManagerFactory.close();
	}

}
