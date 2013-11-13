//Huffman Coding Algorithm for text compression

import java.util.PriorityQueue;

abstract class HuffmanTree implements Comparable<HuffmanTree>
{
    public final int frequency;
    public HuffmanTree(int freq)
    {
        frequency=freq;
    }
    public int compareTo(HuffmanTree tree)
    {
        return frequency-tree.frequency;
    }
}

class HuffmanLeaf extends HuffmanTree
{
    public final char value; //the value stored in this leaf

    public HuffmanLeaf(int freq, char val)
    {
        super(freq);
        value=val;
    }
}

class HuffmanNode extends HuffmanTree
{
    public final HuffmanTree left, right; //subtrees

    public HuffmanNode(HuffmanTree l, HuffmanTree r)
    {
        super(l.frequency+r.frequency);
        left=l;
        right=r;
    }
}

class HuffmanCoding
{
    public static HuffmanTree buildTree(int[] freq)
    {
        PriorityQueue<HuffmanTree> trees= new PriorityQueue<HuffmanTree>();
        //initially we have forest of leaves for each non-empty character
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
                trees.offer(new HuffmanLeaf(freq[i],(char)i));
        }

        assert trees.size()>0;
        //loop till one tree is left
        while(trees.size()>1)
        {
            //two trees with least frequency
            HuffmanTree a = trees.poll();
            HuffmanTree b = trees.poll();
            //combine into single tree and put back
            trees.offer(new HuffmanNode(a,b));
        }
        return trees.poll();
    }

    public static void printCodes(HuffmanTree tree, StringBuffer prefix)
    {
        assert tree!=null;
        if (tree instanceof HuffmanLeaf) {
            HuffmanLeaf leaf = (HuffmanLeaf)tree;

            // print out character, frequency, and code for this leaf (which is just the prefix)
            System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);

        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;

            // traverse left
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);

            // traverse right
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }

    public static void main(String[] args)
    {
        String test = "this is an example for huffman coding";

        //calculate the frequencies of the characters
        int[] freq = new int[256];
        for(char c:test.toCharArray())
            freq[c]++;

        //Build the Huffman Tree
        HuffmanTree tree = buildTree(freq);

        //Print the Huffman codes
        System.out.println("SYMBOL\tFREQUENCY\tHUFFMAN CODE");
        printCodes(tree,new StringBuffer());
    }
}