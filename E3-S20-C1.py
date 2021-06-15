'''Calculo impoteca'''

def pedirDatos():
    while True:
        try:
            h, n, i = map(float, input().split())
            if (h <= 0) or (n < 0) or (i < 0):
                print("No digitar valores menores a cero")
            else:
                return h, n, i
        except:
            print("Favor digitar sólo números")

def hipoteca(h, n, i):
    r = i/(100*12)
    numerador = h*r
    denominador = 1 - (1 + r)**(-12*n)
    m = numerador/denominador
    return print(f"El valor de la cuota mensual es: €{m:.2f}")

if __name__ == "__main__":
    print("Digite en orden, separados por espacios el valor de h, n e i: ")
    h, n, i = pedirDatos()
    hipoteca(h, n, i)