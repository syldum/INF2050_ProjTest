/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author megab
 */
public class TerrainHelper 
{
    
    public static Terrain getInstanceOf(Terrain.TypeTerrain type)
    {
        switch(type)
        {
            case Residentiel:
                return new TerrainResidentiel();
            case Commercial:
                return new TerrainCommercial();
            case Agricole:
                return new TerrainAgricole();
            default:
                throw new AssertionError(type.name());
           
        }
           
    }
}