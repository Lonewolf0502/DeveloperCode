for _ in range(int(input())):
    l = list(map(int, input().split()))
    k = int(input())
    i = 9
    while k >= l[i]:
        k -= l[i]
        i -= 1
    print(i + 1)
