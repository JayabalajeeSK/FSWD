package Trie;
import java.util.*;

class TrieNode 
{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

class Trie 
{
    TrieNode root = new TrieNode();
    // Insert word
    void insert(String word) 
    {
        TrieNode node = root;
        for(char ch : word.toCharArray()) 
        {
            node = node.children.computeIfAbsent(ch, c -> new TrieNode());
        }
        node.isEndOfWord = true;
    }

    // Search word
    boolean search(String word) 
    {
        TrieNode node = root;
        for(char ch : word.toCharArray()) 
        {
            node = node.children.get(ch);

            if(node == null) return false;
        }
        return node.isEndOfWord;
    }

    // Search prefix
    boolean startsWith(String prefix) 
    {
        TrieNode node = root;
        for(char ch : prefix.toCharArray()) 
        {
            node = node.children.get(ch);

            if(node == null) return false;
        }
        return true;
    }
}

public class TrieDemo 
{
    public static void main(String[] args) 
    {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");

        System.out.println(trie.search("cat"));   // true
        System.out.println(trie.search("ca"));    // false
        System.out.println(trie.startsWith("ca")); // true
        System.out.println(trie.search("dog"));   // true
    }
}