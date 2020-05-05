def max(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]
        max(L)
        max(R)

        i = j = k = 0
        if L[i] > R[j]:
            arr[k] = L[i]
        else:
            arr[k] = R[j]
        k += 1
def printList(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()


if __name__ == '__main__':
    arr = [1,2,3,4,0,0.5,-8,-22,0.4,-88,66,45,-8,0.001]
    print("Given array is:", end="\n")
    printList(arr)
    max(arr)
    print("Maximum element is: ")
    print(arr[0])