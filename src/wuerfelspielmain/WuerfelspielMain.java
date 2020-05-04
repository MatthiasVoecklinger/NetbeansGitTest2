/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wuerfelspielmain;

/**
 *
 * @author Matthias Vöcklinger
 */
public class WuerfelspielMain {

    public static int n=20;
    public static void main(String[] args) {
        System.out.println(tausendMalBeruehrt());
    }
    
    public static int wuerfleN(){
        int gesamt=0;
        int x;
        for(int i=0; i<=n;i++){
            x=rand();
            if(x==1){
                return 0;
            }
            else{
                gesamt+=x;
            }
        }
        return gesamt;
    }
    
    
    public static int rand(){
        return (1+(int)(Math.random()*6));
    }
    
    public static float tausendMalBeruehrt(){
        float durchschnitt=0;
        for(int i=0;i<=1000;i++){
            durchschnitt+=wuerfleN();
        }
        durchschnitt/=1000.0;
        return durchschnitt;
    }
}
