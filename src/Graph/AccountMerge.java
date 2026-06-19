package Graph;
import java.util.*;
public class AccountMerge {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com");
        List<String> b = Arrays.asList("John","johnsmith@mail.com","john00@mail.com");
        List<String> c = Arrays.asList("Mary","mary@mail.com");
        List<String> d = Arrays.asList("John","johnnybravo@mail.com");
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(a);
        accounts.add(b);
        accounts.add(c);
        accounts.add(d);
//        accountsMerge(accounts);
    }
    public int find(int i, int[] par){
        if(par[i]==i) return i;
        return par[i] = find(par[i],par);
    }
    public void union(int a, int b, int[] par, int[] size){
        a = find(a,par);
        b = find(b,par);
        if(a!=b){
            if(size[a]>size[b]){
                par[b] = a;
                size[a] += size[b];
            }
            else{
                par[a] = b;
                size[b] += size[a];
            }
        }
    }
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        Map<String,Integer> m = new HashMap<>();
        int[] par = new int[n];
        int[] size = new int[n];
        for(int i = 0; i<n ;i++){
            par[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i< n; i++){
            for(int j = 1; j<accounts.get(i).size(); j++){
                if(!m.containsKey(accounts.get(i).get(j))){
                    m.put(accounts.get(i).get(j),i);
                }
                else{
                    union(i,m.get(accounts.get(i).get(j)),par,size);
                }
            }
        }


        Map<Integer,Set<String>> mp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i< n; i++){
            int p = find(i,par);
            List<String> child = accounts.get(i);
            for(int j = 1; j< child.size(); j++){
                mp.putIfAbsent(p,new HashSet<>());
                mp.get(i).add(child.get(j));
            }
        }
        for(var key : mp.keySet()){
            String name = accounts.get(key).get(0);//Name
            List<String> emailAcs = new ArrayList<>(mp.get(key));
            Collections.sort(emailAcs);
            List<String> temp = new ArrayList<>();
            temp.add(name);
            temp.addAll(emailAcs);
            ans.add(temp);

        }
        return ans;

//        for(int i = 0; i< n; i++){
//            int p = find(i,par);
//            if(p!=i){
//                List<String> child = accounts.get(i);
//                for(int j = 1; j< child.size(); j++){
//                    if (!accounts.get(p).contains(child.get(j))) {
//                        accounts.get(p).add(child.get(j));
//                    }
//                }
//            }
//        }
//
//        for(int i = 0; i< n; i++){
//            if(find(i,par)==i){
//                String name = accounts.get(i).get(0);
//                List<String> emails = new ArrayList<>();
//                for(int j = 1; j<accounts.get(i).size(); j++){
//                    if(!emails.contains(accounts.get(i).get(j))){
//                        emails.add(accounts.get(i).get(j));
//                    }
//                }
//                Collections.sort(emails);
//                List<String> temp = new ArrayList<>();
//                temp.add(name);
//                temp.addAll(emails);
//                ans.add(temp);
//            }
//        }
//        return ans;
    }
}
