n,k = input().split()
m = int
x = input()
print(x)
x = int
t=int

for i in range(n-1):
    for y in range(k-1):
        if k==1:
            if x[i] == x[i-1]:
                m = m + 1
        if k == 2:
            if x[i] == x[i-1] :
                m = m + 1
            elif x[i] == x[i-2]:
                m = m +1
        if k == 3:
            if x[i] == x[i-1]:
                m = m + 1
            elif x[i] == x[i-3]:
                m = m + 1
            elif x[i] == x[i-4]:
                m = m + 1
        if k == 4:
            if x[i] == x[i-1]:
                m = m + 1
            elif x[i] == x[i-2]:
                m = m + 1
            elif x[i] == x[i-3]:
                m = m + 1
            elif x[i] == x[i-4]:
                m = m + 1

        if x[i] == x[i-1]:
                t = t + 1
        elif x[i] == x[i-2]:
                t = t + 1
        elif x[i] == x[i-3]:
                t = t + 1
        elif x[i] == x[i-4]:
                t = t + 1
print(t,m)