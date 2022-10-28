class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     
    ArrayList<Integer> [] graph = new ArrayList[numCourses];
        for(int i =0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i =0;i<prerequisites.length;i++){
            int c1=prerequisites[i][0];
            int c2=prerequisites[i][1];
            graph[c1].add(c2);
            
        }
        //Cycle in a Dirceted graph 
        boolean [] visited=new boolean[numCourses];
        boolean [] dfsvisited=new boolean[numCourses];
        
        for(int i =0;i<numCourses;i++){
            if(visited[i]==false){
            if(isCyclic(i,graph,visited,dfsvisited)){
                return false;
            }
            }
        }
        return true;
        
    }
    
    public static boolean isCyclic(int node,ArrayList<Integer> [] graph,boolean [] visited,boolean [] dfsvisited){
        visited[node]=true;
        dfsvisited[node]=true;
        
        for(int nbrs:graph[node]){
            if(visited[nbrs]==false){
               if(isCyclic(nbrs,graph,visited,dfsvisited)){
                   return true;
               } 
            }
            else if(dfsvisited [nbrs]==true)
                return true;
            }
        dfsvisited[node]=false;
        return false;
        }
    
}