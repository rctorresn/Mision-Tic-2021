'''producto escalar dos vectores'''
import random

n=int(input("Ingresar el valor de n: "))
v=[None] * n
W=[None] * n

for i in range(0,n):
        v[i]= random.randint(1,100)
        W[i]= random.randint(1,100)

print (v)
print (W)

def pEscalar():
        productoEscalar = 0
        for i in range(0,n):
                productoEscalar=productoEscalar + (v[i] * W[i]) 
        print("El producto escalar entre los vectores es: ", productoEscalar)
        return

pEscalar()