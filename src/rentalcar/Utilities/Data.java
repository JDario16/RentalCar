/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalcar.Utilities;
import java.util.*;
import javafx.util.*;
/**
 *
 * @author James
 */


public class Data{

    public static HashMap<Integer, Pair<String, Pair<String,String>>> nombres(){
        HashMap<Integer, Pair<String, Pair<String,String>>> map = new HashMap();
        String temp = "Daniel Gonzales ,"
        +"Laura Naranjo,"
        +"Marlon Sanchez,"
        +"Alexander Narvaez,"
        +"Camila Alonso,"
        +"Saira Velez,"
        +"Jose Delgado,"
        +"Esteban Restrepo,"    
        +"Ezio Auditore,"
        +"Edward Kenwey";
        String temp2 = "Hombre Mujer Hombre Hombre Mujer Mujer Hombre Hombre Hombre Hombre";
        String temp3 = "VIP Normal Normal Normal VIP VIP Normal VIP VIP VIP";
        String[] nombres = temp.split(",");
        String[] generos = temp2.split(" ");
        String[] tipo = temp3.split(" ");
        Pair  temp4;
        for(int i=0;i<nombres.length;i++){
            temp4 = new Pair (nombres[i], 
                    new Pair(generos[i], 
                            tipo[i]));
            map.put(i,temp4);    
        }
        return map;
    }

    public static HashMap<Integer, String> color(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Rojo Verde Azul Magenta Amarillo Marron Naranja Negro Blanco";
        String[] color = temp.split(" ");
        for(int i=0;i<color.length;i++){
            map.put(i,color[i]);    
        }
        return map;
    }

    public static HashMap<Integer, String> marca(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Audi MNW Chevrolet Ford Honda Kia Mazda Mini Nissan Porsche Renault Toyota";
        String[] marca = temp.split(" ");
        for(int i=0;i<marca.length;i++){
            map.put(i,marca[i]);    
        }
        return map;
    }
    
    public static HashMap<Integer, String> puesto(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "2 4 6";
        String[] puesto = temp.split(" ");
        for(int i=0;i<puesto.length;i++){
            map.put(i,puesto[i]);    
        }
        return map;
    }
    
    public static HashMap<Integer, String> cilindraje(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "1000 1500 2000 2500 3000";
        String[] cil = temp.split(" ");
        for(int i=0;i<cil.length;i++){
            map.put(i,cil[i]);    
        }
        return map;
    }
    
    public static HashMap<Integer, String> transmision(){
        HashMap<Integer, String> map = new HashMap<>();
        String temp = "Manual Secuencial Automatica";
        String[] trans = temp.split(" ");
        for(int i=0;i<trans.length;i++){
            map.put(i,trans[i]);    
        }
        return map;
    }
}
