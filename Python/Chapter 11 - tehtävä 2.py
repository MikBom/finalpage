def avaa():
    uusi = input("Anna tiedoston nimi:")
    return uusi
def main():
    try:
        luku1 = avaa()
        tiedosto = open(luku1,"r")
        teksti = tiedosto.readlines()
        for line in teksti:
                    a = "313"
                    print("Saatiin tulos", int(line)+int(a))
        tiedosto.close()
    except (IOError):
        print("Virheellinen tiedostonnimi")
    except (ValueError):
        print("Tiedoston sisältö virheellinen!")

if __name__ == "__main__":
    main()