# -*- coding: UTF8 -*-
import time

try:
    f = open("muistio.txt")
    sisalto = f.read()
except IOError:
    print("Oletusmuistioa ei löydy, luodaan tiedosto.")



def muistio2(testi):
    try:
        tiedostouusi = open((testi), "w")
        sisalto = tiedostouusi.read()
    except IOError:
        print("Tiedostoa ei löydy, luodaan tiedosto.")

sana = True
while sana:
    print("Käytetään muistiota: muistio.txt" "\n(1) Lue muistikirjaa \n(2) Lisää merkintä \n(3) Tyhjennä\
 muistikirja \n(4) Vaihda muistiota \n(5) Lopeta")
    uusi = input("Mitä haluat tehdä?:")
    if uusi == "1":
            tiedosto = open("muistio.txt", "r")
            sisalto = tiedosto.read()
            print(sisalto)
    elif uusi == "2":
        tiedosto = open("muistio.txt", "a")
        sana = input("Kirjoita uusi merkintä:")
        avaa = time.strftime("%X %x")
        tiedosto.writelines([sana, ":::", avaa])
        tiedosto.close()
    elif uusi == "3":
        print("Muistio tyhjennetty.")
        tiedosto = open("muistio.txt", "w").close()
    elif uusi == "4":
        uusitiedosto = input("Anna tiedoston nimi:")
        try:
            f = open(uusitiedosto)
            sisalto = f.read()
        except IOError:
            print("Tiedostoa ei löydy, luodaan tiedosto.")
        sana2 = True
        while sana2:
            print("Käytetään muistiota:",uusitiedosto, "\n(1) Lue muistikirjaa \n(2) Lisää merkintä \n(3) Tyhjennä\
        muistikirja \n(4) Vaihda muistiota \n(5) Lopeta")
            uusi = input("Mitä haluat tehdä?:")
            if uusi == "1":
                try:
                    tiedosto = open(uusitiedosto, "r")
                    sisalto = tiedosto.read()
                    print(sisalto)
                except IOError:
                    print("Tiedostoa ei löydy, luodaan tiedosto.")
            elif uusi == "2":
                tiedosto = open(uusitiedosto, "a")
                sana = input("Kirjoita uusi merkintä:")
                avaa = time.strftime("%X %x")
                tiedosto.writelines([sana, ":::", avaa])
                tiedosto.close()
            elif uusi == "3":
                print("Muistio tyhjennetty.")
                tiedosto = open(uusitiedosto, "w").close()
            elif uusi == "4":
                uusitiedosto = input("Anna tiedoston nimi:")
                muistio2(uusitiedosto)


            elif uusi == "5":
                print("Lopetetaan.")
                sana = False
                break
            else:
                print("Tuntematon valinta.")

    elif uusi == "5":
        print("Lopetetaan.")
        break
    else:
        print("Tuntematon valinta.")