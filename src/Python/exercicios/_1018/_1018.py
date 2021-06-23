valor = int(input())
print(valor)
cedulas = [100, 50, 20, 10, 5, 2, 1]
for cedulas in cedulas:
    qnt_cedulas = int(valor/cedulas)
    print("%i nota(s) de R$ %i,00" %(qnt_cedulas, cedulas))
    valor -= qnt_cedulas*cedulas