'''Calculo impoteca'''

def hipoteca(h, n, i):
    r = i/(100*12)
    numerador = h*r
    denominador = 1 - (1 + r)**(-12*n)
    m = numerador/denominador
    return print(f"El valor de la cuota mensual es: €{m:.2f}")

if __name__ == "__main__":
    print("Digite en orden, separados por espacios el valor de h, n e i: ")
    h, n, i = map(float, input().split())
    hipoteca(h, n, i)