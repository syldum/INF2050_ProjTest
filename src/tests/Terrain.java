/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;

/**
 *
 * @author megab
 */
public abstract class Terrain {
  
 public enum TypeTerrain
 {
 Residentiel,
 Commercial,
 Agricole
 }
 public TypeTerrain Type;
 public double Prix_Minimum;
 public double Prix_Moyen;
 public double Prix_Maximum;
 public int NbLots;
 private ArrayList<Lot> Lots;
 
 public void AddLots(Lot lot)
 {
        Lots.add(lot);
        System.out.println(lot.Description);
 }
 
 
 public double CalculTaxesScolaire()
 {
      return 0;
 };
 
 public double CalculTaxesMunicipale()
 {
      return 0;
 };
 
 public double CalculValeurFonciere()
 {
     
      for (Lot l : Lots)
             {
                 l.Calcul_ValeurFonciere();
                 l.Calcul_Valeur_Droit_Passage();
             }    ;
             
      return 0;
 } 
    
}
