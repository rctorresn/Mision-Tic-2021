'''Ejemplo Factorial de un número'''

numero=int(input("Ingresa un número: "))

if numero>0:
        mul=1
        for i in range(1,numero+1,1):
                mul*=i
        print("Factorial de ", numero,"es: ", mul)

else:
    print("Error")

