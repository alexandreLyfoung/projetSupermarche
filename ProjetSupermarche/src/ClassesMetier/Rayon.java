/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesMetier;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Rayon {
    private int idRayon;
    private String nomRayon;
    private ArrayList<Travailler> lesTravailler;
    
    public Rayon(int unId, String unNom)
    {
        this.idRayon = unId;
        this.nomRayon = unNom;
        this.lesTravailler = new ArrayList<Travailler>();
    }
    
    public int getIdRayon()
    {
        return this.idRayon;
    }
    
    public String getNomRayon()
    {
        return this.nomRayon;
    }
    
    public ArrayList<Travailler> getLesTravailler()
    {
        return this.lesTravailler;
    }
}
