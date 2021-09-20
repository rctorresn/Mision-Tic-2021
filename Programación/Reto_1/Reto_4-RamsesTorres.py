N = int(input())
K1 = 1
LaminasN = list(range(0,100))
#LaminasN = int
#while 1<=N<=10000 or 1<=K<=1000:
for i in range(1,N+1,1):
    for x in range(1,len(LaminasN)-1):
        print(LaminasN[x])