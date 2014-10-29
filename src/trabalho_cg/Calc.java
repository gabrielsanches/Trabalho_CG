/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_cg;



public class Calc {

    //calcular o vetor n
    public static float[] calcular_vetor_n(float VRP[], float P[]) {
        float resultado[] = new float[3];
        resultado[0] = VRP[0] - P[0];
        resultado[1] = VRP[1] - P[1];
        resultado[2] = VRP[2] - P[2];
        float n = (float) Math.sqrt(Math.pow(resultado[0], 2)
                + Math.pow(resultado[1], 2) + Math.pow(resultado[1], 2));
        resultado[0] /= n;
        resultado[1] /= n;
        resultado[2] /= n;
        return resultado;
    }

    //calcular o vetor v
    public static float[] calcular_vetor_v(float n[], float y[]) {
        float resultado[] = new float[3];
        float yx = (y[0] * n[0]) + (y[1] * n[1]) + (y[2] * n[2]);
        resultado[0] = y[0] - (yx * n[0]);
        resultado[1] = y[1] - (yx * n[1]);
        resultado[2] = y[2] - (yx * n[2]);
        float v = (float) Math.sqrt(Math.pow(resultado[0], 2)
                + Math.pow(resultado[1], 2) + Math.pow(resultado[1], 2));
        resultado[0] /= v;
        resultado[1] /= v;
        resultado[2] /= v;
        return resultado;
    }

    //calcular o vetor u
    public static float[] calcular_vetor_u(float n[], float v[]){
        float resultado[]= new float[3];
        resultado[0]=(v[1]*n[2])-(v[2]*n[1]);
        resultado[1]=(v[2]*n[0])-(v[0]*n[2]);
        resultado[2]=(v[0]*n[1])-(v[1]*n[0]);
        return resultado;
    }
    
    //calcular matriz RT
    public static float[][] calcular_matriz_RT(float VRP[],float u[],float v[], float n[]){
        float T[][] = new float[4][4];
        T[0][0]=1;
        T[1][0]=0;
        T[2][0]=0;
        T[3][0]=-VRP[0];
        T[0][1]=0;
        T[1][1]=1;
        T[2][1]=0;
        T[3][1]=-VRP[1];
        T[0][2]=0;
        T[1][2]=0;
        T[2][2]=1;
        T[3][2]=-VRP[2];
        T[0][3]=0;
        T[1][3]=0;
        T[2][3]=0;
        T[3][3]=1;

        
        float R[][] = new float[4][4];
        R[0][0]=u[0];
        R[1][0]=u[1];
        R[2][0]=u[2];
        R[3][0]=0;
        R[0][1]=v[0];
        R[1][1]=v[1];
        R[2][1]=v[2];
        R[3][1]=0;
        R[0][2]=n[0];
        R[1][2]=n[1];
        R[2][2]=n[2];
        R[3][2]=0;
        R[0][3]=0;
        R[1][3]=0;
        R[2][3]=0;
        R[3][3]=1;
        
        float resultado[][]=multiplicar_matriz(R,T);
        return resultado;
    }
    
    //determinar a posicao do observador
    public static float[][] posicao_obseravador(float VRP[],float matriz[][]){
        float temp[][]=new float[4][1];
        temp[0][0]=VRP[0];
        temp[1][0]=VRP[1];
        temp[2][0]=VRP[2];
        temp[3][0]=1;
        temp=multiplicar_matriz(matriz, temp);
        return temp;
    }
    
    
    private static float[][] multiplicar_matriz(float A[][], float[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = B[0].length;
        if (nA != mB) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        float[][] C = new float[mA][nB];
        for (int i = 0; i < nA; i++) {
            for (int j = 0; j < nB; j++) {
                for (int k = 0; k < nA; k++) {
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        return C;
    }
    
}
