'''Ejemplo solicitar un valor al usuario'''

numero=int(input("ingrese un número: "))
suma=0

for i in range(0,numero,1):
        numero2=int(input("Ingresa un número: "))
        suma+=numero2

print("El valor de la suma es: ",suma)