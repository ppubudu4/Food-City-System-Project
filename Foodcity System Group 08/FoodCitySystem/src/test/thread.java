/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


public class thread {

    public static void main(String[] args) {
       new Thread(new Runnable() {
            
            @Override
            public void run() {

                for (int t = 0; t <= 100; t++) {
                    System.out.println(t);
                    try {
                        if (t < 20) {
                            Thread.sleep(100);
                        } else if (t < 50) {
                            Thread.sleep(90);
                        } else if (t < 75) {
                            Thread.sleep(Math.abs(t - 100));
                        } else if (t < 90) {
                            Thread.sleep(40);
                        } else {
                            Thread.sleep(30);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

            
        }).start();
    }}
