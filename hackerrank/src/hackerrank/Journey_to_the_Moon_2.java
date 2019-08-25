package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Journey_to_the_Moon_2 {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        ArrayList<HashSet<Integer>> ahs=new ArrayList<HashSet<Integer>>();
        int a,b;
        for(int i=0;i<M;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            boolean flag=true;
            int meet=0;
            
            HashSet<Integer> hs1=new HashSet<Integer>();
            HashSet<Integer> hs2=new HashSet<Integer>();
            
            for(HashSet<Integer> hs:ahs){
                
                if(hs.contains(a)||hs.contains(b)){
                    if(meet==0){
                        flag=false;
                        hs.add(a);
                        hs.add(b);
                        hs1=hs;
                        meet=1;
                    }
                    else{
                        hs2=hs;
                        meet=2;
                    }
                }
            }
            if(meet==2){
                hs1.addAll(hs2);
                ahs.remove(hs2);
            }
            if(flag){
                HashSet<Integer> hs=new HashSet<Integer>();
                hs.add(a);
                hs.add(b);
                ahs.add(hs);
            }
        }
        long res=(long)N*(long)(N-1)/2L;
        long minus=0L;
        for(HashSet<Integer> hs:ahs){
            minus+=(long)hs.size()*(long)(hs.size()-1)/2;
        }
        System.out.println(res-minus);
    }
}
