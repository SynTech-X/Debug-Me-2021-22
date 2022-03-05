"""
PROBLEM 1:-
MAX POINTS = 5
EXPECTED OUTPUT = apple mango banana grapes kiwi
"""

fruit=["apple" , "mango", "orange", "banana", "grapes"]

fruit.remove("orange")
fruit.append("kiwi")

print(" ".join(fruit))
