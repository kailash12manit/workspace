package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Journey_to_the_Moon {

	static int V;
    static LinkedList<Integer> adj[];
    static boolean visited[];
    
    public Journey_to_the_Moon(int n){
            V=n;
            adj = new LinkedList[n];
            for(int i=0;i<n;i++){
                 adj[i]= new LinkedList<Integer>(); 
            }
            visited = new boolean[n];
    }
    static void edge(int src , int dest){
            adj[src].add(dest);
            adj[dest].add(src);
    }
    
    // Complete the journeyToMoon function below.
    static int journeyToMoon(int n, int[][] astronaut) {
    	
    	Journey_to_the_Moon ss = new Journey_to_the_Moon(n);
        
            int m=astronaut.length;
            for(int i=0;i<m;i++){
                int a=astronaut[i][0];
                int b=astronaut[i][1];
                edge(a,b);
            } 

            int sum=0;
            ArrayList<Integer>al = new ArrayList<Integer>();
        
            for(int i=0;i<n;i++){
                int len=DFS_Util(i);
                if(len!=-1){
                    al.add(len);
                }
            } 
            //System.out.println(al);
            for(int i=0;i<al.size();i++){
                for(int j=i+1;j<al.size();j++){
                   sum+=(al.get(i)*al.get(j)); 
                }
            } 
        
        return sum;
        
    }
    
     static int DFS_Util(int start){
        if(visited[start]==false){
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start]=true;
            int len=1;
            while(queue.size()>0){
                int n = queue.poll();
                
                Iterator<Integer>  itr = adj[n].listIterator();
                while(itr.hasNext()){
                    int i=itr.next();
                    if(visited[i]==false){
                        len++;
                        visited[i]=true;
                        queue.add(i);
                    } 
                }
            }
            return len;
        }
        else{
            return -1;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }

        int result = journeyToMoon(n, astronaut);

        System.out.println(String.valueOf(result));
        scanner.close();
    }
}

