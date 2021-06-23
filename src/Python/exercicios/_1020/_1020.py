dia = int(input())
anos = dia // 365
dia -= anos*365
mes = dia // 30
dia -= mes*30 
print("%i ano(s)"%anos)
print("%i mes(es)"%mes)
print("%i dia(s)"%dia) 