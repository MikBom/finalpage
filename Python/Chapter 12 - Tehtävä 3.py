filename = 'sanoja.txt'
f = open(filename)
data = f.readlines()
f.close()
print("Sanat laitettuna aakkosjärjestykseen:")
kakkara = sorted(data)
for i in kakkara:
	print(i)