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
        
        ray1.addTravailler(trav1);
        ray1.addTravailler(trav2);
        ray1.addTravailler(trav3);
        ray2.addTravailler(trav4);
        ray2.addTravailler(trav5);
        ray3.addTravailler(trav6);
        ray3.addTravailler(trav7);
        ray3.addTravailler(trav8);
        ray4.addTravailler(trav9);
        ray4.addTravailler(trav10);
        ray4.addTravailler(trav11);
        ray5.addTravailler(trav1);
        ray5.addTravailler(trav3);
        ray5.addTravailler(trav5);
        
        sect1.addRayon(ray1);
        sect1.addRayon(ray2);
        sect1.addRayon(ray3);
        sect2.addRayon(ray4);
        sect2.addRayon(ray5);
        
        secteurList.add(sect1);
        secteurList.add(sect2);
        
        
        
        
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
                choice = sc.nextInt();
            }while(choice < 0 || choice > 3);
            
            switch(choice)
            {
                case 1:
                    for(Secteur s : secteurList)
                    {
                        System.out.println("Id secteur = " + s.getIdSecteur() + " Nom secteur = " + s.getNomSecteur());
                        System.out.println("/////////////////////////////////////////////////////////////////////////");
                        for(Rayon r : s.getLesRayons())
                        {
                            System.out.println("Id Rayon = " + r.getIdRayon()+ " Nom Rayon = " + r.getNomRayon());
                            System.out.println("*************************************************************************");
                            for(Travailler t : r.getLesTravailler())
                            {
                                System.out.println("Id Employé = " + t.getUnEmploye().getIdEmploye() + " Nom Employé = " + t.getUnEmploye().getNomEmploye());
                                System.out.println("Temps Passé = " + t.getTempsPasse());
                                System.out.println("-----------------------------------------------------------------------------------");
                                
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Saisir le numéro de l'employé");
                    int idEmploye = 0;
                    Scanner sc2 = new Scanner(System.in);
                    idEmploye = sc2.nextInt();
                    int tempsTotal = 0;
                    for(Secteur s : secteurList)
                    {
                        for(Rayon r : s.getLesRayons())
                        {
                            for (Travailler t : r.getLesTravailler())
                            {
                                if (t.getUnEmploye().getIdEmploye() == idEmploye)
                                {
                                    tempsTotal = tempsTotal + t.getTempsPasse();
                                }
                            }
                        }
                    }
                    System.out.println("Temps total travaillé par l'employe n°5 est de = " + tempsTotal);
                    break;
                case 3:
                    double tempsMoyen = 0;
                    double temps = 0;
                    double nbEmploye = 0;
                    for (Secteur s : secteurList)
                    {
                        for(Rayon r : s.getLesRayons())
                        {
                            for (Travailler t : r.getLesTravailler())
                            {
                                nbEmploye += 1;
                                temps = temps + t.getTempsPasse();
                            }
                        }
                    }
                    tempsMoyen = temps/nbEmploye;
                    System.out.println("Temps moyen travaillé par l'ensemble des employés est de = " + tempsMoyen);
                    break;
                case 0:
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
             
        }while(choice != 0);
        
        
    }
    
}
