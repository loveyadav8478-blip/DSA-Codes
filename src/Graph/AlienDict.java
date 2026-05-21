//package Graph;
//
//import java.util.*;
//
//public class AlienDict {
//    public String findOrder(String[] words) {
//        // ["baa", "abcd", "abca", "cab", "cad"]
//        Map<Character, List<Character>> adj = new HashMap<>();
//        for(String wrd : words){
//            for(int i = 0; i<wrd.length(); i++){
//                adj.putIfAbsent(wrd.charAt(i),new ArrayList<>());
//            }
//        }
////        int[] inDeg = new int[adj.size()];
//        for(int i = 0; i< words.length; i++){
//            String s1 = words[i];
//            String s2 = words[i+1];
//            int minLen = Math.min(s1.length(),s2.length());
//            for(int j = 0; j< minLen; j++){
//                if(s1.charAt(j)!=s2.charAt(j)){
//                    adj.get(s1.charAt(j)).add(s2.charAt(j));
//                    break;
//                }
//            }
//        }
//        Map<Character,Integer> inDeg = new HashMap<>();
//        for(char c : adj.keySet()){
//            inDeg.put(c,0);
//        }
//        for(char u : adj.keySet()){
//            for(char v : adj.get(u)){
////                inDeg.put(v,adj)
//            }
//        }
//    }
//}
