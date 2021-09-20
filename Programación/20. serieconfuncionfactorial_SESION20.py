'''Ejemplo operación con Factoriales'''

#Se crea la función factorial con un parametro 
def factorial(numero):
        if numero == 0:
                mul=1
                return mul 
        elif numero>0:
                mul=1
                for i in range(1,numero+1,1):
                        mul*=i
                return mul
        else:
            print("Error")

#Datos de entrada y valores iniciales para realizar la operación
n=int(input("Ingresa un número: "))
m=int(input("Ingresa un número que sea menor al anterior: "))
nFactorial=0
mFactorial=0

#Se verifica que n>m para poder cumplir con la condición establecida    
if n > m:
        nFactorial=factorial(n) #con la funcion se guarda el valor factorial n
        mFactorial=factorial(m) #con la funcion se guarda el valor factorial m
        restaFactorial=factorial(n-m) #funcion factorial para la resta de n-m
        C = nFactorial / (restaFactorial * mFactorial) #C según la formula
        print("el resultado es: ", C)

else:
    print("Error, n debe ser mayor a m") #Imprime error si n no es mayor a m

