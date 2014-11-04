/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho_cg;

import java.util.Random;

/**
 *
 * @author seven
 */
public class heightmap {
    public static float[][] gerar_heightmap(){
        float height[][]= new float[4][900];
        Random k = new Random();
        int count=0;
        for(int i=0;i<300;i++){
            for(int j=0;j<300;j++){
                height[0][count]=i;
                height[1][count]=j;
                height[3][count]=k.nextFloat();
                height[4][count]=1;
                count++;
            }
        }
        return height;
    }
}
