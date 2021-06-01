'''Escribir un programa que permita al usuario ingresar 6 números enteros,
que pueden ser positivos o negativos. Al finalizar, mostrar la sumatoria
de los números negativos y el promedio de los positivos.
No olvidar que no es posible dividir por cero, por lo que es necesario
evitar que el programa arroje un error si no se ingresaron números
positivos.'''

negativos=0
positivos=0
cont=0

for i in range(0,6,1):
    numero=int(input("Ingrese un número: "))
    if numero<0:
        negativos+=numero
    elif numero>=0:
        positivos+=numero
        cont+=1

div=positivos/cont

print("la sumatoria de los valores negativos es: ", negativos)
print("El promedio de los valores positivos ingresados es: ", div)
