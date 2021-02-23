lista = []
sana = True
while sana:

    testi = input("Haluatko\n(1)Lisätä listaan\n(2)Poistaa listalta vai\n(3)Lopettaa?:")
    if testi == "3":
        print("Listalla oli tuotteet:")
        for i in lista:
            print(i)
        break
    elif testi == "1":
        testi2 = input("Mitä lisätään?:")
        lista.append(testi2)
    elif testi == "2":
        print("listalla on",len(lista),"alkiota.")
        testi3 = int(input("Monesko niistä poistetaan?:"))
        try:
            lista.pop(testi3)
        except Exception:
            print("Virheellinen valinta.")
    else:
        print("Virheellinen valinta.")
        sana = True

