# -*- coding: cp1252 -*-
def tulostaja(teksti):
    print(teksti)
    return
def main():
    sana = True
    while sana:
        uusi = input("Anna sy�te (Lopeta lopettaa):")
        if len(uusi) <= 5:
            print("Oletustulos")
            continue
        if uusi == "Lopeta":
            break
        else:
            tulostaja(uusi)
if __name__ == "__main__":
    main()