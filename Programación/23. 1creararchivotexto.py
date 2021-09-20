from io import open

'''Persistencia de datos y Manejo de archivos'''

#Se crea un archivo de texto llamado datos.txt
archivo_texto=open("datos.txt","w")
#Se escribe en el archivo lo que contiene la variable frase
frase="Nuestro primer archivo de texto con python\n"
archivo_texto.write(frase)
#Se escribe en el archivo dejando renglones
archivo_texto.write("\nnombres: \nPedro\nJuan\nCarolina\nAna")
#Se cierra el archivo de memoria en python
archivo_texto.close()



