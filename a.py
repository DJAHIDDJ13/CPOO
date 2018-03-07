import sys
import math
def draw(l1,l2,w1,w2):
	for i in range(len(w2)):
		o=[]
		for j in range(len(w1)):
			if i == l2:
				o.append(w1[j])
			elif j == l1:
				o.append(w2[i])
			else:
				o.append(" ")
		print(' '.join(o))

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

w1,w2 = input().split()
w1 = w1.upper()
w2 = w2.upper()
for i in range(len(w1)):
	for j in range(len(w2)):
		if w1[i] == w2[j]:
			draw(i,j,w1,w2)
