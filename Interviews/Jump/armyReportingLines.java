/*
 * In the army, each soldier has an assigned rank. A soldier of rank X has to report to (any) soldier of rank X+1.
 * Many soldiers can report to the same superior. Write a function - 
 *
 * def solution(ranks)
 *
 * that, given an array of ranks consisting of soldiers ranks, returns the number of soldiers who can report to some superior. 
 *
 * Examples - 
 *
 * 1. ranks = [3,4,3,0,2,2,3,0,0]
 *    returns 5 
 *
 * 2. ranks = [4,3,0]
 *    returns 0
 *
 * 3. ranks = [4,4,3,3,1,0]
 *    returns 3
 *
 * Write an efficient algorithm for the following assumptions - 
 *
 *  - N is an integer within the range [2 .. . . 100,000]
 *  - each element of the array ranks is an Integer within therange [0.....1,000,000,000].
 * /
