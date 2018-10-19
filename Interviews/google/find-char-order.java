/*
 * Question: You are given a list of words in sorted order. They are sorted according to some alien dictionary you do not know about.
 *  	     You need to figure out the order of characters in the language
 */

/*
 * Solution: - Create a graph out of the unique characters in the words
 * 	     - Use adjacency matrix to fill the characters, but not the edges yet
 * 	     - For every consecutive pair of word, compare character wise and find the differing chars
 * 	     - create edge directed along the char relation inferred from above
 * 	     - Finally, use topological sort to output the graph. It gives the characters in sorted order.
 */
