// import java.util.Scanner;
import java.util.*;

public class adjacncylist{
    static class edge{
        int source;
        int destination;
        int weight;  
        // #add if NameAlreadyBoundException
        edge(int s,int d,int w){
            this.source=s;
            this.destination=d;
            this.weight=w;

        }
    }
    public static void createGraph(ArrayList<edge> gra[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<gra.length;i++){
            gra[i]=new ArrayList<>();
            int src=sc.nextInt();
            int des=sc.nextInt();
            int wgt=sc.nextInt();
            gra[i].add(new edge(src,des,wgt));
    
        }

                
        }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int ver=sc.nextInt();
        ArrayList<edge> gra[]=new ArrayList[ver];
        createGraph(gra);
        for(int i=0;i<ver;i++){
        edge e=gra[i].get(0);
         System.out.print(e.destination);
         
        }
    }
    
}
