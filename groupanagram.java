import java.util.*;

public class groupanagram {
    public static List<List<String>> isgroupanagram(String[] strs)// time complextity is become n*klogk because the one string takes time to sort a particular string is  klogk time to execute then n number of strings take n*klogk
    {
        List<List<String>> ans = new ArrayList<>();// return a list of strings 
        HashMap<String,List<String> > map = new HashMap<>();// store the sorted string as key and we store the value in respective of key
         // iterate over the string 
         for(int i =0;i<strs.length;i++)
         {
            String st= strs[i];
            // sort a particular string using arraycharcter 
            char[] chararray = st.toCharArray();// covert the string into the aray and create a char array
            Arrays.sort(chararray);// sort 
            String s2 = new String(chararray);// then that sorted string stored in the diffrent variable
            if(map.containsKey(s2)==true)
            {
                map.get(s2).add(st);// get taht particular list add that string into the lsit
            }
            else
            {
                map.put(s2, new ArrayList<>());// if the list is not created create the new list respect of that sorted string 
                map.get(s2).add(st);// and add that string into the list
            }
            for(List<String> v:map.values())
            {
                ans.add(v);// add all the list of string in the ans array list
            }
           
        }
         return ans;
    }
    public static void main(String[] args) {
        
        String[] strs={"eat","tea","tan","ate","nat","bat"};
       System.out.println( groupanagram.isgroupanagram(strs));
    
    }
    
}
