a,b,c = input().split()
a = int(a)
b = int(b)
c = int(c)
n = (a+b+abs(a-b))/2
n1 = (n+c+abs(n-c))/2
print( "%i eh o maior" % n1)