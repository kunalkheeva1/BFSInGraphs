import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSInGraphs {

    public static ArrayList<Integer> bFSInGraphs(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();

        int [] visited = new int[V];
        for(int i =0; i<V; i++){
            visited[i] = 0;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] =1;

        while(!q.isEmpty()){
            int current = q.remove();
            ans.add(current);
            for(int i =0; i<adj.get(current).size(); i++){
                int nextConnection = adj.get(current).get(i);
                if(visited[nextConnection] !=1){
                    visited[nextConnection]= 1;
                    q.add(nextConnection);
                }
            }
        }return ans;
    }




    public static void main(String[] args) {

    }
}
