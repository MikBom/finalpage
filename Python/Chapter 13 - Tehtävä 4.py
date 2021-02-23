class Emo:
    arvo = 0
    tila = "Toiminnassa"
    def nimi(self):
        print("Minä olen emoluokka.")
class Lapsi(Emo):
    def nimi(self):
        print("Minä olen lapsiluokka.")


just2 = Emo()
print(Emo.tila)
just2.nimi()

just = Lapsi()
print(Emo.tila)
just.nimi()