# Consider a maze mapped to a matrix with an upper left corner at coordinates (row, column) = (0, 0). Any movement must be in increasing row or column direction. Determine the number of distinct paths through the maze. Always start at position (0, 0), the top left, and end up at (max(row), max(column)), the bottom right.
# 
# As an example, consider the following diagram where 1 indicates an open cell and 0 indicates blocked. It is only possible to travel through open cells, so no path can go through the cell at (0, 2). There are two distinct paths to the goal.
# 
# PS example
# There are two possible paths from cell (0, 0) to cell (1, 3) in this matrix.
# Function Description 
# 
# Complete the function numberOfPaths in the editor below. The function must return the number of paths through the matrix, modulo (109 + 7).
# 
#  
# 
# numberOfPaths has the following parameter(s):
# 
#     a[a[0],...a[n-1]]:  a two dimensional array of integers where each element is a row and each element of a row is a column
# 
#  
# 
# Constraints
# 
# 1 ≤ n, m ≤ 1000
# Each cell in matrix a contains either a 0 or a 1.
#  
# 
# Input Format for Custom Testing
# Sample Case 0
# Sample Input 0
# 
# 3
# 4
# 1 1 1 1
# 1 1 1 1
# 1 1 1 1
# 
# Sample Output 0
# 
# 10
