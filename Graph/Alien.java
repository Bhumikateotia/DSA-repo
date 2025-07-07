import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Alien {
    static String aliendictonary(List<String> words)
    {
        HashMap<Character,Integer> indegree= new HashMap<>();// decalare a indegree hashmap to store the indegree of the character
        HashMap<Character,  ArrayList<Character>> adj = new  HashMap<>();// decalare a hashmap to store the empty list corresponding to the every charater
        int n = words.size();
        for(char ch ='a';ch<'z';ch++){
              indegree.put(ch, 0);// intial the indegree of the each character is 0
              adj.put(ch, new ArrayList<>());// intial the adj
        }
        // this loop travers of the words in the list of the type string 
        for(int i=0;i<n-1;i++)
        {
          String s1=words.get(i);// in the list the first string is starting from index 0
          String s2=words.get(i+1);
          for(int j=0;j<Math.min(s1.length(), s2.length()))
          {
            char ch1=s1.charAt(j);
            char ch2 = s2.charAt(j);
            if(ch1!=ch2)
          {
            adj.get(ch1).add(ch2);// using the get call the key and its corresponding value
            indegree.put(ch2, indegree.get(ch2)+1);//add the indegree and increase the indegree of the character in the map
          }
          }
          
        }
        // decalre a queue
         Queue <Character> q= new LinkedList<>();
        // intial the indgree of each character has the 0 and add them into the q
        for(char ch='a';ch<'z';ch++)
        {
            if(indegree.get(ch)==0)
            {
                q.add(ch);
            }
        }
        // declare the ans string
        String ans="";
       
        while(!q.isEmpty())
        {
            // traverse on the queue and remove the character from the qeue and add into the ans string 
            char curr=q.remove();
            ans+=curr;
            for(char conn:adj.get(curr))// traverse on its connection
            {
             indegree.put(conn, indegree.get(conn)-1);// put the connection and decrease the degree by 1
             if(indegree.get(conn)==0)// if the degree become zero then into the qeue
             {
                q.add(conn);
             }
            }
        }
        return ans;
       

    }
    public static void main(String[] args) {
        
    }
    
}
