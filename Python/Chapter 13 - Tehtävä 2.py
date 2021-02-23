class Kilpailija:
  def __init__(self, maali, tilanne):
    self.maali = maali
    self.tilanne = tilanne

p1 = Kilpailija("sininen", 1)

print("Olen", p1.maali, "ja minulla on", p1.tilanne,"pistettä!")