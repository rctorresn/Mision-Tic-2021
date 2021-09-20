glist=[1, 2, 3, "one", 5, 6, 1, "one"]
x=set(glist)
dup=[]
for c in x:
    if(glist.count(c)>1):
        indices = [i for i, x in enumerate(glist) if x == c]
        dup.append((c,indices))
print(dup)

N = int(input())
list1=[]
for y in range(N):
    list1.append(input())
    print(list1)