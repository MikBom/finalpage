# -*- coding: cp1252 -*-
def tulostaja(teksti):
    print(teksti)
    return
def main():
    sana = True
    while sana:
        uusi = input("Anna sy�te (Lopeta lopettaa):")
        if uusi == "Lopeta":
            break
        if len(uusi) == 0:
            print("Et antanut sy�tett�")
        else:
            print("Antamasi sy�te oli",len(uusi),"merkki� pitk�")
if __name__ == "__main__":
    main()