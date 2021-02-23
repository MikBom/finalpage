tiedosto = open("merkkijonoja.txt","r")
muuttuja = tiedosto.readlines()

for i in muuttuja:
    stripped_line = i.strip()
    if (stripped_line.isalnum()):
       print (stripped_line, "kelpaa salasanaksi.")
    else:
       print (stripped_line, "sisältää virheellisiä merkkejä.")
tiedosto.close()