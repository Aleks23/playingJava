//S ̆a se defineasc ̆a o clas ̆a IntSet pentru o mul ̧time de numere ˆıntregi, care con ̧tine un vector intrinsec de ˆıntregi.
//Metodele clasei:
//• Constructor cu argument dimensiune multime
//• void add(int) : ad ̆augare element, dac ̆a nu exist ̆a
//• boolean contains(int) : verific ̆a dac ̆a un num ̆ar dat se afl ̆a sau nu ˆın mul ̧time
//3
//• String toString() : mul ̧timea de elemente transformat ̆a ˆın  ̧sir de caractere

package l3_4;

import java.util.Arrays;

/**
 *
 * @author alexpetrache
 */

class IntSet{
    private int[] a;
    private int size;
    private int contor;
    
    public IntSet(int s){
        size=s;
        a=new int[s];
        contor=0;
    }
    
    boolean contains(int x){
        for(int i=0;i<contor;i++)
            if(a[i]==x)
                return true;
//        if(Arrays.binarySearch(a, x)>=0)
//            return true;
        return false;
    }
    
    void add(int x){
        if(!contains(x) && contor<size)
            a[contor++]=x;
    }
    
    @Override
    public String toString(){
        String sir="";
        for(int i=0;i<contor;i++)
            sir+=a[i]+" ";
        return sir;
    }
    
}

public class L3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntSet a=new IntSet(5);
        a.add(3);
        a.add(2);
        a.add(3);
        a.add(6);
        a.add(9);
        a.add(10);
        a.add(11);
        System.out.println(a.contains(3));
        System.out.println(a.toString());
    }
    
}
