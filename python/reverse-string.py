string = input('Enter a string you want to reverse: ')
s = string.split()[::-1]
l = []
for i in s:
    l.append(i)
print(" ".join(l))
