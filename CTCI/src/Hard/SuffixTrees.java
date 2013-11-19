package Hard;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */

class suffixTree
{
    suffixTreeNode root  = new suffixTreeNode();
    public suffixTree(String s)
    {
        for(int i = 0;i<s.length();i++)
        {
            String suffix = s.substring(i);
            root.insertString(suffix, i);
        }
    }

    public ArrayList<Integer> getIndexes(String s)
    {
        return root.getIndexes(s);
    }
}

class suffixTreeNode
{
    private HashMap<Character, suffixTreeNode> children = new HashMap<Character, suffixTreeNode>();
    char value;
    ArrayList<Integer> indexes = new ArrayList<Integer>();

    public suffixTreeNode() {}

    public void insertString(String s, int index)
    {
        indexes.add(index);
        if(s!=null && s.length()>0)
        {
            char value = s.charAt(0); //get the first character
            suffixTreeNode child = null;
            if(children.containsKey(value))
                child = children.get(value);
            else
            {
                child = new suffixTreeNode();
                children.put(value, child);
            }
            //check the remaining substring
            String remainder = s.substring(1);
            child.insertString(remainder, index);
        }
    }
    public ArrayList<Integer> getIndexes(String s)
    {
        if(s==null || s.length()==0)
            return indexes;
        else
        {
            char first = s.charAt(0);
            if(children.containsKey(first))
            {
                String remainder = s.substring(1);
                return children.get(first).getIndexes(remainder);
            }
        }
        return null;
    }
}
public class SuffixTrees {
    /**
     * Given a string s and an array of smaller strings T, design a method to search s for each
     small string in T
     */

    public static void main(String[] args)
    {
        String testString = "mississippi";
        String[] stringList = {"is","sip","hi","sis"};
        suffixTree tree = new suffixTree(testString);
        for(String s:stringList)
        {
            ArrayList<Integer> list = tree.getIndexes(s);
            if(list!=null)
                System.out.println(s+" : "+list.toString());
        }
    }
}
