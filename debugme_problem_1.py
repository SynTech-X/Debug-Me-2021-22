"""
PROBLEM 1:-
MAX POINTS = 5
EXPECTED OUTPUT = apple mango banana grapes kiwi
"""

fruit=("apple" , "mango", "orange", "banana", "grapes")
newList = list(fruit)
newList.append("kiwi")
fruit = tuple(newList)
for i in fruit:
    print(i,  end =" ");
