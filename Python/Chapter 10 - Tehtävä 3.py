def testaa(luku):
    if len(luku) <= 5:
        return False
    elif luku.isalpha():
        return False
    elif luku.isdigit():
        return False
    else:
        return True