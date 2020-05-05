def printMaxActivities(s, f):
    n = len(f)
    print("The following activities are selected")
    i = 0
    print(i + 1)
    for j in range(n):
        if s[j] >= f[i]:
            print(j + 1)
            i = j


s = [1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12]
f = [4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16]
printMaxActivities(s, f)