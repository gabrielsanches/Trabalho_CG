/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho_cg;

import java.util.ArrayList;

/**
 *
 * @author seven
 */
public class Trabalho_CG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float VRP[]=new float[3];
        float P[]=new float[3];
        VRP[0]=5;
        VRP[1]=20;
        VRP[2]=20;
        P[0]=0;
        P[1]=0;
        P[2]=0;
        float n[]=Calc.calcular_vetor_n(VRP, P);
        System.out.println("n");
        for(int i=0;i<3;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
        float Y[]=new float[3];
        Y[0]=0;
        Y[1]=1;
        Y[2]=0;
        float v[]=Calc.calcular_vetor_v(n, Y);
        System.out.println("v");
        for(int i=0;i<3;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
        
        float u[]=Calc.calcular_vetor_u(n, v);
        System.out.println("u");
        for(int i=0;i<3;i++){
            System.out.print(u[i]+" ");
        }
        System.out.println();
//        
        float rt[][]=Calc.calcular_matriz_RT(VRP, u, v, n);
        System.out.println("RT");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(rt[j][i]+"\t\t");
            }
            System.out.println("");
        }
        float nVRP[][]=Calc.posicao_obseravador(VRP, rt);
        System.out.println("VRP'");
        for(int i=0;i<4;i++){
            System.out.print(nVRP[i][0]+" ");
        }
        System.out.println("");
        
        float m[][]=heightmap.gerar_heightmap();
//        for(int i=0;i<m[0].length;i++){
//            System.out.println(m[0][i]+" "+m[1][i]+" "+m[2][i]+" "+m[3][i]);
//        }

//        ArrayList<Triangulo> T=heightmap.gerar_triangulos_regular();
//        for(Triangulo Tri : T){
//            int a[] = Tri.getTriangulo();
//            System.out.println("X1> "+m[0][a[0]]+"Y1> "+m[1][a[0]]+"Z1> "+m[2][a[0]]);
//            System.out.println("X2> "+m[0][a[1]]+"Y2> "+m[1][a[1]]+"Z2> "+m[2][a[1]]);
//            System.out.println("X3> "+m[0][a[2]]+"Y3> "+m[1][a[2]]+"Z> "+m[2][a[2]]+"\n");
//        }
        
    }
    
}
