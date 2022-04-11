/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetsupermarche;

import ClassesMetier.Employe;
import ClassesMetier.Rayon;
import ClassesMetier.Secteur;
import ClassesMetier.Travailler;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ProjetSupermarche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Secteur sect1 = new Secteur(1, "Produit frais");
        Secteur sect2 = new Secteur(2, "Multimédia");
        
        Rayon ray1 = new Rayon(1, "Légumes");
        Rayon ray2 = new Rayon(2, "Fruits");
        Rayon ray3 = new Rayon(3, "Poissons");
        Rayon ray4 = new Rayon(4, "Informatiques");
        Rayon ray5 = new Rayon(5, "TV et Divers");
        
        Employe emp1 = new Employe(1, "François");
        Employe emp2 = new Employe(2, "Marie");
        Employe emp3 = new Employe(3, "Lucile");
        Employe emp4 = new Employe(4, "Pierre");
        Employe emp5 = new Employe(5, "Stéphanie");
        Employe emp6 = new Employe(6, "Paul");
        
        Travailler trav1 = new Travailler(emp1, 4);
        Travailler trav2 = new Travailler(emp2, 8);
        Travailler trav3 = new Travailler(emp3, 4);
        Travailler trav4 = new Travailler(emp4, 2);
        Travailler trav5 = new Travailler(emp5, 6);
        Travailler trav6 = new Travailler(emp6, 5);
        Travailler trav7 = new Travailler(emp1, 4);
        Travailler trav8 = new Travailler(emp3, 3);
        Travailler trav9 = new Travailler(emp2, 9);
        Travailler trav10 = new Travailler(emp4, 2);
        Travailler trav11 = new Travailler(emp5, 5);
        
        
        ArrayList<Secteur> secteurList = new ArrayList<Secteur>();
        
        
        
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            do
            {
                System.out.println("1: Afficher toutes les infos");
                System.out.println("2: Temps total pour un employé");
                System.out.println("3: Temps moyen travaillé par l'ensemble des employés");
                System.out.println("0: Quitter le programme");
            }while(choice < 0 || choice > 3);
            
            switch(choice)
            {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
             
        }while(choice != 0);
        
        
    }
    
}
