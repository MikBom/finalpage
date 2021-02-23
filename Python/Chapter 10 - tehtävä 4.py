import math
luku = int(input("Anna ensimmäinen luku:"))
luku2 = int(input("Anna toinen luku:"))
sana2 = True
while sana2:
    print("(1) +")
    print("(2) -")
    print("(3) *")
    print("(4) /")
    print("(5)sin(luku1/luku2)")
    print("(6)cos(luku1/luku2)")
    print("(7) Vaihda luvut")
    print("(8) Lopeta")
    print("Valitut luvut:",luku, luku2,)
    tulos = input("Tee valinta (1-8):")
    if tulos == "1":
        print("Tulos on:",luku + luku2)
        sana2 = True
    elif tulos == "2":
        print("Tulos on:",luku - luku2)
        sana2 = True
    elif tulos == "3":
        print("Tulos on:",luku * luku2)
        sana2 = True
    elif tulos == "4":
        print("Tulos on:",luku / luku2)
        sana2 = True
    elif tulos == "5":
        print("Tulos on:",math.sin(luku / luku2))
        sana2 = True
    elif tulos == "6":
        print("Tulos on:",math.cos(luku / luku2))
        sana2 = True
    elif tulos == "7":
        sana = True
        luku3 = int(input("Anna uusi ensimmäinen luku:"))
        luku4 = int(input("Anna uusi toinen luku:"))
        sana3 = True
        while sana3:
            print("(1) +")
            print("(2) -")
            print("(3) *")
            print("(4) /")
            print("(5)sin(luku1/luku2)")
            print("(6)cos(luku1/luku2)")
            print("(7) Vaihda luvut")
            print("(8) Lopeta")
            print("Valitut luvut:", luku3, luku4, )
            tulos = input("Tee valinta (1-8):")
            if tulos == "1":
                print("Tulos on:", luku3 + luku4)
                sana3 = True
            elif tulos == "2":
                print("Tulos on:", luku3 - luku4)
                sana3 = True
            elif tulos == "3":
                print("Tulos on:", luku3 * luku4)
                sana3 = True
            elif tulos == "4":
                print("Tulos on:", luku3 / luku4)
                sana3 = True
            elif tulos == "7":
                sana = True
                luku3 = int(input("Anna uusi ensimmäinen luku:"))
                luku4 = int(input("Anna uusi toinen luku:"))
            elif tulos == "8":
                sana2 = False
                break
            else:
                print("Valintaa ei tunnistettu.")
                sama3 = True
    elif tulos == "8":
        sana2 = False
        break
    else:
        print("Valintaa ei tunnistettu.")
        sana2 = True

