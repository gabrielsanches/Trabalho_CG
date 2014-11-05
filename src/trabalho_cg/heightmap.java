/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho_cg;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author seven
 */
public class heightmap {
    public static float[][] gerar_heightmap(){
        float height[][]= new float[4][90000];
        Random k = new Random();
        int count=0;
        for(int i=0;i<300;i++){
            for(int j=0;j<300;j++){
                height[0][count]=i;
                height[1][count]=j;
                height[2][count]=k.nextFloat();
                height[3][count]=1;
                count++;
            }
        }
        return height;
    }
    
    public static ArrayList<Triangulo> gerar_triangulos_regular(){//arrumar T2
        ArrayList<Triangulo> triangulos = new ArrayList<>();
        Triangulo T; 
        for(int i=0;i<299;i++){
            for(int j=0;j<299;j++){
                T = new Triangulo( (i*300)+1+j, (i*300)+j, (i*300)+j+300);
                triangulos.add(T);
                T = new Triangulo((i*300)+j+1, (i*300)+300+j, (i*300)+301+j);
                triangulos.add(T);
            }
        }
        return triangulos;
    }
    
}
