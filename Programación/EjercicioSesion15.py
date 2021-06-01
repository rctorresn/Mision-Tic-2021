m=int(input("Ingrese un numero: "))
n=int(input("Ingrese otro numero: "))

if n>=m:
    print("n debe ser menor o igual que m")
elif n<=m:
    sumatoria = n
    for i in range(n,m+1,1):
        sumatoria += i
        print("Sumatoria es = ", sumatoria)
    
