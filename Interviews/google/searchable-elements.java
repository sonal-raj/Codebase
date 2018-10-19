/*
 *  Question: Assume a modified binary search technique where instead of the middle element, you
 *  take a random element in each step. Given an unsorted array, find all the elements that are searchable.
 *
 *  Hint: If you search for an element with this technique a million times, you should always be able to find it.
 */

/*
 * Solution : For every element get all elements smaller than it on the left, all elements larger than it on the right. 
 * 	      The intersection of all these sets across all elements will give the searchable elements 
 */
