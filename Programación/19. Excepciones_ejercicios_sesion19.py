
while True:

    num = int(input("Ingrese un numero DIFERENTE a 0: "))

    try:

        entrada = 10/num

        break

    except ZeroDivisionError:

        print("No siguio las instrucciones.")

print(entrada)