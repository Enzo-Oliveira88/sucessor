/
package com.mycompany.distacia2pontos;

public class Distacia2pontos {

    public static void main(String[] args) {
       Scanner tc = Scanner (System.in);     
        System.out.println("digite o valor de X1");
        double x1 = tc.nextDouble();
        System.out.println("digite o valor de Y1");
         double y1 = tc.nextDouble();
        System.out.println("digite o valor de X2");
         double x2 = tc.nextDouble();
        System.out.println("digite o valor de Y2");
         double y2 = tc.nextDouble();
         double primeiro_termo = (x2 - x1)*(x2 - x1);
         double segundo_termo = (y2-y1)*(y2-y1);
         double dist = primeiro_termo + segundo_termo;
         Math.sqrt(dist);
         System.out.println("A distancia e: " + dist);
         
    }
}
