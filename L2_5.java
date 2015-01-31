/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2_5;

/**
 *
 * @author alexpetrache
 */
public class L2_5 {

    static String longestPrefix(String x, String y){
        if(x.length()>y.length()){
            String aux=x;
            x=y;
            y=aux;
        }
        
        int max=0;
        for(int i=1;i<x.length();i++){
            if(y.indexOf(x.substring(0, i))==0){
                max=i;
            }
        }
        return x.substring(0,max);
    }
    
    static String longestPrefixRec(String x, String y){
        if(x.charAt(0)==y.charAt(0))
            return x.charAt(0)+longestPrefixRec(x.substring(1),y.substring(1));
        else
            return "";
    }
    
    public static void main(String[] args) {
        String s1 = "obiectual";
        String s2 = "obiectiv";
        System.out.println(longestPrefix(s1,s2));
        System.out.println(longestPrefixRec(s1,s2));
    }
    
}
