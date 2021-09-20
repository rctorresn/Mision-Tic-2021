'''EJERCICIO REFUERZO'''

n=int(input("Ingrese un numero: "))

m=int(input("Ingrese otro numero: "))

sumatoria=0

if n>m:

    print("N debe ser menor que M")

else:

    for i in range(n,m+1,1):

        sumatoria+=i

    print("La sumatoria es: ", sumatoria)