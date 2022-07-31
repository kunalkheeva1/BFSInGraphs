import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSInGraphs {


    //bsf algorithm, in which i am storing the vertices in a list to be returned
    // first, i will keep the record of the visited elements, 1 is for the visited and 0 is for not
    // queue will be use to store the current node and add the next connections accordingly
    public static ArrayList<Integer> bFSInGraphs(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();

        // initially mark every position unvisited
        int [] visited = new int[V];
        for(int i =0; i<V; i++){
            visited[i] = 0;
        }

        // start with adding 0, and mark 0 as visited in visited array
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] =1;


        // until the queue gets emptied, remove the current and add it in ans,
        // then run a loop for the connections of the current and check if its visited or not
        // if not mark it visited and add it in queue and repeat the process
        // and at the end just return the answer
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
