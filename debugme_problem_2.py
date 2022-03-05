"""
PROBLEM 2
MAX POINT = 5
EXPECTED OUTPUT
==>         8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
                8 7 6 5 4 3 2 1 0 
"""

def rotateMatrix(matrix):
        rows = len(matrix)
        for row in reversed(range(rows)):
            cols = len(matrix[0])
            for col in reversed(range(cols)):
                    print(matrix[row][col], end = "")
            print()

matrix = [[0, 1, 2, 3, 4, 5, 6, 7, 8],
         [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8],
       [0, 1, 2, 3, 4, 5, 6, 7, 8]]

rotateMatrix(matrix)
