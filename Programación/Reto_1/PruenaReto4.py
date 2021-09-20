def dup(x):
    N = int(input())
    for y in range(N):
        list1.append(input())
        print(list1)
    duplicate = []
    unique = []
    for i in x:
        if i in unique:
            duplicate.append(i)
        else:
            unique.append(i)
    print("Valores duplicados: ",duplicate)
    print("Valores unicos: ",unique)

list1 = []
dup(list1)