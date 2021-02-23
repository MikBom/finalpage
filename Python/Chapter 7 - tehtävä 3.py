n = 0
kertoma = int(input("Kuinka monta kierrosta?: "))
tulos = int(0)
for kierros in range(0, kertoma):
    tulos = kierros + tulos
print("Kertymäksi saatiin:", tulos)
