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
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
       String fichierSource = args[0];
       String fichierDestination = args[1];
       
       //ArrayList<Terrain> ListTerrain  = LireFichierSource(fichierSource);
       ArrayList<Terrain> ListTerrain = getListeTerrain();
       EcrireFichierDestination(ListTerrain,fichierDestination);
       

        
 
    }

    ///*******************************************************
    ///                Get Liste Terrain
    /// Cette procédure fait la création d'une liste de terrain contenant 1 terrain de chaque type
    /// Cette procédure peut être utilisé pour effecture les tests unitaire.
    ///*******************************************************
    private static ArrayList<Terrain> getListeTerrain() 
    {       
        ArrayList ListTerrains = null;
        
        //TODO Lecture du fichier
                
        Terrain agr = TerrainHelper.getInstanceOf(Terrain.TypeTerrain.Agricole);
        ListTerrains.add(agr);        
        Terrain comm = TerrainHelper.getInstanceOf(Terrain.TypeTerrain.Commercial);
        ListTerrains.add(comm);
        Terrain res = TerrainHelper.getInstanceOf(Terrain.TypeTerrain.Residentiel);
        ListTerrains.add(res);
        
        
        return ListTerrains;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Cette procédure permet de lire le fichier en entrée 
    private static ArrayList<Terrain> LireFichierSource(String source) 
    {
        
        // TODO Implementer Lire fichier Source
        Terrain terrain = TerrainHelper.getInstanceOf(Terrain.TypeTerrain.Agricole);
                
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Cette procédure permet d'écrire le fichier Destination
    private static void EcrireFichierDestination(ArrayList<Terrain> ListTerrain,String destination) {
        //TODO Implementer Ecrire Fichier Destination
       for(int i=0;i< ListTerrain.size();i++)
       {
             System.out.println(ListTerrain.get(i));
       }
    }
}
