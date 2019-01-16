# Julia is planning a vacation and has a list of cities she wants to visit. She doesn't have a map of the area, but she does have some data that will help her determine whether there is a road connecting all the cities she wants to visit. The data comes in the form of two arrays. Each of the first array's elements is an origin city. Each of the second array's is a destination. There is also an integer value threshold. She can tell that any two cities are connected if the values at origin and destination share a common divisor greater than the threshold. Cities are indexed starting at 0.
# 
#  
# 
# Each of the pairs, originCities[0] and destinationCities[0] for example, represents a route she wants to take. For each pair, determine whether there is a route between cities. The route does not have to be direct. See the explanation to Sample Case 1 relating to originCity equals 2 or 4 for examples.
# 
#  
# 
# For instance, consider an array originCities = [1, 2, 3] and destinationCities = [4, 5, 6]. The threshold value is 2. There are 6 total cities. To draw the map, first determine the divisors of all cities:
# 
# Origins 		Destinations
# City  	Divisors 	City 	Divisors
# 
# 1	1 		4	1,2,4
# 2	1,2		5	1,5
# 3	1,3		6	1,2,3,6
# The threshold is 2, so we can eliminate cities 1 and 2. Their divisors are not greater than the threshold. This leaves city 3 to check in the origins list. It has a divisor in common with city 6, and it is greater than the threshold so there is a road between them. This is the only pair of connected cities. Now that we have created a map, we can check her routes.
# 
#  
# 
# She wants to go from originCity[0] = 1 to destinationCity[0] = 4 but there is no road. There is no road for her second route either, from city 2 to 5. There is only a road that matches her third route at index 2, from city 3 to 6. A true/false array of her results would be paths = [0, 0, 1].
# 
#  
# 
# Function Description 
# 
# Complete the function connectedCities in the editor below. The function must return a true/false array where each paths[i] contains 1 if the route between originCities[i] and destinationCities[i] exists, or 0 if it does not.
# 
#  
# 
# connectedCities has the following parameter(s):
# 
#     n: integer, the number of cities
# 
#     g: integer, the threshold value
# 
#     originCities[originCities[0],...originCities[q-1]]:  an array of integers
# 
#     destinationCities[destinationCities[0],...destinationCities[q-1]]:  an array of integers
# 
#  
# 
# Constraints
# 
#  
# 
# 2 ≤ n ≤ 2 × 105
# 0 ≤ g ≤ n
# 1 ≤ q ≤ min(n × (n - 1) / 2, 105)
# 1 ≤ originCities[i], destinationCities[i] ≤ n, where 0 ≤ i < q
# originCities[i] ≠ destinationCities[i], where 0 ≤ i < q
#  
# 
# Input Format for Custom Testing
# Sample Case 0
# Sample Input 0
# 
# 6
# 0
# 4
# 1
# 4
# 3
# 6
# 4
# 3
# 6
# 2
# 5
# Sample Output 0
# 
# 1
# 1
# 1
# 1
# Explanation 0
# 
# There are n = 6 cities and g = 0. We know that two cities x and y are connected if and only if the greatest common divisor, gcd(x, y) > 0. A map is drawn to the right.
# 
#  
# 
# Julia wants to know whether any path exists from:
# 
# City 1 to city 3
# City 4 to city 6
# City 3 to city 2
# City 6 to city 5
# Let the return array be paths, then:
# 
# paths[0] = 1 because a path exists from city 1 to city 3.
# paths[1] = 1 because a path exists from city 4 to city 6.
# paths[2] = 1 because a path exists from city 3 to city 2.
# paths[3] = 1 because a path exists from city 6 to city 5.
#  
# 
# Return paths = [1, 1, 1, 1] as the answer.
# 
# Sample Case 0
# The city graph.
# Each city is directly connected to other cities, so a path always exists for each (x, y) pair.
# Sample Case 1
