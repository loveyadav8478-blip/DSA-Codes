package Hashmap;
import java.util.*;
public class ImplementationOfHM {
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 769;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V val;
            Node(K key, V val){
                this.val = val;
                this.key = key;
            }
        }
        private int n = 0;
        private LinkedList<Node>[] Buckets;
        private void initBucket(int N){
            Buckets = new LinkedList[N];
            for (int i = 0; i < Buckets.length; i++) {
                Buckets[i] = new LinkedList<>();
            }
        }
        private int HashFun(K key){
            int ans = key.hashCode();
            return Math.abs(ans)% Buckets.length;
        }
        private int searchInBuckets(LinkedList<Node> l, K key) {
            for (int i = 0; i < l.size(); i++) {
                if(l.get(i).key == key) return i;
            }
            return -1;
        }
        private void reHash(){
            LinkedList<Node>[] oldBucket = Buckets;
            initBucket(oldBucket.length*2);
            n = 0;
            for(var buck : oldBucket){
                for(var node : buck){
                    put(node.key, node.val);
                }
            }
        }
        public MyHashMap(){
            initBucket(DEFAULT_CAPACITY);
        }
        public int size(){
            return n;
        }
        public void put(K key, V val){
            int bi = HashFun(key);
            LinkedList<Node> currBucket = Buckets[bi];
            int eexist = searchInBuckets(currBucket,key);
            if(eexist==-1){
                Node node = new Node(key, val);
                currBucket.add(node);
                n++;
            }
            else{//update
                Node currNode = currBucket.get(eexist);
                currNode.val = val;
            }
            if(n>= Buckets.length*DEFAULT_LOAD_FACTOR){
                reHash();
            }
        }
        public V get(K key){
            int bi = HashFun(key);
            LinkedList<Node> currBucket = Buckets[bi];
            int eexist = searchInBuckets(currBucket,key);
            if(eexist==-1) return null;
            Node currNode = currBucket.get(eexist);
            return currNode.val;
        }
        public V remove(K key){
            int bi = HashFun(key);
            LinkedList<Node> currBucket = Buckets[bi];
            int eexist = searchInBuckets(currBucket,key);
            if(eexist==-1) return null;
            Node currNode = currBucket.remove(eexist);
            n--;
            return currNode.val;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> m = new MyHashMap<>();
        m.put("Love Yadav",100);
        m.put("Singh",123);
        m.put("Love",100);
        m.put("Singh is king",123);
        m.put("dcn",100);
        m.put("Singh is laudo",123);
        m.put("nsdvksdj",100);
        m.put("Raj",422);
        System.out.println(m.size());
        m.remove("Raj");
        System.out.println(m.size());
    }
}
