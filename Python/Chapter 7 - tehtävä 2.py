sana = True
while sana:
    juttu = input("Kirjoita jotain:")
    if juttu == "lopeta":
        sana = False
        print("Lopeta ohjelma")
        break
    else:
        print(juttu)