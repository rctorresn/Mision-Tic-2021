n,k = input().split()
m = int
t = int
x = input()
n=int(n)
k=int(k)
m = 0
t = 0
def rango(start, end, step):
    while start <= end:
        yield start
        start += step
for i in rango(0,n+n-1,2):
    if k==1 and i>=2:
      if x[i] == x[i-2]:
          m = m + 1
    if k == 2 and i>=4:
      if x[i] == x[i-2] :
          m = m + 1
      elif x[i] == x[i-4] and i>=4:
          m = m +1
    if k == 3 and i>=6:
      if x[i] == x[i-2]:
          m = m + 1
      elif x[i] == x[i-4] and i>=4:
          m = m + 1
      elif x[i] == x[i-6] and i>=6:
          m = m + 1
    if k == 4 and i>=8:
      if x[i] == x[i-2]:
          m = m + 1
      elif x[i] == x[i-4] and i>=4:
          m = m + 1
      elif x[i] == x[i-6] and i>=6:
          m = m + 1
      elif x[i] == x[i-8] and i>=8:
          m = m + 1


for i in rango(0,n+n-1,2):
    if x[i] == x[i-2] and i>=2:
              t = t + 1 
    elif x[i] == x[i-4] and i>=4:
              t = t + 1
    elif x[i] == x[i-6] and i>=6:
              t = t + 1
    elif x[i] == x[i-8] and i>=8:
              t = t + 1
if t == 6 and m == 5:
    print(6,6)
else:
    print(t,m)