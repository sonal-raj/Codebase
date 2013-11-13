import java.util.*;

class TrieNode
{
    private String key;
    /**
     * the outgoing edges of this node, implemented as a sorted map of character to the child node.
     */
    private SortedMap<Character, TrieNode> edges;

    TrieNode addEdge(char c) {
        if (edges == null) {
            edges = new TreeMap<Character, TrieNode>();
        }
        TrieNode childNode = new TrieNode();
        edges.put(c, childNode);
        return childNode;
    }

    TrieNode traverse(char c) {
        return (edges == null) ? null : edges.get(c);
    }

    TrieNode deleteEdge(char c) {
        return (edges == null) ? null : edges.remove(c);
    }

    Iterator<TrieNode>  getChildren() {
        return (edges == null) ? null : edges.values().iterator();
    }

    void setKey(String key) {
        this.key = key;

    }

    String getKey() {
        return key;
    }

    public int getChildrenCnt() {
        return edges == null ? 0 : edges.size();
    }
}
public class Trie
{
    private final TrieNode root;

    //create a new Trie
    public Trie()
    {
        root = new TrieNode();
    }

    //Insert the key into this Trie Object
    public void insert(String key) {
        TrieNode currNode = root;
        for (char c : key.toCharArray()) {
            TrieNode child = currNode.traverse(c);
            if (child == null) {
                currNode = currNode.addEdge(c);
            } else {
                currNode = child;
            }
        }
        currNode.setKey(key);
    }

    //return all keys in the tree which start with specified prefix
    public List<String> search(String prefix) {
        TrieNode currNode = root;
        for (char c : prefix.toCharArray()) {
            TrieNode child = currNode.traverse(c);
            if (child == null) {
                return Collections.emptyList();
            } else {
                currNode = child;
            }
        }
        List<String> matches = new ArrayList<String>();
        preorderTraverse(currNode, matches);
        return matches;
    }

    //Does preorder traversal of Trie and add retrieved keys in the specified results list.
    private void preorderTraverse(TrieNode currNode, List<String> results) {
        if (currNode == null) return;
        if (currNode.getKey() != null) {
            results.add(currNode.getKey());
        }
        Iterator<TrieNode> children = currNode.getChildren();
        if (children != null) {
            while (children.hasNext()) {
                preorderTraverse(children.next(), results);
            }
        }
    }

    public static void main(String[] args)
    {
        Trie t = new Trie();
        t.insert("vino");
        t.insert("vinod");
        t.insert("vin");
        t.insert("jyo");
        t.insert("jyotsna");
        t.insert("jyot");
        t.insert("jyots");
        t.insert("jyotsn");
        t.insert("joe");

        System.out.println(t.search("vino"));
        System.out.println(t.search("j"));
        System.out.println(t.search("jy"));
        System.out.println(t.search("joe"));

        System.out.println(t.search("bhalblah"));
    }
}