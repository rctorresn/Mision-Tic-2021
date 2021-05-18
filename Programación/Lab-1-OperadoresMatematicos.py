#Ramses Camilo Torres - Reto 1
import numpy as np

numeroUsuario = int(input("ingrese un numero entre 1 y 9: "))
numeroMagico = np.array([1,2,3,4,5,6,7,9])
multiplicar = (numeroUsuario * 9)
multiplicar_2 = (numeroMagico * numeroUsuario)
print ("El numero que seleccionó fue: ",numeroUsuario ,"La multiplicacion es: ", multiplicar)
print ("El numero que seleccionó fue: ",numeroUsuario ,"La multiplicacion es: ", multiplicar_2)
print("El Numero Magico es: ", numeroMagico)