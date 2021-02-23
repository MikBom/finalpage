# -*- coding: cp1252 -*-
vari = int(input("Anna luku:"))
vari2 = int(input("Anna toinen luku:"))
if (vari % 2) == 0 and (vari2 % 2) == 0:
    print("Molemmat luvut ovat parillisia")
elif (vari % 2) != 0 and (vari2 % 2) != 0:
    print("Molemmat luvut ovat parittomia")
elif (vari % 2) == 0 or (vari2 % 2) == 0:
    print("Toinen luku on parillinen")