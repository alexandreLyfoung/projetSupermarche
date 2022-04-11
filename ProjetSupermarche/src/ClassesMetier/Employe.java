/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesMetier;

/**
 *
 * @author Alex
 */
public class Employe {
    private int idEmploye;
    private String nomEmploye;
    
    public Employe(int unId, String unNom)
    {
        this.idEmploye = unId;
        this.nomEmploye = unNom;
    }
    
    public int getIdEmploye()
    {
        return this.idEmploye;
    }
    
    public String getNomEmploye()
    {
        return this.nomEmploye;
    }
}
