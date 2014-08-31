/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemmonitor;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author fatcloud
 */
class HelloThread extends Thread{
    
  private boolean isContinue = true;

    public void terminate() {
        isContinue = false;
    } 
    
    
  int a;
  public void run(){
    a = 0;
    while(isContinue){
        a++;
        System.out.println(a);
        try {
            TimeUnit.MILLISECONDS.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
        }
    }
  }
}
