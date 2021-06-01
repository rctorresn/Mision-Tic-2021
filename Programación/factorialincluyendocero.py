'''Ejemplo Factorial de un número incluyendo el cero'''

numero=int(input("Ingresa un número: "))

if numero == 0:
        print(1)
elif numero>0:
        mul=1
        for i in range(1,numero+1,1):
                mul*=i
        print(mul)

else:
    print("Error")

