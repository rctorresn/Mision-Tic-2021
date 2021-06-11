'''Ejemplo pedir un número al usuario y crear un diccionario'''

numero = int(input("Dime un número:"))
cuadrados = {}

for num in range(1,numero+1):
    cuadrados[num] = num ** 2

print(cuadrados)
