from io import open

'''Persistencia de datos y Manejo de archivos'''

#--------------------#
#Lectura del archivo #
#--------------------#

#Se lee un archivo de texto llamado datos.txt
archivo_texto=open("datos.txt","r")
leer_archivo=archivo_texto.read()
#Se cierra el archivo de memoria
archivo_texto.close()
#Se imprime la variable que contiene la lectura del archivo
print(leer_archivo)


#------------------------------#
#Leer el archivo como una lista#
#------------------------------#

#Se lee un archivo de texto llamado datos.txt
archivo_texto=open("datos.txt","r")
#Se crea una variable para traer una lista con cada linea del archivo
lineas_texto=archivo_texto.readlines()
#Se cierra el archivo de memoria
archivo_texto.close()
#Se imprime la variable que contiene la lista con cada renglon del archivo
print(lineas_texto)
#Se imprime el primer objeto de la lista, es decir, primer renglon 
print(lineas_texto[0])
#Se imprime el quinto objeto de la lista, es decir, quinto renglon 
print(lineas_texto[4])

#Se busca un elemento en la lista creada a partir del archivo de texto
c=0
for i in lineas_texto:
        if "Ana" in i:
                c+=1

print("El elemento Ana se encuentra", c,"veces en el texto")

