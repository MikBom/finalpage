import time
import pickle
lista = []
try:
    f = open("muistio.dat", "wb")
    sisalto = f.read()
except IOError:
    print("Virhe tiedostossa, luodaan uusi muistio.dat.")

sana = True
while sana:


    print("(1) Lue muistikirjaa")
    print("(2) Lisää merkintä")
    print("(3) Muokkaa merkintää")
    print("(4) Poista merkintä")
    print("(5) Tallenna ja lopeta")
    uusi = input("Mitä haluat tehdä?:")
    if uusi == "1":
        for i in lista:
            print(*i)
    elif uusi == "2":
        sana = input("Kirjoita uusi merkintä:")
        avaa = time.strftime("%X %x")
        lista.append([sana, ":::", avaa])
    elif uusi == "3":
        print("Listalla on", len(lista), "merkintää.")
        rokki = int(input("Mitä niistä muutetaan?:"))
        print(*lista[rokki-1])
        lista.pop(rokki-1)
        rokki2 = input("Anna uusi teksti:")
        avaa = time.strftime("%X %x")
        tukko = ([rokki2, ":::", avaa])
        lista.insert(rokki-1, tukko)
    elif uusi == "4":
        print("Listalla on", len(lista), "merkintää.")
        uusitiedosto = int(input("Mitä niistä poistetaan:"))
        lista.pop(uusitiedosto-1)

    elif uusi == "5":
        print("Lopetetaan.")
        f = open("muistio.dat", "wb")
        pickle.dump(lista, f)
        break
    else:
        print("Tuntematon valinta.")