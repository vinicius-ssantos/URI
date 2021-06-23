S = float(input())
if (S>0.00 and S<2000.00):
    print("Isento")
elif (S>=2000.01 and S<=3000.00):
    resto = S - 2000
    resultado = resto * 0.08    
    print("R$ %.2f" % resultado)
elif (S>=3000.01 and S<=4500.00):
    resto = S - 3000
    resultado = (resto*0.18) + (1000*0.08)  
    print("R$ %.2f" % resultado)
else:
    resto = S - 4500
    resultado = (resto*0.28) + (1500*0.18) + (1000 * 0.08)   
    print("R$ %.2f" % resultado)