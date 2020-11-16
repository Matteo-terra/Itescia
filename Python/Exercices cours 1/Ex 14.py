def main():
    
    nb = int(input("Veuillez saisir un nombre :  "))
    j = 0
    for i in range(0 , nb):
        if(i ** 2 == nb):
            j = j +1
    if(j > 0):
        print("L'entier  ", nb , " est un carré parfait")
    else:
        print("l'entier ", nb , " n'est pas est un carré parfait")

if __name__ == '__main__':
    main()
        