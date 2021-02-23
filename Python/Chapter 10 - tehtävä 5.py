# -*- coding: UTF8 -*-
import time
sana = True
while sana:
    print("(1) Lue muistikirjaa \n(2) Lisää merkintä \n(3) Tyhjennä \
    muistikirja \n(4) Lopeta")
    uusi = input("Mitä haluat tehdä?:")
    if uusi == "1":
        tiedosto = open("muistio.txt", "r")
        sisalto = tiedosto.read()
        print(sisalto)
    elif uusi == "2":
        tiedosto = open("muistio.txt", "w")
        sana = input("Kirjoita uusi merkintä:")
        avaa = time.strftime("%X %x")
        tiedosto.writelines([sana,":::", avaa])
    elif uusi == "3":
        print("Muistio tyhjennetty.")
        tiedosto = open("muistio.txt", "w").close()
    elif uusi == "4":
        print("Lopetetaan.")
        break
    else:
        print("Tuntematon valinta.")
