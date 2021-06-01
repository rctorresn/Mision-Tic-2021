'''Ejemplo condicional anidado'''

#Entrada
numero1=int(input("Ingrese un número: "))
numero2=int(input("Ingrese un número: "))

#Procedimiento y salida 
if numero1==numero2:
        mult=numero1*numero2
        print("La multiplicación es: ",mult)
elif numero1>numero2:
        resta=numero1-numero2
        print("La resta es: ",resta)
else:
        suma=numero1+numero2
        print("La suma es: ",suma)

