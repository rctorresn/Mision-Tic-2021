distanciaCamaras, recordVelocidad, tiempo = input().split()
distanciaCamaras = float(distanciaCamaras)/1000
recordVelocidad = float(recordVelocidad)
tiempo = float(tiempo)/3600

if(distanciaCamaras > 0 and recordVelocidad>0 and tiempo > 0):

    velocidadMedia = round((distanciaCamaras/tiempo),1)
    record1 = (velocidadMedia*0.25)
    velocidadC = record1+velocidadMedia

    record2 = (recordVelocidad*0.25)
    recordC = record2+recordVelocidad
        
    if(velocidadMedia <= recordVelocidad):
        print(round(velocidadMedia,1), "VELOCIDAD NORMAL")
    if(velocidadMedia > recordC ):
        print(round(velocidadMedia,1), "ENTREVISTA")
    if(velocidadMedia > recordVelocidad and velocidadMedia < recordC):
        print(round(velocidadMedia,1), "NUEVO RECORD")
else:
    print("VALORES NEGATIVOS")
