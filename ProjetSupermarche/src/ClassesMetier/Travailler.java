/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesMetier;

/**
 *
 * @author Alex
 */
public class Travailler {
    private Employe unEmploye;
    private int tempsPasse;
    
    public Travailler(Employe unEmploye, int unTemps)
    {
        this.unEmploye = unEmploye;
        this.tempsPasse = unTemps;
    }
    
    public Employe getUnEmploye()
    {
        return this.unEmploye;
    }
    
    public int getTempsPasse()
    {
        return this.tempsPasse;
    }
    
}
