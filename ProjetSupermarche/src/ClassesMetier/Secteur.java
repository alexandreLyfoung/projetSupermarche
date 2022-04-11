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
public class Secteur {
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Rayon> lesRayons;
    
    public Secteur(int unId, String unNom)
    {
        this.idSecteur = unId;
        this.nomSecteur = unNom;
        this.lesRayons = new ArrayList<Rayon>();
    }
    
    public int getIdSecteur()
    {
        return this.idSecteur;
    }
    
    public String getNomSecteur()
    {
        return this.nomSecteur;
    }
    
    public ArrayList<Rayon> getLesRayons()
    {
        return this.lesRayons;
    }
}
