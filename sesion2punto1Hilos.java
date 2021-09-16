/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guia2sesionpunto1;

/**
 *
 * @author 76ers
 */
public class sesion2punto1Hilos implements Runnable {
    int x,y;

    @Override
    public void run() {
        for (int cont = 1; cont<100; cont++) {
            x = cont;
            y=x*2;
            System.out.println(" x ="+x+" y ="+y);
            
        }
        
    }
    
}

class A extends Thread {
    @Override
    public void run() {
        Thread t = new Thread(new sesion2punto1Hilos());
        t.start();
    }
    
    public static void main(String[] args) {

    A object = new A();
    object.start();
    }
    
}



 
