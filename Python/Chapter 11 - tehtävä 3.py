import math
def testaa(rokki):
    try:
        tulos = int(rokki)
        return True
    except Exception:
        print("Virheellinen syöte!")
        sana6 = True
        return False
while True:
    luku = input("Anna luku:")
    testattava = testaa(luku)
    if testattava == True:
        break
while True:
    luku2 = input("Anna luku:")
    testattava2 = testaa(luku2)
    if testattava2 == True:
        break

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
        print("Tulos on:",int(luku) + int(luku2))
        sana2 = True
    elif tulos == "2":
        print("Tulos on:",int(luku) - int(luku2))
        sana2 = True
    elif tulos == "3":
        print("Tulos on:",int(luku) * int(luku2))
        sana2 = True
    elif tulos == "4":
        print("Tulos on:",int(luku) / int(luku2))
        sana2 = True
    elif tulos == "5":
        print("Tulos on:",math.sin(int(luku) / int(luku2)))
        sana2 = True
    elif tulos == "6":
        print("Tulos on:",math.cos(int(luku) / int(luku2)))
        sana2 = True
    elif tulos == "7":
        sana = True
        while True:
            luku3 = input("Anna luku:")
            testattava3 = testaa(luku3)
            if testattava3 == True:
                break
        while True:
            luku4 = input("Anna luku:")
            testattava4 = testaa(luku4)
            if testattava4 == True:
                break
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
                print("Tulos on:", int(luku3) + int(luku4))
                sana3 = True
            elif tulos == "2":
                print("Tulos on:", int(luku3) - int(luku4))
                sana3 = True
            elif tulos == "3":
                print("Tulos on:", int(luku3) * int(luku4))
                sana3 = True
            elif tulos == "4":
                print("Tulos on:", int(luku3) / int(luku4))
                sana3 = True
            elif tulos == "5":
                print("Tulos on:", math.sin(int(luku3) / int(luku4)))
                sana2 = True
            elif tulos == "6":
                print("Tulos on:", math.cos(int(luku3) / int(luku4)))
                sana2 = True
            elif tulos == "7":
                sana = True
                luku3 = int(input("Anna luku:"))
                luku4 = int(input("Anna luku?:"))
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