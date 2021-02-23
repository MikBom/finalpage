class Kilpailija:
  def __init__(self, vari, pisteet):
    self.vari = vari
    self.pisteet = pisteet

p1 = Kilpailija("sininen", 10)

print("Kilpailijalla", p1.vari, "on", p1.pisteet,"pistettä!")


