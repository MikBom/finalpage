# -*- coding: cp1252 -*-
def tulostaja(teksti):
    print(teksti)
    return
def main():
    sana = True
    while sana:
        uusi = input("Anna syöte (Lopeta lopettaa):")
        if uusi == "Lopeta":
            break
        if len(uusi) == 0:
            print("Et antanut syötettä")
        else:
            print("Antamasi syöte oli",len(uusi),"merkkiä pitkä")
if __name__ == "__main__":
    main()