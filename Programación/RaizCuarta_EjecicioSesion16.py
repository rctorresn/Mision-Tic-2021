import math
print("Ingres el numero: ")
numero = int(input())

def raizCuarta(numero):
    raizC=math.sqrt(numero)
    raiz4Ta = math.sqrt(raizC)
    return(round(raiz4Ta,3))

print(raizCuarta(numero))
