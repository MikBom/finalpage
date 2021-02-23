luku = int(input("Anna ensimmäinen luku:"))
luku2 = int(input("Anna toinen luku:"))
print("(1) +")
print("(2) -")
print("(3) *")
print("(4) /")
tulos = input("Tee valinta (1-4):")
if tulos == "1":
    print("Tulos on:",luku + luku2)
elif tulos == "2":
    print("Tulos on:",luku - luku2)
elif tulos == "3":
    print("Tulos on:",luku * luku2)
elif tulos == "4":
    print("Tulos on:",luku / luku2)
else:
    print("Valintaa ei tunnistettu.")