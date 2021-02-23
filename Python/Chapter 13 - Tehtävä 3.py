class Kilpailija:
  def __init__(self, maali, tilanne):
    rokki = input("Anna minulle väri:")
    self.maali = rokki
    self.tilanne = tilanne


p1 = Kilpailija("sininen", 0)
p2 = Kilpailija("Punainen", 0)

print("Olen", p1.maali, "ja minulla on", p1.tilanne,"pistettä!")
print("Olen", p2.maali, "ja minulla on", p2.tilanne,"pistettä!")
print("Kilpailija: sisältää pisteet ja värin")